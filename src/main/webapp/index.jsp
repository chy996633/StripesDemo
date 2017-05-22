<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<html>
<body>
<h2>Hello Stripes!</h2>
<p>Welcome:${actionBean.username},password:${actionBean.password}</p>
<stripes:form beanclass="web.stripes.action.HelloWorldAction">
    username: <stripes:text name="username" />
    password: <stripes:text name="password" />
    <input type="submit" name="index" value="login" />
    <input type="submit" name="register" value="register" />
    <a href="User.action?list">registed User</a>
</stripes:form>
</body>
</html>
