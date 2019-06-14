package com.zhiliao;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import com.zhiliao.module.web.cms.service.ContentService;
import com.zhiliao.mybatis.mapper.TCmsContentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * Description:content test
 *
 * @author Jin
 * @create 2017-05-23
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CmsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class ContentTest {

    @Autowired
    private ContentService contentService;

    @Autowired
    private TCmsContentMapper contentMapper;

    public void findContentByContentIdAndTbleName() {
        Map map = contentService.findContentByContentIdAndTableName(1l, "ceshi");
        map.forEach((key, value) -> System.out.println(key + " --> " + value));
    }

    @Test
    public void findContentListByCategoryIdAndSiteId() {
        PageInfo<Map> t = contentService.findContentListBySiteIdAndCategoryId(1, 181L, 1, 3, 1, 0, 0, 0, 0);
        System.out.println();
    }


    public void findContentPageByTableNameAndParam() {
        Map param = Maps.newHashMap();
        param.put("nianling", 25);
        param.put("danxuan", 2);
        contentMapper.selectByTableNameAndMap("ceshi", 32l, param);
    }


}
