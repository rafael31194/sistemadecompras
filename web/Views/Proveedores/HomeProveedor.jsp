
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        div .texto{
    width: 300px;
    border: 25px solid green;
    padding: 25px;
    margin: 25px;
}

.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
}

        </style>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    
    </head>
    <body  >
        <div class="texto" >
        
        
        <s:form action="/Views/Proveedores/ProveedorAction" >
            
    <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">

          <div class="masthead clearfix">
            
          </div>

          <div class="inner cover">
            <h1 class="cover-heading">BIENVENIDO</h1>
            <p class="lead">Desde acá podrás gestionar tu catalogo de productos.</p>
            
             <s:submit value="Ingresar Nuevo Equipo" cssClass="button"></s:submit>
             <table class="table table-bordered">
                 <thead>
                 <th>ID</th>
                 <th>Nombre</th>
                 <th>Marca</th>
                 <th>Modedlo</th>
                 <th>Acciones</th>
                 </thead>
                 <tbody>
                        <s:iterator value="datosEquipos" var="dato" status="estado">
                            <tr>
                        <td><s:property value="equId"></s:property></td>
                        <td><s:property value="equNombre"></s:property></td>
                        <td><s:property value="equModelo"></s:property></td>
                        <td><s:property value="equMarca"></s:property></td>
                        <td><s:a action="editarEquipoAction">
                                <s:param value="id" name="id"></s:param>
                                <i class="glyphicon glyphicon-pencil"></i>  
                            </s:a>
                                <s:a action="eliminarEquipoAction">
                                    <s:param value="id" name="id"></s:param>
                                    <i class="glyphicon glyphicon-trash"></i>
                                </s:a>
                        </td>
                 </tr>
                        </s:iterator>
                 </tbody>
            </table>
          </div>

          

        </div>

      </div>

    </div>
           
        </s:form>
        </div>
             
               <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>
