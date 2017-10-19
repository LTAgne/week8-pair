<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jsp" %>
	
<section class= "centeredPanel">

	<h2>Solar System Geek Gift Shopping Cart</h2>
	
	<table>
		<tr>
			<th>&nbsp;</th>
			<th>Name</th>
			<th>Price</th>
			<th>Qty</th>
			<th>Total</th>
		</tr>
		<c:forEach items="${productList}" var="entry">
		<c:set var="product" value="${entry.key}"/>
		<c:set var="quantity" value="${entry.value}"/>
			<tr>
				<td><c:out value="${product.imageName}"/></td>
				<td><c:out value="${product.name}"/></td>
				<td><c:out value="${product.price}"/></td>
				<td><c:out value="${quantity}"/></td>
				<td><c:out value="${product.price * quantity}"/></td>
			</tr>
		</c:forEach>		
	
	</table>
	
	
</section>
	
<%@include file="common/footer.jsp" %>