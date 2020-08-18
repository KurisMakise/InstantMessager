package makise.im.vo;

import lombok.Data;

/**
 * 消息
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 20:05
 */
@Data
public class MessageVo {
    /**
     * 数据拥有方
     */
    private String ownerUid;
    /**
     * 对方ID
     */
    private String otherUid;
    /**
     * 对方名称
     */
    private String otherName;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 消息类型 {@link makise.im.service.impl.MessageServiceImpl.MessageRelationType}
     */
    private short type;
}
