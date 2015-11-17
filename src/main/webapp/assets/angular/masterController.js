/**
 * It is for showing forms in pop ups and submitting form
 */
angular.module('Tms', [])
    .controller('MasterController', ['$scope', '$window','$http', function($scope, $window,$http) {
      $scope.clickedForm = 0;
      $scope.members = {};
      $scope.newMember = {};
      $scope.newTeamMember = {};
      $scope.timeZone = {};
      $scope.newProject = {
    		  selectedClient : 0,
    		  startDate : new Date()
      };
      $scope.projects = {};
      $scope.newProject = {
    		  selectedProject : 0,
    		  selectedMember : 0
      };
      $scope.clients = {};
      $scope.projectFlag = 0;
      $scope.clientFlag = 0;
      $scope.projects ={};
      var date = new Date();
      var token = $("meta[name='_csrf']").attr("content");
      var header = $("meta[name='_csrf_header']").attr("content");
	  $scope.minDate = date;
      $scope.removePopWindow = function() {
    	  $scope.clickedForm = 0;
		};
      $scope.popWindowNewUser = function() {
    	  $scope.clickedForm = 1;
		};
		$scope.selctedStartDate = function(startDate){
			$scope.minDate = startDate;
		};
		 $scope.selctedClient = function(id) {
			 alert(id);
	    	  $scope.newProject.selectedClient = id;
			};
		$scope.selctedProject = function(selectedProject){
			var leadId = document.getElementById('employeeId').value;
			var param = {leadId:leadId
					, projectId:selectedProject};
			console.log(param);
			$http({
		          method  : 'POST',
		          url     : '/getMember?_csrf='+token,
		          data    : $scope.newMember, //forms user object
		          headers : header
		         })
		          .success(function(data) {
		        	  console.log(data);
		        	  $scope.members = data;
		          });
		};
		$scope.popWindowNewTeamMember = function() {
			$scope.clickedForm = 2;
			if($scope.projectFlag == 0){
				 var token = $("meta[name='_csrf']").attr("content");
				 var header = $("meta[name='_csrf_header']").attr("content");
				$http.get("/listProjects?_csrf='+token")
			          .success(function(response) {
			        	  $scope.projects = response;
			        	  $scope.projectFlag = 1;
			        	  console.log(response);
			          });
			}
		};
		$scope.popWindowNewProject = function() {
	    	  $scope.clickedForm = 3;
	    	  if($scope.clientFlag == 0){
					 
					 $http.get("/listClients?_csrf='+token")
					    .success(function(response) {
					    	console.log(response);
					    	$scope.clients = response;
					    	$scope.clientFlag = 1;
					    });	        
				}
			};
			$scope.popWindowNewClient = function() {
				$scope.clickedForm = 4;
			};
		$scope.showNewMember = function(){
			return  $scope.clickedForm == 1; 
		};
		$scope.showNewTeamMember = function(){
			return  $scope.clickedForm == 2; 
		};
		$scope.showNewProject = function(){
			return  $scope.clickedForm == 3 ; 
		};
		$scope.makeBothSame = function(){
			$scope.newMember.permanentAddress = $scope.newMember.presentAddress
		};
		$scope.submitMemberForm = function(){
			 $scope.error = "";
			 $scope.success = "";
			 var token = $("meta[name='_csrf']").attr("content");
			 var header = $("meta[name='_csrf_header']").attr("content");
			console.log($scope.newMember);
			console.log(header);
			
			$http({
		          method  : 'POST',
		          url     : '/addMember?_csrf='+token,
		          data    : $scope.newMember, //forms user object
		          headers : header
		         })
		          .success(function(data) {
		        	  console.log(data);
		            if (data.error === "") {
		              // Showing errors.
		            	 $scope.success = data.success;
			              $scope.newMember = {};
		            } else {
		            	$scope.error = data.error;
		            }
		          });
			

		};
		$scope.submitNewProjectForm = function(){
			 $scope.error = "";
			 $scope.success = "";
			 var token = $("meta[name='_csrf']").attr("content");
			 var header = $("meta[name='_csrf_header']").attr("content");
			console.log($scope.newProject);
			console.log(header);
		};
    }]);