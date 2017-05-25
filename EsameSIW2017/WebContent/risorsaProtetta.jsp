<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, model.*" %>
<% Utente utente = (Utente)session.getAttribute("utente"); 
   boolean autorizzato = true;
   if (utente!=null)
	   autorizzato &= (utente.getRole().equals("admin"));
   else 
   	   autorizzato = false;
   if (!autorizzato) {
   	   out.clear();
	   RequestDispatcher rd = application.getRequestDispatcher("/fallimento.jsp");
   	   rd.forward(request, response);
	   return;
	}
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%--<link rel="stylesheet" type="text/css" href="uniroma3.css" />--%>

</head>
<body>
<div>Ciao <%= utente.getUsername() %>, sei qui come <%= utente.getRole() %></div>

</body>
</html>