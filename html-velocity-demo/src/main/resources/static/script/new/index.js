/**
 * 列表页模板
 */
var ViewUtil={
  toLaypage:function (pageTotal) {
      laypage({
          skip: true, //是否开启跳页
          skin: '#e88a6e',
          cont: $('#tpl4page'), //容器。值支持id名、原生dom对象，jquery对象,
          pages: pageTotal, //总页数
          curr:1,
          groups: 7, //连续显示分页数
          jump: function (obj, first) { //触发分页后的回调,是否是首次创建分布
              console.log(first);
              if(first){return;}
              if (!first) { //点击跳页触发函数自身，并传递当前页：obj.curr
                  console.log(obj.curr);
                  $("#pageNumber").val(obj.curr);
                  RequestUtil.initDataFun(false);
              }
          }
      });
  }
};
var RequestUtil = {
    initDataFun: function (isFristLoading) {
        var categoryId = common.getUrlParam("categoryId");
        var pageNumber = $("#pageNumber").val();
        var pageSize = $("#pageSize").val();
        if (common.isEmpty(categoryId)) {
            alert("categoryId为空");
            return;
        }
        var url = common.getContentListApiUrl(categoryId,pageNumber,pageSize);
        axios.get(url).then(function (response) {
            console.log(response.data);
            var result = response.data;
            if (result.statusCode != StatusCodeEnum.SUCCESS) {
                alert("请求失败");
                return;
            }
            vm4content.dataList = result.data.dataList;
            //是否为首次加载
            if(isFristLoading){
                ViewUtil.toLaypage(result.data.total);
            }
        });
    }
};
//VUE 放在代码的最后面
var vm4content = new Vue({
    el: "#tpl4content",
    data: {dataList: []},
    created: function () {
        RequestUtil.initDataFun(true);
    }
});