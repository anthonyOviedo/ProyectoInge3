/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function enviar() {
    $.ajax({
        contentType: "application/json; charset=utf-8",
        type: "POST",
        url: "api/RecursoUsuario",
        dataType: "json",
        //campos de obj en json 
        data: JSON.stringify({
           correo: $("#campoCorreo").val(),
           contrasenya: $("#campoContrasenna").val()
        })
    }).done(iniciar) ;
}




function iniciar(data) {
    //redirigir a pag principal del admin o cliente
    alert(data);
    window.location="presentacion/ciudadanos/crearUsuario/ciudadano.jsp";
}

function error(data) {
    //marcar campos de formularios erroneos

}

function validarCampo(campo){
	campoTexto = campo.value;
	if (campoTexto.length == 0 || /^\s+$/.test(campoTexto)) {
           		return false;
        }
	return true;		
}

function validartodo(){
if(!validarCampo(document.getElementById('campoCorreo')))
   {alert("completa el correo");
          return false;}
  if(!validarCampo(document.getElementById('campoContrasenna')))
   {alert("incorrecto vuelva a digitar el password");
          return false; }
   
    
         enviar();

         }

