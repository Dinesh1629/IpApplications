import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Wallet extends HttpServlet {

   protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
     PrintWriter out = res.getWriter();
     try {
         String name = req.getParameter("wallet");
        String password = req.getParameter("password");

        if(password.equals("dinesh"))
        {
           RequestDispatcher rd = req.getRequestDispatcher("Payment");
           rd.forward(req,res);
        }
        else
         {
         out.println("<font color='red'><b>You have entered incorrect wallet password</b></font>");
                RequestDispatcher rd = req.getRequestDispatcher("shop.html");
                rd.include(req,res);
            }
        }finally {            
            out.close();
        }
        
    }
}
