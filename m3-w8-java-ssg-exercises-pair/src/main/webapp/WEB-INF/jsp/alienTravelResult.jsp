<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@include file="common/header.jsp" %>

<section class="centeredPanel">
	<div class="container">
	<div class="planetDownsize">
	<c:set var="lowercaseName" value="${fn:toLowerCase(calculator.planet)}"/>
	<c:url var="planetImageUrl" value="/img/${lowercaseName}.jpg"/>
	<img src="${planetImageUrl}"/>
	</div>
	
	<div class="planetInfo">
	<h2>Traveling by <c:out value="${calculator.modeOfTransportation}"/> you will reach <c:out value="${calculator.planet}"/>
	 in <c:out value="${calculator.planetMode}"/>. You will be <c:out value="${calculator.planet}"/> years old. </h2>
	</div>
	</div>
	
</section>

<%@include file="common/footer.jsp" %>