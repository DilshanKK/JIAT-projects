/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Hibernate.Brand;
import Hibernate.NewHibernateUtil;
import Hibernate.Product;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ProductSave extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Session hs = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tr = hs.beginTransaction();
        Product product = new Product();

        try {
            DiskFileItemFactory dfif = new DiskFileItemFactory();
            ServletFileUpload sfu = new ServletFileUpload(dfif);

            List<FileItem> items = sfu.parseRequest(request);

            for (FileItem item : items) {
                if (item.isFormField()) {
                    //Input Field
                    if (item.getFieldName().equals("brand")) {
                        Criteria cr = hs.createCriteria(Brand.class);
                        cr.add(Restrictions.eq("name", item.getString()));

                        Brand b = (Brand) cr.uniqueResult();

                        product.setBrand(b);
                    } else if (item.getFieldName().equals("model")) {
                        product.setModel(item.getString());
                    } else if (item.getFieldName().equals("date")) {

                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date d = sdf.parse(item.getString());
                        
//                        response.getWriter().write(d.toString());

                        product.setReleaseDate(d);
                    } else if (item.getFieldName().equals("description")) {
                        product.setDescription(item.getString());
                    }

                } else {
                    //File

                    String Project_path = request.getServletContext().getRealPath("/");
                    String folder_name = Project_path + "images/product/";
                    String file_name = folder_name + System.currentTimeMillis() + ".jpg";

                    File f = new File(file_name);
                    item.write(f);

                    product.setImgUrl(file_name);
                }
            }
            String resp ="";
            
//            if (product.getBrand() == null) {
//                resp+="Please Select the Brand...  ";
//            }
//            else if (product.getModel()== null || product.getModel()== "") {
//                resp+="Please Enter the Model...   ";
//            }
//            else if (product.getReleaseDate()== null) {
//                resp+="Please Select the Released Date...   ";
//            }
//            else if (product.getDescription()== null || product.getDescription()== "") {
//                resp+="Please Enter the Description...   ";
//            }
//            else if (product.getImgUrl()== null || product.getImgUrl()== "") {
//                resp+="Please Select the Product Image...   ";
//            }else{
                hs.save(product);
                tr.commit();
                resp+="Successfully Added!   ";
//            }
            
            response.getWriter().write(resp);
            

        } catch (Exception e) {
            e.printStackTrace();
        }

//        response.getWriter().write("OK987");

    }

}
