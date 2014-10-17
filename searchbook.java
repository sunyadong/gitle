package books;

import java.sql.*;
import java.util.*;

public class searchbook {
	public List<Book> books =new ArrayList<Book>();
	public String name;
	public List<Book> getBooks(){
		return books;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() 
	{
		try{
		Statement stmt;
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/BookDB","root","12345678");
		
		stmt = con.createStatement();
		ResultSet rst;
		ResultSet rst2;
		Book booktemp;
		
			String sql ="select AuthorID from Author where Author.Name='"+name+"'";
			
			
			rst = stmt.executeQuery(sql);
			System.out.println("hello");
			
			if(rst.next())
			{
				
				int tempid;
				tempid=rst.getInt(1);

				String sql2="select * from Book where Book.AuthorID='"+String.valueOf(tempid)+"'";
			    rst2=stmt.executeQuery(sql2);
			
			    while(rst2.next())
			    {
			    	booktemp=new Book(rst2.getString(1),rst2.getString(2),rst2.getInt(3),rst2.getString(4),rst2.getString(5),rst2.getInt(6));
			    	books.add(booktemp);
			    }
			    
			}
			    else
			    {
			    	stmt.close();
					con.close();
			    	return "error";
			    }
			stmt.close();
			con.close();
			  
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "success";
	}
	
}
