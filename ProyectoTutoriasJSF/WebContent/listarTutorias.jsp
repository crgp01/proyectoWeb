<!doctype html>
<%@page import="modelo.entity.Tutoria"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Tutorias</title>
<link href="css/stylos.css" type="text/css" rel="stylesheet" />
</head>

<body>
	<div>
		<div id="banner">
			<div id="logo"></div>
			<div id="nombresite">
				Tutorias FIS <br /> <span>Facultad de Ingeniería de Sistemas</span>
			</div>
		</div>
		<div id="barmenu"></div>
	</div>
	<div class="titulopagina">
		<h2>Lista de Solicitudes</h2>
	</div>
	<div class="datagrid" color="blue">
		<table>
			<thead>
				<tr>
					<th>Código.</th>
					<th>Fecha</th>
					<th>Estudiante</th>
					<th>Temática</th>
					<th>Hora Inicio</th>
					<th>Hora Fin</th>
				</tr>
			</thead>
			<tbody>
				<%
					ArrayList<Tutoria> tutoriasDevueltas = new ArrayList<Tutoria>();
					HttpSession sesion=request.getSession();
					tutoriasDevueltas= (ArrayList<Tutoria>) sesion.getAttribute("tutorias");
					
					for (Tutoria i:tutoriasDevueltas)
					{
						out.println("<tr>");
						out.println("<td>"+i.getId()+"</td>");
						out.println("<td>"+i.getFecha()+"</td>");
						out.println("<td>"+i.getProfesor()+"</td>");
						out.println("<td>"+i.getEstudiate()+"</td>");
						out.println("<td>"+i.getHoraInicio()+"</td>");
						out.println("<td>"+i.getHoraFin()+"</td>");
						out.println("</tr>");
					}
					
					/* for (Tutoria i:tutoriasDevueltas)
					{
						out.println("<tr>");
						out.println("<td>"+i.getId()+"</td>");
						out.println("<td>"+i.getFecha()+"</td>");
						out.println("<td>"+i.getIdEstudiante()+"</td>");
						out.println("<td>"+i.getTematica()+"</td>");
						out.println("<td>"+i.getHoraInicio()+"</td>");
						out.println("<td>"+i.getHoraFin()+"</td>");
						out.println("</tr>");
					} */
					
					//tutoriasDevueltas.clear();
				%>
				<!-- <tr>
					<td>Cód.</td>
					<td>Fecha</td>
					<td>Estudiante</td>
					<td>Temática</td>
					<th>Hora Inicio</th>
					<th>Hora Fin</th>
				</tr>  -->
			</tbody>
		</table>
	</div>
	<div id="login">

		<input id="regresarTabla" type="button" value="Regresar"
			onclick="window.location.href='menuTutorias.jsp'" />

	</div>
</body>
</html>
