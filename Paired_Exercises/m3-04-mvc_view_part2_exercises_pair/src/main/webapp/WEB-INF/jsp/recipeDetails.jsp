<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Recipe Tiles" />
</c:import>
<html>
<section>
	<div id ="box_0">
		<table style="text-align: left">
			<tr>
				<td><img alt="Food Pic" src="img/recipe${recipe.recipeId}.jpg">
				</td>
				<td style="vertical-align:top"><b><big>${recipe.name}</big></b><br> 
				${recipe.recipeType}<br> <br>
				<b>Cook Time</b> ${recipe.cookTimeInMinutes} minutes<br><br>
					${recipe.description}
				</td>
			</tr>
		</table>
	</div>
	<h4 class="detail">Ingredients</h4>
	<c:forEach var="ingredient" items="${recipe.ingredients}">
		<ul>
			<li class="detail">${ingredient.quantity}${ingredient.name}</li>
		</ul>
		
	</c:forEach>
	<p style="border-bottom: 1px solid gray;"></p>
	<h4 class="detail">Preparation</h4>
	<ol>
		<c:forEach var="step" items="${recipe.preparationSteps}">
			<li class="detail">${step}</li>
		</c:forEach>
	</ol>
</section>
</body>
</html>