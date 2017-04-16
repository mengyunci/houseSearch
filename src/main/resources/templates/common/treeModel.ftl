<ul id="tree_type"></ul>
<script type="text/javascript">
//    var center = $('body').layout('panel','center');
$(function () {
    $('#main_tree_type').tree({
        url: '/mainmenu',
        onClick: function (node) {
            if (node.url) {
                if ($("#tt").tabs("exists", node.text)) {
                    $('#tt').tabs('select', node.text);
                } else {
                    $("#tt").tabs('add', {
                        title: node.text,
                        closable: true,
                        href: '${base}' + node.url
                    });
                }
            } else {
                if (node.state == 'closed') {
                    $(this).tree('expand', node.target);
                } else {
                    $(this).tree('collapse', node.target);
                }

            }
        },
        onBeforeLoad: function () {
            $("<div class=\"datagrid-mask\"></div>").css({
                display: "block",
                width: "100%",
                height: $(window).height(),
                'zIndex': 99
            }).appendTo("body");
            $("<div class=\"datagrid-mask-msg\"></div>").html("正在处理，请稍候。。。").appendTo("body").css({
                'zIndex': 100,
                display: "block",
                left: ($(document.body).outerWidth(true) - 190) / 2,
                top: ($(window).height() - 45) / 2
            });
        },
        onLoadSuccess: function () {
            $(".datagrid-mask").remove();
            $(".datagrid-mask-msg").remove();
        }
    });

    $('#tree_type').tree({
        url: '/tree',
        onClick: function (node) {
            if (node.url && !node.checked) {
                $("#panel_center").tabs('add', {
                    title: 'New Tab',
                    content: 'Tab Body'
                });
            }
        },
        onBeforeLoad: function () {
            $("<div class=\"datagrid-mask\"></div>").css({
                display: "block",
                width: "100%",
                height: $(window).height(),
                'zIndex': 99
            }).appendTo("body");
            $("<div class=\"datagrid-mask-msg\"></div>").html("正在处理，请稍候。。。").appendTo("body").css({
                'zIndex': 100,
                display: "block",
                left: ($(document.body).outerWidth(true) - 190) / 2,
                top: ($(window).height() - 45) / 2
            });
        },
        onLoadSuccess: function () {
            $(".datagrid-mask").remove();
            $(".datagrid-mask-msg").remove();
        }
    });
});
</script>