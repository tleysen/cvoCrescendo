angular.module('informat', [])
    .controller('home', function($scope, $http) {
        $http.get('/courses').success(function(data) {
            $scope.courses = data;
        })
        $http.get('/students').success(function(data) {
            $scope.students = data;
        })
    });