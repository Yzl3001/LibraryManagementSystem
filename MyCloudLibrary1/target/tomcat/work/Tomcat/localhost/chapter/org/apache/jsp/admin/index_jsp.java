/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-06-06 03:49:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- 页面meta -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>云借阅-图书管理系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/AdminLTE.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/_all-skins.min.css\">\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/app.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function SetIFrameHeight() {\r\n");
      out.write("            var iframeid = document.getElementById(\"iframe\"); //iframe id\r\n");
      out.write("            if (document.getElementById) {\r\n");
      out.write("                iframeid.height = document.documentElement.clientHeight;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition skin-green sidebar-mini\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("    <!-- 页面头部 -->\r\n");
      out.write("    <header class=\"main-header\">\r\n");
      out.write("        <!-- Logo -->\r\n");
      out.write("        <a href=\"index.jsp\" class=\"logo\">\r\n");
      out.write("            <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("            <span class=\"logo-mini\"><b>云借阅</b></span>\r\n");
      out.write("            <!-- logo for regular state and mobile devices -->\r\n");
      out.write("            <span class=\"logo-lg\"><b>云借阅-图书管理系统</b></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <!-- Header Navbar: style can be found in header.less -->\r\n");
      out.write("        <nav class=\"navbar navbar-static-top\">\r\n");
      out.write("            <nav class=\"navbar navbar-static-top\">\r\n");
      out.write("                <div class=\"navbar-custom-menu\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li class=\"dropdown user user-menu\">\r\n");
      out.write("                            <a >\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/user.jpg\" class=\"user-image\" alt=\"User Image\">\r\n");
      out.write("                                <span class=\"hidden-xs\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USER_SESSION.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown user user-menu\">\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/logout\">\r\n");
      out.write("                                <span class=\"hidden-xs\">注销</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- 页面头部 /-->\r\n");
      out.write("\r\n");
      out.write("    <!-- 导航侧栏 -->\r\n");
      out.write("    <aside class=\"main-sidebar\">\r\n");
      out.write("        <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("        <section class=\"sidebar\">\r\n");
      out.write("            <!-- /.search form -->\r\n");
      out.write("            <!-- sidebar menu: : style can be found in sidebar.less -->\r\n");
      out.write("            <ul class=\"sidebar-menu\">\r\n");
      out.write("                <li id=\"admin-index\">\r\n");
      out.write("                    <a href=\"index.jsp\">\r\n");
      out.write("                        <i class=\"fa fa-dashboard\"></i> <span>首页</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/book/search\" target=\"iframe\">\r\n");
      out.write("                        <i class=\"fa fa-circle-o\"></i>图书借阅\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/book/searchBorrowed\" target=\"iframe\">\r\n");
      out.write("                        <i class=\"fa fa-circle-o\"></i>当前借阅\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/record/searchRecords\" target=\"iframe\">\r\n");
      out.write("                        <i class=\"fa fa-circle-o\"></i>借阅记录\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- /.sidebar -->\r\n");
      out.write("    </aside>\r\n");
      out.write("    <!-- 导航侧栏 /-->\r\n");
      out.write("    <!-- 内容区域 -->\r\n");
      out.write("    <div class=\"content-wrapper\">\r\n");
      out.write("        <iframe width=\"100%\" id=\"iframe\" name=\"iframe\" onload=\"SetIFrameHeight()\"\r\n");
      out.write("                frameborder=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/book/selectNewbooks\"></iframe>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
