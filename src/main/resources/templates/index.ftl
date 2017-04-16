<#assign base=rc.contextPath/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="${base}/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${base}/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${base}/css/basic/main.css">
    <link rel="stylesheet" type="text/css" href="${base}/css/basic/kube.css">
    <script type="text/javascript" src="${base}/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${base}/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${base}/js/common.js"></script>
</head>
<body class="easyui-layout">
<div data-options="region:'north',border:false"
     class="group wrap header panel-body panel-body-noheader panel-body-noborder layout-body"
     style="font-size: 100%; width: 100%; height: 66px;">
    <div class="content">
        <div class="navigation-toggle" data-tools="navigation-toggle" data-target="#navbar-1">
            <span>EasyUI</span>
        </div>
        <div id="elogo" class="navbar navbar-left">

        </div>
        <div style="clear:both"></div>
    </div>
</div>

<div data-options="region:'west',title:'West',collapsible:true" style="width:400px;">
    <div class="easyui-layout" data-options="fit:true">
        <div data-options="region:'west',title:'West',border:true" style="width:200px">
            <ul id="main_tree_type"></ul>
        </div>
        <div data-options="region:'center',title:'east',border:false">
            <#include "./common/treeModel.ftl"/>
        </div>
    </div>
</div>


<div id="panel_tree" data-options="region:'center'" style="background:#eee;width:220px;">
    <div id="tt" class="easyui-tabs" style="width:100%;height:100%;"></div>
</div>

<div data-options="region:'south',collapsible:false,border:false" style="text-align: center">
    <span>WE  JUST  DO  WE  LIKE   ~~~~~  GO  AWAY  THE   COMPANY</span>
</div>


</body>
</html>