<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<html>
<head>
    <title>Todo Items</title>
</head>
<body>
    <div align="center">
    <c:url var="items" value="${Mappings.ITEMS_LINK}"/>
        <h2><a href="${items}">Show Items</a></h2>

    <table>
                         <table border="1" cellpadding="5">

                                    <caption><h2>View Item</h2></caption>

                                    <tr>
                                    <th>Id</th>
                                        <th>Title</th>
                                        <th>Deadline</th>
                                        <th>Description</th>

                                    </tr>

                                    <tr>
                                                        <td><c:out value="${todoItem.id}"/></td>
                                                        <td><c:out value="${todoItem.title}"/></td>
                                                        <td><c:out value="${todoItem.deadline}"/></td>
                                                        <td><c:out value="${todoItem.details}"/></td>

                                                    </tr>
                    </table>


    </div>

</body>
</html>