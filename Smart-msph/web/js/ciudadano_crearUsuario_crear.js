/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 
 
 nombre: $("#campoNombre").val(),
 
 
 
 */


function inspect(elemento,elemento2) {
 
    
      if(elemento.value===''){ 
      elemento.className='error';
      document.getElementById(elemento2).innerHTML = "Este campo es obligatorio";
      document.getElementById(elemento2).style.color = "red";
    
    } else {
               elemento.className='inputText'; 
               document.getElementById(elemento2).innerHTML = " ";
               
    }   
  }

function isnumber(elemento,elemento2) {
    if(elemento.value!==''){
        let data = elemento.value;
            if(isNaN(data)){
               elemento.className='error';
                 document.getElementById(elemento2).innerHTML = "Debe insertar unicamente datos numericos";
                  document.getElementById(elemento2).style.color = "red";
    
    } else {
               elemento.className='inputText'; 
               document.getElementById(elemento2).innerHTML = " ";
                       
        }
    
    }
}






function minlong(elemento,min,elemento2) {
    if(elemento.value!==''){
        let data = elemento.value;
            if(data.length<min){
                elemento.className='error'; 
                 document.getElementById(elemento2).innerHTML = "Debe tener minimo de "+ min +" caracteres";
                    document.getElementById(elemento2).style.color = "red";
        } else {
                       elemento.className='inputText'; 
                        document.getElementById(elemento2).innerHTML = "";
                }
    }
 }
 
  function togglepass1(elemento,elemento2) {
    
        if(document.getElementById(elemento2).type === 'password'){
        document.getElementById(elemento2).type = 'text';
        elemento.style.color="dodgerblue";
        } else {
              document.getElementById(elemento2).type = 'password';
               elemento.style.color="#999";
            
            
        }
     

}
 
 
 
 function checkEmail(elemento,elemento2) {
     if(elemento.value!==''){
         let data = elemento.value;
         let regularexp = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
       if(!regularexp.test(data)){
        elemento.className='error';
      document.getElementById(elemento2).innerHTML = "El formato no corresponde a un email valido";
      document.getElementById(elemento2).style.color = "red";
    
    } else {
               elemento.className='inputText'; 
               document.getElementById(elemento2).innerHTML = " ";
           
       }
     }
  }




function validate() {
    let name = $("#name").val();
    let surname1= $("#surname1").val();
    let surname2= $("#surname2").val();
    let username= $("#username").val();
    let password= $("#password").val();
    let confirmpass=$("#confirmpass").val(); 
    let idnumber= $("#_id").val();
    let email= $("#mail").val();
    let phoneNumber= $("#phoneNumber").val();   
    let error = "";
    let rightdata = true;
    
 
    if(name===""){
        rightdata=false;
        }
        
         if(username===""){
        rightdata=false;
        }
   
   
     if(surname1===""){
        rightdata=false;
       
       }
        if(surname2===""){
        rightdata=false;
       
       }
        if(password===""){
        rightdata=false;
       
       }
        if(confirmpass!==password){
        rightdata=false;

        


        error = "las contraseñas no coinciden";
    
    } 
       if(idnumber===""){
        rightdata=false;
       
       }
         if(isNaN(idnumber)){
        rightdata=false;
       
       }
       
       if(idnumber<6){
           rightdata=false; 
       }
       
       
        let regularexp = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
       if(!regularexp.test(email)){
           rightdata=false;
           
    }

        
      
    
        if(isNaN(phoneNumber)){
        rightdata=false;
       error="debe ser un dato numerico";
       }
       
       
       if(phoneNumber<8){
           rightdata=false;
           error="debe ser mayor a 8 caracteres";
       
   }
        if(!rightdata){
            alert("Hay errores en el formulario " + error );
            
        }
        
        return rightdata;
    }



function enviar() {

    //recibir los campos y guardarlos en un array
    let campos = $.makeArray($("input[name='campos']")).map(x => x.value);
    //concatena y mete , en el medio
    let dat = campos.join();
   if(validate()){
    $.ajax({
        url: "api/RecursoUsuario" ,
        dataType: "json",
        type: "POST",
        data:dat
    }).done(function (request) {
            console.log("success"); 
            alert("el usuario se registro correctamente");
     //    window.location = "principal/principal.jsp?request="+request;
            
    }).fail(function (request){
    console.log("error");        
     alert("el usuario se registro correctamente");
            
        });
    }

}




function iniciar(data) {
    console.log(data);
    window.location = "presentacion/login/login.jsp";
}

function error(data) {
    //marcar campos de formularios erroneos

}



function cancelar() {
    console.log("cancelar");
}





