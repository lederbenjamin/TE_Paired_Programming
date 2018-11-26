<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="Alien Age Calculator" />
</c:import>

<div style="background-color:white">


<c:url var="imgSrc" value="/img/${planet.toLowerCase()}.jpg" />
<img src="${imgSrc}" alt="Planet Picture">


If you are on ${planet}, you will be <fmt:formatNumber value="${estimate}" maxFractionDigits="0"/> years old.


</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />