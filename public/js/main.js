(function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);throw new Error("Cannot find module '"+o+"'")}var f=n[o]={exports:{}};t[o][0].call(f.exports,function(e){var n=t[o][1][e];return s(n?n:e)},f,f.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({1:[function(require,module,exports){
'use strict'
module.exports = function(app){

  app.controller('homeController', ['$scope','$http','UserService', function($scope, $http, userService){






  }])


}

},{}],2:[function(require,module,exports){
'use strict'
let app = angular.module('voteKnow', ['ngRoute']);

// Controllers:
require('./controllers/homeController')(app);

// Services:
require('./services/userService')(app);


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

},{"./controllers/homeController":1,"./services/userService":3}],3:[function(require,module,exports){
'use strict'
/*
  Damon Wingo
  Dependency injection: $http

  Purpose: Set up methods for request from browser uses es6
*/
module.exports = function(app) {
    app.factory('UserService', ['$http', function($http) {
      return{
        getPoliticion: ()=>{
          $http({
            url: '/politician',
            method: 'GET',
            data: politicians
          });
        },
        getBill: (id)=>{
          $http({
            url: '/bill' + id,
            method: 'GET',
            data: bill
          })
        },
      };//Return methods for UserService factory
    }]);//End of factory
};//End of exports

},{}]},{},[2])