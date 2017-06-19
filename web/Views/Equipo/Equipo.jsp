<%-- 
    Document   : Equipo
    Created on : 18/06/2017, 01:13:59 AM
    Author     : Hassel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- start: Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- end: Mobile Specific -->
        <title>Equipos</title>
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
                            'Oops...', 'Equipo asociado a una orden de compra, no se puede eliminar',
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
                                    <i class="icon-user"></i> Pablo Tobar
                                    <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li class="dropdown-menu-title">
                                        <span>Perfil</span>
                                    </li>
                                    <li><a href="<s:url value='/Views/Login.jsp'/>"><i class="icon-off"></i> Cerrar sesión</a></li>
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

                <!-- start: Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li><a href="form.html"><i class="icon-edit"></i><span class="hidden-tablet"> Formulario CRUD</span></a></li>
                            <li><a href="table.html"><i class="icon-align-justify"></i><span class="hidden-tablet"> Tablas</span></a></li>
                            <li><s:a action="institucion" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Institución</s:a></i></li>
                            <li><s:a action="solicitudes" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Solicitudes</s:a></li>
                            <li><s:a action="restricciones" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Restricciones</s:a></i></li>
                            <li><s:a action="proveedores" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Proveedores</s:a></i></li>
                            <li><s:a action="usuarios" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Usuarios</s:a></i></li>
                            <li><s:a action="roles" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Roles</s:a></i></li>
                            <li><s:a action="solicitudCompra" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Solicitud de compra</s:a></li>
                            <li><s:a action="solicitudMantto" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Solicitud de mantenimiento</s:a></li>
                            <li><s:a action="ordenCompra" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Orden de Compra</s:a></i></li>
                            <li><s:a action="inventario" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Inventario</s:a></i></li>
                            <li><s:a action="bitacora" forceAddSchemeHostAndPort="true"><i class="icon-align-justify"></i><span class="hidden-tablet"> Bitacora</s:a></i></li>
                            +                          <li><s:a action="LoginAction"><i class="icon-lock"></i><span class="hidden-tablet"> Login</span></s:a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- end: Main Menu -->

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
                                    <h2><i class="icon-edit"></i><span class="break"></span>Ingresar equipo</h2>
                                    <div class="box-icon">
                                        <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                                        <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                                        <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
                                    </div>
                                </div>
                                <div class="box-content">
                                <s:form action="enviarEquipo" cssClass="form-horizontal">
                                    <div class="control-group">
                                        <label class="control-label" for="typeahead">Proveedor:</label>
                                        <div class="controls">
                                            <s:select name="id" list="datosProvee" listValue="pro_nombre" listKey="pro_id"/>
                                            <s:hidden name="equ_id"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" >Categoría del equipo::</label>
                                        <div class="controls">
                                            <s:select name="id_cat" list="datosCatEqui" listValue="cat_descripcion" listKey="cat_id"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" >Nombre:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="equ_nombre"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" >Marca:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="equ_marca"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" >Modelo:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="equ_modelo"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Año:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="equ_anio"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Capacidad en BTU:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="equ_capacidad_btu"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Potencia:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="equ_potencia"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Garantía:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="equ_especificaciongarantia"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Estado del equipo:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="equ_estado"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Imagen:</label>
                                        <div class="controls">
                                            <s:textfield cssClass="form-control" name="equ_imagen"/>
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
                                            <th>Equipo</th>
                                            <th>Categoría</th>
                                            <th>Proveedor</th>
                                            <th>Marca</th>
                                            <th>Modelo</th>
                                            <th>Año</th>
                                            <th>Btu</th>
                                            <th>Potencia</th>
                                            <th>Estado</th>
                                            <th>Garantía</th>
                                            <th>Acciones</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <s:iterator value="datos" var="dato" status="estado">
                                            <tr>
                                                <td class="center"><s:property value="equ_nombre"/></td>
                                                <td class="center"><s:property value="catEquipo"/></td>
                                                <td class="center"><s:property value="proveedor"/></td>
                                                <td class="center"><s:property value="equ_marca"/></td>
                                                <td class="center"><s:property value="equ_modelo"/></td>
                                                <td class="center"><s:property value="equ_anio"/></td>
                                                <td class="center"><s:property value="equ_capacidad_btu"/></td>
                                                <td class="center"><s:property value="equ_potencia"/></td>
                                                <td class="center"><s:property value="equ_estado"/></td>
                                                <td class="center"><s:property value="equ_especificaciongarantia"/></td>
                                                <td class="center">
                                                    <s:a action="editarEquipo" cssClass="btn btn-info">
                                                        <s:param name="equ_id" value="equ_id"/>
                                                        <i class="icon-pencil"></i>
                                                    </s:a>
                                                    <s:a action="eliminarEquipo" cssClass="btn btn-danger">
                                                        <s:param name="equ_id" value="equ_id"/>
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

        <!-- start: JavaScript-->

        <script src="../Recursos/js/jquery-1.9.1.min.js"></script>
        <script src="../Recursos/js/jquery-migrate-1.0.0.min.js"></script>

        <script src="../Recursos/js/jquery-ui-1.10.0.custom.min.js"></script>

        <script src="../Recursos/js/jquery.ui.touch-punch.js"></script>

        <script src="../Recursos/js/modernizr.js"></script>

        <script src="../Recursos/js/bootstrap.min.js"></script>

        <script src="../Recursos/js/jquery.cookie.js"></script>

        <script src='../Recursos/js/fullcalendar.min.js'></script>

        <script src='../Recursos/js/jquery.dataTables.min.js'></script>

        <script src="../Recursos/js/excanvas.js"></script>
        <script src="../Recursos/js/jquery.flot.js"></script>
        <script src="../Recursos/js/jquery.flot.pie.js"></script>
        <script src="../Recursos/js/jquery.flot.stack.js"></script>
        <script src="../Recursos/js/jquery.flot.resize.min.js"></script>

        <script src="../Recursos/js/jquery.chosen.min.js"></script>

        <script src="../Recursos/js/jquery.uniform.min.js"></script>

        <script src="../Recursos/js/jquery.cleditor.min.js"></script>

        <script src="../Recursos/js/jquery.noty.js"></script>

        <script src="../Recursos/js/jquery.elfinder.min.js"></script>

        <script src="../Recursos/js/jquery.raty.min.js"></script>

        <script src="../Recursos/js/jquery.iphone.toggle.js"></script>

        <script src="../Recursos/js/jquery.uploadify-3.1.min.js"></script>

        <script src="../Recursos/js/jquery.gritter.min.js"></script>

        <script src="../Recursos/js/jquery.imagesloaded.js"></script>

        <script src="../Recursos/js/jquery.masonry.min.js"></script>

        <script src="../Recursos/js/jquery.knob.modified.js"></script>

        <script src="../Recursos/js/jquery.sparkline.min.js"></script>

        <script src="../Recursos/js/counter.js"></script>

        <script src="../Recursos/js/retina.js"></script>

        <script src="../Recursos/js/custom.js"></script>
        <!-- end: JavaScript-->

        <!-- Bootstrap core JavaScript================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
        <script src="../../dist/js/bootstrap.min.js"></script>
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

    </body>
</html>
