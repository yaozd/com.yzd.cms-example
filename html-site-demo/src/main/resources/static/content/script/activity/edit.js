//========================================
var model = {
    item: []
};
var vm = new Vue({
    el: "#contentTpl",
    data: model,
    created: function () {
        getData();
    },
    //方法，可用于绑定事件或直接调用
    methods: {
        submitBtn: function () {
            submitBtn();
        }
    }
});

//GET请求时推荐使用：StringBuffer的形式
function getData() {
    var formValue = new StringBuffer().append("id=" + common.getUrlParam("id"));
    axios.get('/api/activity/getItem?'+ formValue.toParam())
        .then(function (response) {
            var result = response.data;
            vm.item = result.data;
        });
}

function getDataSimple() {
    var param = common.getUrlParam("id");
    axios.get('/api/activity/getItem?id=' + param)
        .then(function (response) {
            var result = response.data;
            vm.item = result.data;
        });
}

function submitBtn() {
    var formValue = $("#defaultForm").serializeObject();
    axios.post("/api/activity/doUpdate", formValue)
        .then(function (response) {
            var result = response.data;
            if (result.code == 200) {
                window.location.href = "/activity/index";
            }
        });
}