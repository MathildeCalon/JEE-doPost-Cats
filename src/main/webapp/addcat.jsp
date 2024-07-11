<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/07/2024
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cat</title>
</head>
<body>
<h1>Ajouter un chat</h1>
<form action="cats" method="post">
    <div>
        <label for="name">Name :</label>
        <input type="text" id="name" name="name" >
    </div>
    <div>
        <label for="race">Race :</label>
        <input type="text" id="race" name="race" >
    </div>
    <div>
        <label for="meal">Meal :</label>
        <input type="text" id="meal" name="meal" >
    </div>
    <div>
        <label for="birthdate">Birthdate :</label>
        <input type="date" id="birthdate" name="birthdate" >
    </div>
    <button>Add</button>
</form>
</body>
</html>
