<%-- 
    Document   : crear
    Created on : Sep 8, 2019, 8:18:15 PM
    Author     : anton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <%@ include file="/Head.jsp" %>
    </head>
    <script src="js/ciudadano_crearUsuario_crear.js" type="text/javascript"></script>
    <!--  serpara esta parte en otro archivo js -->

    <body>

        <!--        header-->
        <%@ include file="/Header.jsp" %>


        &nbsp;
        <div class="container">
            <!-- ajustar margenes de los containers -->
            &nbsp;&nbsp;
            <h1> Registrarse </h1>
            <!-- form -->
            <div class="container">
                <div class="col-md-3"> </div>
                &nbsp;

                <!-- campo para la cedula -->
                <div class="input-group col-md-6">
                    <div class="input-group-prepend">
                        <span class="input-group-text">Cedula</span>
                    </div>
                    <input type="text" name="campos" class="form-control" id="campoCedula">
                </div>

                &nbsp;

                <!-- campo para el nombre -->
                <div class="input-group col-md-6">
                    <div class="input-group-prepend">
                        <span class="input-group-text">Nombre</span>
                    </div>
                    <input type="text" name="campos" class="form-control" id="campoNombre">
                </div>



                &nbsp;

                <!-- campo para el apellido -->
                <div class="input-group col-md-6">
                    <div class="input-group-prepend">
                        <span class="input-group-text">Apellido</span>
                    </div>
                    <input type="text" name="campos" class="form-control" id="campoApellido">
                </div>



                &nbsp;
                <!-- campo para el correo -->
                <div class="input-group col-md-6">
                    <div class="input-group-prepend">
                        <span class="input-group-text">Correo</span>
                    </div>
                    <input type="text" name="campos" class="form-control" id="campoCorreo">
                </div>

                &nbsp;
                <!-- campo para la contreaseña -->
                <div class="input-group col-md-6">
                    <div class="input-group-prepend">
                        <span class="input-group-text">Contraseña</span>
                    </div>
                    <input type="text" name="campos" class="form-control" id="campoContrasenna">
                </div>

                &nbsp;
                <!-- campo para el telefono -->
                <div class="input-group col-md-6">
                    <div class="input-group-prepend">
                        <span class="input-group-text">Telefono</span>
                    </div>
                    <input type="text" name="campos" class="form-control" id="campoTelefono">
                </div>

                &nbsp;
                <div class="input-group col-md-6">

                    <button type="button" onclick="cancelar()" class="btn btn-light">Cancelar</button>
                    &nbsp;
                    <button type="button" onclick="enviar()" class="btn btn-primary">Aceptar</button>

                </div>


                <div class="col-md-3"></div>

            </div>
        </div>


    </body>

</html>