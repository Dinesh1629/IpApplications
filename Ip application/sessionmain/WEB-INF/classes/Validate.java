import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validate extends HttpServlet {

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     try {
         String name = request.getParameter("wallet");
        String password = request.getParameter("password");

        if(password.equals("dinesh"))
        {
           RequestDispatcher rd = request.getRequestDispatcher("Welcome");
           rd.forward(request, response);
        }
        else
         {
         out.println("<font color='red'><b>You have entered incorrect password</b></font>");
                RequestDispatcher rd = request.getRequestDispatcher("shop.html");
                rd.include(request, response);
            }
        }finally {            
            out.close();
        }
        
    }
}
