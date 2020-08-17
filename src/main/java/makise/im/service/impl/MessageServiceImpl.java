package makise.im.service.impl;

import makise.im.entity.MessageContact;
import makise.im.entity.MessageContent;
import makise.im.entity.MessageRelation;
import makise.im.mapper.MessageContactMapper;
import makise.im.mapper.MessageContentMapper;
import makise.im.mapper.MessageRelationMapper;
import makise.im.service.MessageService;
import makise.im.vo.ContactInfoVo;
import makise.im.vo.MessageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 19:16
 */
@Service
public class MessageServiceImpl implements MessageService {

    private final MessageContentMapper messageContentMapper;
    private final MessageRelationMapper messageRelationMapper;
    @Autowired
    private MessageContactMapper messageContactMapper;

    public MessageServiceImpl(@Qualifier("messageContentMapper") MessageContentMapper messageContentMapper,
                              @Qualifier("messageRelationMapper") MessageRelationMapper messageRelationMapper) {
        this.messageContentMapper = messageContentMapper;
        this.messageRelationMapper = messageRelationMapper;
    }


    @Override
    public MessageVo sendMessage(String sendUid, String receiveUid, String content, short msgType) {
        //保存消息
        MessageContent messageContent = new MessageContent(sendUid, receiveUid, msgType, content);
        messageContent.setMid(UUID.randomUUID().toString());
        messageContentMapper.save(messageContent);

        String mid = messageContent.getMid();

        short type = 0;
        //保存发件箱
        MessageRelation messageRelationSender = new MessageRelation(mid, sendUid, receiveUid, MessageRelationType.SENDER.type);
        messageRelationMapper.save(messageRelationSender);

        //保存收件箱
        MessageRelation messageRelationRecipient = new MessageRelation(mid, receiveUid, sendUid, MessageRelationType.RECIPIENT.type);
        messageRelationMapper.save(messageRelationRecipient);


        //更新发件人最近联系人
        MessageContact messageContactSender = new MessageContact();


        //更新收件人最近联系人
        MessageContact messageContactRecipient = new MessageContact();


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
        return null;
    }

    @Override
    public List<MessageVo> getMessage(String ownerUid, String otherUid, String msgId, short type) {
        return null;
    }

    @Override
    public List<ContactInfoVo> queryContacts(String ownerUid) {
        return null;
    }
}
