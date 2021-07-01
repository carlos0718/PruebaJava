<%@page import="entidad.Persona"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="entidad.Cuenta"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
<title>ALTA CUENTA</title>
</head>
<body>
	<div class="container" style="background-color:">
		<div class="container" style="background-color: orange;"align=center>
		<br>
		<h1>ALTA CUENTAS</h1><br>
		</div>
		<hr>
		<div class="container text-center">
			<%
				ArrayList<Persona> listPersona = null;
				if(request.getAttribute("listClientes")!= null){
					listPersona = (ArrayList<Persona>)request.getAttribute("listClientes");
				}
			%>
		</div>
		<form class="row g-3" method="post" action="servletAltaCuenta">

		  <div class="col-md-6">
		    <label class="form-label">DNI</label>
		    <input type="text" class="form-control" id="txtDni" value="4215684">
		  </div>
		  <div class="col-md-6">
		    <label  class="form-label">CUIL</label>
		    <input type="text" class="form-control" id="" value = "2042156844">
		  </div>
		  <div class="col-md-6">
		    <label class="form-label">NOMBRE</label>
		    <input type="text" class="form-control" id="txtDni" value="Nombre" >
		  </div>
		  
		  <div class="col-md-6">
		    <label  class="form-label">APELLIDO</label>
		    <input type="text" class="form-control" id="" value="Apellido">
		  </div>
		  
		  <div class="col-md-6">
		    <label for="inputCity" class="form-label">GENERO</label>
		    <input type="text" class="form-control" id="inputCity" value="Genero">
		  </div>
		  
		  <div class="col-md-6">
		    <label for="inputAddress" class="form-label">NACIONALIDAD</label>
		    <input type="text" class="form-control" id="inputAddress" value="Nacionalidad">
		  </div>
		  
		  <div class="col-md-6">
		    <label for="inputCity" class="form-label">LOCALIDAD</label>
		    <input type="text" class="form-control" id="inputCity" value="Localidad">
		  </div>
		  
		  <div class="col-md-6">
		    <label for="inputCity" class="form-label">DOMICILIO</label>
		    <input type="text" class="form-control" id="inputCity" placeholder="1234 Main St">
		  </div>
          <label for="inputCity" class="form-label">TIPO DE CUENTA :</label>
		  <div class="form-check">
			  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1" checked>
			  <label class="form-check-label" for="flexRadioDefault1">
			    Caja de Ahorros
			  </label>
			</div>
			<div class="form-check">
			  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" >
			  <label class="form-check-label" for="flexRadioDefault2">
			    Cuenta Corriente
			  </label>
		  </div>
		  <div class="col-md-6">
		    <label for="inputCity" class="form-label">CBU</label>
		    <input type="text" class="form-control" id="inputCity">
		  </div>
		  <div class="col-md-6">
		    <label for="inputCity" class="form-label" >SALDO</label>
		    <input type="text" class="form-control" id="inputCity" value="$10 000">
		  </div>
		  <div class="col-12">
		    <div class="form-check">
		      <input class="form-check-input" type="checkbox" id="gridCheck">
		      <label class="form-check-label" for="gridCheck">
		        Check me out
		      </label>
		    </div>
		  </div>
		  <div class="col-12">
		    <button type="submit" class="btn btn-primary">Create</button>				
		 </div>
		</form>
			<%-- <table class="table table-striped" id="table_listar" >
			    <thead>
			        <tr>
			            <th>DNI</th>
			            <th>CUIL</th>
			            <th>Nombre</th>
			            <th>Apellido</th>
			            <th>Fec. Nac</th>
			            <th>Nacionalidad</th>
			            <th>Localidad</th>
			            <th>Domicilio</th>
			            <th>Tipo de Cuenta</th>
			            <th></th>
			        </tr>
			    </thead>
			    <tr>
			     <% if(listPersona != null)
			     	for(Persona p : listPersona){%>
			     		<td><%= p.getDni() %></td>
				      	<td><%= p.getCuil() %></td>
				      	<td><%= p.getNombre() %></td>
				      	<td><%= p.getApellido() %> </td>
				      	<td><%= p.getFechaNac() %></td>
				      	<td><%= p.getIdNac() %></td>
				      	<td><%= p.getIdLocalidad() %></td>
				      	<td><%= p.getDireccion() %></td>
				      	<td><%= p.getTipoCuenta() %></td>
				      	<td>
					      	<div class="input-group">
							  	<form method="post" action="servletAltaCuenta">
							  		<button class="btn btn-outline-secondary" type="submit" name="accept">accept</button>
							  		<button class="btn btn-outline-secondary" type="button" name="deny">deny</button>
							  	</form>
							</div>
				  		</td>
			    	  
			      	<%}%>
			      
			      
			    </tr>
			</table> --%>
	</div>
</body>
</html>