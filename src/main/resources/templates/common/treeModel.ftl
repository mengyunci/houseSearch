<ul id="tree_type"></ul>
<script type="text/javascript">
//    var center = $('body').layout('panel','center');
    $('#tree_type').tree({
        url:'/tree',
        onClick: function(node) {
            if (node.url && !node.checked) {
                $("#panel_center").tabs('add',{
                    title:'New Tab',
                    content:'Tab Body'
                });
            }
        }
    });
</script>