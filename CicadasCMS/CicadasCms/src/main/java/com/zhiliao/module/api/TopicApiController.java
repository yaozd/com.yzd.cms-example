package com.zhiliao.module.api;

import com.github.pagehelper.PageInfo;
import com.zhiliao.common.annotation.ParamNotNull;
import com.zhiliao.common.constant.CmsConst;
import com.zhiliao.common.exception.ApiException;
import com.zhiliao.common.utils.CmsUtil;
import com.zhiliao.common.utils.JsonUtil;
import com.zhiliao.module.web.cms.service.ContentService;
import com.zhiliao.module.web.cms.service.SiteService;
import com.zhiliao.module.web.cms.service.TopicService;
import com.zhiliao.mybatis.model.TCmsCategory;
import com.zhiliao.mybatis.model.TCmsSite;
import com.zhiliao.mybatis.model.TCmsTopic;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/topic")
public class TopicApiController {
    @Autowired
    SiteService siteService;
    @Autowired
    ContentService contentService;
    @Autowired
    TopicService topicService;

    @ApiOperation("专题列表接口")
    @GetMapping(value = "/list")
    @ParamNotNull(parameter="siteId,topicId")
    public String list(@RequestParam("siteId") Integer siteId,
                       @RequestParam("topicId") Integer topicId,
                       @RequestParam(value = "isRecommend",defaultValue = "0") Integer isRecommend,
                       @RequestParam(value = "isHot",defaultValue = "0") Integer isHot,
                       @RequestParam(value = "orderBy",defaultValue = "1") Integer orderBy,
                       @RequestParam(value = "isPic",required = false) Integer isPic,
                       @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize
    ){
        TCmsSite site = siteService.findById(siteId);
        if(CmsUtil.isNullOrEmpty(site))
            throw new ApiException("["+siteId+"]"+CmsConst.SITE_NOT_FOUND);
        TCmsTopic topic=topicService.findById(topicId);
        if(CmsUtil.isNullOrEmpty(topic))
            throw new ApiException("["+topicId+"]"+CmsConst.TOPIC_NOT_FOUND);
        /*将专题中的categoryIds 字符串转为Long数组*/
        String[] topicsStr = topic.getCategoryIds().split(",");
        Long[] str2 = new Long[topicsStr.length];
        for (int i = 0; i < topicsStr.length; i++) {
            str2[i] = Long.valueOf(topicsStr[i]);
        }
        PageInfo<Map> page = contentService.findTopicContentListBySiteIdAndCategoryIds(siteId, str2, orderBy, pageSize, isHot, isPic,isRecommend);
        return JsonUtil.toSuccessResultJSON("请求成功",page.getList());
    }

}
