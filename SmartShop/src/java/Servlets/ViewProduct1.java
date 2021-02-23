package Servlets;

import Hibernate.NewHibernateUtil;
import Hibernate.Stock;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class ViewProduct1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            int cols = Integer.parseInt(request.getParameter("cols"));
            
            Session hs = NewHibernateUtil.getSessionFactory().openSession();
            Criteria cr = hs.createCriteria(Stock.class);

            List<Stock> list = cr.list();
            int i = 0;
            String data = "<tr>";

            for (Stock p : list) {
                i++;
                String image = p.getProduct().getImgUrl();
                String replace = image.replace(request.getServletContext().getRealPath("/"), "");
                String brand = p.getProduct().getBrand().getName();
                String model = p.getProduct().getModel();
                String date = p.getProduct().getReleaseDate().toString();
                String description = p.getProduct().getDescription();
                String uprice = p.getUnitPrice().toString();
                String quantity = p.getAvailableQty().toString();

                data += "<td><div class=\"mdiv\" style=\"width: 350px;\n"
                        + "                 height: 550px;\n"
                        + "                 border-width: 2px;\n"
                        + "                 border-style: solid;\n"
                        + "                 padding: 5px;\">\n"
                        + "                <img src=\"" + replace + "\" style=\"width:340px;\n"
                        + "                     height: 350px;\n"
                        + "                     min-width: 340px;\n"
                        + "                     min-height: 350px;\n"
                        + "                     max-width: 340px;\n"
                        + "                     max-height: 350px;\">\n"
                        + "                <br>\n"
                        + "                <br>\n"
                        + "                <center>\n"
                        + "                    <span>" + brand + " " + model + "</span>\n"
                        + "                    <br>\n"
                        + "                    <span>Released Date : " + date + "</span>\n"
                        + "                    <br>\n"
                        + "                    <span>Description : " + description + "</span>\n"
                        + "                    <br>\n"
                        + "                    <span>Unit Price: " + uprice + "</span>\n"
                        + "                    <br>\n"
                        + "                    <span>Available Quantity : " + quantity + "</span>\n"
                        + "                    <br>\n"
                        + "                    <br>\n"
                        + "                    <input type=\"text\" value=\"Add To Cart\" class=\"btn btn-info\">\n"
                        + "                </center>\n"
                        + "            </div></td>";

                if (i % cols == 0) {
                    data += "</tr><tr>";
                }
            }

            response.getWriter().write(data);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
