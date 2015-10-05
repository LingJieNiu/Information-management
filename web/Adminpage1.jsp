<%-- 
    Document   : Adminpage1
    Created on : Jun 21, 2015, 4:36:10 PM
    Author     : Ling
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>First</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js">
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">


<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script> 

   <script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

 <link href="Adminpage_CSS.css" rel="stylesheet" type="text/css"/>
	

	
	
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.16/angular.min.js"></script><!-- load angular -->
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.8/angular-ui-router.min.js"></script>
	
	
	<script src="http://d3js.org/d3.v3.min.js" charset="utf-8"></script>
 
  <script src="/scripts/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>

 


 

 
</head>

<body>

<div class="container" >


<nav class="navbar navbar-default">
  <div class="container-fluid">
  
  <div class="col-sm-3">
	 
  <div class="container-fluid">
  <div id="headerImg">
  <img src="image/Infra11.jpg" id="img1"   alt="img" />
  </div>


  
  
 </div> 
 </div>
  
 <div class="col-sm-7"> 
 <p id="firstword">Customized IT Infrastructure Monitoring and Facility Management System</p>
 </div>
  
  
<div class="col-sm-2" id="tag_contain">  

<span class="dropdown" id="tagHeader">

 

<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
<span class="glyphicon glyphicon-envelope" ></span>

<span class="caret"></span></a>
<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Action</a></li>
    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Another action</a></li>
   
  </ul>

</span>



<span class="dropdown" id="tagHeader">
<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
<span class="glyphicon glyphicon-th-list" ></span>
<span class="caret"></span></a>
<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">11</a></li>
    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">22</a></li>
   
  </ul>

</span>



<span class="dropdown" id="tagHeader">
<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
<span class="glyphicon glyphicon-bell" ></span>
<span class="caret"></span></a>

</span>


<span class="dropdown" id="tagHeader">
<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
<span class="glyphicon glyphicon-user" ></span>
<span class="caret"></span></a>

</span>

</li>
</div>

</nav>  
 
  
    



<div class="col-sm-3">

 
	<input ng-model="information" type="text" id="input" class="form-control" >
     
    <button class="btn btn-default" type="button" ng-click="searchData">
        <span class="glyphicon glyphicon-search" ></span>  </button>
	 
	   
       

	
	   
	   
	   
	   
<div class="bs-example">
    

<div class="btn-group-vertical" role="group"aria-label="...">

   
    
    
    
   <button class="btn btn-default" type="button">
        
      <span class="glyphicon glyphicon-home" ></span>   
        
        Home</button> 
    
    
    
    
    
    
    
    <form action="Assettype_Servlet" method="post"> 
   <div class="btn-group">
     <button class="btn btn-default dropdown-toggle"  data-toggle="dropdown" id="btnGroupVerticalDrop1"
             type="button" aria-expanded="false">
         <span class="glyphicon glyphicon-file" ></span> 
         Asset Type
         <span class="caret"></span>
         
     </button>
    
        <ul aria-labelledby="btnGroupVerticalDrop1" class="dropdown-menu" role="menu">
            
            <li>
                 <button type="submit" name="assettype"value="viewassettype"><span class="glyphicon glyphicon-list-alt" ></span>
                     View Asset Type</button>
            </li>
            
            <li >
               
               <a href="AddAssetType.jsp">    <span class="glyphicon glyphicon-plus-sign" ></span>
                  
                    Add Asset Type</a>
                
            </li>
           
            <li>
                <a href="DeleteAssetType.jsp"><span class="glyphicon glyphicon-trash" ></span>Delete Asset Type</a>
            </li>
            
             <li>
                <a href="EditAssetType.jsp"><span class="glyphicon glyphicon-edit" ></span>Edit Asset Type</a>
            </li>
            
        </ul>
    </div>  
    
    </form> 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    <div class="btn-group">
     <button class="btn btn-default dropdown-toggle"  data-toggle="dropdown" id="btnGroupVerticalDrop1"
             type="button" aria-expanded="false">
         <span class="glyphicon glyphicon-file" ></span> 
         Vendors
         <span class="caret"></span>
         
     </button>
    
        <ul aria-labelledby="btnGroupVerticalDrop1" class="dropdown-menu" role="menu">
            
            <li>
                <a href="#"><span class="glyphicon glyphicon-list-alt" ></span>View Vendors</a>
            </li>
            
            <li>
                <a href="#"><span class="glyphicon glyphicon-plus-sign" ></span>
                
                Add Vendors
                </a>
            </li>
           
            <li>
                <a href="#"><span class="glyphicon glyphicon-trash" ></span>Delete Vendors</a>
            </li>
            
             <li>
                <a href="#"><span class="glyphicon glyphicon-edit" ></span>Edit Vendors</a>
            </li>
            
        </ul>
    </div> 
   
    
    
    
    <div class="btn-group">
     <button class="btn btn-default dropdown-toggle"  data-toggle="dropdown" id="btnGroupVerticalDrop2"
             type="button" aria-expanded="false">
        
    <span class="glyphicon glyphicon-file" ></span>      
          Asset <span class="caret"></span>
     </button>
    
        <ul aria-labelledby="btnGroupVerticalDrop2" class="dropdown-menu" role="menu">
            <li>
                <a href="#"><span class="glyphicon glyphicon-list-alt" ></span>View Asset</a>
            </li>
            
            <li>
                <a href="#"><span class="glyphicon glyphicon-plus-sign" ></span>
                
                Add Asset
                </a>
            </li>
           
            <li>
                <a href="#"><span class="glyphicon glyphicon-trash" ></span>Delete Asset</a>
            </li>
            
             <li>
                <a href="#"><span class="glyphicon glyphicon-edit" ></span>Edit Asset</a>
            </li>
        </ul>
    </div> 
    
    
    
    
  

 
</div>
    
</div>


    
    

        
        
        
</div>
    






<div class="col-sm-9">

<div  class="jumbotron">
<div class="row">


<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" >
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>
 
  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img id="image_carousel"src="image/databases.jpg" alt="...">
     
      <div class="carousel-caption">
          <h3>database</h3>
      </div>
    </div>
    <div class="item">
      <img id="image_carousel" src="image/database2.jpg" alt="...">
      <div class="carousel-caption">
          <h3>database</h3>
      </div>
    </div>
    <div class="item">
      <img src="image/database3.jpg" id="image_carousel" alt="...">
      <div class="carousel-caption">
          <h3>database search</h3>
      </div>
    </div>
  </div>
 
  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>
</div> <!-- Carousel -->




</div>
</div>

</div>




</div> 
    
  
    
    
 
  </body>

</html>
    



