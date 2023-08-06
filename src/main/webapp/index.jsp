<%-- 
    Document   : index
    Created on : 06-08-2023, 18:11:18
    Author     : fv192
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nuevo Cliente</h1>
        <form action="controller" method="POST">
            Identificacion: <br>
            <input type="text" name="identificacion" value="" /><br>
            Nombres: <br>
            <input type="text" name="nombres" value="" /><br>
            Apellidos: <br>
            <input type="text" name="apellidos" value="" /><br>
            Rut:
            <input type="text" name="rut" value="" /><br>
            Ciudad: <br>
            <input type="text" name="ciudad" value="" /><br>
            
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
