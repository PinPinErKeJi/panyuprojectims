$(function(){
    $('.personal').tooltip({
        hideEvent: 'none',
        showEvent:'click',
        content: function(){
            return $('.message');
        },
        onUpdate: function(content){
            content.panel({
                width: 200,
                border: false,
            });
        },
        onShow: function(){
            var t = $(this);
            t.tooltip('tip').focus().unbind().bind('click',function(){
                t.tooltip('hide');
            });
        }
    });
});