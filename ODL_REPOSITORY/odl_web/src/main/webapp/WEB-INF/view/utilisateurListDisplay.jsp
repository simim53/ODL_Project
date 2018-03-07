
<!DOCTYPE html>

 
<html>
<head>
    <title>Spring MVC Hello World</title>
</head>
 
<body>
    <h2>All Employees in System</h2>
 
    <table border="1">
        <tr>
            <th>utilisateur Id</th>
            <th>prenom</th>
            <th>nom</th>
        </tr>
        <c:forEach items="${utilisateur}" var="utilisateur">
            <tr>
                <td>${utilisateur.id}</td>
                <td>${utilisateur.prenom}</td>
                <td>${utilisateur.nom}</td>
            </tr>
        </c:forEach>
    </table>
 
</body>
</html>