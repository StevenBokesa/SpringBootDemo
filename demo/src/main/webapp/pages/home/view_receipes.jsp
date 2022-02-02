<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>View Books</title>
        
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Batch No</th>
                    <th>Price</th>
                    <th>Number of Product</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${products}" var="book">
                    <tr>
                   
                        <td>${book.id}</td>
                        <td>${book.pname}</td>
                        <td>${book.batchno}</td>
                        <td>${book.price}</td>
                        <td>${book.noofproduct}</td>
                        
                    </tr>
                </c:forEach> 
            </tbody>
        </table>
    </body>
</html>