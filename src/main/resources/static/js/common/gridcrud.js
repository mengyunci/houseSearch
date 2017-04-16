/**
 * 弹出框(dialog)按钮动作
 * @param name
 * @param dlgId
 * @param title
 * @param iconStr
 * @param url
 * @param fId
 * @param dgId
 */
function dlgButtonAction(name,dlgId,title,width,iconStr,url,fId,dgId) {
    if(!iconStr){
        iconStr = 'icon-edit';
    }
    $('#' + dlgId).show().dialog({
        title: title,
        iconCls: iconStr,
        width: width,
        padding: 10,
        modal: true,
        buttons: [{
            text: '保存', iconCls: 'icon-save', handler: function () {
                $.messager.confirm('提示', '确定保存？', function (r) {
                    if (r) {
                        addOrEdit(name,dlgId,fId,dgId,url);
                    }
                });
            }
        }, {
            text: '取消', iconCls: 'icon-cancel', handler: function () {
                initForm(fId);
                $('#' + dlgId).dialog('close');
            }
        }],
        onClose: function () {
            initForm(fId);
        }
    });
}

/**
 * 添加或编辑
 * @param dlgId
 * @param fId
 * @param dgId
 * @param url url
 */
function addOrEdit(name,dlgId,fId, dgId, url){
    $('#' + fId).form('submit',{
        url: url,
        success:function(result){
            var result = eval('(' + result + ')');
            if(result.success){
                msgShow('消息', result.msg || '保存成功！');
                if(name == 'datagrid') {
                    $('#' + dgId).datagrid('reload').datagrid('unselectAll');
                }else{
                    $('#' + dgId).treegrid('reload').treegrid('unselectAll');
                }
            }else{
                msgShow('消息',result.msg || "保存失败");
            }
            initForm(fId);
            $('#' + dlgId).dialog('close');
        }
    });
}

/**
 * 根据ID删除数据行
 * @param name
 * @param dgId
 * @param url
 * @param idValue
 */
function removeById(name,dgId,url,idValue){
    $.messager.confirm('提示', '确定删除？', function (r) {
        if (r) {
            $.post(url,{id:idValue},function(data){
                if(data.success){
                    msgShow('消息','删除成功！');
                    if(name == 'datagrid') {
                        $('#' + dgId).datagrid('reload').datagrid('unselectAll');
                    }else{
                        $('#' + dgId).treegrid('reload').treegrid('unselectAll');
                    }
                }else{
                    msgShow('消息','删除失败！');
                }
            });
        }
    });
}

/**
 * 初始化form表单
 */
function initForm(fId){
    $('#' + fId).form('clear').form('reset');
}
/**
/**
 * 右下角弹出提示信息框
 * @param title 标题
 * @param msg 消息内容
 */
function msgShow(title,msg){
    $.messager.show({
        title:title,
        msg:msg,
        timeout:3000,
        showType:'show'
    });
}