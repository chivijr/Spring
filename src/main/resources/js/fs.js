$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8081/fs/"
    }).then(function(data) {
       $('body').append(data.ficheros);
    });
});