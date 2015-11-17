<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="_csrf" content="${_csrf.token}"/>
	<!-- default header name is X-CSRF-TOKEN -->
	<meta name="_csrf_header" content="${_csrf.headerName}"/>
	<!-- ... -->
  <title>TMS | New Member Form</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.5 -->
  <!--Favicon Image -->
  <link rel="shortcut icon" href="<c:url value="assets/dist/img/favicon.ico"/>"/>
  <link rel="stylesheet" href="<c:url value="assets/bootstrap/css/bootstrap.min.css"/>"/>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<c:url value="assets/dist/css/AdminLTE.min.css"/>">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="<c:url value="assets/dist/css/skins/_all-skins.min.css"/>">
  <!-- iCheck -->
  <link rel="stylesheet" href="<c:url value="assets/plugins/iCheck/flat/blue.css"/>">
  <!-- Morris chart -->
  <link rel="stylesheet" href="<c:url value="assets/plugins/morris/morris.css"/>">
  <!-- jvectormap -->
  <link rel="stylesheet" href="<c:url value="assets/plugins/jvectormap/jquery-jvectormap-1.2.2.css"/>">
  <!-- Date Picker -->
  <link rel="stylesheet" href="<c:url value="assets/plugins/datepicker/datepicker3.css"/>">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="<c:url value="assets/plugins/daterangepicker/daterangepicker-bs3.css"/>">
  <!-- bootstrap wysihtml5 - text editor -->
  <link rel="stylesheet" href="<c:url value="assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css"/>">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
 
  <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.3.min.js"></script>
  <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.0-beta.1/angular.min.js"></script>
  <script> 
   // $(function(){
    //$("#topSideFrame").load("<c:url value='assets/topSideFrame.jsp'/>"); 
    //console.log(principal);
   //});
   </script> 
   <style>
   .clearAll{
   clear: both;
   }
   </style>
</head>
<body class="hold-transition skin-blue sidebar-mini" ng-app='Tms'  ng-controller='MasterController'>
<sec:authorize access="hasRole('ANONYMOUS')">
	<c:redirect url="/loginPage"/>
</sec:authorize>

