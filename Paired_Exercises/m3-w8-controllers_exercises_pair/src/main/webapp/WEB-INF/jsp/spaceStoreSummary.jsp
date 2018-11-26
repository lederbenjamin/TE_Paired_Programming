<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="Solar System Geek Gift Shop" />
</c:import>

<section>
<h1>Space Story Summary</h1>
				
				<ol>
				<c:forEach items="${shoppingCart.getPurchases()}" var="purchase">
					${purchase.product.name}
				</c:forEach>
				</ol>

</section>
</html>