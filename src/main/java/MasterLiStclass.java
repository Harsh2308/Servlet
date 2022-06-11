

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MasterLiStclass
 */
public class MasterLiStclass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MasterLiStclass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		StudentDAO d = new StudentDAO();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");  
        out.println("<html><body>");
		try {
			List<techsub> t = d.techsubs(); //getstudent();
			out.println("<table border=1 width=20% height=20%>");  
            out.println("<tr><th>" + "CLASS LIST" +"</th></tr>");  
            for(techsub ab : t)
			{
				out.println("<tr><td>"+ab.getAssignclass()+"</td></tr>");
			}
			out.println("</table>");  
            out.println("</html></body>");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}