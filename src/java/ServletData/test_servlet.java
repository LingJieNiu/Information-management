/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletData;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ling
 */
public class test_servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   public test_servlet(){
       super();
   }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");
        response.setHeader("Cache-Control","no-cache"); 
        
        
        PrintWriter out = response.getWriter();
        
        
         Connection connection = null;
          Statement statement = null;  
          ResultSet rscontent=null;
           PreparedStatement ps=null;
           
           String identity=(String)request.getParameter("identity");
           System.out.println("The identity is :"+identity);
           
     if(identity.equals("1")) { 
         String assetword=(String)request.getParameter("AssetID");
        
        String showID="";
        String showName ="";
        String showDescription="";
            
         
           
           ArrayList <String> ID=new ArrayList<String>();
          
           ArrayList <String> Name=new ArrayList<String>();
           
           ArrayList <String> Description=new ArrayList<String>();
           
  try{
           
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/capstone", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         
         String comment="select * from assettype where AssetID='" +assetword+"'";
         rscontent = 
                    statement.executeQuery(comment);
         
         
        
   while( rscontent.next())
{
  
    showID=rscontent.getString(1);
  
   showName=rscontent.getString(2);
   showDescription=rscontent.getString(3);
}
   
   System.out.println("This is assetword:"+assetword);
   System.out.println("This is ID:"+showID);
   System.out.println("This is Name:"+showName);
   
   StringBuffer str=new StringBuffer();
   str.append("<information>");  
    str.append("<name>");str.append(showName);str.append("</name>");  
   str.append("<ID>");str.append(showID);str.append("</ID>");  
    str.append("<Description>");str.append(showDescription);str.append("</Description>");  
     str.append("</information>");  
//System.out.println(str);
  out.print(str.toString());  
     
   /*  
   out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
   out.println("<information>");
   out.println("<Name>"+showName+"</Nmae>");
   out.println("<ID>"+showID+"</ID>");
   out.println("<Description>"+showDescription+"</Description>");
   out.println("</information>");
     
     
     */
   
 /*  
    out.println("<table width='90%' id='mytab'  border='1' class='t1'>");
           out.println("<thead>");
           out.println("<th width=\"20%\">AssetID</th>");
           out.println("<th width=\"30%\">AssetName</th>");
           out.println("<th width=\"30%\">Description</th>");
           out.println("</thead>");
           out.println("<td>"+showID+"</td>");
           out.println("<td><input type=\"text\" id=\"editName\"value="+showName+"></td>");
           out.println("<td><input type=\"text\" id=\"editDescription\" value="+showDescription+"></td>");
           out.println("</tr>");
           
           out.println("<input type=\"button\" name=\"assettype\" value=\"edit it\" onclick=\"EditsendMassageToServer()\">");
   
   
*/
   
/*   
 for(int i=0; i<ID.size();i++){
     
     if(ID.get(i).equals(assetword)){
         
         showID=ID.get(i);
         showName=Name.get(i);
         showDescription=Description.get(i);
         
         
           out.println("<table width='90%' id='mytab'  border='1' class='t1'>");
           out.println("<thead>");
           out.println("<th width=\"20%\">AssetID</th>");
           out.println("<th width=\"30%\">Name</th>");
           out.println("<th width=\"30%\">Description</th>");
           out.println("</thead>");
           out.println("<td>"+showID+"</td>");
           out.println("<td>"+showName+"</td>");
           out.println("<td>"+showDescription+"</td>");
           out.println("</tr>");
          
         
     }
     
     
 }
   
 */  
  
   request.setAttribute("AssetIDfromSQL", ID);
   request.setAttribute("AssetNamefromSQL", Name);
   request.setAttribute("AssetDescriptionfromSQL", Description);
   
   
  
   
   } catch(SQLException se){
         //Handle errors for JDBC
         se.printStackTrace();
      }catch(Exception e){
         //Handle errors for Class.forName
         e.printStackTrace();
      } finally{
         //finally block used to close resources
         try{
            if(statement !=null)
               statement.close();
         }catch(SQLException se2){
         }// nothing we can do
         try{
            if(connection !=null)
            connection.close();
         }catch(SQLException se){
            se.printStackTrace();
         }//end finally try
      } //end try       
   
    
     }else if(identity.equals("2")){
          System.out.println("Here is spet2 The identity is :"+identity);
          
         String editID=(String)request.getParameter("editID");
         String editName=(String)request.getParameter("editName");
         String editDescription=(String)request.getParameter("editDescription");
         System.out.println("Here is spet2 editID is :"+editID);
         System.out.println("Here is spet2 editName is :"+editName);
         
         
         
         
     try{     
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/capstone", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         
         
         
         String comment=" update assettype set AssetName ='"+editName+"',Description= '" 
                             +editDescription+"' where AssetID= '"+editID+"'";
         //rscontent =  statement.executeQuery(comment);
          statement.executeUpdate(comment); 
         
     }catch(SQLException se){
         //Handle errors for JDBC
         se.printStackTrace();
      }catch(Exception e){
         //Handle errors for Class.forName
         e.printStackTrace();
      } finally{
         //finally block used to close resources
         try{
            if(statement !=null)
               statement.close();
         }catch(SQLException se2){
         }// nothing we can do
         try{
            if(connection !=null)
            connection.close();
         }catch(SQLException se){
            se.printStackTrace();
         }//end finally try
      } 
         
         
     }
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
