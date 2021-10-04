<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <title>Forum</title>
</head>
<body>
<div class="container mt-3">
    <ul class="nav nav-justified">
        <li class="nav-item">
            <a class="nav-link" href="<c:url value="/login"/>">
                Login
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<c:url value="/post"/>">
                New post
            </a>
        </li>
    </ul>
    <div class="row">
        <h4>Forum</h4>
    </div>
    <div class="row">
        <table class="table">
            <thead>
            <tr>
                <th>Name</th>
                <th>Text</th>
                <th>Created</th>
            </tr>
            </thead>
            <tbody>
            <jsp:useBean id="posts" scope="request" type="java.util.List<ru.job4j.forum.model.Post>"/>
            <c:forEach items="${posts}" var="post">
                <tr>
                    <td><a href="<c:url value='/post?id=${post.id}'/>"><c:out value="${post.name}"/></a></td>
                    <td><c:out value="${post.text}"/></td>
                    <td><c:out value="${post.created}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>