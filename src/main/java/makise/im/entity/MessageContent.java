package makise.im.entity;

import lombok.Data;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

/**
 * 消息内容
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 18:04
 */
@Data
public class MessageContent {

    public MessageContent(String sendId, String receiveId, short msgType, String content) {
        this.content = content;
        this.sendId = sendId;
        this.receiveId = receiveId;
        this.msgType = msgType;
        this.createTime = new Date();
    }

    /**
     * 消息ID
     */
    private String mid;
    /**
     * 消息内容
     */
    private String content;
    /**
     * 发送人ID
     */
    private String sendId;
    /**
     * 接收人ID
     */
    private String receiveId;
    /**
     * 消息类型
     */
    private short msgType;
    /**
     * 创建时间
     */
    private Date createTime;
}
