import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LogoutServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                        throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
          
        request.getRequestDispatcher("link.html").include(request, response);  
          
        Cookie ck=new Cookie("name","");  
        ck.setMaxAge(0);  
        response.addCookie(ck);  
          
        out.print("you are successfully logged out!");  
    }  
}  