<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test = "${cookie.containsKey('login')}">
<span>
    <%= cookie.get("login") %>
</span>
</c:if>