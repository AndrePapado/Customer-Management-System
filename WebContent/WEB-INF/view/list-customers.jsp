<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
<title>List Customers</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>
<div id="vbox"> 
<div id="header">
<h2> Customer Management System </h2>
</div>
</div>

<div id="container">
<div id="content">

<input type="button" value="Add"
onclick="window.location.href='showform';return false;" class="add-button" />

<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Address</th>
<th>Action</th>
</tr>
<c:forEach var="bCust" items="${customers}">

<!-- update link based on id -->
<c:url var="updatelink" value="/customer/showUpdateform">
<c:param name="customerID" value="${bCust.id}" />
</c:url>

<c:url var="deletelink" value="/customer/delete">
<c:param name="customerID" value="${bCust.id}" />
</c:url>

<tr>
<td>${bCust.fname}</td>
<td>${bCust.lname}</td> 
<td>${bCust.email}</td>
<td>${bCust.address}</td>
<td> <a href="${updatelink}">Update</a> <!-- display update -->
|
<a href="${deletelink}"
onclick="if (!(confirm('Do you want to delete this customer?'))) return false">Delete</a>
</td> 
</tr>

</c:forEach>
</table>
</div>
</div>
</body>

</html>