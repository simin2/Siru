<%@ page import="com.simin.siru.model.domain.Member"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
	Member member_write = (Member)session.getAttribute("member");
%>
<%if (member_write != null) { %>
<a href="/user/board/regist/form" id="write_button">글쓰기</a>
<%} else { %>
<a href="/#start" id="write_button">글쓰기</a>
<%} %>