var app = angular.module("indexApp",['ngAnimate','ui.bootstrap','ngRoute','ngResource']);

app.config(function($locationProvider) {

	$locationProvider.hashPrefix('');
	$locationProvider.html5Mode({
	    enabled: false,
	    requireBase: true
	  });
	});

app.config([ '$qProvider', function($qProvider) {
	$qProvider.errorOnUnhandledRejections(false);
} ]);
app.config(function($routeProvider) {
    $routeProvider
        // route for the about page
        .when('/accueil', {
            templateUrl : 'resources/pages/accueil.html',
            //controller  : 'AccueilController'            
           
        })
        
     // route for the about page
        .when('/film', {
            templateUrl : 'resources/pages/film.html',
            //controller  : 'FilmController'            
           
        })
        
        .otherwise({redirectTo: '/accueil'})     
       
});

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

    let getSessionInfo = function () {
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

// Controller get version
app.controller('Version', function($scope,$rootScope, $http) {
    $http.get('/odl_web/appVersion').then(function successCallback(response){    		
        	$scope.application = response.data.message;        
      }
      ,function errorCallback(response) {
    	  console.log(data);

      });
});


app.run([
	  '$rootScope',
	  function($rootScope) {
	    // see what's going on when the route tries to change
	    $rootScope.$on('$locationChangeStart', function(event, newUrl, oldUrl) {
	      // both newUrl and oldUrl are strings
	      console.log('Starting to leave %s to go to %s', oldUrl, newUrl);
	    });	    
	  }
	]);

app.controller('HeaderController', function($rootScope,$location) {
	$rootScope.getClass = function (path) {
		  return ($location.path().substr(0, path.length) === path) ? 'active' : '';
		}
});


