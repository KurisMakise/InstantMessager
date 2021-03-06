package makise.im.service.impl;

import makise.im.entity.MessageContact;
import makise.im.entity.MessageContent;
import makise.im.entity.MessageRelation;
import makise.im.mapper.MessageContactMapper;
import makise.im.mapper.MessageContentMapper;
import makise.im.mapper.MessageRelationMapper;
import makise.im.service.MessageService;
import makise.im.vo.MessageContactVo;
import makise.im.vo.MessageVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 19:16
 */
@Service
public class MessageServiceImpl implements MessageService {

    private final MessageContentMapper messageContentMapper;
    private final MessageRelationMapper messageRelationMapper;
    private final MessageContactMapper messageContactMapper;

    public MessageServiceImpl(@Qualifier("messageContentMapper") MessageContentMapper messageContentMapper,
                              @Qualifier("messageRelationMapper") MessageRelationMapper messageRelationMapper,
                              @Qualifier("messageContactMapper") MessageContactMapper messageContactMapper) {
        this.messageContentMapper = messageContentMapper;
        this.messageRelationMapper = messageRelationMapper;
        this.messageContactMapper = messageContactMapper;
    }


    @Override
    public MessageVo sendMessage(String sendUid, String receiveUid, String content, short msgType) {
        //保存消息
        MessageContent messageContent = new MessageContent(sendUid, receiveUid, msgType, content);
        messageContent.setMid(UUID.randomUUID().toString());
        messageContentMapper.save(messageContent);

        String mid = messageContent.getMid();
        //保存发件箱
        MessageRelation messageRelationSender = new MessageRelation(mid, sendUid, receiveUid, MessageRelationType.SENDER.type);
        messageRelationMapper.save(messageRelationSender);

        //保存收件箱
        MessageRelation messageRelationRecipient = new MessageRelation(mid, receiveUid, sendUid, MessageRelationType.RECIPIENT.type);
        messageRelationMapper.save(messageRelationRecipient);

        //更新发件人最近联系人
        MessageContact messageContactSender = new MessageContact(sendUid, receiveUid, mid, MessageRelationType.SENDER.type);
        messageContactMapper.save(messageContactSender);

        //更新收件人最近联系人
        MessageContact messageContactRecipient = new MessageContact(receiveUid, sendUid, mid, MessageRelationType.RECIPIENT.type);
        messageContactMapper.save(messageContactRecipient);

        return null;
    }


    private enum MessageRelationType {
        /**
         * 发送方
         */
        SENDER((short) 0),
        /**
         * 接受方
         */
        RECIPIENT((short) 1);

        private final short type;

        MessageRelationType(short type) {
            this.type = type;
        }
    }

    @Override
    public List<MessageVo> getMessage(String ownerUid, String otherUid, short type) {
        List<MessageVo> messageVos;
        List<MessageContent> messageContents = messageContentMapper.query(ownerUid, otherUid);

        messageVos = messageContents.stream().map(messageContent -> {
            MessageVo messageVo = new MessageVo();
            BeanUtils.copyProperties(messageContent, messageVo);
            return messageVo;
        }).collect(Collectors.toList());

        return messageVos;
    }

    @Override
    public List<MessageVo> getMessage(String ownerUid, String otherUid, String mid, short type) {
        List<MessageVo> messageVos;
        List<MessageContent> messageContents = messageContentMapper.query(ownerUid, otherUid, mid);

        messageVos = messageContents.stream().map(messageContent -> {
            MessageVo messageVo = new MessageVo();
            BeanUtils.copyProperties(messageContent, messageVo);
            return messageVo;
        }).collect(Collectors.toList());

        return messageVos;
    }

    @Override
    public List<MessageContactVo> queryContacts(String ownerUid) {
        List<MessageContact> messageContacts = messageContactMapper.query(ownerUid);

        List<MessageContactVo> messageContactVos = messageContacts.stream().map(messageContact -> {
            MessageContactVo messageContactVo = new MessageContactVo();
            BeanUtils.copyProperties(messageContact, messageContactVo);

            return messageContactVo;
        }).collect(Collectors.toList());

        return messageContactVos;
    }
}
