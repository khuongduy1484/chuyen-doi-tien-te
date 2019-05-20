<%--
  Created by IntelliJ IDEA.
  User: duy
  Date: 20/05/2019
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <form action="convert" method="post">
    Rate:
    <input type="text" name="usd">
    USD:
    <input type="text" name="vnd" placeholder="0">
    <br><br>
    <input type="submit" value="Convert">
  </form>

  </body>
</html>
