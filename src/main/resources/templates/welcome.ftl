<#assign base=rc.contextPath/>
<#--<!DOCTYPE html>-->
<#--<html lang="en">-->
<#--<head>-->
    <#--<base id="base" href="${base}">-->
	<#--<script src="${base}/js/index.js"></script>-->
    <#---->
<#--</head>-->
<#--<body>-->
<link rel="stylesheet" href="${base}/css/mdc/style.css" />
<div id="equipment_monitor_div">
    <div class="main">
        <!--上排设备名称-->
        <div class="inc-mes">
            <div class="cell20">LH511</div>
            <div class="cell20">LH522</div>
            <div class="cell20">LH533</div>
            <div class="cell20">OP60-1</div>
            <div class="cell20">OP60-3L</div>
            <div class="clear"></div>
        </div>

        <!--上排设备图片-->
        <div class="inc-box">
            <a datatype="A1">
                <div class="div20">
                    <img id="equipment_A1"  src="${base}/images/mdc/green.png" class="light" />
                    <img src="${base}/images/mdc/inc-5.png" title="LH511" class="inc"/>
                </div>
            </a>
            <a datatype="A3">
                <div class="div20">
                    <img id="equipment_A3"  src="${base}/images/mdc/green.png" class="light" />
                    <img src="${base}/images/mdc/inc-4.png" title="LH522" class="inc"/>
                </div>
            </a>
            <a datatype="A5">
                <div class="div20">
                    <img id="equipment_A5"  src="${base}/images/mdc/green.png" class="light" />
                    <img src="${base}/images/mdc/inc-3.png" title="LH533" class="inc" />
                </div>
            </a>
            <a datatype="A7">
                <div class="div20">
                    <img id="equipment_A7"  src="${base}/images/mdc/green.png" class="light" />
                    <img src="${base}/images/mdc/inc-7.png" title="OP60-1" class="inc"/>
                </div>
            </a>
            <a datatype="A9">
                <div class="div20">
                    <img id="equipment_A9"  src="${base}/images/mdc/green.png" class="light" />
                    <img src="${base}/images/mdc/inc-1.png" title="OP60-3L"  class="inc"/>
                </div>
            </a>
        </div>
        <!--机器人-->
        <div class="robot-box">
            <div class="robot-box-l">
                <img id="equipment_A13"  src="${base}/images/mdc/green.png" class="fl-l-120"/>
                <img src="${base}/images/mdc/robot.png"/>
                <div class="cell20" style="padding-left: 160px">Robot50</div>
                <!--<div class="robot-float" ><img src="/images/mdc/arr1.gif"/></div>-->
            </div>
            <div class="robot-box-l">
                <img id="equipment_A14"  src="${base}/images/mdc/green.png" class="fl-l-120"/>
                <img src="${base}/images/mdc/robot.png" />
                <!--<div class="robot-float" ><img src="images/arr1.gif"/></div>-->
                <div class="cell20" style="padding-left: 160px">Robot60</div>
            </div>
            <div class="robot-box-l">
                <img id="equipment_A15"  src="${base}/images/mdc/green.png" class="fl-l-120"/>
                <img src="${base}/images/mdc/robot.png" />
                <!--<div class="robot-float" ><img src="images/arr1.gif"/></div>-->
                <div class="cell20" style="padding-left: 160px">去毛刺</div>
            </div>
        </div>
        <!--下排设备图片-->
        <div class="inc-box">
            <a datatype="A2">
                <div class="div20">
                    <img id="equipment_A2" src="${base}/images/mdc/green.png" class="light" />
                    <img src="${base}/images/mdc/inc-10.png" title="RH501" class="inc"/>
                </div>
            </a>
            <a datatype="A4">
                <div class="div20">
                    <img id="equipment_A4"  src="${base}/images/mdc/green.png" class="light" />
                    <img src="${base}/images/mdc/inc-9.png" title="RH502" class="inc"/>
                </div>
            </a>
            <a datatype="A6">
                <div class="div20">
                    <img id="equipment_A6"  src="${base}/images/mdc/green.png" class="light" />
                    <img src="${base}/images/mdc/inc-8.png" title="RH503" class="inc"/>
                </div>
            </a>
            <a datatype="A8">
                <div  class="div20">
                    <img id="equipment_A8"  src="${base}/images/mdc/green.png" class="light" />
                    <img src="${base}/images/mdc/inc-2.png" title="OP60-2"  class="inc"/>
                </div>
            </a>
            <a datatype="A10">
                <div  class="div20">
                    <img id="equipment_A10"  src="${base}/images/mdc/green.png" class="light" />
                    <img src="${base}/images/mdc/inc-6.png" title="OP60-3R"  class="inc"/>
                </div>
            </a>
        </div>
        <!--下排设备名称-->
        <div class="inc-mes">
            <div class="cell20">RH501</div>
            <div class="cell20">RH502</div>
            <div class="cell20">RH503</div>
            <div class="cell20">OP60-2</div>
            <div class="cell20">OP60-3R</div>
            <div class="clear"></div>

        </div>
        <!--屏幕左箭头-->
        <div class="scr-1"><img src="${base}/images/mdc/arr-up.png" /></div>
        <!--屏幕右上箭头-->
        <div class="scr-2"><img src="${base}/images/mdc/arr-down.png" /></div>
        <!--屏幕右下箭头-->
        <div class="scr-3"><img src="${base}/images/mdc/arr-up.png" /></div>
    </div>
    <div id="mdcEquiMoni-tab-tools" style="width: 650px; float: right">
        <table width="600px;" align="center">
            <tr>
                <td align="right">关机</td>
                <td align="left">
                    <div style="width: 15px;height: 15px;background-color: #A8A8A8;"></div>
                </td>
                <td align="right"><label id="mdcEquiMoni-lbl-closed"></label></td>
                <td align="right">待机</td>
                <td align="left">
                    <div style="width: 15px;height: 15px;background-color: yellow"></div>
                </td>
                <td align="right"><label id="mdcEquiMoni-lbl-waiting"></label></td>
                <td align="right">加工</td>
                <td align="left">
                    <div style="width: 15px;height: 15px;background-color: #00ee00"></div>
                </td>
                <td align="right"><label id="mdcEquiMoni-lbl-processing"></label></td>
                <td align="right">报警</td>
                <td align="left">
                    <div style="width: 15px;height: 15px;background-color: red"></div>
                </td>
                <td align="right"><label id="mdcEquiMoni-lbl-erroring"></label></td>
            </tr>
        </table>
    </div>
