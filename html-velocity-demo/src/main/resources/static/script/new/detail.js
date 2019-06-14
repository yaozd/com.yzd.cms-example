/**
 *
 */
var RequestUtil = {
    initData4ContentFun: function () {
        var id = common.getUrlParam("id");
        if (common.isEmpty(id)) {
            alert("id为空");
            return;
        }
        var url = common.getContentDetailApiUrl(id);
        axios.get(url)
            .then(function (response) {
                //console.log(response.data);
                var result = response.data;
                if (result.statusCode != StatusCodeEnum.SUCCESS) {
                    alert("请求失败");
                    return;
                }
                vm4content.content = result.data;
            });
    }
}
//VUE 放在代码的最后面
var vm4content = new Vue({
    el: "#tpl4content",
    data: {content: {}},
    created: function () {
        RequestUtil.initData4ContentFun();
    }
});