<%-- 
    Document   : homeOrdenCompra
    Created on : 14/05/2017, 04:12:15 PM
    Author     : Pablo
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
        <title>Ordenes de Compras</title>
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
                            <li><a href="<s:url value='/Views/Login.jsp'/>"><i class="icon-lock"></i><span class="hidden-tablet"> Login</span></a></li>
                            <li><a href="<s:url value='/Views/Instituciones/homeInstitucion.jsp'/>"><i class="icon-lock"></i><span class="hidden-tablet"> Instituciones</span></a></li>
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
                                <h2><i class="icon-edit"></i><span class="break"></span>Ingresar orden de compra</h2>
                                <div class="box-icon">
                                    <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                                    <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                                    <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
                                </div>
                            </div>
                            <div class="box-content">
                                <form class="form-horizontal">
                                    <div class="control-group">
                                        <label class="control-label" for="selectError">Estado:</label>
                                        <div class="controls">
                                            <select id="selectError" data-rel="chosen">
                                                <option>Option 1</option>
                                                <option>Option 2</option>
                                                <option>Option 3</option>
                                                <option>Option 4</option>
                                                <option>Option 5</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="selectError">Solicitud:</label>
                                        <div class="controls">
                                            <select id="selectError" data-rel="chosen">
                                                <option>Option 1</option>
                                                <option>Option 2</option>
                                                <option>Option 3</option>
                                                <option>Option 4</option>
                                                <option>Option 5</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="selectError">Proveedor:</label>
                                        <div class="controls">
                                            <select id="selectError" data-rel="chosen">
                                                <option>Option 1</option>
                                                <option>Option 2</option>
                                                <option>Option 3</option>
                                                <option>Option 4</option>
                                                <option>Option 5</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
					<label class="control-label" for="typeahead">Auto complete </label>
                                        <div class="controls">
                                            <input type="text" class="span6 typeahead" id="typeahead"  data-provide="typeahead" data-items="4" data-source='["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]'>
					</div>
                                    </div>
                                    <div class="control-group">
					<label class="control-label" for="date01">Fecha:</label>
					<div class="controls">
                                            <input type="date" class="input-xlarge datepicker" id="date01">
					</div>
				</div>
                                    <div class="control-group">
                                        <label class="control-label">Descripción:</label>
                                        <div class="controls">
                                            <input class="form-control" type="text" value="" placeholder="Descripción">
                                        </div>
                                    </div>
                                    
                                    <div class="form-actions">
                                        <button type="submit" class="btn btn-primary">Guardar</button>
                                        <button class="btn">Limpiar</button>
                                    </div>
                                </form>

                            </div>
                        </div><!--/span-->

                    </div><!--/row-->

                    <div class="row-fluid sortable">
                        <div class="box span12">
                            <div class="box-header" data-original-title>
                                <h2><i class="icon-align-justify"></i><span class="break"></span>Ordenes de compras</h2>
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
                                            <th># Orden</th>
                                            <th># Solicitud</th>
                                            <th>Estado</th>
                                            <th>Proveedor</th>
                                            <th>Fecha</th>
                                            <th>Descripción</th>
                                            <th>Acciones</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td class="center">2</td>
                                            <td class="center">Aprobada</td>
                                            <td class="center">Tecnoparts</td>
                                            <td class="center">03/05/2017</td>
                                            <td class="center">Aires acondicionados</td>
                                            <td class="center">
                                                <a class="btn btn-success" href="<s:url value='/Views/OrdenCompra/homeDetalleOrdenCompra.jsp'/>">
                                                    <i class="icon-save"></i>
                                                </a>
                                                <a class="btn btn-info" href="#">
                                                    <i class="icon-pencil"></i>
                                                </a>
                                                <a class="btn btn-danger" href="#">
                                                    <i class="icon-trash"></i>
                                                </a>
                                            </td>
                                        </tr>
                                        
                          
                                        <tr>
                                            <td>2</td>
                                            <td class="center">27</td>
                                            <td class="center">Aprobada</td>
                                            <td class="center">Autoparts</td>
                                            <td class="center">9/11/2016</td>
                                            <td class="center">3 motocicletas</td>
                                            <td class="center">
                                                <a class="btn btn-success" href="#">
                                                    <i class="icon-save"></i>
                                                </a>
                                                <a class="btn btn-info" href="#">
                                                    <i class="icon-pencil"></i>
                                                </a>
                                                <a class="btn btn-danger" href="#">
                                                    <i class="icon-trash"></i>
                                                </a>
                                            </td>
                                        </tr>
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
