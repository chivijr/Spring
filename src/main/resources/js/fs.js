$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8081/fs/"
    }).then(function(data) {
    	data.ficheros.each(function (index, item){
    		alert(item);
    	})
    	//$('body').append(data.ficheros);
    });
});