<%-- jsp 파일: Java Service Pages의 약자
        >> 동적인 웹 페이지를 만들기 위해 사용되는 파일 확장자

--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>첫 번째 서블릿 페이지</title>
</head>
<body>
<h1><%= "첫 번째 서블릿 페이지에 오신 것을 환영합니다!" %>
</h1>
<br/>
<%-- a링크 클릭 시: hello-servlet의 결로로 이동을 요청! --%>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>