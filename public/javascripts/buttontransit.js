/**
 * Created by Pedro on 26/11/2015.
 */
$(document).ready(function(){
    $('#dica-menu').hide();

    $("#botao-dica-menu").click(function(){
        if($('#dica-menu').is(":hidden")){
            $("#dica-menu").show().transition({ opacity: 0, duration: 3500 },function () { $("#dica-menu").hide(); });
            $("#dica-menu").show().transition({opacity: 1.0, duration: 3500});
            return;
        }
        if($('#dica-menu').is(":visible")){
            $('#dica-menu').hide();
        }
    });

});