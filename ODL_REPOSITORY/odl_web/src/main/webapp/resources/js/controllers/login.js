var app = angular.module("indexApp", []);

app.config([ '$qProvider', function($qProvider) {
	$qProvider.errorOnUnhandledRejections(false);
} ]);

app.controller('identification', function($scope,$rootScope, $http) {
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
			$rootScope.message = 'vous etes connecte en tant que : '+ response.data.login;
		}, function errorCallback(response) {
			console.log("Authentification ERROR : " + response.data.message);
			$rootScope.message = 'identifiants incorrects';
		});

	}
});

app.controller('myMenuController',function($scope, $http){

    getSessionInfo = function () {
        $http.get('/odl_web/getSession')
            .then(function(data) {
                $scope.user = data;
            })
    }

    getSessionInfo();

});

