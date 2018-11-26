<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="Solar System Geek Gift Shop" />
</c:import>

<section style="background-color:white">
<h3 style="text-align:center">Solar System Geek Gift Shop</h3>
<table style="text-align: left">
			<tr>
				<td><c:url var="productImageUrl" value="/img/${product.imageName}" />
					<img src="${productImageUrl}"/></td>
				<td style="vertical-align:top"><br><b style="color:black"><big>${product.name}</big></b><br>
		                   	    <b style="color:skyblue">${product.price}</b><br>
		                    	<p style="color:black">${product.description}</p><br>
     		<c:url var="formAction" value="/spaceStoreSummary" />
<form style="background-color:white" method="GET" action="${formAction}">
	<div>
		<label for="quantityToBuy">Quantity to Buy</label> 
		<input type="number" name="quantity"/>
<%-- 		<c:param name="quantity" value="${product.id}" />
 --%>		<input type="submit" value="Add to Cart"/>
	</div>
</form>
				</td>
			</tr>
		</table>	
	
</section>