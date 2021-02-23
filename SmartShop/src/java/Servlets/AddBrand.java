package Servlets;

import Hibernate.Brand;
import Hibernate.NewHibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddBrand extends HttpServlet {
  
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        Session hs=NewHibernateUtil.getSessionFactory().openSession();
        Transaction tr = hs.beginTransaction();
        Brand brand = new Brand();
        
        try {
            
            String brand_name = request.getParameter("brand");
            
            brand.setName(brand_name);
            
            String option = "<option>"+brand_name+"</option>";
            
            hs.save(brand);
            response.getWriter().write(option);
            hs.flush();
            tr.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
