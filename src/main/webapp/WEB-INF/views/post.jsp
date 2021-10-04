<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Create Post</title>
</head>
<body>

<jsp:useBean id="post" scope="request" type="ru.job4j.forum.model.Post"/>
<div class="container pt-1">
    <div class="row">
        <div class="card" style="width: 100%">
            <div class="card-header">
                Post
            </div>
            <div class="card-body">
                <div class="form-group col">
                    <h5 class="card-title">${post.name}</h5>
                    <p>created: ${post.created}</p>
                    <p>${post.text}</p>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>