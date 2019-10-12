<%-- 
    Document   : index
    Created on : 23/09/2019, 09:17:47 AM
    Author     : leine
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
     
      <meta charset="utf-8">
    <title>SMARTHMSPH</title>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js" charset="utf-8"></script> 
    <script src="js/main.js" type="text/javascript"></script> 
    <%@ include file="/Head.jsp" %>
     
  </head>
     <script src="js/login.js" ></script>

  <body>

      <form  action="" class="login-form">
           <h1 id='title1'>Inicio de Sesión</h1>
        <span id="error-loging">   </span>
        
        
        <div id='us' class="txtb">
            <input id="user" type="text">
          <span data-placeholder="Nombre de Usuario"></span>
        </div>

        <div class="txtb">
          <input id="password" type="password">
          <span data-placeholder="Contraseña"></span>
        </div>

        <input  onclick="iniciar()" type="button" class="logbtn" id="Iniciosesion" value="Iniciar Sesión">

          <div class="bottom-text">
              <a href="#">Olvidé mi Contraseña</a> <br>
           No tienes una cuenta? <a href="presentacion/ciudadanos/crearUsuario/crear2.jsp">Registrarse</a>
          </div>

        
      </form>

          <script src="js/main.js" ></script>
            <script src="js/login.js" ></script>
  </body>
</html>
