package makise.im.service.impl;

import makise.im.entity.MessageContent;
import makise.im.mapper.MessageContentMapper;
import makise.im.mapper.MessageRelationMapper;
import makise.im.service.MessageService;
import makise.im.vo.MessageVo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 19:16
 */
@Service
public class MessageServiceImpl implements MessageService {

    private final MessageContentMapper messageContentMapper;
    private final MessageRelationMapper messageRelationMapper;

    public MessageServiceImpl(@Qualifier("messageContentMapper") MessageContentMapper messageContentMapper,
                              @Qualifier("messageRelationMapper") MessageRelationMapper messageRelationMapper) {
        this.messageContentMapper = messageContentMapper;
        this.messageRelationMapper = messageRelationMapper;
    }

    @Override
    public int save(MessageContent messageContent) {
        return 0;
    }

    @Override
    public List<MessageVo> getMessage(String ownerUid, String otherUid, short type) {
        return null;
    }
}
