<%-- 
    Document   : crear
    Created on : Sep 8, 2019, 8:18:15 PM
    Author     : anton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <link href="../../../css/register.css" rel="stylesheet" type="text/css"/>
        <%@ include file="/Head.jsp" %>
        <title>Registrarse</title>
    </head>
    <script src="js/ciudadano_crearUsuario_crear.js" type="text/javascript"></script>
    <!--  serpara esta parte en otro archivo js -->

    <body>

        <form>
        <div class="container register">
            <div class="row">
                <div class="col-md-3 register-left">
                    <!-- <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/> -->
                    <h3></h3>
                    <p></p>
                    <!--  <input type="submit" name="" value="Login"/><br/>-->
                </div>
                <div class="col-md-9 register-right">
                    <!--<ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
                        <li class="nav-item">
                            <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Employee</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Hirer</a>
                        </li>
                    </ul> -->
                    <div class="tab-content" id="myTabContent">
                        <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                            <div id="title">
                            <h2 class="register-heading">SMART-MSPH</h2>
                            <br><br>
                             <h3 class="register-heading">Registrarse</h3>
                            </div>
                             <div class="row register-form">
                                
                                <div class="col-md-6">
                                   
                                      
                                    <div class="user-input-wrp">
                                        <br/>
                                        
                                        
                                        <input type="text" name="campos" class="inputText form-group " id="name" onblur="inspect(this,'error-name')" onkeyup="inspect(this,'error-name')" required/>
                                        <span class="floating-label">Nombre * </span> <span id="error-name">   </span>
                                                            
                                    </div>
                                    
                                    <div class="user-input-wrp">
                                        <br/>
                                        
                                        <input type="text" name="campos" class="inputText form-group " id="surname1" onblur="inspect(this,'error-surname1')" onkeyup="inspect(this,'error-surname1')" required/>
                                        <span class="floating-label">Primer Apellido * </span> <span id="error-surname1">   </span>
                                        
                                    </div>
                                       <div class="user-input-wrp form-group">
                                        <br/>
                                       
                                        <input type="text" name="campos" class="inputText" id="surname2" onblur="inspect(this,'error-surname2')" onkeyup="inspect(this,'error-surname2')" required/>
                                        <span class="floating-label">Segundo Apellido * </span> <span id="error-surname2">   </span>
                                    </div>
                                     <div class="user-input-wrp form-group">
                                        <br/>
                                      
                                        <input type="text" name="campos" class="inputText" id="username" onblur="inspect(this,'error-username')" onkeyup="inspect(this,'error-username')" required/>
                                        <span class="floating-label">Nombre de usuario </span> <span id="error-username">   </span>
                                    </div>
                                     <div class="user-input-wrp form-group">
                                        <br/>
                                        <i class="fa fa-eye" id="eye1" onclick="togglepass1(this,'password')"> </i>
                                        <input type="password" name="campos" class="inputText" id="password" onblur="inspect(this,'error-pass'); minlong(this,7,'error-pass') " onkeyup="inspect(this,'error-pass'); minlong(this,7,'error-pass')" required/>
                                        <span class="floating-label">Contraseña * </span> <span id="error-pass">   </span>
                                    </div>
                                      <div class="user-input-wrp form-group">
                                        <br/>
                                        <i class="fa fa-eye" id="eye2" onclick="togglepass1(this,'confirmpass')" > </i>
                                        <input type="password" name="campos" class="inputText" id="confirmpass" onblur="inspect(this,'error-compass');" onkeyup="inspect(this,'error-compass');" required/>
                                        <span class="floating-label">Confirmar Contraseña * </span> <span id="error-compass">   </span>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                     <div class="user-input-wrp form-group">
                                        <br/>
                                        
                                        <input type="text" name="campos" class="inputText" id="_id" onblur="inspect(this,'error-id'); minlong(this,9,'error-id'); isnumber(this,'error-id')" onkeyup="inspect(this,'error-id'); isnumber(this,'error-id');minlong(this,9,'error-id')" required/>
                                        <span class="floating-label">Numero de cedula * </span> <span id="error-id">   </span>
                                    </div>
                                     <div class="user-input-wrp form-group">
                                        <br/>
                                        
                                        <input required type="text" name="campos" onblur="inspect(this,'error-email'); checkEmail(this,'error-email')" onkeyup="checkEmail(this,'error-email')" class="inputText" id="mail"  />
                                        <span class="floating-label">Correo  </span> <span id="error-email">   </span>
                                    </div>
                                    <div class="user-input-wrp form-group">
                                        <br/>
                                        
                                        <input required type="text" name="campos" class="inputText" id="phoneNumber" onblur="inspect(this,'error-phone'); isnumber(this,'error-phone'); minlong(this,8,'error-phone')" onkeyup="isnumber(this,'error-phone'); minlong(this,8,'error-phone')" />
                                        <span class="floating-label">Telefono </span> <span id="error-phone">   </span>
                                    </div>
                                      <div class="user-input-wrp form-group">
                                     
                                    </div>
                                    <input onclick="enviar()" type="button" class="btnRegister"  value="Registrarse"/>
                                </div>
                            </div>
                        </div>
                </div>
            </div>

        </div>
        </div>
        </form>
    </body>

</html>