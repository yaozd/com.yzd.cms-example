#### -CMS����
- �����ǿ��ٹ�����ʾģ����Ҫ������
- ģ�����ݵ���ʾ����ͨ�������������չʾ����nodejs��spring boot�ȱ�дhtml����ajax��ȡ��Ⱦ��ʾ

#### -CMSģ������Json��ʽ������ݻ�������
```
1.CMS->��Redis�ж�ȡDATA
2.��Redis�ж�ȡDATA
3.Mysql�ж�ȡDATA
4.��Redis��д��DATA
5.�������ݸ��ͻ���
```

#### -CMS��ַ����
- [��¼��ַ-http://localhost/admin/login](http://localhost/admin/login)

```
����CmsApplication����main����������Ŀ����������Ա��admin�����룺123456��
��ʾ��ַ[ʹ�ò���ģ�����Ĳ�����վ]���˺ţ�testdemo1�����룺testdemo1��
```
#### -CMS-������֯����
```
1.����ģ�͹�����Ҫ���ڿ��ٹ�������-���ҳ�棩
2.��Ŀ
3.��ǩ��ؼ���
```
#### -CMS-Helloworld
```
1.����վ��
2.ģ��Ŀ¼
3.ģ�͹�����Ҫ���ڿ��ٹ�������-���ҳ�棩
4.��̬��Ϊjson����
5.�ṩapi��ȡ����
---
��̬��
http://localhost/system/toStaticHtml/siteCategoryStatic

��ȡ�����б�
http://localhost/api/content/list?siteId=1&categoryId=187&orderBy=1&pageNumber=1&pageSize=10

��ȡ����
http://localhost/api/content/185
```

#### -CMS��̬����������
```
��̬��
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

#### -CMS��Ϣ��ȡSQL
```
1.�ֶ�����ʱ��Ҫ���»���,���磺c.view_num viewNum
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