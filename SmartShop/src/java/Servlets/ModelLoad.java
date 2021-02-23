/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Hibernate.Brand;
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

public class ModelLoad extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String brand = request.getParameter("brand");
            
            Session hs = NewHibernateUtil.getSessionFactory().openSession();
            Criteria cr = hs.createCriteria(Product.class);
//            cr.add(Restrictions.eq("brand", brand));
            
            Criteria cr1 = hs.createCriteria(Brand.class);
            cr1.add(Restrictions.eq("name", brand));
            
            Brand b =  (Brand) cr1.uniqueResult();
            
            cr.add(Restrictions.eq("brand", b));
            
            List<Product> list = cr.list();
            
            String options = "";
            
            for (Product p : list) {
                options+="<option>"+p.getModel()+"</option>";
            }
            
            response.getWriter().write(options);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
//        Session hs = NewHibernateUtil.getSessionFactory().openSession();
//
//        try {
//            String brand = request.getParameter("brand");
//            Criteria cr = hs.createCriteria(Brand.class);
//            cr.add(Restrictions.eq("brand", brand));
//            
//            Brand b = (Brand)cr.uniqueResult();
//            
//            Criteria cr1 = hs.createCriteria(Product.class);
//            cr1.add(Restrictions.eq("brand", b));
//            
//            List<Product> list = cr1.list();
//            
//            String option = "";
//            for (Product p : list) {
//                option += "<option>" + p.getModel() + "</option>";
//            }
//
//            response.getWriter().write(option);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}
