import com.mvc.LoginBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        LoginBean bean = new LoginBean();
        bean.setName(name);
        bean.setPassword(password);
        request.setAttribute("bean", bean);

        boolean status = bean.validate();

        if (status) {
            RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rdp = request.getRequestDispatcher("login-error.jsp");
            rdp.forward(request, response);
        }


    }





    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}

