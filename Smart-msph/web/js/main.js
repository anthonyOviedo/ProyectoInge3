    
      $(".txtb input").on("focus",function(){
        $(this).addClass("focus");
      });

      $(".txtb input").on("blur",function(){
        if($(this).val() == "")
        $(this).removeClass("focus");
      });

function inspect(elemento) {
 
    
      if(document.getElementById(elemento).value===''){ 
      elemento.className='error';
      
    
    } else {
               elemento.className='txtb'; 
              
               
    }   
  }