<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="index2.html" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>TMS</b></span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>TMS</b>Panel</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>

      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          
          <!-- User Account: style can be found in dropdown.less -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="<c:url value="assets/dist/img/ramakrishna.jpg"/>" class="user-image" alt="User Image">
              <span class="hidden-xs"><sec:authentication property="principal.employeeUserName"/></span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
                <img src="<c:url value="assets/dist/img/ramakrishna.jpg"/>" class="img-circle" alt="User Image">

                <p>
                 <sec:authentication property="principal.employeeUserName"/>
                  <small>Member since July. 2013</small>
                </p>
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="#" class="btn btn-default btn-flat">Profile</a>
                </div>
                <div class="pull-right">
                	<c:url value="/logout" var="Signout" />
	               <form id="logout" action="${Signout}" method="post" >
					  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					</form>
					<c:if test="${pageContext.request.userPrincipal.name != null}">
					    <a class="btn btn-default btn-flat" href="javascript:document.getElementById('logout').submit()">Logout</a>
					</c:if>
                  
                </div>
              </li>
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button -->
          <li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>
        </ul>
      </div>
    </nav>
	
  </header>
  <input type="hidden" value="<sec:authentication property="principal.accountId"/>" id="employeeId">
  <div id='topSideFrame' ng-include="'assets/topSideFrame.html'"> </div>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Dashboard
        <small>Control panel</small>
      </h1>
    </section>

    <!-- Main content -->
    <section class="content">
      <!-- Small boxes (Stat box) -->
      <div class="row">
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-aqua">
            <div class="inner">
              <p>You are in</p>
			  <h3>3</h3>

              <p>Teams</p>
            </div>
            <div class="icon">
              <i class="ion ion-person-stalker"></i>
            </div>
            <a href="#" class="small-box-footer">Team info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-green">
            <div class="inner">
              <p>You Lead</p>
              <h3>1</h3>

              <p>Team</p>
            </div>
            <div class="icon">
              <i class="ion ion-ribbon-b"></i>
            </div>
            <a href="#" class="small-box-footer">More info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-yellow">
            <div class="inner">
              <p>You Work for</p>
              <h3>2</h3>

              <p>Clients</p>
            </div>
            <div class="icon">
              <i class="ion ion-thumbsup"></i>
            </div>
            <a href="#" class="small-box-footer">More info <i class="fa fa-arrow-circle-right"></i></a>
          </div>
        </div>
        <!-- ./col -->

        <!-- ./col -->
      </div>
      <!-- /.row -->
      <div class="row">
      	<section ng-show="showNewMember()" class="col-lg-12 connectedSortable">
      	<div class="box box-success">
            <div class="box-header">
            	<i class="ion ion-person-add"></i>
			   <h3 class="box-title">New Member</h3>
			    <div class="box-body">
			    	<form name="newMemberForm" ng-submit="submitMemberForm()" enctype="multipart/form-data">
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<input type="text" name="firstName" class="form-control" placeholder="First Name*" ng-model="newMember.firstName" ng-pattern="/^[a-zA-Z]+$/" required>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<input type="text" name="middleName" class="form-control" placeholder="Middle Name" ng-model="newMember.middleName" ng-pattern="/^[a-zA-Z]+$/">
		               		 </div>
					    </div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<input type="text" name="lastName" class="form-control" placeholder="Last Name*" ng-model="newMember.lastName" ng-pattern="/^[a-zA-Z]+$/" required>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
								<div ng-show="newMemberForm.$submitted || newMemberForm.firstName.$touched">
							      <span style="color:red" ng-show="newMemberForm.firstName.$error.required">Please Fill First Name.</span>
							      <span style="color:red" ng-show="newMemberForm.firstName.$error.pattern">Only letters are Allowed.</span>
							    </div>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<div ng-show="newMemberForm.$submitted || newMemberForm.middleName.$touched">
		                  		 <span style="color: red" ng-show="newMember.middleName.$error.pattern">Only letters are Allowed.</span>
		                  		</div>
		               		 </div>
					    </div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		 <span style="color:red" ng-show="newMemberForm.lastName.$submitted || newMemberForm.lastName.$touched">
									<span ng-show="newMemberForm.lastName.$error.required">Last Name is required.</span>
									<span ng-show="newMemberForm.lastName.$error.pattern">Only letters are allowed.</span>
								</span>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<input type="text" name="userName" class="form-control" placeholder="User Name*" ng-model="newMember.employeeUserName" ng-minlength="5" ng-maxlength="15"  required>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<input type="email" name="officialMail" class="form-control" placeholder="Official MailID*" ng-model="newMember.officialEmailID" required email>
		               		 </div>
					    </div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<input type="email" name="permanentMail" class="form-control" placeholder="Personal MailID" ng-model="newMember.permanentEmailID" required email>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newMemberForm.userName.$submitted || newMemberForm.userName.$touched">
									<span ng-show="newMemberForm.userName.$error.required">UserName is required.</span>
									<span ng-show="newMemberForm.userName.$error.minlength">UserName Must have length of 5.</span>
									<span ng-show="newMemberForm.userName.$error.maxlength">Max Length of UserName allowed 15.</span>
								</span>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newMemberForm.officialMail.$submitted || newMemberForm.officialMail.$touched">
		                  			<span ng-show="newMemberForm.officialMail.$error.required">OfficialMail Id is required.</span>
		                  			<span ng-show="newMemberForm.officialMail.$error.email">Email ID should be valid.</span> 
		                  		</span>
		               		 </div>
					    </div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newMemberForm.permanentMail.$submitted || newMemberForm.permanentMail.$touched">
		                  			<span ng-show="newMemberForm.permanentMail.$error.email">Email ID should be valid.</span>
		                  		</span>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<input type="password" name="password" class="form-control" placeholder="Password*" ng-model="newMember.password" ng-minlength="5" ng-maxlength="12" required>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<input type="text" max="10" name="homePhone" class="form-control" placeholder="Home Contact Number" ng-model="newMember.homeNumber" ng-pattern="/^\d{10}$/">
		               		 </div>
					    </div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<input type="text" max="10" name="officialPhone" class="form-control" placeholder="Official Contact Number*" ng-model="newMember.officeNumber" ng-pattern="/^\d{10}$/" ng-minlength="10" ng-maxlength="10" required>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newMemberForm.password.$submitted ||newMemberForm.password.$touched">
		                  		 	<span ng-show="newMemberForm.password.$error.required">Password Required</span>
		                  		 	<span ng-show="newMemberForm.password.$error.minlength">Password Must be of length 5</span>
		                  		 	<span ng-show="newMemberForm.password.$error.maxlength">Password Should not exceed length 12</span>
		                  		</span>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newMemberForm.homePhone.$submitted || newMemberForm.homePhone.$touched">
		                  			<span ng-show="newMemberForm.homePhone.$error.pattern">Phone number is invalid.</span>
		                  		</span>
		               		 </div>
					    </div>
					    <div class="col-md-4">
					    	<div class="form-group">
					    		<span style="color:red" ng-show="newMemberForm.officialPhone.$submitted || newMemberForm.officialPhone.$touched">
					    			<span ng-show="newMemberForm.officialPhone.$error.required">Official Number is required.</span>
					    			<span ng-show="newMemberForm.officialPhone.$error.pattern">Official Phone number is invalid.</span>
					    		</span>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-5">
					    	<div class="form-group">
		                  		<textarea name="presentAddress" class="form-control" placeholder="Present Address*"  ng-model="newMember.presentAdd" required></textarea>
		               		 </div>
					    </div>
					    <div class="col-md-6">
					    	<div class="form-group">
		                  		<textarea name="permanentAddress" class="form-control" placeholder="Permanent Address*" ng-model="newMember.permanentAdd"  required></textarea>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		Present Address same as permanent Address: <input type="checkbox" ng-model="bothSame" name="bothSame"  ng-click="makeBothSame()">
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-5">
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newMemberForm.presentAddress.$submitted || newMemberForm.presentAddress.$touched">
					    			<span ng-show="newMemberForm.presentAddress.$error.required">Present Address is required.</span>
					    		</span>
		               		 </div>
					    </div>
					    <div class="col-md-6">
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newMemberForm.permanentAddress.$submitted || newMemberForm.permanentAddress.$touched">
					    			<span ng-show="newMemberForm.permanentAddress.$error.required">Present Address is required.</span>
					    		</span>
		               		 </div>
					    </div>
					    
					    <div class="clearAll"></div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<input type="text" name="skills" class="form-control" placeholder="Skills*" ng-model="newMember.skills" required>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newMemberForm.skills.$submitted || newMemberForm.skills.$touched">
					    			<span ng-show="newMemberForm.skills.$error.required">Skills Are Required.</span>
					    		</span>
		               		 </div>
					    </div>
					    <input type="hidden" id='csrf' name="${_csrf.parameterName}" value="${_csrf.token}" />
					  
					    <div class="clearAll"></div>
					     <div class="col-md-3"></div>
					     <div class="col-md-4"><button type="submit" class="btn btn-default pull-right">Add Profile</button></div>
					     <div class="col-md-4"></div>
					     
					     <div class="clearAll"></div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<span style="color:red"> {{error}}{{success}}</span>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
				     </form>
			    </div>
           	 </div>
          </div>
      	</section>
      	<section ng-show="showNewTeamMember()" class="col-lg-12 connectedSortable">
      		<div class="box box-success">
            <div class="box-header">
            	<i class="ion ion-person-add"></i>
			   <h3 class="box-title">New Team Member</h3>
			    <div class="box-body">
			    	<form name="newTeamMemberForm" ng-submit="submitTeamMemberForm()" enctype="multipart/form-data">
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		Project List:&nbsp;&nbsp;<select  name="selectedProject" ng-model="newTeamMember.selectedProject"  ng-change='selctedProject(newTeamMember.selectedProject)' required>
					    		 <option ng-repeat="p in projects" value={{p.projectId}}>{{p.projectName}}</option>	
					    		</select>
		               		 </div>
		               	</div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<div class="form-group">
		                  		Member List:&nbsp;&nbsp;<select  name="selectedMember" ng-model="newTeamMember.selectedMember"  ng-change='selctedProject(newTeamMember.selectedMember)' required>
					    		 <option ng-repeat="m in members" value={{m.accountId}}>{{m.employeeUserName}}</option>	
					    		</select>
		               		 </div>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
								<div ng-show="newTeamMemberForm.$submitted || newTeamMemberForm.selectedProject.$touched">
							      <span style="color:red" ng-show="newTeamMember.selectedProject == 0">Please Select a Project.</span>
							    </div>
		               		 </div>
		               	</div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<div ng-show="newTeamMemberForm.$submitted || newTeamMemberForm.selectedMember.$touched">
		                  		 <span style="color: red" ng-show="newTeamMember.selectedMember == 0">Please Select a Member.</span>
		                  		</div>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <input type="hidden" id='csrf' name="${_csrf.parameterName}" value="${_csrf.token}" />
					    <div class="clearAll"></div>
					     <div class="col-md-3"></div>
					     <div class="col-md-4"><button type="submit" class="btn btn-default pull-right">Assign Project</button></div>
					     <div class="col-md-4"></div>
					     
				     </form>
			    </div>
           	 </div>
          </div>
      	</section>
      	<section ng-show="showNewProject()" class="col-lg-12 connectedSortable">
      		<div class="box box-success">
            <div class="box-header">
            	<i class="ion ion-monitor"></i>
			   <h3 class="box-title">New Project</h3>
			    <div class="box-body">
			    	<form name="newProjectForm" ng-submit="submitNewProjectForm()" >
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<input type="text" name="projectName" class="form-control" placeholder="project Name" ng-model="newProject.projectName" required>
		               		 </div>
					    </div>
					    <div class="col-md-2">
					    	<div class="form-group">
		                  		
		               		 </div>
					    </div>
					    <div class="col-md-6">
					    	<div class="form-group">
					    	Client:
					    		<select  name="selectedClient" ng-model="newProject.selectedClient"  ng-change='selctedClient(newProject.selectedClient)' required>
					    		 <option ng-repeat="c in clients" value={{c.clientId}}>{{c.clientName}}</option>	
					    		</select>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-6"> 
					    	<div class="form-group">
								<div ng-show="newProjectForm.$submitted || newProjectForm.projectName.$touched">
							      <span style="color:red" ng-show="newProjectForm.projectName.$error.required">Please Fill Name of Project.</span>
							    </div>
		               		 </div>
		               	</div>
		               	<!-- -->
		               	<div class="col-md-4"> 
					    	<div class="form-group">
								<div ng-show="newProjectForm.$submitted || newProjectForm.selectedClient.$touched">
							      <span style="color:red" ng-show="newProject.selectedClient == 0" >Please Select Client.</span>
							    </div>
		               		 </div>
		               	</div> 
		               	<div class="clearAll"></div>
					    <div class="col-md-6">
					    	<div class="form-group">
					    		<textarea name="details" class="form-control" placeholder="Project Details*"  ng-model="newProject.details" required></textarea>
		               		 </div>
					    </div>
					    <div class="col-md-6">
					    	<div class="form-group">
					    		<textarea name="description" class="form-control" placeholder="Project Description*"  ng-model="newProject.description" required></textarea>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-6"> 
					    	<div class="form-group">
								<div ng-show="newProjectForm.$submitted || newProjectForm.details.$touched">
							      <span style="color:red" ng-show="newProjectForm.details.$error.required">Please Fill Details of Project.</span>
							    </div>
		               		 </div>
		               	</div>
					    <div class="col-md-6">
					    	<div class="form-group">
		                  		<div ng-show="newProjectForm.$submitted || newProjectForm.description.$touched">
		                  		 <span style="color: red" ng-show="newProjectForm.description.$error.required">Please Fill Project Description.</span>
		                  		</div>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<input type="text" name="serverTechnologies" class="form-control" placeholder="Server Technologies*" ng-model="newProject.serverTechnologies"  required>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<input type="text" name="uiTechnologies" class="form-control" placeholder="UI Technologies*" ng-model="newProject.uiTechnologies" required>
		               		 </div>
					    </div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<input type="text" name="database" class="form-control" placeholder="Database" ng-model="newProject.database">
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newProjectForm.$submitted || newProjectForm.serverTechnologies.$touched">
									<span ng-show="newProjectForm.serverTechnologies.$error.required">Server Technologies is required.</span>
								</span>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newProjectForm.$submitted || newProjectForm.uiTechnologies.$touched">
									<span ng-show="newProjectForm.uiTechnologies.$error.required">UI Technologies is required.</span>
								</span>
		               		 </div>
					    </div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  	
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		Start Date:&nbsp;<input type="date" name="startDate" class="form-control" placeholder="Start Date*" ng-model="newProject.startDate" ng-change='selctedStartDate(newProject.startDate)'  placeholder="dd-MM-yyyy" min="newProject.startDate" max="31-12-2017" required />
		               		 </div>
		               	</div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		Delivery Date:&nbsp;<input type="date" name="deliveryDate" class="form-control" placeholder="Delivery Date*" ng-model="newProject.deliveryDate"  placeholder="dd-MM-yyyy" min="newProject.startDate" max="31-12-2021" required />
		               		 </div>
					    </div>
					    
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newProjectForm.startDate.$submitted ||newProjectForm.startDate.$touched">
		                  		 	<span ng-show="newProjectForm.startDate.$error.required">Start Date Required.</span>
		                  		</span>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newProjectForm.deliveryDate.$submitted ||newProjectForm.deliveryDate.$touched">
		                  		 	<span ng-show="newProjectForm.deliveryDate.$error.required">Delivery Date Required.</span>
		                  		</span>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    
					    <input type="hidden" id='csrf' name="${_csrf.parameterName}" value="${_csrf.token}" />
					    <div class="clearAll"></div>	    
					   <div class="col-md-3"></div>
					     <div class="col-md-4"><button type="submit" class="btn btn-default pull-right">Add Project</button></div>
					     <div class="col-md-4"></div>
					     
				     </form>
			    </div>
           	 </div>
          </div>
      	</section>
      	<section ng-show="showNewClient()" class="col-lg-12 connectedSortable">
      		<div class="box box-success">
            <div class="box-header">
            	<i class="ion ion-monitor"></i>
			   <h3 class="box-title">New Client</h3>
			    <div class="box-body">
			    	<form name="newClientForm" ng-submit="submitNewClientForm()" >
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<input type="text" name="clientName" class="form-control" placeholder="project Name" ng-model="newClient.clientName" required>
		               		 </div>
					    </div>
					    <div class="col-md-2">
					    	<div class="form-group">
		                  		
		               		 </div>
					    </div>
					    <div class="col-md-6">
					    	<div class="form-group">
					    		<input type="text" name="location" class="form-control" placeholder="Location" ng-model="newClient.location" required>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-6"> 
					    	<div class="form-group">
								<div ng-show="newProjectForm.$submitted || newProjectForm.projectName.$touched">
							      <span style="color:red" ng-show="newProjectForm.projectName.$error.required">Please Fill Name of Project.</span>
							    </div>
		               		 </div>
		               	</div>
		               	<!-- -->
		               	<div class="col-md-4"> 
					    	<div class="form-group">
								<div ng-show="newProjectForm.$submitted || newProjectForm.selectedClient.$touched">
							      <span style="color:red" ng-show="newProject.selectedClient == 0" >Please Select Client.</span>
							    </div>
		               		 </div>
		               	</div> 
		               	<div class="clearAll"></div>
					    <div class="col-md-6">
					    	<div class="form-group">
					    		<textarea name="details" class="form-control" placeholder="Project Details*"  ng-model="newProject.details" required></textarea>
		               		 </div>
					    </div>
					    <div class="col-md-6">
					    	<div class="form-group">
					    		<textarea name="description" class="form-control" placeholder="Project Description*"  ng-model="newProject.description" required></textarea>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-6"> 
					    	<div class="form-group">
								<div ng-show="newProjectForm.$submitted || newProjectForm.details.$touched">
							      <span style="color:red" ng-show="newProjectForm.details.$error.required">Please Fill Details of Project.</span>
							    </div>
		               		 </div>
		               	</div>
					    <div class="col-md-6">
					    	<div class="form-group">
		                  		<div ng-show="newProjectForm.$submitted || newProjectForm.description.$touched">
		                  		 <span style="color: red" ng-show="newProjectForm.description.$error.required">Please Fill Project Description.</span>
		                  		</div>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<input type="text" name="serverTechnologies" class="form-control" placeholder="Server Technologies*" ng-model="newProject.serverTechnologies"  required>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<input type="text" name="uiTechnologies" class="form-control" placeholder="UI Technologies*" ng-model="newProject.uiTechnologies" required>
		               		 </div>
					    </div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		<input type="text" name="database" class="form-control" placeholder="Database" ng-model="newProject.database">
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newProjectForm.$submitted || newProjectForm.serverTechnologies.$touched">
									<span ng-show="newProjectForm.serverTechnologies.$error.required">Server Technologies is required.</span>
								</span>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newProjectForm.$submitted || newProjectForm.uiTechnologies.$touched">
									<span ng-show="newProjectForm.uiTechnologies.$error.required">UI Technologies is required.</span>
								</span>
		               		 </div>
					    </div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  	
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		Start Date:&nbsp;<input type="date" name="startDate" class="form-control" placeholder="Start Date*" ng-model="newProject.startDate" ng-change='selctedStartDate(newProject.startDate)'  placeholder="dd-MM-yyyy" min="newProject.startDate" max="31-12-2017" required />
		               		 </div>
		               	</div>
					    <div class="col-md-4">
					    	<div class="form-group">
		                  		Delivery Date:&nbsp;<input type="date" name="deliveryDate" class="form-control" placeholder="Delivery Date*" ng-model="newProject.deliveryDate"  placeholder="dd-MM-yyyy" min="newProject.startDate" max="31-12-2021" required />
		               		 </div>
					    </div>
					    
					    <div class="clearAll"></div>
					    <div class="col-md-4"> 
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newProjectForm.startDate.$submitted ||newProjectForm.startDate.$touched">
		                  		 	<span ng-show="newProjectForm.startDate.$error.required">Start Date Required.</span>
		                  		</span>
		               		 </div>
		               	</div>
					    <div class="col-md-3">
					    	<div class="form-group">
		                  		<span style="color:red" ng-show="newProjectForm.deliveryDate.$submitted ||newProjectForm.deliveryDate.$touched">
		                  		 	<span ng-show="newProjectForm.deliveryDate.$error.required">Delivery Date Required.</span>
		                  		</span>
		               		 </div>
					    </div>
					    <div class="clearAll"></div>
					    
					    <input type="hidden" id='csrf' name="${_csrf.parameterName}" value="${_csrf.token}" />
					    <div class="clearAll"></div>	    
					   <div class="col-md-3"></div>
					     <div class="col-md-4"><button type="submit" class="btn btn-default pull-right">Add Project</button></div>
					     <div class="col-md-4"></div>
					     
				     </form>
			    </div>
           	 </div>
          </div>
      		
      	</section>
      </div>
      <!-- Main row -->
      <div class="row">
        <!-- Left col -->
        <section class="col-lg-7 connectedSortable">
         <!-- TO DO List -->
          <div class="box box-primary">
            <div class="box-header">
              <i class="ion ion-clipboard"></i>

              <h3 class="box-title">Task List</h3>

              <div class="box-tools pull-right">
                <ul class="pagination pagination-sm inline">
                  <li><a href="#">&laquo;</a></li>
                  <li><a href="#">1</a></li>
                  <li><a href="#">2</a></li>
                  <li><a href="#">3</a></li>
                  <li><a href="#">&raquo;</a></li>
                </ul>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <ul class="todo-list">
                <li>
                  <!-- drag handle -->
                      <span class="handle">
                        <i class="fa fa-ellipsis-v"></i>
                        <i class="fa fa-ellipsis-v"></i>
                      </span>
                  <!-- checkbox -->
                  <input type="checkbox" value="" name="">
                  <!-- todo text -->
                  <span class="text">Design a nice theme</span>
                  <!-- Emphasis label -->
                  <small class="label label-danger"><i class="fa fa-clock-o"></i> 2 mins</small>
                  <!-- General tools such as edit or delete-->
                  <div class="tools">
                    <i class="fa fa-edit"></i>
                    <i class="fa fa-trash-o"></i>
                  </div>
                </li>
                <li>
                      <span class="handle">
                        <i class="fa fa-ellipsis-v"></i>
                        <i class="fa fa-ellipsis-v"></i>
                      </span>
                  <input type="checkbox" value="" name="">
                  <span class="text">Make the theme responsive</span>
                  <small class="label label-info"><i class="fa fa-clock-o"></i> 4 hours</small>
                  <div class="tools">
                    <i class="fa fa-edit"></i>
                    <i class="fa fa-trash-o"></i>
                  </div>
                </li>
                <li>
                      <span class="handle">
                        <i class="fa fa-ellipsis-v"></i>
                        <i class="fa fa-ellipsis-v"></i>
                      </span>
                  <input type="checkbox" value="" name="">
                  <span class="text">Let theme shine like a star</span>
                  <small class="label label-warning"><i class="fa fa-clock-o"></i> 1 day</small>
                  <div class="tools">
                    <i class="fa fa-edit"></i>
                    <i class="fa fa-trash-o"></i>
                  </div>
                </li>
                <li>
                      <span class="handle">
                        <i class="fa fa-ellipsis-v"></i>
                        <i class="fa fa-ellipsis-v"></i>
                      </span>
                  <input type="checkbox" value="" name="">
                  <span class="text">Let theme shine like a star</span>
                  <small class="label label-success"><i class="fa fa-clock-o"></i> 3 days</small>
                  <div class="tools">
                    <i class="fa fa-edit"></i>
                    <i class="fa fa-trash-o"></i>
                  </div>
                </li>
                <li>
                      <span class="handle">
                        <i class="fa fa-ellipsis-v"></i>
                        <i class="fa fa-ellipsis-v"></i>
                      </span>
                  <input type="checkbox" value="" name="">
                  <span class="text">Check your messages and notifications</span>
                  <small class="label label-primary"><i class="fa fa-clock-o"></i> 1 week</small>
                  <div class="tools">
                    <i class="fa fa-edit"></i>
                    <i class="fa fa-trash-o"></i>
                  </div>
                </li>
                <li>
                      <span class="handle">
                        <i class="fa fa-ellipsis-v"></i>
                        <i class="fa fa-ellipsis-v"></i>
                      </span>
                  <input type="checkbox" value="" name="">
                  <span class="text">Let theme shine like a star</span>
                  <small class="label label-default"><i class="fa fa-clock-o"></i> 1 month</small>
                  <div class="tools">
                    <i class="fa fa-edit"></i>
                    <i class="fa fa-trash-o"></i>
                  </div>
                </li>
              </ul>
            </div>
            <!-- /.box-body <i class="fa fa-plus"></i>-->
            <div class="box-footer clearfix no-border">
              <button type="button" class="btn btn-default pull-right"> Finish</button>
            </div>
          </div>
          <!-- /.box -->
		</section>
        <!-- /.Left col -->
        <!-- right col (We are only adding the ID to make the widgets sortable)-->
        <section class="col-lg-5 connectedSortable">
        	<!-- quick email widget -->
			 <div class="box box-info">
            <div class="box-header">
              <i class="fa fa-envelope"></i>

              <h3 class="box-title">Quick Email</h3>
              <!-- /. tools -->
            </div>
            <div class="box-body">
              <form action="#" method="post">
                <div class="form-group">
                  <input type="email" class="form-control" name="emailto" placeholder="Email to:">
                </div>
                <div class="form-group">
                  <input type="text" class="form-control" name="subject" placeholder="Subject">
                </div>
                <div>
                  <textarea class="textarea" placeholder="Message" style="width: 100%; height: 125px; font-size: 14px; line-height: 18px; border: 1px solid #dddddd; padding: 10px;"></textarea>
                </div>
              </form>
            </div>
            <div class="box-footer clearfix">
              <button type="button" class="pull-right btn btn-default" id="sendEmail">Send
                <i class="fa fa-arrow-circle-right"></i></button>
            </div>
          </div> </section>
        <!-- right col -->
      </div>
      <!-- /.row (main row) -->

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 2.3.1
    </div>
    <strong>Copyright &copy; 2014-2015 <a href="http://www.mindfiresolutions.com/">Mindfire Solutions</a>.</strong> All rights
    reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
    
      <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
	<div class="tab-pane" id="control-sidebar-home-tab">
      </div>
    <div class="tab-content">
      
      </div>
      <!-- /.tab-pane -->
    </div>
  </aside>
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- .Angular files -->
<script src="<c:url value="assets/angular/masterController.js"/>"></script>
<!-- jQuery 2.1.4 -->
<script src="<c:url value="assets/plugins/jQuery/jQuery-2.1.4.min.js"/>"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.5 -->
<script src="<c:url value="assets/bootstrap/js/bootstrap.min.js"/>"></script>
<!-- Morris.js charts -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="<c:url value="assets/plugins/morris/morris.min.js"/>"></script>
<!-- Sparkline -->
<script src="<c:url value="assets/plugins/sparkline/jquery.sparkline.min.js"/>"></script>
<!-- jvectormap -->
<script src="<c:url value="assets/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"/>"></script>
<script src="<c:url value="assets/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"/>"></script>
<!-- jQuery Knob Chart -->
<script src="<c:url value="assets/plugins/knob/jquery.knob.js"/>"></script>
<!-- daterangepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
<script src="<c:url value="assets/plugins/daterangepicker/daterangepicker.js"/>"></script>
<!-- datepicker -->
<script src="assets/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="assets/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="assets/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="assets/dist/js/app.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="assets/dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="assets/dist/js/demo.js"></script>

</body>
</html>
