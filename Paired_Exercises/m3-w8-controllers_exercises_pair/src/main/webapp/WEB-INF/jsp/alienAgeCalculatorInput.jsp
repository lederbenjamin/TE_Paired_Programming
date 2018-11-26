<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="Alien Age Calculator" />
</c:import>

<c:url var="formAction" value="/alienAgeCalculatorOutput" />
<form style="background-color:white" method="GET" action="${formAction}">
<h3 style="text-align:center">Alien Age Calculator</h3>
	<div>
		<label for="planetChoice">Choose a Planet</label> 
		<select name="planetChoice"	id="planetChoice">
			<option value="1">Mercury</option>
			<option value="2">Venus</option>
			<option value="3">Mars</option>
			<option value="4">Jupiter</option>
			<option value="5">Saturn</option>
			<option value="6">Uranus</option>
			<option value="7">Neptune</option>
		</select>
	</div>
	<div>
		<label for="earthAge">Enter Your Earth Age</label> 
		<input type="text" name="earthAge" id="earthAge" />
	</div>
	<div>
			<label for="rate"></label> <!-- This should be formatted in a less janky way -->
			<input class="formSubmitButton" type="submit" value="Calculate Age" />
	</div>
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />