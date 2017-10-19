<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jsp" %>
	
<section class= "centeredPanel">

	<h2>Solar System Geek Gift Shop</h2>
	<div class="productDetailView">
	<c:url var="productDetail" value="/img/${product.imageName}"/><img src="${imageName}"> <img src="${productDetail}"/>
		<c:out value="${product.name}"> </c:out>
	 	<c:out value="${product.price}"></c:out>
		<c:out value="${product.description}"></c:out>
	</div>
	<c:url var="addToCartUrl" value="/shoppingCart/addToCart"/>
	<form method="POST" action="${addToCartUrl}">
		<input type="hidden" name="productId" value="${product.id}"/>
		<label for="quantityInput">Quantity to buy:</label> 
		<input type="number" name="quantity" id="quantityInput" min="1" />
		<input class="button" type="submit" value="Add to Cart" />
	</form>

</section>
	
<%@include file="common/footer.jsp" %>