var app = angular.module("indexApp", []);

app.config([ '$qProvider', function($qProvider) {
	$qProvider.errorOnUnhandledRejections(false);
} ]);

app.controller('navigation', function($scope,$rootScope, $http) {
	$scope.onLogin = function(login) {
		var data = 'username='
				+ encodeURIComponent($scope.credentials.username)
				+ '&password='
				+ encodeURIComponent($scope.credentials.password)
				+ '&submit=login';
		$http.post('/odl_web/login', data, {
			headers : {
				'Content-Type' : 'application/x-www-form-urlencoded'
			}
		}).then(function successCallback(response) {
			console.log("Authentification SUCCESS");
			$rootScope.error = 'vous etes connecte en tant que : '+ response.data.login;
		}, function errorCallback(response) {
			console.log("Authentification ERROR : " + response.data.message);
		});

	}
});


app.controller("errors", function($scope,$rootScope) {
	$rootScope.error = app.errorMessage ;	
});
