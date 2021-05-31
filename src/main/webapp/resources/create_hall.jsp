<%--
  Created by IntelliJ IDEA.
  User: CakeForDrake
  Date: 28.05.2021
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/styles.css">
    <title>Create new Hall</title>
</head>
<body>
<div class="create-hall">Create Hall</div>

<form class="block-level drop-shadow.right" action="${pageContext.request.contextPath}/save_hall" method="post">
<%--    {% csrf_token %}--%>
    <input type="hidden" id="id" name="id" value="-1">
    <label class="j-label" for="name">Name:</label>
    <input class="create-hall1" type="text" id="name" name="name"><br><br>
    <label class="j-label" for="description">Description:</label>
    <input class="create-hall1" type="text" id="description" name="description"><br><br>
    <label class="j-label" for="hall">Hall #:</label>
    <input class="create-hall1" type="number" id="hall" name="hall"><br><br>
    <label class="j-label" for="price">Price:</label>
    <input class="create-hall1" type="number" id="price" name="price"><br><br>
    <input class="create-hall1" type="submit" value="Submit">
    <input class="create-hall1" type="datetime-local" id="time"
           name="time" value="2020-06-12 T19:30"
           min="2018-06-07T00:00" max="2048-06-14T00:00">

</form>
</body>
</html>
