<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>hello</title>  
</head>  
<body>  
<h2>Hello World!</h2>  
  
<form action="login.do">  
    username:<input id="username" name="username" type="text"></input><br>  
    pwd:<input id="username" name="password" type="password"></input><br>  
    <input type="submit">  
</form>  
<span>IP:<%=request.getRemoteAddr() %></span>  
</body>  
</html>  