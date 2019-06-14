/**
 *  工具类
 **/
(function () {
    //页面公共对象
    var common = {
        apiOrigin: "http://localhost:2380",
        getContentApiUrl:function(id){
            var url=common.apiOrigin+"/api/content/"+id+".json";
            return url;
        },
        //获取url参数
        getUrlParam: function (name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
            var r = window.location.search.substr(1).match(reg);
            if (r != null){
                var paramValue=unescape(r[2]);
                return xssEscapeHtml(paramValue);
            } else return null;
        },
        //显示文本内容
        toText: function (obj) {
            if (obj == null) {
                return '';
            }
            return obj.toString();
        },
        //将时间戳转日期格式
        formatDateTime: function (inputTime) {
            var date = new Date(inputTime);
            var y = date.getFullYear();
            var m = date.getMonth() + 1;
            m = m < 10 ? ('0' + m) : m;
            var d = date.getDate();
            d = d < 10 ? ('0' + d) : d;
            var h = date.getHours();
            h = h < 10 ? ('0' + h) : h;
            var minute = date.getMinutes();
            var second = date.getSeconds();
            minute = minute < 10 ? ('0' + minute) : minute;
            second = second < 10 ? ('0' + second) : second;
            return y + '-' + m + '-' + d+' '+h+':'+minute+':'+second;
        },
        isNotEmpty:  function(val){
            return !this.isEmpty(val);
        },
        isEmpty: function(val){
            if ((val==null || typeof(val)=="undefined")|| (typeof(val)=="string"&&val==""&&val!="undefined")){
                return true;
            }else{
                return false;
            }
        }
    };
    window.common = common;
})(jQuery);
/**
 * Jquery中避免部分XSS漏洞
 * 解决办法：将请求参数的字符串中的特殊符号进行转义
 * @param obj
 * @returns {string}
 */
function xssEscapeHtml(obj) {
    return(obj)?obj.replace(/</g, '&lt;').replace(/>/g, '&gt;'):"";
}
/**
 * 请求状态
 * @type {{SUCCESS: number}}
 */
var StatusCodeEnum = {
    SUCCESS:0
};
/**
 * vue全局方法--时间格式化
 */
Vue.prototype.formatDate =function (inputTime) {
     return common.formatDateTime(inputTime);
};
Vue.prototype.thumbImg =function (inputImg) {
    return common.isEmpty(inputImg)?"/":inputImg;
};