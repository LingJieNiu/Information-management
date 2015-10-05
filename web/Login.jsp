<%-- 
    Document   : index
    Created on : Jun 17, 2015, 6:44:28 PM
    Author     : LingJie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        
    <link href="Login_CSS.css" rel="stylesheet">
    
        <title>Login Page</title>
    </head>
    
    
      
        
       <body>
           
          <script language="JavaScript">
    function validate(form)
    {
        if (form.id.value === "")
        {
            alert("Please fill in your id");
            form.firstName.focus();
        }
       
        else if (form.password.value === "")
        {
            alert("Please fill in your password");
            form.emailAddress.focus();
        }
        else
        {
            form.submit();
        }
    }
    
    
    
    function doreset(){
        
        document.getElementsByName("id").reset();
         document.getElementsByName("password").reset();
    }
    
</script>      
           
           
           
           
           
           
           <div id="image1" ><img id="imageinside"src="image/Infra11.jpg" alt=""/></div>
           
            
            <div id="left">
                <p>Capstone Course by:</p>
                     <p>Shravyna</p>
                     <p>Rohini Elthury</p>
                     <p>Lingjie</p>
                     <p>Raviteja</p>
                     <p>Manasa</p>
                     <p>Anand Patil</p>
                     <p>Jithedhar</p>
                      <p>Daniel</p>
                 </div>  
           
             <div id="container">
                
                  
                 
           <div id="right">
           <div id="wrappertop"></div>
           <div id="wrapper">
               <div id="content">
                   <div id="header">
             
                       
                       <p><img src="image/002.png"id="image2">Customized IT Infrastructure Monitoring and Facility 
                            Management System</p>
                <!--        
                        <h1 id="stream"><a href="http://www.twitch.tv/rleeson85">WATCH THE STREAM</a></div>
                        <h1 id="dice"><a href="dice.html">DICE GAME</a></h1>
                
                -->
                
           </div>
                   <div id="darkbanner" class="banner320">
                       <h2>Login</h2>
                   </div>
                   <div id="darkbannerwrap"></div>
                   
                   
                   
                 <form action="Login_Servlet" method="post" >
            
                             
           <div id="content2"> 
            <table cellspacing="5" border="0">
              
                
                <tr>
                    <td align="right" id="id">User ID:</td>
                    <td><input type="text" name="id"></td>
                </tr>
                
                
                <tr>
                    <td align="right" id="second">Password:</td>
                    <td><input type="text" name="password"></td>
                </tr>
               
                <tr>
                    <td></td>
                    <td><br>
                        <input type="submit" value="Submit"id="botton" onClick="validate(this.form)">
               
                    
                    | 
                     <button type="button" id="button1"onClick="doreset()">Reset</button>
                       
            </td>
                
                </tr>
            </table>
              </div>  
        </form>
               </div> 
           </div>
           </div>
             </div>     
        </body>

        
        
    
</html>
