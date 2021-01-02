<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- 컨텍스트 변수에 담기 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!-- resources 변수에 담기 -->
<c:set var="resources_path" value="${ctx}/resources"/>

<script type="text/javascript">
	// 컨텍스트 변수에 담기
	var ctx = "${pageContext.request.contextPath}";
	// resources 변수에 담기
	var resUrl = "${resources_path}";
</script>

<!-- ajax 처리 정의 -->
<script type="text/javascript" src="${resources_path}/forme/js/ajax.js"></script>
<!-- 공통기능js -->
<script type="text/javascript" src="${resources_path}/forme/js/common.js"></script>