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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ling
 */
public class Assettype_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
          Connection connection = null;
          Statement statement = null;  
          ResultSet rscontent=null;
           PreparedStatement ps=null;
       
         String identify=request.getParameter("assettype");
        
         
         
           
        if(identify.equals("viewassettype")) {  
            
         
           
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
         
         
         rscontent = 
                    statement.executeQuery("select AssetID,AssetName,Description from assettype");
         
         
        
   while( rscontent.next())
{
  
    ID.add(rscontent.getString(1));
  
   Name.add(rscontent.getString(2));
   Description.add(rscontent.getString(3));
}
 /*        
  ArrayList<String>AssetIDfromSQL=new ArrayList<String>();
  ArrayList<String>AssetNamefromSQL=new ArrayList<String>();
  ArrayList<String>AssetDescriptionfromSQL=new ArrayList<String>();
  */
  
   request.setAttribute("AssetIDfromSQL", ID);
   request.setAttribute("AssetNamefromSQL", Name);
   request.setAttribute("AssetDescriptionfromSQL", Description);
   
    RequestDispatcher reqDispatcher = request.getRequestDispatcher("/ViewAssetType.jsp");
        reqDispatcher.forward(request,response);
   
   
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
   
   
   
        }      
      else if(identify.equals("deleteassettype")){
           
            
            try{
           
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded from delete");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/capstone", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         
         
         
         
        String ID= request.getParameter("AssetID1");
         
        String comment="delete from assettype where AssetID='" +ID+"'";
         System.out.println("The comment is :"+comment);
        
        
          statement.executeUpdate(comment);
         
    RequestDispatcher reqDispatcher = request.getRequestDispatcher("/Adminpage1.jsp");
        reqDispatcher.forward(request,response);
   
   
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
   
            
            
        }
        
        
      else if(identify.equals("addassettype")){
          
          String AssetID=request.getParameter("AssetID");
          String AssetName=request.getParameter("AssetName");
          String Description=request.getParameter("Description");
          
          
         try{  
        
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/capstone", "root", "fuzhou");

         System.out.println("Database connected");
         
         
         
         // String sql = "INSERT INTO questions(Context,Choice1,Choice2,Choice3,Choice4) values(?,?,?,?,?)";
         ps = (PreparedStatement)connection.prepareStatement("insert into assettype (AssetID,AssetName,Description) values(?,?,?)");
         
        ps.setString(1,AssetID);
          ps.setString(2,AssetName);        
          ps.setString(3,Description);
        
          
       int i= ps.executeUpdate();
       
          connection.commit(); 
          String msg=" ";
          if(i!=0){  
            msg="Record has been inserted";
            out.println("<font size='6' color=blue>" + msg + "</font>");  


          }  
          else{  
            msg="failed to insert the data";
            out.println("<font size='6' color=blue>" + msg + "</font>");
           }  
          ps.close();
        }  
        catch (Exception e){  
          out.println(e);  
        }  
          
          RequestDispatcher reqDispatcher = request.getRequestDispatcher("/AddAssetType.jsp");
        reqDispatcher.forward(request,response);
          
          
          
          
      }  
        
        
        
       
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
        processRequest(request, response);
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
        processRequest(request, response);
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
