function iniciar(){
	let username = $("#user").val();
	let password = $("#password").val();
	
        let usuario = {username:username,password:password}
    
     $.ajax({
            contentType: "application/json; charset=utf-8",
            url: "api/login",
            type:'POST',
            dataType: 'json',
            data:JSON.stringify(usuario) ,
            beforeSend:function (){}
            
        }).done(function (request) {
            if(request.role==='ciudadano'){
           window.location = "principal/principal.jsp?request="+request;
       } else {
           window.location = "principal/principalAdministrador.jsp?request="+request;
           }
        
       
    }).fail(function (request){
        document.getElementById("error-loging").innerHTML = "El usuario o la contraseña no son correctos";
        document.getElementById("error-loging").style.color = "red";
});


}
