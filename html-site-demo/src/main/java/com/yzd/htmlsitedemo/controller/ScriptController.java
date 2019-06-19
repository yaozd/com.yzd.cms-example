package com.yzd.htmlsitedemo.controller;

import com.yzd.htmlsitedemo.utils.FastJsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("script")
public class ScriptController {
    @GetMapping("perms")
    @ResponseBody
    public String perms() {
        return "alert('最先执行脚本的是/script/perms')";
    }

    /**
     * 验证js脚本的执行顺序
     * @return
     */
    @GetMapping("perms-load")
    @ResponseBody
    public String permsLoad() {
        return readScript("script/perms-load.js");
    }

    /**
     * 权限模板
     * @return
     */
    @GetMapping("perms-load-tpl")
    @ResponseBody
    public String permsLoadTpl() {
        //占位符
        String place="DATA_PLACE";
        //当前用户权限
        List<String> permsList=new ArrayList<>();
        permsList.add("user:admin");
        permsList.add("user:add");
        permsList.add("user:update");
        String permsJson=FastJsonUtil.serialize(permsList);
        //脚本模板
        String tpl=readScript("script/perms-load-tpl.js");
        return tpl.replace(place,permsJson);
    }

    /**
     * 用户没有登录的情况下，自动跳转到登录页面
     * @return
     */
    @GetMapping("perms-load-nologin")
    @ResponseBody
    public String permsLoadNoLogin() {
        return readScript("script/perms-load-nologin.js");
    }
    /**
     * 读取Script脚本文件
     * @param filePath
     * @return
     */
    private String readScript(String filePath) {
        String script = "";
        InputStream stream=null;
        try {
            stream = ScriptController.class.getClassLoader().getResourceAsStream(filePath);
            if(stream==null){
                return "FILE NOT FOUND!";
            }
            script = IOUtils.toString(stream,"utf-8");
        } catch (IOException e) {
            log.error("Exception:", e);
        } finally {
            IOUtils.closeQuietly(stream);
        }
        return script;
    }
}
