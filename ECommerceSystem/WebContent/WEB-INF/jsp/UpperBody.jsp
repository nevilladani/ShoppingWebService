<body class="root61">

	  				
	<div class="w ld" id="toppanel">
		<div id="sidepanel" class="hide" style="right: 70.5px; display: none;">
		</div>
	</div>
	<br>
	<br>
	<script type="text/javascript" src="../js/base-2011.js" charset="gb2312">
	</script>
	

	<div id="shortcut-2013">
		<div class="w">
			<ul class="fl lh">
				<li class="fore1 ld"><b></b>
				<!-- <a
					 href="javascript:addToFavorite()" rel="nofollow">Add to favourite</a> -->
					Add to favourites
				</li>
			</ul>
			<ul class="fr lh">
			
	
				
			
				
				<li >Welcome <%= session.getAttribute( "theName" ) %>Å<span>
				</span>
				</li>
				<li ><a href="http://localhost:8080/ECommerceSystem/logout.jsp" >Logout</a><span>
				</span>
				</li>
				
			</ul>
			<span class="clr"></span>
		</div>
	</div>
	<!--shortcut end-->
	
	
	<div id="o-header-2013">
		<div class="w" id="header-2013">
			<div id="logo-2013" class="ld">
				<a href="" hidefocus="true"><img
					src="../image/logo.png" width="260"
					height="60" alt="web coders">
				</a>
			</div>
			<!--logo end-->
			<form action="SearchServlet" method ="post" style = "margin-top: 20px;">
			<div id="search-2013">
				<div >     <!-- class="i-search ld" -->
					<ul id="shelper" class="hide">
					</ul>
					<div class="form">
					
						<input type="submit" value="Search" class="button" style = "background-color:#424242 "
							onclick="">
							<input type= "text" name="searchSomething" style="color:blue; margin-left:20px; border-style:solid;
border-width:5px; border-color: #424242;text-align:center; color:#424242; width: 400px"/>
					</div>
				</div>
			</div>
			</form>
			<!--search end-->
			

			<div id="settleup-2013">
				<dl>
					<dt class="ld">
						<a href="http://localhost:8080/ECommerceSystem/web.controller/ListCartServlet" >Pay</a>
					</dt>
				</dl>
			</div>
			<!--settleup end-->
		</div>
		<!--header end-->
		
		<div class="w" style="background-color:#A4A4A4 ">
			<div id="nav-2013" style="background-color:#A4A4A4 ">
				<div id="categorys-2013" class="" style="background-color:#A4A4A4 ">
					<div class="mt ld" style="background-color:#A4A4A4 ">
						<h2>
							<a href="">All Products
							</a>
						</h2>
					</div>
					
				</div>
			
				<ul id="navitems-2013" style="background-color:#A4A4A4 ">
					<li class="fore1" id="nav-home" style="background-color:#424242 "><a href="http://localhost:8080/ECommerceSystem//web.controller/ListProductServlet">Home</a>
					</li>
		
				</ul>
			</div>
		</div>
	</div>