package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_005fback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>  行者官网后台登录</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"image/style1.css\">\r\n");
      out.write("\t\t<meta http-equiv=\"windows-Target\">\r\n");
      out.write("<SCRIPT Language=\"JavaScript\">\r\n");
      out.write(" <!--\r\n");
      out.write(" function isValid()\r\n");
      out.write(" {\t\r\n");
      out.write(" \tif(formlogin_back.id.value == \"\")\r\n");
      out.write(" \t{\t\r\n");
      out.write(" \t\twindow.alert(\"请输入账号！\"); \r\n");
      out.write("\t\tdocument.formlogin.elements(0).focus();\r\n");
      out.write(" \t\treturn  false;\r\n");
      out.write(" \t}\r\n");
      out.write(" \tif(formlogin_back.password.value == \"\")\r\n");
      out.write(" \t{\r\n");
      out.write(" \t\twindow.alert(\"请输入密码！\");\r\n");
      out.write(" \t\tdocument.formlogin.elements(1).focus();\r\n");
      out.write(" \t\treturn  false; \r\n");
      out.write(" \t}\r\n");
      out.write(" \tformlogin_back.image();\r\n");
      out.write("}\r\n");
      out.write("  -->\r\n");
      out.write("  </SCRIPT>\r\n");
      out.write("\t</head>\r\n");
      out.write("    \r\n");
      out.write("\t<body background=\"\">\r\n");
      out.write("\t\t<form name=\"formlogin_back\" action=\"Login_conf\" method=\"post\" onSubmit=\"return isValid(this);\">\r\n");
      out.write("\t\t\t<table width=\"600\" height=\"600\" border=\"0\" align=\"center\" >\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"800\" height=\"80\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"800\" height=\"138\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"165\" height=\"187\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>行者官网后台管理</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"450\" height=\"187\" border=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr height=\"84\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"130\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t用户名：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"180\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"name\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr height=\"43\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"130\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t密&nbsp;&nbsp;码：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"180\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th width=\"171\" rowspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"image\" src=\"image/login.gif\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"800\" height=\"106\" colspan=\"3\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"800\" height=\"79\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
