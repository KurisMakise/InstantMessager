package makise.im.entity;

import lombok.Data;

/**
 * 消息索引
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 18:05
 */
@Data
public class MessageRelation {
    /**
     * 消息ID
     */
    private String mid;

    private String ownerId;

    private String otherId;

    private short type;


}
