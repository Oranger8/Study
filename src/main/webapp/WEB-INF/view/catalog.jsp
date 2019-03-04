<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="ru.geekbrains.javaee.study.model.Product" %>
<%@ page import="java.util.Collection" %>

<html>
<head>
    <title>Catalog</title>
</head>
<body>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
    </tr>

    <% for (Product pr : (Collection<Product>) request.getAttribute("products")) { %>

    <tr>
        <td><%= pr.getId() %></td>
        <td><%= pr.getName() %></td>
        <td><%= pr.getPrice() %></td>
        <td><%= pr.getDescription() %></td>
    </tr>

    <% } %>
</table>

</body>
</html>
