<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="UTF-8">
<title>show.jsp</title>
</head>
<body>
<h2>Show</h2>

<table width="50%" border="1">
<tr align="center">
<th>ID</th>
<th>Account</th>
<th>Amount</th>
<th>When</th>
</th>

<c:forEach var="c" items="${tot.accounts}" varStatus="status">
<tr align="center">
<td>${c.id}</td>
<td>${c.accnt}</td>
<td>${c.money}</td>
<td>${c.yymmdd}</td>
</tr>
</c:forEach>
</table>


 <c:forEach var="cnt" begin="1" end="5"> 
 Number : <c:out value = "${cnt}"/><br /> 
 </c:forEach>



</body>
</html>