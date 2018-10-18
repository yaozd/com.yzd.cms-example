#### -CMS本质
- 本质是快速构建显示模板需要的数据
- 模板数据的显示可以通过其他主体进行展示，如nodejs、spring boot等编写html后再ajax读取渲染显示

#### -CMS模板数据Json形式后的数据缓存流程
```
1.CMS->从Redis中读取DATA
2.主Redis中读取DATA
3.Mysql中读取DATA
4.主Redis中写入DATA
5.返回数据给客户端
```

#### -CMS地址导航
- [登录地址-http://localhost/admin/login](http://localhost/admin/login)

```
运行CmsApplication类下main方法启动项目（超级管理员：admin，密码：123456）
演示地址[使用博客模版做的博客网站]（账号：testdemo1，密码：testdemo1）
```
#### -CMS-数据组织构成
```
1.数据模型管理（主要用于快速构建数据-添加页面）
2.栏目
3.标签或关键词
```
#### -CMS-Helloworld
```
1.创建站点
2.模板目录
3.模型管理（主要用于快速构建数据-添加页面）
4.静态化为json数据
5.提供api读取数据
---
静态化
http://localhost/system/toStaticHtml/siteCategoryStatic

获取内容列表
http://localhost/api/content/list?siteId=1&categoryId=187&orderBy=1&pageNumber=1&pageSize=10

获取内容
http://localhost/api/content/185
```

#### -CMS静态化处理流程
```
静态化
http://localhost/system/toStaticHtml/siteCategoryStatic
1.
HtmlStaticController
siteCategoryStatic
2.
com.zhiliao.module.web.cms.service.impl
HtmlStaticServiceImpl.content
3.
com.zhiliao.component.beetl.html
beetlHtmlUtil.create
```

#### -CMS信息读取SQL
```
1.字段名命时不要加下滑线,例如：c.view_num viewNum
<select id="selectByContentIdAndTableName"  resultType="java.util.Map">
      SELECT
       c.content_id contentId,
       c.site_id siteId,
       c.user_id userId,
       c.category_id categoryId,
       c.model_id modelId,
       c.title,
       c.keywords,
       c.description,
       c.top,
       c.recommend,
       c.thumb,
       c.updatedate,
       c.inputdate,
       c.status,
       c.url,
       c.author,
       c.view_num viewNum,
       m.*
      FROM
       t_cms_content c  LEFT JOIN  t_cms_content_${tableName}  m
      ON
       c.content_id = m.content_id
      WHERE
      c.content_id =#{contentId}
  </select>
```