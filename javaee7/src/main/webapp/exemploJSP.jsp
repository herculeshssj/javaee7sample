<jsp:useBean id="teste" class="br.com.hslife.javaee7.servletjsp.ExemploJSP" scope="page"/>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exemplo JSP</title>
</head>
<body>
<% 

	out.println(teste.mensagem());
	
%>

<br/><br/>

<form action="${pageContext.request.contextPath}/ExemploServlet" method="get">

Entre com seu nome:
<input type="text" id="nomeGET" name="nomeGET"/>

<input type="submit" value="Enviar via GET">

</form>

<br/><br/>

<form action="${pageContext.request.contextPath}/ExemploServlet" method="post">

Entre com seu nome:
<input type="text" id="nomePOST" name="nomePOST"/>

<input type="submit" value="Enviar via POST">

</form>

<a href="${pageContext.request.contextPath}/faces/index.jsf">Exemplo de JSF</a>
<br/><br/>
<a href="${pageContext.request.contextPath}/faces/indexCDI.jsf">Exemplo de JSF com CDI</a>
<br/><br/>
<a href="${pageContext.request.contextPath}/faces/indexEJBCDI.jsf">Exemplo de JSF com EJB e CDI</a>

</body>
</html>