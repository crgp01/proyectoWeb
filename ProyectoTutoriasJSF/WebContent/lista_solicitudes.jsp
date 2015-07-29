<!--<%@page import="epn.modelo.Tutoria"%>-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Listar Solicitudes</title>
<link href="css/stylos.css" type="text/css" rel="stylesheet" />
</head>

<body>
	<div>
		<div id="banner">
			<div id="logo"></div>
			<div id="nombresite">
				Tutorias FIS <br /> <span>Facultad de Ingeniería en Sistemas</span>
			</div>
		</div>
		<div id="barmenu">
			<ul>
				<li><a href="#">Inicio</a></li>
				<li><a href="#">Listar Tutorias</a></li>
			</ul>
		</div>
	</div>
	<div class="titulopagina">
		<h2>Lista de Solicitudes</h2>
	</div>
	<div class="datagrid">
		<table>
			<thead>
				<tr>
					<th>Cód.</th>
					<th>Fecha</th>
					<th>Estudiante</th>
					<th>Temática</th>
					<th>Profesor</th>
				</tr>
			</thead>
			<tbody>
				<%@page import="java.util.*, modelo.*"%>
				<%@page import="java.util.*, modelo.entity.Tutoria"%>
				<%
					List<Tutoria> tutorias = (List<Tutoria>) request.getAttribute("tutorias");
					for (Tutoria t : tutorias) {
				%>
				<!--Impresion de los datos en la tabla-->
				<tr>
					
					<td><%=t.getId()%></td>
					<td><%=t.getFecha()%></td>
					<!--    <td><!--%=t.getEstudiante().getNombre()%></td>  -->
					<!--    <td><!--%=t.getTematica()%></td>                -->
					<td><%=t.getProfesor().getNombre()%></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>