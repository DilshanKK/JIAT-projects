package Servlets;

import Hibernate.NewHibernateUtil;
import Hibernate.User;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Session hs = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tr = hs.beginTransaction();
        User user = new User();

        try {

            DiskFileItemFactory dfif = new DiskFileItemFactory();
            ServletFileUpload sfu = new ServletFileUpload(dfif);

            List<FileItem> li = sfu.parseRequest(request);

            for (FileItem items : li) {
                if (items.isFormField()) {
                    //Inut Field

                    if (items.getFieldName().equals("name")) {
                        user.setName(items.getString());
                    } else if (items.getFieldName().equals("email")) {
                        user.setEmail(items.getString());
                    } else if (items.getFieldName().equals("password")) {
                        user.setPassword(items.getString());
                    } else if (items.getFieldName().equals("mobile")) {
                        user.setMobile(items.getString());
                    } else if (items.getFieldName().equals("country")) {
                        user.setCountry(items.getString());
                    }

                } else {
                    //File
                    String project_path = request.getServletContext().getRealPath("/");
                    String folder_name = project_path + "images/user/";
                    String file_name = folder_name + System.currentTimeMillis() + ".png";

                    File file = new File(file_name);
                    items.write(file);

                    user.setImgUrl(file_name);

                }
            }

            if (user.getName() != null || user.getName() != "") {
                response.getWriter().write("Please Enter your Name");
            }
            if (user.getEmail() != null || user.getEmail() != "") {
                response.getWriter().write("Please Enter your Email");
            }
            if (user.getPassword() != null || user.getPassword() != "") {
                response.getWriter().write("Please Enter your Password");
            }
            if (user.getMobile() != null || user.getMobile() != "") {
                response.getWriter().write("Please Enter your Name");
            }
            if (user.getCountry() != null || user.getCountry() != "") {
                response.getWriter().write("Please Enter your Name");
            }
            if (user.getImgUrl() != null || user.getImgUrl() != "") {
                response.getWriter().write("Please Select your Profile Picture");
            } else {
                user.setType("User");
                hs.save(user);
                response.getWriter().write("Successfully Registered");
                tr.commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
