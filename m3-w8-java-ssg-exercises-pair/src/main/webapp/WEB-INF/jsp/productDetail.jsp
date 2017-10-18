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

</section>
	
<%@include file="common/footer.jsp" %>