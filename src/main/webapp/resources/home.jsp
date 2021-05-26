<%--
  Created by IntelliJ IDEA.
  User: CakeForDrake
  Date: 26.05.2021
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/resources/styles.css">
</head>
<body>
<ul>
    <li><a href="#home">Home</a></li>
    <li><a href="#hall1">Hall 1</a></li>
    <li><a href="#hall2">Hall 2</a></li>
    <li><a href="#hall3">Hall 3</a></li>
    <li><a href="#hall4">Hall 4</a></li>
    <li style="float:right"><a class="active" href="#login">Login</a></li>
</ul>

<div class="block-level drop-shadow.right">
    <div class="hall1-name"> Art Hall</div>
    <a class="img-block" href="hall1"><img   src="resources\images\art_hall.png" width="600"
                                             height="350" alt="art_hall"></a>
    <div class="hall2-name"> Agro Hall</div>
    <a class="img-block-right" href="hall2"><img  src="resources\images\agro_hall.jpg" width="600"
                                                  height="350" alt="art_hall"></a>
    <div class="hall3-name"> Game Hall</div>
    <a class="img-block-left_b" href="hall3"><img  src="resources\images\game_hall.jpg" width="600"
                                                   height="350" alt="art_hall"></a>
    <div class="hall4-name"> Car Hall</div>
    <a class="img-block-right_b" href="hall4"><img  src="resources\images\car_hall.jpg" width="600"
                                                    height="350" alt="art_hall"></a>
</div>
<p></p>
</body>
</html>
