package makise.im.entity;

import lombok.Data;

/**
 * 消息索引，保存两份
 * 发送方保存一份，接收方保存一份
 * 发送方通过ID一次查询出所有消息
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 18:05
 */
@Data
public class MessageRelation {

    public MessageRelation(String mid, String ownerId, String otherId, short type) {
        this.mid = mid;
        this.ownerId = ownerId;
        this.otherId = otherId;
        this.type = type;
    }

    /**
     * 消息ID
     */
    private String mid;

    private String ownerId;

    private String otherId;

    private short type;


}
