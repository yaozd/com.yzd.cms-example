import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zd.yao on 2017/11/22.
 */
@SpringBootApplication
@ComponentScan("com.yzd.httpServer")
public class Application extends SpringBootServletInitializer {

    //spring boot 使用application.properties 进行外部配置
    //http://blog.csdn.net/yingxiake/article/details/51260302

    /**
     * Used when run as JAR
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Used when run as WAR
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}