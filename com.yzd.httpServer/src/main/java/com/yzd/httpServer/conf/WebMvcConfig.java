package com.yzd.httpServer.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.File;

/**
 * Created by zd.yao on 2017/11/22.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    private static Logger logger=LoggerFactory.getLogger(WebMvcConfig.class);
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
        //注：file后面的目录必须是闭合的。否则会找不到文件，提示404错误
        //下面配置是正确的file:C:\\Users\\proc\\Documents\\com.yzd.cms-example\\CicadasCMS\\CicadasCms\\cmsstaticfile\\
        //registry.addResourceHandler("/html/**").addResourceLocations("file:C:\\Users\\proc\\Documents\\com.yzd.cms-example\\CicadasCMS\\CicadasCms\\cmsstaticfile\\");
        //下面配置是错误的file:C:\\Users\\proc\\Documents\\com.yzd.cms-example\\CicadasCMS\\CicadasCms\\cmsstaticfile
        //registry.addResourceHandler("/html/**").addResourceLocations("file:C:\\Users\\proc\\Documents\\com.yzd.cms-example\\CicadasCMS\\CicadasCms\\cmsstaticfile");
        //File.separator
        logger.info("静态资源目录："+cmsStaticPath);
        registry.addResourceHandler("/html/**").addResourceLocations("file:"+cmsStaticPath);

    }
    @Bean
    public EmbeddedServletContainerFactory createEmbeddedServletContainerFactory() {
        TomcatEmbeddedServletContainerFactory tomcatFactory = new TomcatEmbeddedServletContainerFactory();
        tomcatFactory.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
        return tomcatFactory;
    }
}
