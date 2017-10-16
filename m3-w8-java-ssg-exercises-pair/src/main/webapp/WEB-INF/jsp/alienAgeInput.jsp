<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jsp" %>

<section class="centeredPanel">
	
	<h2>Alien Age Calculator</h2>
	<c:url var="alienAgeUrl" value="/alienAgeResult"/>
	<form method="GET" action="${alienAgeUrl}">
		<div>
			<label for="planet">Choose a planet</label>
			<select name="planet" id="planet">
				<option value="Mercury">Mercury</option>
				<option value="Venus">Venus</option>
				<option value="Mars">Mars</option>
				<option value="Jupiter">Jupiter</option>
				<option value="Saturn">Saturn</option>
				<option value="Uranus">Uranus</option>
				<option value="Neptune">Neptune</option>
			</select>
		</div>
		<div>
			<label for="age">Enter your Earth age</label>
			<input type="number" name="age" id="age" placeholder="Between 1 and 100"/>
		</div>
		<div>
			<label></label>
			<input type="submit" value="Calculate Age"/>	
		</div>
	</form>

</section>

<%@include file="common/footer.jsp" %>

