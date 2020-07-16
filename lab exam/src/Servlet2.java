import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_URL ="jdbc:mysql://localhost:3306/eshop";
    private static String DB_USER = "root";
    static final String DB_PASS = "";

    static final String USER = "root";
    static final String PASS = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        try {
            PrintWriter out = response.getWriter();
            String Name = request.getParameter("name");
            String registration = request.getParameter("registration");
            String grade = request.getParameter("grade");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String gender = request.getParameter("gender");
            String status = request.getParameter("status");

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stm = conn.createStatement();

            String query = "SELECT name, grade, registration from students ";
            ResultSet result = stm.executeQuery(query);



        }
        catch (Exception se){



            protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }