package makise.im.mapper;

import makise.im.entity.MessageRelation;

import java.util.List;

/**
 * 关联消息
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/9 12:28
 */
public interface MessageRelationMapper {
    /**
     * 保存用户
     *
     * @param messageRelation 关联消息
     * @return 是否成功
     */
    int save(MessageRelation messageRelation);

    /**
     * 更新用户
     *
     * @param messageRelation 关联消息
     * @return 是否成功
     */
    int update(MessageRelation messageRelation);

    /**
     * 删除用户
     *
     * @param messageRelation 关联消息
     * @return 是否成功
     */
    int delete(MessageRelation messageRelation);

    /**
     * 查询
     *
     * @param ownerUid 用户ID
     * @param otherUid 对方ID
     * @param type     类型
     * @return 消息索引
     */
    MessageRelation queryByOwnerId(String ownerUid, String otherUid, short type);

    /**
     * 查询用户所有关联消息
     *
     * @param ownerUid 发送方
     * @param otherUid 接收方
     * @return 消息索引列表
     */
    List<MessageRelation> queryAll(String ownerUid, String otherUid);

}
