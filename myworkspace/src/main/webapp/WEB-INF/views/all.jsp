<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>all.jsp</title>
</head>
<body>
<h2>all</h2>

<table width="50%" border="1">
	<tr align="center">
		<th>id</th>
		<th>accnt</th>
		<th>money</th>
		<th>yymmdd</th>
	</tr>

<c:forEach var="c" items="${accounts}" varStatus="status">
	<tr align="center">
		<td>${c.id}</td>
		<td>${c.accnt}</td>
		<td>${c.money}</td>
		<td>${c.yymmdd}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>