<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta charset="UTF-8">
<title>addf.jsp</title>
</head>
<body>

<div> <jsp:include page="/menu.jsp" flush="false"/></div>
<h2>Add Form</h2>
 
<form:select path="name">
 <form:option value="박준혁1" label="박준혁1" />
 <form:option value="박준혁2" label="박준혁2" />
 <form:option value="박준혁3" label="박준혁3" />
 <form:option value="박준혁4" label="박준혁4" />
</form:select>


 <form:form method = "POST" action = "/">
         <table>
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><form:input path = "name" /></td>
            </tr>
            <tr>
               <td><form:label path = "age">Age</form:label></td>
               <td><form:input path = "age" /></td>
            </tr>
            <tr>
               <td><form:label path = "id">id</form:label></td>
               <td><form:input path = "id" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
      
      



</body>
</html>

