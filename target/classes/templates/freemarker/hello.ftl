<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
Hello ${name}

<h1>${resource.name}</h1>
<h1>${resource.website}</h1>
<h1>${resource.language}</h1>

<#--user交给后端响应，localhost/user响应-->
<a href="user">green mouse</a>

<br>
<#--支持动态的href-->
<a href="${resource.name}">${resource.name}</a>

<#--if用法-->
<h1>
    Welcome ${resource.name}
    <#if resource.name == "user">, our beloved leader</#if>!
</h1>

<#include "center/center.ftl">

</body>
</html>