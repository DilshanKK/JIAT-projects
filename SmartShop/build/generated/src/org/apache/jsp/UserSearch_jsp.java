package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <h1 class=\"breadcrumb\">User View</h1>\n");
      out.write("            <br>\n");
      out.write("            <h4 id=\"mess\" style=\"color: tomato;\"></h4>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("                <span>Username: </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                <input id=\"uname\" type=\"text\" placeholder=\"Enter your Username...\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("                <span>Email :</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                <input id=\"uemail\" type=\"email\" placeholder=\"Enter your Password...\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("                <span>Mobile :</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                <input id=\"umobile\" type=\"text\" placeholder=\"Enter your Mobile...\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("                <span>Country :</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("                <select id=\"ucountry\">\n");
      out.write("                    <option>All</option>\n");
      out.write("                    <option>Sri Lanka</option>\n");
      out.write("                    <option>India</option>\n");
      out.write("                    <option>Australia</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("                <input type=\"button\" value=\"Search\" onclick=\"searchUser();\" class=\"btn btn-info\">\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Username</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Password</th>\n");
      out.write("                        <th>Mobile</th>\n");
      out.write("                        <th>Country</th>\n");
      out.write("                        <th>Type</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody id=\"tbody3\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>67</td>\n");
      out.write("                        <td>Kamal</td>\n");
      out.write("                        <td>kamal@gmail.com</td>\n");
      out.write("                        <td>k12345</td>\n");
      out.write("                        <td>0715788957</td>\n");
      out.write("                        <td>Sri Lanka</td>\n");
      out.write("                        <td>User</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>68</td>\n");
      out.write("                        <td>Peter</td>\n");
      out.write("                        <td>peter@gmail.com</td>\n");
      out.write("                        <td>p12345</td>\n");
      out.write("                        <td>0715788957</td>\n");
      out.write("                        <td>Australia</td>\n");
      out.write("                        <td>Admin</td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function searchUser(){\n");
      out.write("                var request = new XMLHttpRequest();\n");
      out.write("                \n");
      out.write("                var user={\"name\": document.getElementById(\"uname\").value,\n");
      out.write("                \"email\": document.getElementById(\"uemail\").value,\n");
      out.write("                \"mobile\": document.getElementById(\"umobile\").value,\n");
      out.write("                \"country\": document.getElementById(\"ucountry\").value};\n");
      out.write("            \n");
      out.write("                window.alert(JSON.stringify(user));\n");
      out.write("                \n");
      out.write("                request.onreadystatechange = function(){\n");
      out.write("                  if(request.readyState === 4 && request.status === 200){\n");
      out.write("                      window.alert(request.responseText);\n");
      out.write("                  }  \n");
      out.write("                };\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                request.open(\"GET\",\"UserSearch?user=\"+JSON.stringify(user),true);\n");
      out.write("                request.send();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
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
