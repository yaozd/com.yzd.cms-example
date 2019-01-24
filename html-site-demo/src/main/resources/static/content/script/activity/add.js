//========================================
var model = {
    item:[]
};
var vm = new Vue({
    el: "#contentTpl",
    data: model,
    created:function(){
        getData();
    },
    //方法，可用于绑定事件或直接调用
    methods:{
        submitBtn:function () {
            submitBtn();
        }
    }
});
function getData() {
    
}
function submitBtn(){
    var formValue = $("#defaultForm").serializeObject();
    axios.post("/api/activity/doInsert",formValue)
        .then(function (response) {
            var result=response.data;
            if(result.code==200){
                window.location.href="/activity/index";
            }
        });
}