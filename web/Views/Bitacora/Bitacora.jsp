<%-- 
    Document   : homeOrdenCompra
    Created on : 14/05/2017, 04:12:15 PM
    Author     : Pablo
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
        <title>Bitácora de mantenimientos</title>
        <!-- start: CSS -->
        <link type="text/css" id="base-style" href="Recursos/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/style.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/fullcalendar.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/iconos.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/elfinder.min.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/elfinder.theme.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/style-forms.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/glyphicons.css" rel="stylesheet">
        <link type="text/css" id="base-style" href="Recursos/css/halflings.css" rel="stylesheet">
        <link type="text/css" id="base-style-responsive" href="Recursos/css/style-responsive.css" rel="stylesheet">
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href="Recursos/css/sweetalert2.min.css" />
        <!-- end: CSS -->
    <script language='javascript'>
            <%@include file="/Recursos/sweetalert2/sweetalert2.min.js" %>

            function mostrarError()
            {
                
                var isError =<s:property value="loginError"/>;
                if (isError === 1)
                {
                    //swal
                    swal(
                            'Oops...', 'Bitacora asociada, no se puede eliminar',
                            'error'
                          
                            );
                }
            }
        </script>
    </head>
    <body onload="mostrarError();">
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
                                    <i class="icon-user"></i>Usuario<span class="caret"></span>
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
                <%    if (UsuarioActivo.idRol<1 || UsuarioActivo.idRol>5){%>
           <s:action name="login" executeResult="true"/>
<%}%> 
                <%    if (UsuarioActivo.idRol == 1) {%>
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
                <%    if (UsuarioActivo.idRol == 2) {%>
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
                <%    if (UsuarioActivo.idRol == 3) {%>
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
                <%    if (UsuarioActivo.idRol == 4) {%>
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
                <%    if (UsuarioActivo.idRol == 5) {%>
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
                            <a href="index.html">Home</a>
                            <i class="icon-angle-right"></i>
                        </li>
                        <li>
                            <i class="icon-edit"></i>
                            <a href="#">Forms</a>
                        </li>
                    </ul>

                    <div class="row-fluid sortable">
                        <div class="box span12">
                            <div class="box-header" data-original-title>
                                <h2><i class="icon-edit"></i><span class="break"></span>Ingresar bitacora de matenimiento</h2>
                                <div class="box-icon">
                                    <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                                    <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                                    <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
                                </div>
                            </div>
                            <div class="box-content">
                                <s:form action="bit_enviar" cssClass="form-horizontal">
                                    <div class="control-group">
                                        <label class="control-label" for="typeahead">Equipo:</label>
                                        <div class="controls">
                                            <s:select name="id1" list="datosEqui" listValue="equ_nombre" listKey="inv_dtl_id"/>
                                            <s:hidden name="bit_id"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="date01">Fecha inicio:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="bit_fecha_inicio" type="date"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="date01">Hora inicio:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="bit_hora_inicio" minlength="5" maxlength="5" placeholder="00:00" pattern="[0-9]{2}:[0-9]{2}" title="Formato: 00:00"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="date01">Estado inicial del equipo:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="bit_estado_inicial" placeholder="Estado inicial del equipo" title="Ingresar estado inicial"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="date01">Fecha fin:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="bit_fecha_fin" type="date"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="date01">Hora fin:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="bit_hora_fin" minlength="5" maxlength="5" placeholder="00:00" pattern="[0-9]{2}:[0-9]{2}" title="Formato: 00:00"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="date01">Estado final:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="bit_estado_final" placeholder="Estado final del equipo" title="Ingresar estado final"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Persona que lo realiza:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="bit_nombre_personal" required="true" minlength="5"/>
                                        </div>
                                    </div>

                                    <div class="control-group">
                                        <label class="control-label">Comentario:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="bit_comentarios" required="true" minlength="5"/>
                                        </div>
                                    </div>

                                    <div class="form-actions">
                                        <s:submit value="Enviar" title="Guardar" cssClass="btn btn-info"/>
                                        <button class="btn">Limpiar</button>
                                    </div>
                                </s:form>
                            </div>
                        </div><!--/span-->

                    </div><!--/row-->

                    <div class="row-fluid sortable">
                        <div class="box span12">
                            <div class="box-header" data-original-title>
                                <h2><i class="icon-align-justify"></i><span class="break"></span>Bitácora de mantenimiento</h2>
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
                                            <th>Correlativo</th>
                                            <th>Inventario</th>
                                            <th>Equipo</th>
                                            <th>Institucion</th>
                                            <th>Fecha inicio</th>
                                            <th>Hora inicio</th>
                                            <th>Fecha fin</th>
                                            <th>Hora fin</th>
                                            <th>Estado inicial</th>
                                            <th>Estado final</th>
                                            <th>Persona</th>
                                            <th>Comentario</th>
                                            <th>Acciones</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <s:iterator value="datos" var="dato" status="estado">
                                            <tr>
                                                <td><s:property value="bit_id"/></td>
                                                <td class="center"><s:property value="inv_dtl_id"/></td>
                                                <td class="center"><s:property value="equipo"/></td>
                                                <td class="center"><s:property value="institucion"/></td>
                                                <td class="center"><s:property value="bit_fecha_inicio"/></td>
                                                <td class="center"><s:property value="bit_hora_inicio"/></td>
                                                <td class="center"><s:property value="bit_fecha_fin"/></td>
                                                <td class="center"><s:property value="bit_hora_fin"/></td>
                                                <td class="center"><s:property value="bit_estado_inicial"/></td>
                                                <td class="center"><s:property value="bit_estado_final"/></td>
                                                <td class="center"><s:property value="bit_nombre_personal"/></td>
                                                <td class="center"><s:property value="bit_comentarios"/></td>
                                                <td class="center">
                                                    <s:a cssClass="btn btn-success" action="detalleOrdenCompra">
                                                        <i class="icon-save"></i>
                                                    </s:a>
                                                    <s:a action="bit_editar" cssClass="btn btn-info">
                                                        <s:param name="bit_id" value="bit_id"/>
                                                        <i class="icon-pencil"></i>
                                                    </s:a>
                                                    <s:a action="bit_eliminiar" cssClass="btn btn-danger">
                                                        <s:param name="bit_id" value="bit_id"/>
                                                        <i class="icon-trash"></i>
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

        <div class="clearfix"></div>

        <footer>

            <p>
                <span style="text-align:left;float:left">&copy; 2017  Sistema de compra de equipos eletrónicos.</span>

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
