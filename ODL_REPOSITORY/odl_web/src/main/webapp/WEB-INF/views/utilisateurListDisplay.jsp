<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

 
<html>
<head>
    <title>All Users Panel</title>
</head>
 
<body>
    <h2>All Users in System</h2>
 
    <table border="1">
        <tr>
            <th>ID</th>
            <th>prenom</th>
            <th>nom</th>
            <th>ville</th>
        </tr>
        <c:forEach items="${utilisateurs}" var="utilisateurs">
            <tr>
                <td>${utilisateurs.userID}</td>
                <td>${utilisateurs.prenom}</td>
                <td>${utilisateurs.nom}</td>
                <td>${utilisateurs.adresse.ville}</td>
            </tr>
        </c:forEach>
    </table>
 
</body>
</html>