$(function () {
    $(".item-name > i").click(function(){
        $(this).parent().parent().toggleClass("unfold")
        $(this).parent().parent().find("ul:first").slideToggle(500);
        $(this).toggleClass("unfold");
        $(this).parent().children(".filename").toggleClass("filename-open");
    });
});
$(function () {
    $(".checkbox").click(function (){
        $(this).toggleClass("c-selected");
    });
});

$(function () {
    $(".nav-trunk>li").click(function () {
        $(this).siblings(".nav-trunk>li").find('.nav-trunk').slideUp();
    })
})


function formatOper(value,row,index){

    return '<a href="javascript:void(0);" onclick="bianjiUser('+index+')">编辑</a> <a href="javascript:void(0);" onclick="shanchuUser('+index+')">删除</a>';
};

//+++++增加用户+++++
function add(){
    $('#add').dialog('open').dialog({
        title:增加用户,
        modal: true
    });
};

function queding(){

    var message={
        "username":$("#username").val(),
        "rolename":$("#rolename").val(),
    };
    if($("#username").val()!=""&&$("#rolename").val()!="")
    {
        $.ajax({
            type:"post",
            url:"servlet/adduserServlet",
            data:{"Message":JSON.stringify(message)},
            success:function(){
                $('#dg1').datagrid('reload');
                alert("添加成功！");
                $("#username").val("");
                $("#rolename").val("");
            }
        })


    }
    else{alert("请填写完整！");
        $("#username").val("");
        $("#rolename").val("");
    }
}
//++++++++++用户编辑+++++++++++++
function  bianjiUser(index){

    alert(index);
}

//++++++++++++用户删除++++++++++++++++
function shanchuUser(index){
    $.ajax({
        type:"post",
        url:"servlet/shanchuServlet",
        data:{"index":index},
        success:function(){
            $("#dg1").datagrid('reload');
        }
    });

}



// $('#f').combobox({
//     url:'combobox_data.json',
//     valueField:'id',
//     textField:'text',
//     loadFilter:function(data){
//         var obj={};
//         obj.id='';
//         obj.text='-请选择-'
//         data.splice(0,0,obj)//在数组0位置插入obj,不删除原来的元素
//         return data;
//
//     }
//
//
// });


//复选框
$(function () {
    $('.all').on('click',function () {
        if ($(this).prop("checked")) {
            // $('input:checkbox').attr("checked", true);
            $(".checkbox").toggleClass("c-selected");
        } else {
            $('input:checkbox').attr("checked", false);
        }
    })
})

//重置
$('.reset').on('click',function () {
    $('input:checkbox').attr("checked", false);
})