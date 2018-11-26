<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp">
<c:param name="pageTitle" value="Recipe Tiles" />
</c:import>
	<section id="main-content">
		<h1>Recipes</h1>
		<table>
			<c:forEach var="recipe" items="${recipes}">

				<tr class="layer">
				<c:url var="recipeImageUrl" value="/img/recipe${recipe.recipeId}.jpg" />
			<c:url var="recipeDetailUrl" value="/recipeDetails">
				<c:param name="recipeId" value="${recipe.recipeId}" />
			</c:url>
			<td><a href="${recipeDetailUrl}"><img src="${recipeImageUrl}" /></a></td>
<%-- 					<td><img class="imgTile"alt="Food Pic" src="img/recipe${recipe.recipeId}.jpg"></td>
 --%>					<td class="rowTile" class="wordwrap">${recipe.name}</td>
					<c:set var="count" value="${recipe.averageRating-(recipe.averageRating%1)}" />
					<td class="rowTile"><img class="imgTileStar"alt="Stars" src="img/${count}-star.png">${recipe.ingredients.size()}ingredients</td>
				</tr>
			</c:forEach>
		</table>
	</section>
</body>
</html>