<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored ="false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Help-----</title>
</head>
<body>
    <h1>Reach out on the detail Available</h1>
    <%--  <%
        String name=(String) request.getAttribute("name");
        Integer i = (Integer)request.getAttribute("Roll No");
        LocalDateTime j =(LocalDateTime)request.getAttribute("Time");
        
     %> --%>
    <%--  <h1><%=name %></h1>
     <h1><%=i %></h1>
     <h1><%=j%></h1> --%>
    <h1>${name}</h1> 
    
    <h1>${RollNo}</h1> 
     <h1>${Time}</h1>
     <hr>
    <%-- <c:forEach var="it" items=${mks }>
     
     <h1>${it }</h1> 
     
     
     
      </c:forEach> --%>

</body>
</html>