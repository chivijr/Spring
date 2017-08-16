$(document).ready(function() {
    $.ajax({
        type: "GET",
    	dataType: "json",
    	contentType: "application/json; charset=utf-8",
        url: "http://localhost:8080/fs/",
    }).then(function(data) {
       $('body').append(data.ficheros);
    });
});