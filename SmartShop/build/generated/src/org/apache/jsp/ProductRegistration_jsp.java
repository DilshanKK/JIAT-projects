package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Hibernate.Brand;
import org.hibernate.Criteria;
import Hibernate.NewHibernateUtil;
import org.hibernate.Session;

public final class ProductRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <h1 class=\"breadcrumb\">Product Registration</h1>\n");
      out.write("            <br>\n");
      out.write("            <h4 id=\"product_msg\" style=\"color: tomato;\"></h4>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Brand Name :</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <select id=\"brand_select\">\n");
      out.write("                        ");

                            Session hs = NewHibernateUtil.getSessionFactory().openSession();
                            Criteria cr = hs.createCriteria(Brand.class);
                            
                            List<Brand> li=cr.list();
                            
                            for(Brand b : li){
                                
      out.write("\n");
      out.write("                                <option>");
      out.print( b.getName());
      out.write("</option>\n");
      out.write("                                ");

                            }
                        
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <input id=\"brand_name\" type=\"text\" placeholder=\"Enter New Brand Name...\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input type=\"submit\" value=\"Add New Brand\" class=\"btn btn-sm\" onclick=\"addBrand();\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Model :</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input id=\"model\" type=\"text\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Released Date :</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input id=\"date\" type=\"date\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Description :</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <textarea id=\"description\">\n");
      out.write("                        \n");
      out.write("                    </textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <span>Product Image :</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <label for=\"file\">\n");
      out.write("                        <img src=\"icons/upload.png\" style=\"margin-top: -20px;\">\n");
      out.write("                    </label>\n");
      out.write("                    <input id=\"file\" type=\"file\" onchange=\"loadImage();\" style=\"display: none;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <img id=\"preview_image\" style=\"border-width: 2px;\n");
      out.write("                         width: 350px;\n");
      out.write("                         height: 350px;\n");
      out.write("                         min-width: 350px;\n");
      out.write("                         min-height: 350px;\n");
      out.write("                         max-width: 350px;\n");
      out.write("                         max-height: 350px;\n");
      out.write("                         margin-top: -260px;\n");
      out.write("                         \">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input type=\"submit\" value=\"Add Product\" class=\"btn btn-info\" onclick=\"saveProduct();\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function addBrand(){\n");
      out.write("                var brand = document.getElementById(\"brand_name\").value;\n");
      out.write("                \n");
      out.write("                var request = new XMLHttpRequest();\n");
      out.write("                \n");
      out.write("                request.onreadystatechange = function(){\n");
      out.write("                  if(request.readyState === 4 && request.status === 200){\n");
      out.write("                      document.getElementById(\"brand_select\").innerHTML += request.responseText;\n");
      out.write("                      document.getElementById(\"brand_name\").value = \"\";\n");
      out.write("                  }  \n");
      out.write("                };\n");
      out.write("                \n");
      out.write("                request.open(\"GET\",\"AddBrand?brand=\"+brand,true);\n");
      out.write("                request.send();\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            function loadImage(){\n");
      out.write("                var file = document.getElementById(\"file\").files[0];\n");
      out.write("                var reader = new FileReader();\n");
      out.write("                reader.readAsDataURL(file);\n");
      out.write("                \n");
      out.write("                reader.onload = function(content){\n");
      out.write("                    document.getElementById(\"preview_image\").src = content.target.result;\n");
      out.write("                };\n");
      out.write("            }\n");
      out.write("            function saveProduct(){\n");
      out.write("                var brand = document.getElementById(\"brand_select\").value;\n");
      out.write("                var model = document.getElementById(\"model\").value;\n");
      out.write("                var date = document.getElementById(\"date\").value;\n");
      out.write("                var description = document.getElementById(\"description\").value;\n");
      out.write("                var file = document.getElementById(\"file\");\n");
      out.write("                \n");
      out.write("//                alert(brand);\n");
      out.write("//                alert(model);\n");
      out.write("//                alert(date);\n");
      out.write("//                alert(description);\n");
      out.write("//                alert(file.value);\n");
      out.write("\n");
      out.write("                var all_files = file.files[0];\n");
      out.write("                var form = new FormData();\n");
      out.write("                form.append(\"brand\",brand);\n");
      out.write("                form.append(\"model\",model);\n");
      out.write("                form.append(\"date\",date);\n");
      out.write("                form.append(\"description\",description);\n");
      out.write("                form.append(\"file\",all_files);\n");
      out.write("                \n");
      out.write("                var request= new XMLHttpRequest();\n");
      out.write("                \n");
      out.write("                request.onreadystatechange = function(){\n");
      out.write("                  if(request.readyState === 4 && request.status === 200){\n");
      out.write("                      document.getElementById(\"product_msg\").innerHTML = request.responseText;\n");
      out.write("                      document.getElementById(\"brand_select\").value=\"Apple\";\n");
      out.write("                      document.getElementById(\"model\").value=\"\";\n");
      out.write("                      document.getElementById(\"date\").value=\"\";\n");
      out.write("                      document.getElementById(\"description\").value=\"\";\n");
      out.write("                      document.getElementById(\"preview_image\").src=\"\";\n");
      out.write("                  }  \n");
      out.write("                };\n");
      out.write("                \n");
      out.write("                request.open(\"POST\",\"ProductSave\",true);\n");
      out.write("                request.send(form);\n");
      out.write("                \n");
      out.write("            }\n");
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
