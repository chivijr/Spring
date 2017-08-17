$(document).ready(function() {
    $.ajax({
        type: "GET",
    	dataType: "json",
    	contentType: "application/json; charset=utf-8",
        url: "http://localhost:8080/fs?dir=dev",
    }).then(function(data) {
    	$('#cabecera').append("<h1>Ruta: "+data.ruta+"</h1></br>");
    	$.each( data.ficheros, function( key, val ) {
    		var $li = $("<li class=\""+val.tipo+"\"><a href='"+val.ruta+val.nombre+"'>"+val.ruta+"/"+val.nombre+"</a></li>");      
 			$("#lista").append($li);            
 		});
    });
});