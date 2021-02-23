package Servlets;

import Hibernate.Brand;
import Hibernate.NewHibernateUtil;
import Hibernate.Product;
import Hibernate.Stock;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class SaveStock extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String brand = request.getParameter("brand");
            String model = request.getParameter("model");
            String quantity = request.getParameter("quantity");
            String uprice = request.getParameter("uprice");

//            System.out.println(brand);
//            System.out.println(model);
//            System.out.println(quantity);
//            System.out.println(uprice);
            Session hs = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = hs.beginTransaction();

            Criteria c = hs.createCriteria(Brand.class);
            c.add(Restrictions.eq("name", brand));

            Brand b = (Brand) c.uniqueResult();

            Criteria c1 = hs.createCriteria(Product.class);
            c1.add(Restrictions.eq("brand", b));
            c1.add(Restrictions.eq("model", model));

            Product p = (Product) c1.uniqueResult();

            Criteria c2 = hs.createCriteria(Stock.class);
            c2.add(Restrictions.eq("product", p));
            c2.add(Restrictions.eq("unitPrice", Double.parseDouble(uprice)));

            if (c2.list().isEmpty()) {
                // New Product
                Stock st = new Stock();
                st.setProduct(p);
                st.setAvailableQty(Integer.parseInt(quantity));
                st.setUnitPrice(Double.parseDouble(uprice));
                hs.save(st);
                response.getWriter().write("New Stock Added Successfully!");
            } else {
                //Update
//                Stock st = new Stock();
//                st.setAvailableQty(st.getAvailableQty()+Integer.parseInt(quantity));
//                hs.update(st);
//                response.getWriter().write("Stock Updated!!!");
                
                Stock st =(Stock)c2.uniqueResult();
                st.setAvailableQty(st.getAvailableQty()+Integer.parseInt(quantity));
                hs.update(st);
                response.getWriter().write("Stock Updated");
                
            }

            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
