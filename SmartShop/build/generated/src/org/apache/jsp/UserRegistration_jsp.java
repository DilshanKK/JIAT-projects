package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Country;
import java.util.ArrayList;

public final class UserRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <h1 class=\"breadcrumb\">User Registration</h1>\n");
      out.write("            <h3 id=\"msg\"></h3>\n");
      out.write("            <form>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <span>User Name :</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <input id=\"name\" type=\"text\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <span>Email :</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <input id=\"email\" type=\"email\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <span>Password :</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <input id=\"password\" type=\"password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <span>Mobile :</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <input id=\"mobile\" type=\"text\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <span>Country :</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <select id=\"country\">\n");
      out.write("                            ");

                                ArrayList<Country> c_list = Country.countries;
                                
                                for(Country c: c_list){
                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print( c.getCountry() );
      out.write("</option>\n");
      out.write("                                    ");

                                }
                                
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <span>Profile Picture :</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <label for=\"file\">\n");
      out.write("                            <img src=\"icons/upload.png\">\n");
      out.write("                        </label>\n");
      out.write("                        <input id=\"file\" type=\"file\" onchange=\"loadImage();\"  style=\"display: none;\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <img id=\"preview\"  style=\"width: 350px;\n");
      out.write("                             height: 350px;\n");
      out.write("                             min-height: 350px;\n");
      out.write("                             min-width: 350px;\n");
      out.write("                             max-height: 350px;\n");
      out.write("                             max-width: 350px;\n");
      out.write("                             border-style: solid;\n");
      out.write("                             border-width: 1px;\n");
      out.write("                             margin-top: -220px;\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <input type=\"submit\" value=\"Register\" class=\"btn btn-primary\" onclick=\"saveUser();\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function loadImage(){\n");
      out.write("            \n");
      out.write("            var file = document.getElementById(\"file\").files[0];\n");
      out.write("            var reader = new FileReader();\n");
      out.write("            reader.readAsDataURL(file);\n");
      out.write("            \n");
      out.write("            reader.onload = function(content){\n");
      out.write("              document.getElementById(\"preview\").src = content.target.result;\n");
      out.write("            };\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function saveUser(){\n");
      out.write("            var name=document.getElementById(\"name\").value;\n");
      out.write("            var email=document.getElementById(\"email\").value;\n");
      out.write("            var password=document.getElementById(\"password\").value;\n");
      out.write("            var mobile=document.getElementById(\"mobile\").value;\n");
      out.write("            var country=document.getElementById(\"country\").value;\n");
      out.write("            var file=document.getElementById(\"file\");\n");
      out.write("            \n");
      out.write("//            alert(name);\n");
      out.write("//            alert(email);\n");
      out.write("//            alert(password);\n");
      out.write("//            alert(mobile);\n");
      out.write("//            alert(country);\n");
      out.write("//            alert(file.value);\n");
      out.write("\n");
      out.write("            var all_files = file.files[0];\n");
      out.write("            var form = new FormData();\n");
      out.write("            form.append(\"name\",name);\n");
      out.write("            form.append(\"email\",email);\n");
      out.write("            form.append(\"password\",password);\n");
      out.write("            form.append(\"mobile\",mobile);\n");
      out.write("            form.append(\"country\",country);\n");
      out.write("            form.append(\"file\",all_files);\n");
      out.write("            \n");
      out.write("            var request = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            request.onreadystatechange = function(){\n");
      out.write("              if(request.readyState === 4 && request.status === 200){\n");
      out.write("                  alert(request.responseText);\n");
      out.write("              }  else{\n");
      out.write("                  alert(request.status);\n");
      out.write("              }\n");
      out.write("            };\n");
      out.write("            \n");
      out.write("            request.open(\"POST\",\"SaveUser\",true);\n");
      out.write("            request.send(form);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </script>\n");
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
