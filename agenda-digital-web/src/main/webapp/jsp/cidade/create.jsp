<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<body>
	<form action="<%=request.getContextPath()%>/cidade/ControladorCreate">
		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome"></td>
			</tr>
			<tr>
				<td><input type="submit" name="acao" value="Criar"><input
					type="reset" name="acao" value="Limpar"></td>
			</tr>
		</table>
	</form>
</body>
</html>