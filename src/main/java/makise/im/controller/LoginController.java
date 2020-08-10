package makise.im.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 登录
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/8/9 18:44
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @PutMapping
    public Object login() {
        return null;
    }

}
