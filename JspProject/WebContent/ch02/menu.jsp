<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String id = (String)session.getAttribute("id");
 %>
 <body>
 <%
  if (id == null) {
 %>
  <a href="login.jsp" target="rightFrame">로그인</a>
 <%
  } else {
%>
  <%=id%>님 환영합니다.
<%
  }
%>