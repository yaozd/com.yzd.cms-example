/*
package com.yzd.httpServer.conf;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

*/
/**
 * 解决前后端分离的 CORS 跨域资源共享问题
 * 但拦截处理器，不分拦截静态资源请，所以要使用过滤器
 * Created by Administrator on 2016/10/10.
 *//*
 //----------------------------------------------------
public class WebMvcConfig extends WebMvcConfigurerAdapter
//拦截处理器，不分拦截静态资源请，所以要使用过滤器
//所以下面配置是错误的。
@Override
public void addInterceptors(InterceptorRegistry registry) {

    registry.addInterceptor(new CORSFInterceptor()).addPathPatterns("/**");

    super.addInterceptors(registry);

}
 //----------------------------------------------------

public class CORSFInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
*/
