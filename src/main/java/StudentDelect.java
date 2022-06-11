

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentDelect
 */
public class StudentDelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
   	/**
   	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   	 */
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		
   		
   		String studid = request.getParameter("studid");
   		String assigncls = request.getParameter("assigncls");
   		//System.out.println(studid +" "+ studfname +" " +studlname+" "+ studdob +" "+ studadd +" "+ studphone);
   		PrintWriter out = response.getWriter();
   		
   		try {
   			Connection con = DbUtil.getConn();
   			String sql = "Delect Student assigncls=? where studid=?";
   			PreparedStatement ps = con.prepareStatement(sql);
   			ps.setString(1, studid);
   			ps.setString(2, assigncls);
   			
   			int row = ps.executeUpdate();
   			if(row>0)
   			{
   				//out.print("UPDATED ");
   				response.sendRedirect("studeSUCCESS.html");
   			}else
   			{
   				//out.print("NOT UPDATED");
   				response.sendRedirect("studFAIL.html");
   			}
   		} catch (ClassNotFoundException e) {
   			e.printStackTrace();
   			out.print("CHECK THE CONNECTION " + e);
   		} catch (SQLException e) {
   			e.printStackTrace();
   		}
   	}
   }
