<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<html>
<head>
    <title>Todo Items</title>
</head>
<body>
    <div align="center">
    <c:url var="addItem" value="${Mappings.ADD_ITEM}"/>
        <h2><a href="${addItem}">Add Items</a></h2>
        <table border="1" cellpadding="5">

            <caption><h2>Todo Items</h2></caption>

            <tr>
                <th>Title</th>
                <th>Deadline</th>
                <th>Delete</th>
                <th>Edit</th>
            </tr>

            <c:forEach var="item" items="${todoData.items}">
          <c:url var="deleteItem" value="${Mappings.DELETE_ITEM}">
          <c:param name="id" value="${item.id}"/>
          </c:url>
          <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
                    <c:param name="id" value="${item.id}"/>
                    </c:url>

                    <c:url var="viewURL" value="${Mappings.VIEW_ITEM}">
                                        <c:param name="id" value="${item.id}"/>
                                        </c:url>

                <tr>
                    <td><c:out value="${item.title}"/></td>
                    <td><c:out value="${item.deadline}"/></td>
                   <td> <a href="${deleteItem}">Delete</a></td>
                   <td> <a href="${editUrl}">Update</a></td>
                   <td> <a href="${viewURL}">View</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>