<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
</head>
<body>

	<h1>Connexion</h1>
		
	<form action="${loginUrl}" method="post">
	<c:if test="${param.error != null}">        		<p>
			identifiant et/ou mot de passe invalide.
		</p>
	</c:if>
    <table>
      <tr>
        <td>Identifiant</td>
        <td><input type="text" name="username"></td>
      </tr>
      <tr>
        <td>Mot de passe</td>
        <td><input type="password" name="password"></td>
      </tr>
      <tr>
        <td><button type="submit">Connexion</button></td>
      </tr>
    </table>
  </form>
  <br/>
</body>
</html>