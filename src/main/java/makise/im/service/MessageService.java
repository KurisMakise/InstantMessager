package makise.im.service;

import makise.im.entity.MessageContent;
import makise.im.vo.MessageVo;

import java.util.List;

/**
 * 消息服务
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 19:16
 */
public interface MessageService {

    /**
     * 服务器存储用户信息
     *
     * @param messageContent 消息内容
     * @return 0保存失败 1保存成功
     */
    int save(MessageContent messageContent);

    /**
     * 获取用户消息
     *
     * @param ownerUid 当前用户
     * @param otherUid 对方用户
     * @param type     消息类型
     * @return 消息列表
     */
    List<MessageVo> getMessage(String ownerUid, String otherUid, short type);
}
