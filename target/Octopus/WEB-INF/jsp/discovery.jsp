<%@ page language="java" contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%--<%String path = request.getContextPath();%>--%>
<html>
<head>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/css/discovery.css" media="all"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/css/discovery_header.css" media="all"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/css/hanging_search_bar.css" media="all"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/css/nav.css" media="all"/>
    <title>探索</title>
</head>
<div class="wrapper">
    <!-- 头部导航栏 -->
    <%@include file="discovery_header.jsp" %>

    <!-- 搜索框 下滑会消失 -->
    <%@include file="hanging_search_bar.jsp" %>

    <div class="inside-nav">
        <div class="inside-nav-content feed">
            推送
        </div>
        <div class="inside-nav-content latest">
            最新
        </div>
        <div class="inside-nav-content hottest">
            最热
        </div>
    </div>

    <!-- 两列瀑布流 -->
    <div class="posts">
        <div class="post-item">
            <c:forEach var="postDisplayBean" items="${postDisplayBeans}">
                <a href="/octopus/discovery/posts/post_id=<c:out value="${postDisplayBean.post_id}"/>">
                    <div class="post-inner-img">
                        <img src="<c:url value = "/resources/img/${postDisplayBean.img_url}"/>" alt="img"/>
                    </div>
                    <div class="post-inner-tag">
                        tag
                    </div>
                    <div class="post-item-bottom">
                        <div class="post-publisher">
                            <c:out value="${postDisplayBean.user_id}"/>
                        </div>
                        <div class="likes">
                            <c:out value="${postDisplayBean.likes}"/>
                        </div>
                    </div>
                </a>
            </c:forEach>
        </div>
    </div>

    <!-- 底部导航栏 -->
    <%@include file="nav.jsp" %>
</div>
<%--<script type="text/javascript" src="${ctx}/resources/js/jquery-3.6.0.js"></script>--%>
<%--<script type="text/javascript" src="${ctx}/resources/js/hanging_search_bar.js"></script>--%>

</html>