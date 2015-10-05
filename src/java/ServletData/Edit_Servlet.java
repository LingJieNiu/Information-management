package ServletData;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class Edit_Servlet extends HttpServlet {

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
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
         Connection connection = null;
          Statement statement = null;  
          ResultSet rscontent=null;
           PreparedStatement ps=null;
       
         String identify=request.getParameter("assettype");
        
        
            
         
           
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
   
   
   String test="test";
 /*        
  ArrayList<String>AssetIDfromSQL=new ArrayList<String>();
  ArrayList<String>AssetNamefromSQL=new ArrayList<String>();
  ArrayList<String>AssetDescriptionfromSQL=new ArrayList<String>();
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
