package org.apache.jsp.back;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigation_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/includ/res-incl.jsp");
    _jspx_dependants.add("/includ/nav-incl.jsp");
    _jspx_dependants.add("/includ/left-incl.jsp");
    _jspx_dependants.add("/includ/foot-incl.jsp");
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\"/>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<title>行者官网管理后台</title>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/static/common/css/bootstrap.min.css\"></link>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/static/common/css/bootstrap-responsive.min.css\"></link>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/static/common/css/ui-lightness/jquery-timepicker.css\"></link>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/static/common/css/ui-lightness/jquery-ui-datepicker.min.css\"></link>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/static/back/default.css\"></link>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/common/js/jquery-1.9.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/common/js/jquery.form.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/common/js/jquery-ui-datepicker.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/common/js/jquery-timepicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/common/js/bootstrap.min.js\"></script>");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar active_menu = \"walker-navigation\";\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 导航条开始 -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("    <div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<a class=\"brand\" href=\"###\">行者官网管理后台</a>\r\n");
      out.write("\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"###\">首页</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<a type=\"button\" class=\"btn btn-primary pull-right\">退出</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 正文内容开始 -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<!-- 左侧导航 -->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<div class=\"span3\">\r\n");
      out.write("\t\t\t<ul class=\"nav nav-tabs nav-stacked\">\r\n");
      out.write("\t\t\t\t<li id=\"walker-navigation\"><a href=\"/back/navigation/list.do?page=1\">导航管理</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"walker-product\"><a href=\"/back/product/list.do?page=1\">产品管理</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"walker-ad\"><a href=\"/back/ad/list.do?page=1\">广告管理</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"walker-news\"><a href=\"/back/news/list.do?page=1\">新闻公告管理</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(\"#\" + active_menu).addClass(\"active\");\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\t\t<div class=\"span8 radius-div\">\r\n");
      out.write("\t\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t\t<h5>导航管理</h5>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<a href=\"/back/wechattype/toadd.do\" class=\"btn btn-primary\">添加导航</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table class=\"table table-bordered table-hover\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>名称</th>\r\n");
      out.write("\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>jkkjhhkjhk</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"/back/wechattype/toupdate.do?id=1\"><i class=\"icon-pencil\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" data=\"1\" class=\"remove-btn\"><i class=\"icon-remove\"></i></a></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<!-- 分页 -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 页脚开始 -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<p>Copyright @ walker.com</p>\r\n");
      out.write("\t\t\t<p>Powered by 行者</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Modal -->\r\n");
      out.write("\t<div id=\"myModal\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t<div class=\"modal-header\">\r\n");
      out.write("\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("\t<h3 id=\"myModalLabel\">删除服务帐号类型</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"modal-body\">\r\n");
      out.write("\t<p>确定删除此服务帐号类型~?</p>\r\n");
      out.write("\t<input type=\"hidden\" id=\"delid\"></input>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"modal-footer\">\r\n");
      out.write("\t<button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">关闭</button>\r\n");
      out.write("\t<button class=\"btn btn-primary\" id=\"remove-model-sure\">确定</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(\".remove-btn\").click(function() {\r\n");
      out.write("\t\t\t\t$(\"#delid\").val($(this).attr(\"data\"));\r\n");
      out.write("\t\t\t\t$(\"#myModal\").modal('show');\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\"#remove-model-sure\").click(function() {\r\n");
      out.write("\t\t\t\tvar url = \"/back/navigation/del.do\";\r\n");
      out.write("\t\t\t\tvar data = {\"id\":$(\"#delid\").val()};\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\turl:url,\r\n");
      out.write("\t\t\t\t\tdata:data,\r\n");
      out.write("\t\t\t\t\tsuccess:function(mesg) {\r\n");
      out.write("\t\t\t\t\t\tif(mesg.code) {\r\n");
      out.write("\t\t\t\t\t\t\tlocation.href = \"/back/navigation/list.do?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
