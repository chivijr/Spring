$.urlParam = function(name){
    var results = new RegExp('[\?&]' + name + '=([^]*)').exec(window.location.href);
    if (results==null){
       return null;
    }
    else{
       return results[1] || 0;
    }
}

$(document).ready(function() {
    $.ajax({
        type: "GET",
    	dataType: "json",
    	contentType: "application/json; charset=utf-8",
        url: "http://localhost:8080/fs?dir="+$.urlParam('dir'),
    }).then(function(data) {
    	$('#cabecera').append("<h1>Ruta: "+data.ruta+"</h1></br>");
    	$.each( data.ficheros, function( key, val ) {
    		var $li = $("<li id=\"elemento\" class=\""+val.tipo+"\"><a href='"+"http://localhost:8081/?dir="+val.rutaAbsoluta+"'>"+val.rutaAbsoluta+" -> Tamaño: "+Math.floor(val.tamanio/1025)+" KB.</a></li>");      
 			$("#lista").append($li);            
 			if (val.contenido != "" && val.contenido != null) {
 				$('#elemento').remove();
 				$('#contenido #letrero').append("Contenido del fichero:</br></br>");
 				$("#contenido #contenidotexto").append(val.contenido);
 			}
 		});
    });
});


