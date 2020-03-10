import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Welcome extends HttpServlet {

   protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        req.getRequestDispatcher("link.html").include(req, res);
        HttpSession session=req.getSession(false);
         String name=(String)session.getAttribute("username");
        try {
            
            out.println("<body>");
            out.println("<h2>Payment successfuly completed</h2>");
            out.println("Thank you for purchasing" +name);
            out.println("</body>");
        } finally {            
            out.close();
        }
    }
}