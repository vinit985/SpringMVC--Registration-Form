<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
   <h1>This is home Page</h1>
   <h1>Called by home Controller</h1>
   <h1>Url------/home</h1>
   <%
   
        String name =(String)request.getAttribute("name");
         Integer id =(Integer)request.getAttribute("Id");
        ArrayList<String> s1=(ArrayList<String>)request.getAttribute("f");
   
   %>
  <h1>Name is <%=name %></h1>
  <h1>Id is <%=id%></h1> 
  <%
    for(String s:s1)
    {
   %>	
   <h1><%=s%></h1>
   <%}%> 
  
 
  </body>
</html>