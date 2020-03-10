import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet {  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("link.html").include(request, response);  
          
        String name=request.getParameter("username");  
        String password=request.getParameter("password");  
          
        if(password.equals("admin123")){  
        out.print("Welcome, "+name);  
        HttpSession session=request.getSession();  
        session.setAttribute("username",name);
         request.getRequestDispatcher("shop.html").include(request, response);  
        }  
        else{  
            out.print("Sorry, username or password error!");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
        out.close();  
    }  
}  
