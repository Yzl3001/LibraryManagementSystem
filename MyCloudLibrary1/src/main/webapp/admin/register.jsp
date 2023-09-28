<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>云借阅-图书管理系统</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/webbase.css"/>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/pages-login-manage.css"/>
<%--  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>--%>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/register.js"></script>
</head>
<body>
<div class="loginmanage">
  <div class="py-container">
    <h4 class="manage-title">云借阅-图书管理系统</h4>
    <div class="loginform">
      <ul class="sui-nav nav-tabs tab-wraped">
        <li class="active">
          <h3>账户注册</h3>
        </li>
      </ul>
      <div class="tab-content tab-wraped">
        <%--登录提示信息--%>
        <span style="color: red">${msg}</span>
        <div id="profile" class="tab-pane  active">

          <form action="${pageContext.request.contextPath}/addUser">
            <p>用户名：<input type="text" name="username" value="${user.name}"></p>
            <p>密码：<input type="password" name="password" value="${user.password}"></p>
            <p>邮箱：<input type="email" name="email" value="${user.email}"></p>
            <p><input type="submit" value="提交" onclick="saveUser()"></p>
          </form>


        </div>
      </div>
    </div>
  </div>
</div>
</body>
<script type="text/javascript">
  /**
   * 注册超时 展示区跳出iframe
   */
  <%--var _topWin = window;--%>
  <%--while (_topWin != _topWin.parent.window) {--%>
  <%--  _topWin = _topWin.parent.window;--%>
  <%--}--%>
  <%--if (window != _topWin)--%>
  <%--  _topWin.document.location.href = '${pageContext.request.contextPath}/registr.jsp';--%>
</script>
</html>
