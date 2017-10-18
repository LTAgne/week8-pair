<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@include file="common/header.jsp" %>

<section class="centeredPanel">
<h2>Solar System Geek Forum</h2>

 <p>
 	<c:url var="spaceForumInput" value="/spaceForumInput"/>
 	<a href="${spaceForumInput}">Post a Message</a>
 </p>
               
<ul>
<c:forEach items="${allPosts}" var="post">

	<li><c:out value="${post.subject}"/></li>	

</c:forEach>
</ul>


</section>

<%@include file="common/footer.jsp" %>