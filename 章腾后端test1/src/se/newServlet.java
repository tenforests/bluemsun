package se;
import entity.Users;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "newServlet")
public class newServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users user = new Users();
        String username;
        String password;
        System.out.printf("post方式");
        try {
            username = request.getParameter("username");
            password = request.getParameter("password");
            user.setUsername(username);
            user.setPassword(password);
            if (username.equals("tenforests") && password.equals("123456")) {
                request.getRequestDispatcher("/succeed.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/failed.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.printf("get方式");
        doPost(request, response);
    }
}