<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>stat.jsp</title>
</head>
<body>

<div>
    <jsp:include page="/menu.jsp" flush="false"/>
</div>

<h2>stat</h2>

<table width="50%" border="1">
	<tr align="center">
		<th>yymmdd</th>
		<th>amount</th>
	</tr>

<c:forEach var="c" items="${stats}" varStatus="status">
	<tr align="center">
		<td>${c.yymmdd}</td>
		<td>${c.amount}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>