<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Post</title>
</head>
<body>

<jsp:useBean id="post" scope="request" type="ru.job4j.forum.model.Post"/>
<div class="container pt-1">
    <div class="row">
        <div class="card" style="width: 100%">
            <div class="card-header">
                <c:choose>
                    <c:when test="${post.id == 0}">
                        Create post
                    </c:when>
                    <c:otherwise>
                        Edit post
                    </c:otherwise>
                </c:choose>
            </div>
            <div class="card-body">
                <form action="<c:url value='/post'/>" method="POST" enctype="multipart/form-data">
                    <input type="hidden" name="id" value="${post.id}">

                    <div class="form-group row">
                        <label class="col-form-label col-sm-3" for="name">Name</label>
                        <input type="text" class="form-control col-sm-3" name="name" id="name"
                               value="${post.name}" placeholder="Input post name">
                    </div>

                    <div class="form-group row">
                        <label class="col-form-label col-sm-3" for="text">Text</label>
                        <input type="text" class="form-control col-sm-3" name="description" id="text"
                               value="${post.text}" placeholder="Input post text">
                    </div>

                    <div class="form-group row">
                        <label class="col-form-label col-sm-3"></label>
                        <button type="submit" class="btn btn-dark">Save</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>