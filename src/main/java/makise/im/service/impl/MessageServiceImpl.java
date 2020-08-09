package makise.im.service.impl;

import makise.im.entity.MessageContent;
import makise.im.service.MessageService;
import makise.im.vo.MessageVo;

import java.util.List;

/**
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 19:16
 */
public class MessageServiceImpl implements MessageService {
    @Override
    public int save(MessageContent messageContent) {
        return 0;
    }

    @Override
    public List<MessageVo> getMessage(String ownerUid, String otherUid) {
        return null;
    }
}
