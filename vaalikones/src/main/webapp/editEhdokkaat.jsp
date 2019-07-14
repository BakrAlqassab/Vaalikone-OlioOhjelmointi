<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="vaalikone.css">
</head>
<body>

<form action="/editehdokkaat?id=${requestScope.Ehdokkaat.ehdokasId}" method ="Get">
<table>
  
  
  		<tr> 
		<td>ID</td> 
		<td><input name="id1" type="text" value="${requestScope.Ehdokkaat.ehdokasId}" readonly></td>
		 
		
		
		
	</tr>
	<tr> 
		<td>Sukunimi</td>
		<td><input name="sukunimi" type="text" value="${requestScope.Ehdokkaat.sukunimi}"></td>
	</tr>

	<tr>
		<td>Etunimi</td>
		<td><input name="etunimi" type="text" value="${requestScope.Ehdokkaat.etunimi}"></td>
	</tr>
	<tr>
		<td>Puolue</td>
		<td><input id ="puolue" name="puolue" type="text" value="${requestScope.Ehdokkaat.puolue}"></td>
	</tr>
	<tr>
		<td>Kotipaikkakunta</td>
		<td><input name="kotipa" type="text" value="${requestScope.Ehdokkaat.kotipaikkakunta}"></td>
	</tr>
	<tr>
		<td>Ika</td>
		<td><input name="ika" type="text" value="${requestScope.Ehdokkaat.ika}"></td>
	</tr>
	<tr>
		<td>MiksiEduskuntaan</td>
		<td><input id ="mieduskunta" name="mieduskunta" type="text" value="${requestScope.Ehdokkaat.miksiEduskuntaan}"></td>
	</tr>
	<tr>
		<td>MitaAsioitaHaluatEdistaa</td>
		<td><input id="mitaas" name="mitaas" type="text" value="${requestScope.Ehdokkaat.mitaAsioitaHaluatEdistaa}"></td>
	</tr>
	
	<tr>
		<td>Ammatti</td>
		<td><input name="ammatti" type="text" value="${requestScope.Ehdokkaat.ammatti}"></td>
	</tr>
</table>
<input type ="submit" value ="Ehdokkaat Edit"/>
</form>

</body>
</html>