<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp">
<c:param name="pageTitle" value="Recipe Table" />
</c:import>
    <section id="main-content">
    <h1>Recipes</h1>
			 <table class ="table">
       			<tr class ="layer headpad">
					<th class = "rowhead">Name</th>
					<th class = "rowhead">Type</th>
					<th class = "rowhead">Cook Time</th>
					<th class = "rowhead">Ingredients</th>
					<th class = "rowhead">Rating</th>
				</tr>
       			<c:forEach var="recipe"  items="${recipes}">
       			
						<tr class ="layer">
						<c:url var="recipeImageUrl" value="/img/recipe${recipe.recipeId}.jpg" />
			<c:url var="recipeDetailUrl" value="/recipeDetails">
				<c:param name="recipeId" value="${recipe.recipeId}" />
			</c:url>
			<td><a href="${recipeDetailUrl}"><img src="${recipeImageUrl}" /></a></td>
<%-- 							<td><img alt="Food Pic" src="img/recipe${recipe.recipeId}.jpg"></td>
 --%>							<td class = "odd" class="wordwrap">${recipe.name}</td>
							<td class = "even">${recipe.recipeType}</td>
							<td class = "odd">${recipe.cookTimeInMinutes} min</td>
							<td class = "even">${recipe.ingredients.size()} ingredients</td>
							<c:set var="count" value = "${recipe.averageRating-(recipe.averageRating%1)}"/>
							<td class = "odd"><img alt="Stars" src="img/${count}-star.png"></td>
						</tr>
				</c:forEach>
      		</table>
    </section>
</body>
</html>