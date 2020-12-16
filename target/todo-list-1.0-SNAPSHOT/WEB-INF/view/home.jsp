<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <div align="center">
    <c:url var="items" value="${Mappings.ITEMS_LINK}"/>
    <h2><a href="${items}">Show Items</a></h2>


    </div>

</body>
</html>