</div>
<div id="mdcEquiInfo" style="display: none; padding: 5px;">
    <table style="height: 10%;width: 100%">
        <tr>
            <td>
                <p>设备编号</p>
            </td>
            <td>
                <input id="mdcEquiMoni-equipmentID" class="easyui-textbox" data-options="readonly:true">
            </td>
            <td>
                <p>设备名称</p>
            </td>
            <td>
                <input id="mdcEquiMoni-equipmentName" class="easyui-textbox" data-options="readonly:true">
            </td>
            <%--<td>
            控制系统:
        </td>
            <td>
                <input id="continuousSys" class="easyui-textbox" data-options="disabled:true" style="height:22px">
            </td>--%>
        </tr>
    </table>
    <fieldset style="width: 100%;height: 89%">
        <legend><p>监控数据</p></legend>
        <table style="width: 100%;height: 99%">
            <tr>
                <td colspan="2">
                    <div id="mdcEquiMoniGauge1" style="width: 200px; height: 200px;margin : 0 auto"
                         align="center">主轴倍率
                    </div>
                </td>
                <td colspan="2">
                    <div id="mdcEquiMoniGauge2" style="width: 200px; height: 200px;margin : 0 auto"
                         align="center">进给倍率
                    </div>
                </td>
                <td colspan="2">
                    <div id="mdcEquiMoniGauge3" style="width: 200px; height: 200px;margin : 0 auto"
                         align="center">主轴负载
                    </div>
                </td>
            </tr>
            <tr>
                <td><p>当前执行程序</p></td>
                <td>
                    <input id="mdcEquiMoni-executingcode" class="easyui-textbox" data-options="readonly:true" style="height:22px">
                </td>
                <td>
                    <p>主轴倍率</p>
                </td>
                <td>
                    <input id="mdcEquiMoni-spindlebeilv" class="easyui-textbox" data-options="readonly:true" style="height:22px">
                </td>
                <td>
                    <p>进给倍率</p>
                </td>
                <td colspan="3">
                    <input id="mdcEquiMoni-feedbeilv" class="easyui-textbox" data-options="readonly:true" style="height:22px">
                </td>
            </tr>
            <tr>
                <td>
                    <p>主轴负载</p>
                </td>
                <td>
                    <input id="mdcEquiMoni-spindleload" class="easyui-textbox" data-options="readonly:true" style="height:22px">
                </td>
                <td>
                    <p>主轴转速</p>
                </td>
                <td>
                    <input id="mdcEquiMoni-spindlespeed" class="easyui-textbox" data-options="readonly:true" style="height:22px">
                </td>
                <td>
                    <p>进给速度</p>
                </td>
                <td>
                    <input id="mdcEquiMoni-feedrate" class="easyui-textbox" data-options="readonly:true" style="height:22px">
                </td>
            </tr>
        </table>
    </fieldset>
</div>
<script type="text/javascript" charset="utf-8" src="${base}/js/mdc/equipmentMonitor.js"></script>

<#--</body>-->
<#--</html>-->