<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.gb.model.Product" %><%--
  Created by IntelliJ IDEA.
  User: k1netic
  Date: 23.03.2022
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
    <h1>Products:</h1>
    <hr>
        <ul>
            <% if (!((ArrayList<Product>)(request.getAttribute("products"))).isEmpty()) %>
            <% for (Product value : (ArrayList<Product>)(request.getAttribute("products"))) { %>
            <li>
                id: <%=value.getId() %>; title: <%=value.getTitle() %>; cost: <%= value.getCost() %>
            </li>
            <% } %>
        </ul>
</body>
</html>
