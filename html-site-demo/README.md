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

###　通过js做权限控制
- [navigation.html](http://localhost:1222/html/navigation.html)-权限导航测试
- [script-execute-sequence.html](http://localhost:1222/html/script-execute-sequence.html)-JS脚本执行顺序
- [script-execute-sequence-2.html](http://localhost:1222/html/script-execute-sequence-2.html)-JS脚本执行顺序
- [script-execute-sequence-3.html](http://localhost:1222/html/script-execute-sequence-3.html)-Js在html中的加载执行顺序-最先加载当前用户权限
- [script-execute-sequence-4.html](http://localhost:1222/html/script-execute-sequence-4.html)-Js在html中的加载执行顺序-用户没有登录的情况下，自动跳转到登录页面
- [script-execute-sequence-5.html](http://localhost:1222/html/script-execute-sequence-5.html)-Js在html中的加载执行顺序-使用ajax同步请求的方式，保证脚本执行的顺序
- [script-execute-sequence-6.html](http://localhost:1222/html/script-execute-sequence-6.html)-Js在html中的加载执行顺序-使用ajax获得权限，然后再控制导航显示
- PS:特别注意:"\</script>"起到一个缓冲的作用，必须带上
    ```
    正确引用方式：
        <script type="text/javascript" src="/script/perms-load"></script>
        <script type="text/javascript" src="/script/perms"></script>
    错误引用方式：
        <script type="text/javascript" src="/script/perms-load"/>
        <script type="text/javascript" src="/script/perms"/>
    ```
 ### 通过js做权限控制-参考：
 - [js在html中的加载执行顺序](https://www.cnblogs.com/lindaWei/archive/2012/04/05/2433454.html)
 - [jQuery Ajax 设置请求头](https://blog.csdn.net/WRian_Ban/article/details/70257261)

### 非登录情况下的TOKEN设置问题
- [token-nolgin.html](http://localhost:1222/html/token-nolgin.html)-非登录情况下的TOKEN设置问题

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