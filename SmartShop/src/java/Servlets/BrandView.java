package Servlets;

import Hibernate.Brand;
import Hibernate.NewHibernateUtil;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class BrandView extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            
            
            
            Session hs = NewHibernateUtil.getSessionFactory().openSession();
            Criteria cr = hs.createCriteria(Brand.class);
            
            int pages = cr.list().size()/3;
            
            String buttons="";
            for (int i = 0; i <= pages; i++) {
                buttons+="<td><input type=\"button\" value=\""+(i+1)+"\" class=\"btn btn-info\" style=\"margin:  5px;\" onclick=\"m("+(i*3)+");\"></td>";
            }
            
            cr.setFirstResult(Integer.parseInt(request.getParameter("i")));
            
            cr.setMaxResults(3);
            
            List<Brand> b_list = cr.list();
            
            String data="";
            for (Brand b : b_list) {
                
                data+="<tr>\n" +
"                <div style=\"width: 200px;\n" +
"                     height: 65px;\n" +
"                     border-width:2px;\n" +
"                     border-style: solid;\n" +
"                     padding: 10px;\">\n" +
"                    <span>Brand ID : "+b.getId()+"</span>\n" +
"                    <br>\n" +
"                    <span>Brand Name : "+b.getName()+"</span>\n" +
"                </div>\n" +
"                    </tr><br>";
                
            }
            response.getWriter().write(data+","+buttons);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
