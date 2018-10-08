var app = angular.module("indexApp",['ngAnimate','ui.bootstrap']);

app.config([ '$qProvider', function($qProvider) {
	$qProvider.errorOnUnhandledRejections(false);
} ]);

//Controller identification utilisateur
app.controller('identification', function($scope,$rootScope, $http) {
	$scope.onLogin = function(login) {
		$rootScope.alerts = [];
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
			$rootScope.hideconn = "true";
			console.log("Authentification SUCCESS");
			$rootScope.alerts.push({type: 'success',msg: 'vous êtes maintenant connecté en tant que : '+ response.data.login});
			
			
		}, function errorCallback(response) {
			$rootScope.hideconn = "true";
			console.log("Authentification ERROR : " + response.data.message);
			$rootScope.alerts.push({type: 'danger',msg: 'Erreur : Identifiants incorrects ( '+response.data.message +' )' });
					
		});

	}
		
});

//Controller valide session
app.controller('myMenuController',function($scope,$rootScope, $http){

    getSessionInfo = function () {
        $http.get('/odl_web/getSession')
            .then(function(data) {
                $scope.user = data;
            })
    }

    getSessionInfo();

});

// Controller message informations
app.controller('messagealerte',function($scope,$rootScope, $http){
	
	$rootScope.closeAlert = function(index) {
		$rootScope.alerts = [];				
	};

});


