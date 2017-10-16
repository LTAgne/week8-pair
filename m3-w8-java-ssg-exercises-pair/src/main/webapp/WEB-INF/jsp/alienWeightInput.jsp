<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">


        <h2>Alien Weight Calculator</h2>
	
	<c:url var="formAction" value="/alienWeightResult" />
<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="choosePlanet">Choose a planet:</label> 
		<select name="planet" id="planetDropDown">
			<option value="Mercury">Mercury</option>
			<option value="Venus">Venus</option>
			<option value="Mars">Mars</option>
			<option value="Jupiter">Jupiter</option>
			<option value="Saturn">Saturn</option>
			<option value="Uranus">Uranus</option>
			<option value="Neptune">Neptune</option>
		</select>
	</div>
	<div class="formInputGroup">
		<label for="earthWeight">Enter your Earth weight:</label> 
		<input type="text" name="weight" id="weight" />
	</div>
	<div class=formInputGroup>
	<label></label>
	<input class="button" type="submit" value="Calculate Weight" />
	</div>
</form>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />