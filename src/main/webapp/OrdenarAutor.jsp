<%-- 
    Document   : OrdenarAutor
    Created on : 29/10/2017, 11:57:36 PM
    Author     : Alejandro
--%>

<%@page import="VO.Libro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
	<title>About</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="img/favicon.ico" type="image/x-icon">
    <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />
    <meta name="description" content="Your description">
    <meta name="keywords" content="Your keywords">
    <meta name="author" content="Your name">
 	<link rel="stylesheet" href="css/bootstrap.css" type="text/css" media="screen">
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
	<link rel="stylesheet" href="css/preview.css" type="text/css">
	<script type="text/javascript" src="js/include_script.js"></script>
  	<!--[if lt IE 9]>
	   	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	    <link href="css/ie.css" rel="stylesheet" type="text/css">
    <![endif]-->
</head>
<body>
<!--content wrapper-->
	<div id="wrapper">
		<section>
			<div class="container">
				<div class="dynamicContent">
					<!--content-->
	               <h1>Libros Ordenados por Autor</h1>
                    <table>
                        <tr>
                            <td>ID</td>
                            <td>NOMBRE</td>
                            <td>AUTOR</td>
                            <td>EDITORIAL</td>
                            <td>ESTADO</td>
                            <td>PRECIO</td>
                            
                        </tr>
                        <%
                            if (request.getAttribute("lis") != null) {
                                ArrayList<Libro> libros = (ArrayList<Libro>) request.getAttribute("lis");

                                if (libros != null) {
                                    for (Libro es: libros) {

                        %>
                        <h1></h1>
                        <tr>  
                            <td><%=es. getId()%></td>
                            <td><%=es.getNombre()%></td>
                            <td><%=es.getAutor() %></td>
                            <td><%=es. getEditorial()%></td>
                            <td><%=es.getEstado()  %></td>
                            <td><%=es.getPrecio()%></td>
                           
                        </tr>
                        
                        

                        <%

                                    }
                                }
                            }
                        %>

                    </table>
                       <h2><a href="LibrosNuevos"> Listar los libros nuevos</a></h2>   
                       <h2><a href="LibrosUsados"> Listar los libros usados</a></h2>   
				</div>
			</div>
                        
                      
		</section>
                        
                        
	</div>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script>
        $(".fancybox").fancybox({});
    </script>
</body>
</html>