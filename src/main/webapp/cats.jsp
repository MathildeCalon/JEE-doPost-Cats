
<%@ page import="org.example.jee_cats.Cat" %>
<jsp:useBean id="cats" type="java.util.ArrayList<org.example.jee_cats.Cat>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="WEB-INF/bootstrap.html"%>
    <title>List of cats</title>
</head>
<body>

<div class="container">
    <h1>Liste de chats</h1>
    <% if (cats.size()>0){ %>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Race</th>
            <th scope="col">Meal</th>
            <th scope="col">Birthdate</th>
        </tr>
        </thead>
        <tbody>
        <% for (Cat c: cats) { %>
        <tr>
            <td> <%= c.getName()  %></td>
            <td> <%= c.getRace() %></td>
            <td> <%= c.getMeal() %></td>
            <td> <%= c.getBirthdate() %></td>

        </tr>
        <% } %>
        </tbody>
    </table>
    <% } else {%>
    <p>Vous n'avez aucun chat dans votre liste.</p>
    <% } %>
</div>
</body>
</html>
