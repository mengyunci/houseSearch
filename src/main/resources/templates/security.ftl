<#assign base=rc.contextPath/>
<script>
    $(function () {
        $('#security_table').datagrid({
            url: '${base}/security/showall',
            iconCls: 'icon-table-gear-cus',
            singleSelect: true,
            fitColumns: true,
            fit: true,
            idField: 'id',
            pagination: true,
            rownumbers: true,
            pageSize: 100,
            pageList: [100, 200, 300, 400, 500],
            columns: [[
                {field: 'employeeId', title: '编号', hidden: true, width: 10},
                {field: 'employeeSerial', title: '编号', width: 10},
                {field: 'employeeName', title: '用户名', width: 10}
            ]],
            toolbar: [{
                iconCls: 'icon-add',
                text: '添加用户',
                handler: function () {
                        dlgButtonAction('datagrid', 'feed_back_dlg', '新增用户', 350, null, '${base}/information/add', 'information_set_up_form', 'information_set_up_table');
                    }
            }, '-', {
                iconCls: 'icon-remove',
                text: '删除',
                handler: function () {
                    var selectedRow = $('#security_table').datagrid('getSelected');
                    if (selectedRow == null) {
                        $.messager.alert('操作提示', '请选择删除数据行！');
                        return;
                    }
                    removeById('datagrid', 'feed_back_dlg', '${base}/information/delete', selectedRow.id);
                }
            }],
            loadFilter: function (data) {
                if (data) {
                    return {
                        rows: data.list,
                        total: data.total
                    }
                } else {
                    return {
                        rows: [],
                        total: 0
                    }
                }
            }
        });
        $('#feed_back_search_button').bind('click', function () {
            var userId = $("#security_user_name").textbox("getValue");
            $("#security_table").datagrid('load', {
                username:userId
            });
        })
    });
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'north',border:false"
         style="width:100%;height: 40px;line-height: 40px;padding-left: 25px">
        <span>用户名: </span><input class="easyui-textbox" id="security_user_name" style="width:120px"/>
        <a id="feed_back_search_button" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
    </div>
    <div data-options="region:'center',border:false">
        <table id="security_table" class="easyui-datagrid" title="拥有权限用户列表"></table>
    </div>
</div>
<#--新增-->
<div id="feed_back_dlg" style="display: none">
    <form id="feed_back_form" method="post">
        <input id="feed_back_id" type="hidden" name="id"/>
        <table cellpadding="2" style="margin: auto">
            <tr>
                <td><span>用户名:</span></td>
                <td>
                    <input class="easyui-textbox" id="feed_back_user_id" name="userId" style="width: 150px;">
                </td>
            </tr>
            <tr>
                <td><span>回复内容:</span></td>
                <td>
                    <input class="easyui-textbox" id="feed_back_feedback_content" data-options="multiline:true"
                           name="feedbackContent"
                           style="width: 150px;height: 100px">
                </td>
            </tr>
        </table>
    </form>
</div>