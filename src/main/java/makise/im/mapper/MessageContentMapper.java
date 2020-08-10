package makise.im.mapper;

import makise.im.entity.MessageContent;

import java.util.List;

/**
 * 消息查询
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/9 12:03
 */
public interface MessageContentMapper {

    /**
     * 保存消息内容
     *
     * @param messageContent 消息内容
     * @return 保存成功
     */
    int save(MessageContent messageContent);

    /**
     * 更新消息内容
     *
     * @param messageContent 消息内容
     * @return 更新成功
     */
    int update(MessageContent messageContent);

    /**
     * 查询消息列表
     *
     * @param ownerUid 用户ID
     * @return 消息列表
     */
    List<MessageContent> query(String ownerUid);

}
