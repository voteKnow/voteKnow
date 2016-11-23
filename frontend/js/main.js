let app = angular.module('voteKnow', ['ngRoute']);

// Controllers:
require('./controllers/homeController')

// Services:



// Router:
app.config(['$routeProvider', function ($routeProvider) {
  $routeProvider
    .when('/',{
      redirectTo: '/home',
    })
    .when('/home',{
      controller: 'homeController',
      templateUrl: 'templates/home.html'
    })

  }]);
