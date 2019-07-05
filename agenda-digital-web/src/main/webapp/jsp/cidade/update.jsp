<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>



<html>
<body>
	<form action="cidade/update">
		<table>
			<tr>
				<td>Código:</td>
				<td><input type="text" name="codigo" value="null"
					readonly="true"></td>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" value="porto"></td>
			</tr>
			<tr>
				<td><input type="submit" name="acao" value="Atualizar"\><input
					type="reset" name="acao" value="Limpar"\></td>
			</tr>
		</table>
	</form>
</body>
</html>