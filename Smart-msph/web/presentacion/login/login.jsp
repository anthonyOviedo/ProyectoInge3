<%-- 
    Document   : login
    Created on : Sep 8, 2019, 8:15:08 PM
    Author     : antony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <%@ include file="/Head.jsp" %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de Sesion</title>
        <link rel="stylesheet" href="css/login.css">
    </head>
    <script type="text/javascript" src="js/login_login.js"></script>
    <body>
        <%@ include file="/Header.jsp" %>
        &nbsp;
    <center>
        <h1>Inicio de Sesion</h1>
    </center> 
    <div class="wrapper fadeInDown">
        <div id="formContent">
            <!-- Tabs Titles -->

            <!-- Icon -->
            <div class="fadeIn first">
                <h1>
                    <i class="fas fa-user"></i>
                </h1>
            </div>
            <!-- Login Form -->

            <input type="text" id="campoCorreo" class="fadeIn second" name="login" placeholder="Correo">
            <input type="text" id="campoContrasenna" class="fadeIn third" name="login"  placeholder="Contraseña">
            <input type="submit" onclick="enviar()" class="fadeIn fourth" value="Inciar Sesion">

            <!-- Remind Passowrd -->
            <div id="formFooter">
                <a class="underlineHover" href="#">Olvide mi Contraseña</a>
            </div>

        </div>
    </div>
</body>
</html>
