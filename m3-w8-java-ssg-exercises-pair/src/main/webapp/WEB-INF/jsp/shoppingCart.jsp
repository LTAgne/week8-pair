<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jsp" %>
	
<section class= "centeredPanel">

	<h2>Solar System Geek Gift Shop</h2>
	
	<c:url var="spaceStoreUrl" value="/shoppingCart/index"/>
	<div class= storeInventory>
	 	
	 	<table> 
			<c:forEach var="product" items="${products}"> <tr> 
	 			<td>
	 			<c:url var="productDetail" value="/shoppingCart/detail/${product.id}"/>
	 			<a href="${productDetail}"> <c:url var="imageName" value="/img/${product.imageName}"/><img src="${imageName}"></a> 
	 			</td> 
	 			
	 			<td><c:out value="${product.name}"/></td> 
	 			<td><c:out value="${product.price}"/></td> 
			 </c:forEach>
		 </table> 
		
		 </div>

</section>
	
	<%@include file="common/footer.jsp" %>
	