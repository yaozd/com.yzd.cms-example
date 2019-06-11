### 地址
- [axios.html](http://localhost:1222/html/axios.html)
- [corsf.html](http://localhost:1222/html/corsf.html)
- [corsf-cms.html](http://localhost:1222/html/corsf-cms.html)
- [textarea.html](http://localhost:1222/html/textarea.html)
- [vue-nocorsf.html](http://localhost:1222/html/vue-nocorsf.html)
- [vue-corsf.html](http://localhost:1222/html/vue-corsf.html)
- [vue-list.html](http://localhost:1222/html/vue-list.html)
- [vue-page-1.html](http://localhost:1222/html/vue-page-1.html)
- [vue-page-2.html](http://localhost:1222/html/vue-page-2.html)
- [vue-css.html](http://localhost:1222/html/vue-css.html)


### 工具
- [JSON在线编辑器-BeJSON.com](http://www.bejson.com/jsoneditoronline/)

> FORM-jQuery序列化表单 serialize() serializeArray()
```
1.serialize()
$("#defaultForm").serialize();
-------------------------------
2.serializeArray()
$("#defaultForm").serializeArray();
-------------------------------
3.serializeObject
$("#defaultForm").serializeObject()
===
 var $form = $("#insertFormId");
 var submitModel = $form.serializeObject();
 submitModel.id=id;
-------------------------------
4.StringBuffer
var formBuffer = new StringBuffer().append("id="+id);
formBuffer.toParam()
===
var model.searchWhere=$("#form-searchWhere").serialize();
var pagerIndex=curr || 1;
var pageSize= $('#pageSize option:selected').val();//选中的值;
var formBuffer = new StringBuffer().append(model.searchWhere).append("pageIndex="+pagerIndex).append("pageSize="+pageSize);
-------------------------------
5.FormData使用方法详解
https://www.jianshu.com/p/e984c3619019
```

### axios-增删改查-模板
```
script>activity>add.js、edit.js index.js
```