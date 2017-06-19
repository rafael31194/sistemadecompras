<%-- 
    Document   : RestriccionesCRUD
    Created on : 05-13-2017, 10:55:43 PM
    Author     : EduardoRAFAEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- start: Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- end: Mobile Specific -->
        <title>Usuarios</title>
        <!-- start: CSS -->
        <link type="text/css" id="base-style" href="Recursos/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/style.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/iconos.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/elfinder.min.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/elfinder.theme.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/style-forms.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/glyphicons.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/halflings.css" rel="stylesheet">
        <link type="text/css" id="base-style-responsive" href="Recursos/css/style-responsive.css" rel="stylesheet">
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
        <!-- end: CSS -->
    </head>
    <body>
        <!-- start: Header -->
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="index.html"><span>Sistema de compras</span></a>

                    <!-- start: Header Menu -->
                    <div class="nav-no-collapse header-nav">
                        <ul class="nav pull-right">
                            <!-- start: User Dropdown -->
                            <li class="dropdown">
                                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                    <i class="icon-user"></i> Usuario
                                    <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li class="dropdown-menu-title">
                                        <span>Perfil</span>
                                    </li>
                                    <li><s:a action="login" forceAddSchemeHostAndPort="true"><i class="icon-off"></i>Cerrar Sesión</s:a></i></li>
                                </ul>
                            </li>
                            <!-- end: User Dropdown -->
                        </ul>
                    </div>
                    <!-- end: Header Menu -->

                </div>
            </div>
        </div>
        <!-- start: Header -->

        <div class="container-fluid-full">
            <div class="row-fluid">

                <%    if (UsuarioActivo.idRol==1) {%>
                <!-- start: Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li><s:a action="prueba" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Institución</s:a></i></li>
                            <li><s:a action="solicitud" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Solicitudes</s:a></li>
                            <li><s:a action="aprobar" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Aprobar Solicitud</s:a></li>
                            <li><s:a action="prueba2" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Restricciones</s:a></i></li>
                            <li><s:a action="prueba3" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Proveedores</s:a></i></li>
                            <li><s:a action="equipo" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Equipo</s:a></i></li>
                            <li><s:a action="prueba4" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Usuarios</s:a></i></li>
                            <li><s:a action="prueba5" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Roles</s:a></i></li>
                            <li><s:a action="orden" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Orden de Compra</s:a></i></li>
                            <li><s:a action="inventario" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Inventario</s:a></i></li>
                            <li><s:a action="bitacora" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Bitacora</s:a></i></li>
 +                          
                        </ul>
                    </div>
                </div>
                <!-- end: Main Menu -->
<%}%>
<%    if (UsuarioActivo.idRol==2) {%>
                <!-- start: Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li><s:a action="aprobar" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Aprobar Solicitud</s:a></li>
                            <li><s:a action="prueba2" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Restricciones</s:a></i></li>
                            <li><s:a action="prueba3" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Proveedores</s:a></i></li>
                            <li><s:a action="orden" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Orden de Compra</s:a></i></li>
                            <li><s:a action="inventario" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Inventario</s:a></i></li>
 +                          
                        </ul>
                    </div>
                </div>
                <!-- end: Main Menu -->
<%}%>
<%    if (UsuarioActivo.idRol==3) {%>
                <!-- start: Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li><s:a action="solicitud" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Solicitudes</s:a></li>
                            <li><s:a action="inventario" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Inventario</s:a></i></li>
 +                          
                        </ul>
                    </div>
                </div>
                <!-- end: Main Menu -->
<%}%>
<%    if (UsuarioActivo.idRol==4) {%>
                <!-- start: Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li><s:a action="solicitud" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Solicitudes</s:a></li>
                            <li><s:a action="aprobar" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Aprobar Solicitud</s:a></li>
                            <li><s:a action="inventario" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Inventario</s:a></i></li>
                            <li><s:a action="bitacora" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Bitacora</s:a></i></li>
 +                          
                        </ul>
                    </div>
                </div>
                <!-- end: Main Menu -->
<%}%>
<%    if (UsuarioActivo.idRol==5) {%>
                <!-- start: Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li><s:a action="prueba3" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Proveedores</s:a></i></li>
                            <li><s:a action="equipo" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Equipo</s:a></i></li>
                            
                        </ul>
                    </div>
                </div>
                <!-- end: Main Menu -->
<%}%>

                <!-- start: Content -->
                <div id="content" class="span10">


                    <ul class="breadcrumb">
                        <li>
                            <i class="icon-home"></i>
                            <a href="index.html">Inicio</a>
                            <i class="icon-angle-right"></i>
                        </li>
                        <li>
                            <i class="icon-edit"></i>
                            <a href="#">Restricciones</a>
                        </li>
                    </ul>

                    <div class="row-fluid sortable">
                        <div class="box span12">
                            <div class="box-header" data-original-title>
                                <h2><i class="icon-edit"></i><span class="break"></span>Agregar usuario</h2>
                                <div class="box-icon">
                                    <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                                    <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                                    <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
                                </div>
                            </div>
                            <div class="box-content">
                                <s:form action="usu_enviar">
                                    <div class="control-group">
                                        <label class="control-label">Usuario:</label>
                                        <div class="controls">
                                            <s:hidden name="usu_id"/>
                                            <s:hidden name="id_ur"/>
                                            <s:hidden name="id_uu"/>
                                            <s:textfield name="usu_usuario" required="true" />
                                        </div>
                                    </div>   
                                    <div class="control-group">
                                        <label class="control-label">Contraseña:</label>
                                        <div class="controls">
                                            <s:textfield name="usu_contrasenia" required="true" type="password" minlength="8" maxlength="12" pattern="[A-Za-z][A-Za-z0-9!#$%&?-]*[0-9!#$%&?-][A-Za-z0-9]*" title="Una contraseña válida es un conjuto de caracteres, donde cada uno consiste de una letra mayúscula o minúscula, o un dígito. La contraseña debe empezar con una letra y contener al menos un dígito o símbolo (! # $ % & ? -)."/>
                                        </div>
                                    </div>                                     
                                    <div class="control-group">
                                        <label class="control-label">Nombre:</label>
                                        <div class="controls">
                                        <s:textfield name="usu_nombre" required="true" minlength="5"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Correo:</label>
                                        <div class="controls">
                                            <s:textfield name="usu_correo" required="true" type="email"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Rol:</label>
                                        <div class="controls">
                                            <s:select name="id_rol" list="datosRol" listValue="rol_descripcion" listKey="rol_id"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Unidad:</label>
                                        <div class="controls">
                                            <s:select name="id_uni" list="datosUni" listValue="uni_nombre" listKey="uni_id"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Institucion:</label>
                                        <div class="controls">
                                            <s:select name="id_ins" list="datosIns" listValue="ins_nombre" listKey="ins_id"/>
                                        </div>
                                    </div>                                        
                                    <div class="form-actions">
                                        <s:submit value="Enviar" title="Enviar" cssClass="btn btn-default"/>
                                        <button class="btn">Limpiar</button>
                                    </div>
                                </s:form>

                            </div>
                        </div><!--/span-->

                    </div><!--/row-->

                    <div class="row-fluid sortable">
                        <div class="box span12">
                            <div class="box-header" data-original-title>
                                <h2><i class="icon-align-justify"></i><span class="break"></span>Usuarios</h2>
                                <div class="box-icon">
                                    <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                                    <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                                    <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
                                </div>
                            </div>
                            <div class="box-content">
                                <table class="table table-striped table-bordered bootstrap-datatable datatable">
                                    <thead>
                                        <tr>
                                            <th>Usuario</th>
                                            <th>Nombre</th>
                                            <th>Correo</th>
                                            <th>Rol</th>
                                            <th>Unidad</th>
                                            <th>Institución</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <s:iterator value="datos" var="dato" status="estado">
                                        <tr>
                                            <td><s:property value="usu_usuario"/></td>
                                            <td><s:property value="usu_nombre"/></td>        
                                            <td><s:property value="usu_correo"/></td>
                                            <td><s:property value="rol_descripcion"/></td>   
                                            <td><s:property value="uni_nombre"/></td>
                                            <td><s:property value="ins_nombre"/></td>   
                                            <td>
                                                <s:a cssClass="btn btn-info" action="usu_editar">
                                                    <s:param name="usu_id" value="usu_id"/>
                                                    <i class="icon-pencil"></i>
                                                </s:a>
                                            </td>
                                        </tr>
                                    </s:iterator>    
                                    </tbody>
                                </table>
                            </div>
                        </div><!--/span-->

                    </div><!--/row-->
                </div><!--/.fluid-container-->

                <!-- end: Content -->
            </div><!--/#content.span10-->
        </div><!--/fluid-row-->

        <div class="modal hide fade" id="myModal">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">×</button>
                <h3>Settings</h3>
            </div>
            <div class="modal-body">
                <p>Here settings can be configured...</p>
            </div>
            <div class="modal-footer">
                <a href="#" class="btn" data-dismiss="modal">Close</a>
                <a href="#" class="btn btn-primary">Save changes</a>
            </div>
        </div>

        <div class="clearfix"></div>
        
        <footer>
            <p>
                <span style="text-align:left;float:left">Sistema de compra de equipos electrónicos.</span>
            </p>
        </footer>        

        <!-- start: JavaScript-->

        <script src="Recursos/js/jquery-1.9.1.min.js"></script>
        <script src="Recursos/js/jquery-migrate-1.0.0.min.js"></script>

        <script src="Recursos/js/jquery-ui-1.10.0.custom.min.js"></script>

        <script src="Recursos/js/jquery.ui.touch-punch.js"></script>

        <script src="Recursos/js/modernizr.js"></script>

        <script src="Recursos/js/bootstrap.min.js"></script>

        <script src="Recursos/js/jquery.cookie.js"></script>

        <script src='Recursos/js/fullcalendar.min.js'></script>

        <script src='Recursos/js/jquery.dataTables.min.js'></script>

        <script src="Recursos/js/excanvas.js"></script>
        <script src="Recursos/js/jquery.flot.js"></script>
        <script src="Recursos/js/jquery.flot.pie.js"></script>
        <script src="Recursos/js/jquery.flot.stack.js"></script>
        <script src="Recursos/js/jquery.flot.resize.min.js"></script>

        <script src="Recursos/js/jquery.chosen.min.js"></script>

        <script src="Recursos/js/jquery.uniform.min.js"></script>

        <!-- <script src="Recursos/js/jquery.cleditor.min.js"></script> -->

        <script src="Recursos/js/jquery.noty.js"></script>

        <script src="Recursos/js/jquery.elfinder.min.js"></script>

        <script src="Recursos/js/jquery.raty.min.js"></script>

        <script src="Recursos/js/jquery.iphone.toggle.js"></script>

        <script src="Recursos/js/jquery.uploadify-3.1.min.js"></script>

        <script src="Recursos/js/jquery.gritter.min.js"></script>

        <script src="Recursos/js/jquery.imagesloaded.js"></script>

        <script src="Recursos/js/jquery.masonry.min.js"></script>

        <script src="Recursos/js/jquery.knob.modified.js"></script>

        <script src="Recursos/js/jquery.sparkline.min.js"></script>

        <script src="Recursos/js/counter.js"></script>

        <script src="Recursos/js/retina.js"></script>

        <!-- <script src="Recursos/js/custom.js"></script> -->
        <!-- end: JavaScript-->

        <!-- Bootstrap core JavaScript================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="assets/js/vendor/jquery.min.js"><\/script>')</script>
        <!-- <script src="dist/js/bootstrap.min.js"></script> -->
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <!-- <script src="assets/js/ie10-viewport-bug-workaround.js"></script> -->

    </body>
</html>
