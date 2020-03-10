import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Shop extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		 PrintWriter out=res.getWriter();  
        req.getRequestDispatcher("link.html").include(request, response);  
          
        String name=req.getParameter("name");  
        String password=req.getParameter("password");  
          
        if(password.equals("admin123")){  
        out.print("Welcome, "+name);  
        HttpSession session=request.getSession();  
        session.setAttribute("name",name);  
        }  
        else{  
            out.print("Sorry, username or password error!");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
        
	}
}