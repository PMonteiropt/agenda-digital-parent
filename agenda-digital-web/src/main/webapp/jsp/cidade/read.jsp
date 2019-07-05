<%@page import="com.everis.academia.agenda.digital.entity.Cidade"%>
<%@page
	import="com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness"%>
<%@page
	import="com.everis.academia.java.agenda.digital.business.ICidadeBusiness"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page
import="com.everis.academia.java.agenda.digital.dao.impl.CidadeDAO"%>
<%@page
import="com.everis.academia.java.agenda.digital.dao.ICidadeDAO"%>


<%!
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
		
		<%
		for(Cidade cidade : business.read()) {
		%>
		<tr>
			<td><%=cidade.getCodigo() %></td>
			<td><%=cidade.getNome() %></td>
			<td width="70px"><a href="update.jsp?codigo="<%=cidade.getCodigo()%>>Atualizar</a></td>
			<td width="70px"><a href="<%=request.getContextPath()%>delete/controller?codigo=<%=cidade.getCodigo()%>">Excluir</a></td>
		</tr>
		<% 
		}
		%>
	</table>
</body>
</html>