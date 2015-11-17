/**
 * Login Controller getting data after login and submitting the form 
 * 
 */
angular.module('Login', [])
    .controller('LoginController', ['$scope', '$window', function($scope, $window) {
    	 $scope.login = {};
       $scope.submitData = function(login) {
    	   var config = {
    		        params: {
    		        	login: login
    		        }
    		      };
    	   $http.post("/login", null, config)
           .success(function (data)
           {
        	   console.log(data);
           })
           
		};
		
    }]);