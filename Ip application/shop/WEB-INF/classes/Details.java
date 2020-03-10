import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Details extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
    PrintWriter out=res.getWriter();
	int pendrive=Integer.parseInt(req.getParameter("pendrive"));
	int mobile=Integer.parseInt(req.getParameter("mobile"));
	int laptop=Integer.parseInt(req.getParameter("laptop"));
	String drive=req.getParameter("drive");
	String mobile1=req.getParameter("mobile1");
	String lap=req.getParameter("lap");
	int a=pendrive*255;
	int b=mobile*7500;
	int c=laptop*30000;
	int total=a+b+c;

	    out.println("<body>");
	    out.println("<form method='post' action='wallet.html'");
	 
        HttpSession session = req.getSession();
        String user = (String)session.getAttribute("user");
        out.println("Hello "+user);
	    	out.println("<h3>Cost of purchase</h3>");
	    if(drive!=null){
	      out.println("<h3>cost of PENDRIVE is : </h3>"+a);
	    }else
	    {
	    	out.println("");
	    }
	    if(mobile1!=null){
	    	out.println("<h3>cost of MOBILE is : </h3>"+b);
	    }else{
	    	out.println("");
	    }
	    if(lap!=null){
           out.println("<h3>cost of LAPTOP is  : </h3> "+c);
	    }else{
	    	out.println("");
	    }     
        out.println("<h3>total cost of product is :</h3> "+total);
        out.println("<input type='submit' value='submit'></form>");
	    out.println("</form>");	
        out.println("</body>");
   
}
}