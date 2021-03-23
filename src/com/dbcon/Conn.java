package com.dbcon;
import java.sql.*;  
  
  
public class Conn {  
private static Connection con=null;  
static{  
try{  
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/durgeshdb","root","root");
}catch(Exception e){
	System.out.println(e);
}  
}  
  
public static Connection getCon(){  
    return con;  
}  
  
}  