<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="Solar System Geek Gift Shop" />
</c:import>

<section style="background-color:white">
<h3 style="text-align:center">Solar System Geek Gift Shop</h3>			
	<c:forEach var="product"  items="${allProducts}">
 					
					<table>
						<tr>
							<td><c:url var="productImageUrl" value="/img/${product.imageName}" />
					<c:url var="productDetailUrl" value="/spaceStoreProductDetail">
						<c:param name="id" value="${product.id}" />
					</c:url><a href="${productDetailUrl}"><img src="${productImageUrl}"/></a>
								</td>
								<td align="left" style=color:black;>
								<b>${product.name}</b><br><br>
								<b style=color:skyblue;>${product.price}</b></td>	
                   	    </tr>
					</table>
			</c:forEach>
</section>

