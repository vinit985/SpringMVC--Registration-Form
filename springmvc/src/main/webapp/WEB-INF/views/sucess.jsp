<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
      <h1>${Header }</h1>
 <p>${desc }</p>
 <hr>
    <h1>Welcome,${user.userName }</h1>
    <h1>Your email is ${user.userEmail }</h1>
    <h1>Your password is ${user.userPassword }</h1>
</body>
</html>