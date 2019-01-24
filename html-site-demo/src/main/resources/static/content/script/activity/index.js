//========================================
var model = {
    itemList:[]
};
var vm = new Vue({
    el: "#contentTpl",
    data: model,
    created:function(){
        getData();
    }
});
function getData() {
    axios.get('/api/activity/getList')
        .then(function (response) {
            vm.itemList=response.data.data;
        });
}