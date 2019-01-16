$(function () {
    var dialog = $('#dialog');
    var form = $('form');
    $('#datagrid').datagrid({
        url:'queryAllPanyuUser',//数据来源
        columns:[[
            {field:'',checkbox:true},
            {field:'roleName',title:'角色名',width:300,align:'center'},
            {field:'role',title:'角色',width:300,align:'center'},
        ]],
        rownumbers:true,//显示行号
        singleSelect:true,//是否单选
        pagination:true,//显示分页栏
        pageList:[10,20,50,100],//每页行数选择列表
        pageSize:10,//出示每页行数
        remoteSort:true,//是否服务器端排序，设成false，才能客户端排序
        //  sortName:'sno',//设置排序列
        // sortOrder:'desc',//排序方式
        //  idField:'id',
        toolbar:[
            {
                iconCls:'icon-add',
                text:'添加',
                handler:function () {
                    dialog.dialog('open');
                }
            },
            {
                iconCls:'icon-remove',
                text:'删除',
                handler:function () {
                    var id=$("#datagrid").datagrid("getSelections");
                    if(id.length==0)
                    {
                        alert('请选中一条数据！');
                    }
                    else
                    {

                        alert("选中条数="+id.length);
                        $.messager.confirm("确认","确实要删除吗？",function(r){
                            if(r)
                            {
                                //利用数组，保存选中记录的主键
                                var snos=[];
                                for(var i=0;i<id.length;i++)
                                {
                                    snos[i]=id[i].userId;
                                    console.log("ids:"+snos[i])
                                }


                                $.get("deletePanyuUser?ids="+snos,
                                    function(data){
                                        //var msg=eval("("+rtn+")");
                                        console.log("data:"+data);
                                        /* if(data==true)
                                         {*/
                                        $('#datagrid').datagrid('reload');
                                        /*  }*/

                                    });

                            }
                        });


                    }

                }
            },
        ]
    })

    dialog.dialog({
        title:'添加角色',
        buttons:[{
            text:'保存',
            iconCls:'icon-save',
            handler:function () {

                /*var message={*/
                var  roleName=$("#roleName").val().trim();
                var role=$("#role").val().trim();
                //console.log("userName:"+userName);
                // console.log("userlogpwd:"+userlogpwd);
                /*  };*/

                if($("#roleName").val()!=""&&$("#role").val()!="")
                {
                    $.ajax({
                        type:"post",
                        url:"addPanyuUser",
                        data:{"roleName":roleName,"role":role},
                        success:function(){
                            alert("添加成功！");

                            dialog.dialog('close');
                            $("#addForm").form("clear");
                            $('#datagrid').datagrid('reload');
                            $("#roleName").val("");
                            $("#role").val("");
                        }
                    })


                }
                else{alert("请填写完整！");
                    $("#roleName").val("");
                    $("#role").val("");
                }

            },
        },
            {
                text:'取消',
                iconCls:'icon-remove',
                handler:function () {
                    dialog.dialog('close');
                },
            }]
    })
});


//点击搜索
$("#user-search").on("click",function () {
    var  userName=$("#user-name").val().trim();
    console.log("名字:"+userName);
    $("#datagrid").datagrid({url:"queryAllPanyuUser?userName="+userName}).datagrid('load');
});



//权限
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