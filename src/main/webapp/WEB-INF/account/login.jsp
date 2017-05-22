<%--
  Created by IntelliJ IDEA.
  User: backstop-samuel
  Date: 5/22/17
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="HelloWorld.action">
    username: <input type="text" name="username"/>
    password: <input type="text" name="password"/>
    <input type="submit" name="login" value="login" />
    <input type="submit" name="register" value="register" />
    <a href="User.action?list">registed User</a>
</form>

</body>
</html>
