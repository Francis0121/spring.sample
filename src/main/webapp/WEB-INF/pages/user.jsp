<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:set var="cp" value="<%=request.getContextPath() %>"/>
<c:set var="rp" value='<%=request.getAttribute("javax.servlet.forward.request_uri")%>'/>

<!DOCTYPE html>
<html lang="kr">
<head>
    <title>Nornenjs</title>

    <link rel="image_src" href="${cp }/resources/image/favicon.ico" />
    <link rel="shortcut icon" type="image/x-icon" href="${cp }/resources/image/favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="${cp}/resources/css/default.css">
    
    <script src="${cp}/resources/javascript/jquery-1.11.2.min.js"></script>

    <script>
        var contextPath = '<c:out value="${cp}"/>';
        var realPath = '<c:out value="${rp}"/>';
    </script>
</head>
<body>

	<form:form commandName="user" method="put" action="${cp}/user" htmlEscape="true">
		<form:input path="name"/>
		<button type="submit">Submit</button>
	</form:form>

</body>
</html>