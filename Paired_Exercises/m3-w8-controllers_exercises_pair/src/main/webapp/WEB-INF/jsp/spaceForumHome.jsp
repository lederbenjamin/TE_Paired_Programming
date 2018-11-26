<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>




<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="Space Forum Home" />
</c:import>



<div style="background-color:white">
<h3 style="text-align:center">Solar System Geek Forum</h3>
<center><a href="spaceForumInput">Post a Message</a></center><br>

<c:forEach var="forumPost" items="${forumPosts}">
<table>

<tr>
<td style="color:black">
${forumPost.subject}<br>
by ${forumPost.username}
on ${forumPost.datePosted}<br><br>
${forumPost.message}<br>
</td>
</tr>
</table>
</c:forEach>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />