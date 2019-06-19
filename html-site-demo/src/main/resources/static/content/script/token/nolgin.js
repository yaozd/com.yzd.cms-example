/**
 * 非登录情况下的TOKEN设置问题
 */
var __TOKEN_KEY="token";
var __TOKEN=localStorage.getItem(__TOKEN_KEY);
if(common.isEmpty(__TOKEN)){
    //使用ajax同步请求的方式，保证脚本执行的顺序
    $.ajax({
        url:"/token/nologin",
        async:false,
        success: function (data) {
            //接收直接返回token方式
            localStorage.setItem(__TOKEN_KEY,data);
            console.log("from data:"+data);
        },error:function(error){
            console.log(error);
        },complete: function(XMLHttpRequest, status) {
            //请求完成后最终执行参数
            if(XMLHttpRequest.status == 200){
                //接收通过head传递token方式
                var authorization=  XMLHttpRequest.getResponseHeader('Authorization');
                console.log("from head:"+authorization);
                return;
            }
            alert("[token-nologin]:系统异常，请稍后再试");
            return;
        }
    });
}
