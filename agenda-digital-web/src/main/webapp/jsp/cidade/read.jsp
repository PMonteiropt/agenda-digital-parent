<%@page
	import="com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness"%>
<%@page
	import="com.everis.academia.java.agenda.digital.business.ICidadeBusiness"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<%
	ICidadeBusiness business = new CidadeBusiness();
%>


<!DOCTYPE html>

<html>
<body>
	<a href="create">Criar Nova Cidade</a>
	<table width="100%" border="1px">
		<tr>
			<th width="70px">Código</th>
			
			<th>Nome</th>
			<th colspan="2">Ações</th>
		</tr>
		<tr>
			<td>1</td>
			<td>lisboa</td>
			<td width="70px"><a href="ControladorUpdate?codigo=lisboa">Atualizar</a></td>
			<td width="70px"><a href="delete/controller?codigo=1">Excluir</a></td>
		</tr>
	</table>
</body>
</html>