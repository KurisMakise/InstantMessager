package makise.im.controller;

import makise.im.service.MessageService;
import makise.im.vo.MessageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 消息控制器
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 19:12
 */
@RestController
@RequestMapping("message")
public class MessageController {

    private final MessageService messageService;

    public MessageController(@Qualifier("messageServiceImpl") MessageService messageService) {
        this.messageService = messageService;
    }

    /**
     * @param ownerId 用户ID
     * @param otherId 对方用户ID
     * @return 消息列表
     */
    @GetMapping("list")
    List<MessageVo> list(String ownerId, String otherId, short type) {
        return messageService.getMessage(ownerId, otherId, type);
    }
}
