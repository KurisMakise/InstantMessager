package makise.im.service;

import makise.im.entity.MessageContent;
import makise.im.vo.ContactInfoVo;
import makise.im.vo.MessageVo;

import java.util.Date;
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
     * 发送消息
     *
     * @param sendUid    发送方ID
     * @param receiveUid 接收方ID
     * @param content    消息内容
     * @param msgType    消息类型，用户消息，系统消息
     * @return 消息对象
     */
    MessageVo sendMessage(String sendUid, String receiveUid, String content, short msgType);


    /**
     * 获取用户消息
     *
     * @param ownerUid 当前用户
     * @param otherUid 对方用户
     * @param type     消息类型
     * @return 消息列表
     */
    List<MessageVo> getMessage(String ownerUid, String otherUid, short type);

    /**
     * 获取某条消息之后的消息
     *
     * @param ownerUid 当前用户ID
     * @param otherUid 对方用户ID
     * @param msgId    消息ID
     * @param type     消息类型
     * @return 消息列表
     */
    List<MessageVo> getMessage(String ownerUid, String otherUid, String msgId, short type);


    /**
     * 查询最近联系人
     *
     * @param ownerUid 用户ID
     * @return 最近联系人列表
     */
    List<ContactInfoVo> queryContacts(String ownerUid);
}
