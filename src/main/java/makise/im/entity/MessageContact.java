package makise.im.entity;

import lombok.Data;

/**
 * @author k.makise
 * @version 1.0
 * @since 2020/8/18 0:19
 */
@Data
public class MessageContact {
    public MessageContact(String ownerUid, String otherUid, String mid, short type) {
        this.ownerUid = ownerUid;
        this.otherUid = otherUid;
        this.mid = mid;
        this.type = type;
    }

    /**
     * 当前用户
     */
    private String ownerUid;
    /**
     * 对方用户
     */
    private String otherUid;
    /**
     * 消息ID
     */
    private String mid;
    /**
     * 消息类型 {@link makise.im.service.impl.MessageServiceImpl.MessageRelationType}
     */
    private short type;


}
