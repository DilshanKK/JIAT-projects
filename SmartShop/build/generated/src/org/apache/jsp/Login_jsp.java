package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h1 class=\"breadcrumb\">Login</h1>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <h5 style=\"margin-left: 900px;\">New member <input class=\"btn btn-success\" type=\"submit\" value=\"Sign Up\" onclick=\"signup();\"></h5>\n");
      out.write("            <br>\n");
      out.write("            <h4 id=\"login_msg\" style=\"color: tomato;\"></h4>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Email :</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input id=\"email\" type=\"email\" placeholder=\"Enter your Email...\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Password :</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input id=\"password\" type=\"password\" placeholder=\"Enter your Password...\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input type=\"submit\" value=\"Login\" class=\"btn btn-primary\" onclick=\"login();\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function login() {\n");
      out.write("                var email = document.getElementById(\"email\").value;\n");
      out.write("                var password = document.getElementById(\"password\").value;\n");
      out.write("\n");
      out.write("                var request = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                request.onreadystatechange = function () {\n");
      out.write("                    if (request.readyState === 4 && request.status === 200) {\n");
      out.write("\n");
      out.write("                        if (request.responseText === \"1\") {\n");
      out.write("                            window.location = \"Profile.jsp\";\n");
      out.write("                        } else {\n");
      out.write("                           \n");
      out.write("                           document.getElementById(\"login_msg\").innerHTML = request.responseText;\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                var param = \"email=\" + email + \"&password=\" + password;\n");
      out.write("\n");
      out.write("                request.open(\"POST\", \"Login\", true);\n");
      out.write("                request.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                request.send(param);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function signup(){\n");
      out.write("                window.location = \"UserRegistration.jsp\";\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
