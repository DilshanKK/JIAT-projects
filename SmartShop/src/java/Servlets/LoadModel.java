/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlets;

import Hibernate.NewHibernateUtil;
import Hibernate.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class LoadModel extends HttpServlet {
  
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        Session hs=NewHibernateUtil.getSessionFactory().openSession();
        
        
        try {
            String brand = request.getParameter("brand");
            Criteria cr = hs.createCriteria(Product.class);
            cr.add(Restrictions.eq("brand", brand));
            
            List<Product> list = cr.list();
            
            String option="";
            for (Product p : list) {
                option+="<option>"+p.getModel()+"</option>";
            }
            
            response.getWriter().write(option);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
