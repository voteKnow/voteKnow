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
