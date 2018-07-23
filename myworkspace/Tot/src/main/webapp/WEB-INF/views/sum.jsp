<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="UTF-8">
<title>sum.jsp</title>
</head>
<body>

<div> <jsp:include page="/menu.jsp" flush="false"/></div>
<h2>Sum</h2>
 
<table width="50%" border="1">
<tr align="center">
<th>When</th>
<th>Account</th>
</tr>
<c:forEach var="c" items="${sums}" varStatus="status">
<tr align="center">
<td>${c.yymmdd}</td>
<td>${c.money}</td>
</tr>
</c:forEach>
</table>




</body>
</html>