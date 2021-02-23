package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Hibernate.Brand;
import org.hibernate.Criteria;
import Hibernate.NewHibernateUtil;
import org.hibernate.Session;

public final class Stock_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            \n");
      out.write("\n");
      out.write("            <h1 class=\"breadcrumb\">Stock</h1>\n");
      out.write("            <br>\n");
      out.write("            <h4 id=\"stockmsg\" style=\"color: tomato;\"></h4>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Brand Name:</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <select id=\"brandselect\" onchange=\"loadModel();\">\n");
      out.write("                        ");

                            Session hs = NewHibernateUtil.getSessionFactory().openSession();
                            Criteria cr = hs.createCriteria(Brand.class);

                            List<Brand> li = cr.list();

                            for (Brand b : li) {
                        
      out.write("\n");
      out.write("                        <option>");
      out.print( b.getName());
      out.write("</option>\n");
      out.write("                        ");

                            }

                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Model :</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <select id=\"modelselect\">\n");
      out.write("                        <!--Load By Ajax-->\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Quantity :</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input id=\"quantity\" type=\"number\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Unit Price :</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input id=\"uprice\" type=\"text\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("              <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input type=\"submit\" value=\"Add Stock\" class=\"btn btn-info\" onclick=\"saveStock();\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function loadModel(){\n");
      out.write("            var brand = document.getElementById(\"brandselect\").value;\n");
      out.write("            \n");
      out.write("//            window.alert(brand);\n");
      out.write("\n");
      out.write("            var request = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            request.onreadystatechange = function(){\n");
      out.write("              if(request.readyState === 4 && request.status === 200){\n");
      out.write("                  document.getElementById(\"modelselect\").innerHTML = request.responseText;\n");
      out.write("              }  \n");
      out.write("            };\n");
      out.write("            \n");
      out.write("            request.open(\"GET\",\"ModelLoad?brand=\"+brand,true);\n");
      out.write("            request.send();\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function saveStock(){\n");
      out.write("            var brand = document.getElementById(\"brandselect\").value;\n");
      out.write("            var model = document.getElementById(\"modelselect\").value;\n");
      out.write("            var quantity = document.getElementById(\"quantity\").value;\n");
      out.write("            var uprice = document.getElementById(\"uprice\").value;\n");
      out.write("            \n");
      out.write("//            window.alert(brand);\n");
      out.write("//            window.alert(model);\n");
      out.write("//            window.alert(quantity);\n");
      out.write("//            window.alert(uprice);\n");
      out.write("\n");
      out.write("            var request = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            request.onreadystatechange = function(){\n");
      out.write("              if(request.readyState === 4 && request.status === 200){\n");
      out.write("                  window.alert(request.responseText);\n");
      out.write("              }  \n");
      out.write("            };\n");
      out.write("            \n");
      out.write("            var parameters = \"brand=\"+brand+\"&model=\"+model+\"&quantity=\"+quantity+\"&uprice=\"+uprice;\n");
      out.write("            \n");
      out.write("            request.open(\"GET\",\"SaveStock?\"+parameters,true);\n");
      out.write("            request.send();\n");
      out.write("            \n");
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
