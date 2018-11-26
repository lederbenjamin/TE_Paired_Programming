<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="Space Forum Input" />
</c:import>


<c:url var="formAction" value="/spaceForumInput" />
<form style="background-color:white" method="POST" action="${formAction}">
<h3 style="text-align:center">New Geek Post</h3>
	<div>
		<label for="username">Username</label> 
		<input type="text" name="username" id="username" />
	</div>
		<div>
		<label for="subject">Subject</label> 
		<input type="text" name="subject" id="subject" />
	</div>
		<div>
		<label for="message">Message</label> 
		<input type="text" name="message" id="message" />
	</div>
	<div>
			<label for="rate"></label> <!-- This should be formatted in a less janky way -->
			<input class="formSubmitButton" type="submit" value="Submit" />
	</div>
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />