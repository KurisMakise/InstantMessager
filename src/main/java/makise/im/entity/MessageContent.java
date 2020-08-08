package makise.im.entity;

import lombok.Data;

import java.util.Date;

/**
 * 消息内容
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 18:04
 */
@Data
public class MessageContent {
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
    private short type;
    /**
     * 创建时间
     */
    private Date createTime;
}
