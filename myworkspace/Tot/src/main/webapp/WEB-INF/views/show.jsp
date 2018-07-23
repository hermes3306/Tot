<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="UTF-8">
<title>show.jsp</title>
</head>
<body>

<div> <jsp:include page="/menu.jsp" flush="false"/></div>
<h2>Show</h2>
 

<table width="50%" border="1">
<tr align="center">
<th>ID</th>
<th>Account</th>
<th>Amount</th>
<th>When</th>
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