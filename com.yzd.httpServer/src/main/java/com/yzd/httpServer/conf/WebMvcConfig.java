package com.yzd.httpServer.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zd.yao on 2017/11/22.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    //启动时加入参数 -Dcms.static.path=E:\opc_workspace\opc\conf
    @Value("${cms.static.path}")
    private String cmsStaticPath;

    //设置静态资源目录
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //参考： Spring Boot 静态资源处理
        //http://blog.csdn.net/catoop/article/details/50501706
        // Resources controlled by Spring Security, which
        // adds "Cache-Control: must-revalidate".
        /* registry.addResourceHandler("/feedbacks*//**")
                .addResourceLocations("classpath:/feedbacks/")
                .setCachePeriod(3600 * 24 * 100);//设置静态资源缓存时间为100天*/
        //测试
        //registry.addResourceHandler("/myimgs/**").addResourceLocations("file:G:/myimgs/");
        registry.addResourceHandler("/html/**").addResourceLocations("file:"+cmsStaticPath);

    }
}
