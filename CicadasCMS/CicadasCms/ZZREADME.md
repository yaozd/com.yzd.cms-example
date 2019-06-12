
### 测试地址
- [http://localhost:2380/admin/login](http://localhost:2380/admin/login)
    ```
    超级管理员：admin，密码：123456
    账号：testdemo1，密码：testdemo1
    ```
## 1.简单的使用教程
```
核心功能：
1.用户权限管理
2.内容发布
PS:生成静态资源与任务调度这些都不重要
```
### -CMS建站使用方法-两步即可。
```
1.创建站点
2.创建内容模型：系统管理=》模型管理
eg：表名就是模型的拼音：测试模型-ceshimoxing
    可以自定义字段-通过自定义字段的形式来无限扩展。
PS:错误的表名t_cms_content_t_cms_ceshimoban
3.创建栏目
4.创建文章
```

### -AJAX接口方法使用-两步即可。
```
1.系统管理=》接口列表
2.根据栏目ID获得内容列表：content-api-controller=》/api/content/list
eg:
http://localhost:2380/api/content/list?siteId=1&categoryId=181&orderBy=1&pageNumber=1&pageSize=10
3.根据内容ID获得内容详情：content-api-controller=》/api/content/{contentId}
eg:
http://localhost:2380/api/content/184
4.通过VUE把数据显示出来即可。
```
### -用户与站点管理
```
站点管理=》编辑=》管理员
PS:通过管理员可以控制站点使用权限
-----------------
- 涉及数据表：
t_cms_user_site
t_cms_site
t_sys_user
-----------------
SiteServiceImpl.save(TCmsSiteVo pojo)

```
### -自定义扩展管理（extend模块）
- 通过extend扩展模块，来满足用户的个性化需求。
```
eg:
extend模块=》AdvertiseController(招聘模块)
extend=>advertise.html
```

### 参考地址
- [https://gitee.com/westboy/CicadasCMS](https://gitee.com/westboy/CicadasCMS)
- [CicadasCMS](https://gitee.com/westboy/CicadasCMS)-推荐参考-byArvin

##### 1、相关技术
- springboot
- mybatis
- TkMyBatis
    - [tk.mybatis 的入门分享](https://blog.csdn.net/qq_37751454/article/details/81562911)
    - [TkMyBatis大杂烩](https://blog.csdn.net/baijifeilong/article/details/80832908)
- [beetl](http://www.ibeetl.com "beetl")
- shiro
- [mybatis通用mapper](http://git.oschina.net/free/Mapper "通用mapper")（整合maven方式代码生成）
- [七牛云存储](https://portal.qiniu.com/signup?code=3lb7ah8vdj0ia "七牛云存储")
- [B-JUI](http://b-jui.cn)
- [B-JUI v1.2](http://b-jui.cn/1.2/)
    - 备份下载：个人项目-开源>com.yzd.cms-example>B-JUI.1.2>B-JUI.1.2.ZIP