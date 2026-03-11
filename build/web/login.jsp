<%-- 
    Document   : login
    Created on : Mar 11, 2026, 10:50:43 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="MainController" method="POST">
            User ID <input type="text" name="userID" required=""/></br> 
            Password <input type="password" name="password" required=""/></br> 
            <input type="submit" name="action" value="Login"/></br> 
            <input type="reset" value="Reset"/></br> 
        </form>
    </body>
</html>
