<%-- 
    Document   : insertuser
    Created on : Mar 8, 2017, 8:00:41 PM
    Author     : NGUYEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insert new user</h1>
        <form action="insert-user" method="post">
            First Name : <input type="text" name="firstname"><p></p>
            Last Name :<input type="text" name="lastname"><p></p>
            Email:<input type="email" name="email"><p></p>
            <input type="submit"  name="username" value="Insert">
        </form>
        <p>${message}</p>
    </body>
</html>
