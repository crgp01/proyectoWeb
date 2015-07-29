<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
<link rel="stylesheet" type="text/css" href="css/stylos.css" />
</head>

<body>
	<div>
		<div id="banner">
			<div id="logo">
				<img src="" />
			</div>
			<div id="nombresite">
				Tutorias FIS <br /> <span>Facultad de Ingeniería de Sistemas</span>
			</div>
		</div>
		<div id="barmenu"></div>
	</div>
	<div id="contenido">
		<div>
			<img src="images/tutoria_fondo.jpg" width="680" height="400" />
		</div>
		<div id="login">
			<fieldset>
				<legend>
					<b>Gestión de Tutorias</b>
				</legend>
				<form name="ListarTutorias" action="ListarTutoriasServlet"
					method="post">
					<input type="submit" value="Listar Tutorias" />
				</form>
				<input type="button" value="Solicitar Tutoria"
					onclick="window.location.href='listarTutorias.jsp'" />
			</fieldset>
		</div>

		<div id="login">
			<fieldset>
				<legend>
					<b>Opciones</b>
				</legend>
				<input id="regresar" type="button" value="Regresar"
					onclick="window.location.href='menu.jsp'" />
			</fieldset>
		</div>

	</div>
	</div>
</body>
</html>