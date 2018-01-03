/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-03 19:04:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/fragments/navigation.jspf", Long.valueOf(1514997960000L));
    _jspx_dependants.put("/WEB-INF/views/fragments/footer.jspf", Long.valueOf(1514640765000L));
    _jspx_dependants.put("/WEB-INF/views/fragments/header.jspf", Long.valueOf(1514992331000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<link href=\"webjars/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Boogaloo\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t\n");
      out.write("\t<title>HappyLibs Emailer</title>\n");
      out.write("</head>\n");
      out.write("<body>");
      out.write('\n');
      out.write("<nav class=\"navbar navbar-expand-sm navbar-dark bg-dark\">\n");
      out.write("\t<div>\n");
      out.write("\t\t<a href=\"/index\" class=\"navbar-brand\">HappyLibs!</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"collapse navbar-collapse\">\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t<li class=\"nav-item\"><a href=\"/index\" class=\"nav-link\">Home</a></li>\n");
      out.write("\t\t\t<li class=\"nav-item\"><a href=\"/about\" class=\"nav-link\">About</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("\t<h1 class=\"center-text\">About HappyLibs!</h1>\n");
      out.write("\t<br/>\n");
      out.write("\t<p>\n");
      out.write("\t\tHappyLibs! is a free word game that emulates the popular word game Mad Libs&#x2122, created by Roger Price and Leonard Stern.\n");
      out.write("\t\tSimply enter the required words in the form and they will be inserted into a short story or poem, often producing something\n");
      out.write("\t\tsilly, goofy, or strange.\n");
      out.write("\t</p>\n");
      out.write("\t\n");
      out.write("\t<br/>\n");
      out.write("\t\n");
      out.write("\t<p>\n");
      out.write("\t\tHappyLibs! was created by Haley Mnatzaganian using Java and Spring MVC as a fun way to learn some new programming technologies.\n");
      out.write("\t\tCheck out her other works in the project section of her <a href=\"https://www.linkedin.com/in/haleymnatzaganian/\">LinkedIn</a>\n");
      out.write("\t\tor email her at haleymnatz@gmail.com.\n");
      out.write("\t</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script src=\"webjars/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"webjars/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/popper.min.js\"></script>\n");
      out.write("\t\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/fragments/header.jspf(12,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/css/main.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
