<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jsp" %>

<section class="centeredPanel">
	
	<h2>New Geek Post</h2>
	<c:url var="spaceForumInput" value="/spaceForumInput"/>
	<form method="POST" action="${spaceForumInput}">
	
	<div>
			<label for="username">Username</label>
			<input type="text" name="username" id="form" />
	</div>
	<div>
			<label for="subject">Subject</label>
			<input type="text" name="subject" id="form" />
	</div>
	<div>
			<label for="message">Message</label>
			<input type="text" name="message" id="form" />
	</div>
		<label></label>
			<input type="submit" value="Submit"/>	
	</form>
</section>




<%@include file="common/footer.jsp" %>