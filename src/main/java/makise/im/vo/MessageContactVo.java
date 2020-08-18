package makise.im.vo;

import lombok.Data;

/**
 * 最近联系人
 *
 * @author k.makise
 * @version 1.0
 * @since 2020/8/19 0:10
 */
@Data
public class MessageContactVo {
    /**
     * 拥有者id
     */
    private String ownerUid;
    /**
     * 对方id
     */
    private String otherUid;
    /**
     * 对方姓名
     */
    private String otherName;
    /**
     * 最近消息内容
     */
    private String content;

    /**
     * 未读数
     */
    private int unRead;
}
