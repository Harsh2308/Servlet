import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	/*STUDENT DATA RETRIVEING CODE START*/
	public List<Student> getstudent() throws ClassNotFoundException, SQLException 
	{
	ArrayList<Student> list = new ArrayList<Student>();
	Connection con = DbUtil.getConn();
	String sql = "select * from student";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	{
		Student s = new Student();
		s.setStudid(rs.getString(1));
		s.setStudfname(rs.getString(2));
		s.setStudlname(rs.getString(3));
		s.setStuddob(rs.getString(4));
		s.setStudadd(rs.getString(5));
		s.setStudphone(rs.getString(6));
		s.setAssigncls(rs.getString(7));
		s.setClassid(rs.getString(8));
		list.add(s);
	}
	return list;
	}
	/*STUDENT DATA RETRIVEING CODE END*/
	
	
	/*SUBJECT AND ASSIGNED TEACHERS DATA RETRIVEING CODE START*/
	public List<techsub> techsubs() throws ClassNotFoundException, SQLException 
	{
	ArrayList<techsub> list = new ArrayList<techsub>();
	Connection con = DbUtil.getConn();
	String sql = "select * from subtech";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	{
		techsub ts = new techsub(); //student s = new student();
		ts.setTechid(rs.getString(1));
		ts.setSsubject(rs.getString(2));
		ts.setAssigntech(rs.getString(3));
		ts.setAssignclass(rs.getString(4));
		ts.setClassid(rs.getString(5));
		list.add(ts);
	}
	return list;
	}
	/*SUBJECT AND ASSIGNED TEACHERS DATA RETRIVEING CODE END*/
	
	/*ADD NEW SUBJECT AND TEACHERS DATA RETRIVEING CODE START*/
	
	public List<SUBTECHRS> subtechrs() throws ClassNotFoundException, SQLException 
	{
	ArrayList<SUBTECHRS> list = new ArrayList<SUBTECHRS>();
	Connection con = DbUtil.getConn();
	String sql = "select * from subject";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	{
		SUBTECHRS ts = new SUBTECHRS(); //student s = new student();
		ts.setSubid(rs.getString(1));
		ts.setSubcode(rs.getString(2));
		ts.setSubname(rs.getString(3));
		ts.setClassname(rs.getString(4));
		list.add(ts);
	}
	return list;
	}
	
	/*ADD NEW SUBJECT AND TEACHERS DATA RETRIVEING CODE END*/
	
	/*CLASS LIST DATA RETRIVEING CODE START*/
	public List<Classes> tecClas() throws ClassNotFoundException, SQLException 
	{
	ArrayList<Classes> list = new ArrayList<Classes>();
	Connection con = DbUtil.getConn();
	String sql = "select * from class";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	{
		Classes tss = new Classes(); //student s = new student();
		tss.setClassid(rs.getString(1));
		tss.setClassname(rs.getString(2));
		list.add(tss);
	}
	return list;
	}
	/*CLASS LIST DATA RETRIVEING CODE END*/  

	/*NEW ADDED CLASS LIST DATA RETRIVEING CODE START*/
	public List<Classes> newclasses() throws ClassNotFoundException, SQLException 
	{
	ArrayList<Classes> list = new ArrayList<Classes>();
	Connection con = DbUtil.getConn();
	String sql = "select * from class";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	{
		Classes tss = new Classes(); //student s = new student();
		tss.setClassid(rs.getString(1));
		tss.setClassname(rs.getString(2));
		list.add(tss);
	}
	return list;
	}
	/*NEW ADDED CLASS LIST DATA RETRIVEING CODE END*/

	
}