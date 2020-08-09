package makise.im;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/9 12:08
 */
@SpringBootApplication
@MapperScan(basePackages = "makise.im.mapper")
public class ImApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImApplication.class);
    }
}
