// script.js

// create the module and name it informat
// also include ngRoute for all our routing needs
var informat = angular.module('informat', ['ngRoute']);

// configure our routes
informat.config(function($routeProvider) {
    $routeProvider

    // route for the home page
        .when('/', {
            templateUrl : 'pages/home.html',
            controller  : 'mainController'
        })

        // route for the about page
        .when('/about', {
            templateUrl : 'pages/about.html',
            controller  : 'aboutController'
        })

        // route for the contact page
        .when('/contact', {
            templateUrl : 'pages/contact.html',
            controller  : 'contactController'
        });
});

// create the controller and inject Angular's $scope
informat.controller('mainController', function($scope) {
    // create a message to display in our view
    $scope.message = 'Everyone come and see how good I look!';
});

informat.controller('aboutController', function($scope, $http) {
    $http.get('/courses').success(function(data) {
        $scope.courses = data;
    })
    $http.get('/students').success(function(data) {
        $scope.students = data;
    })
    $http.get('/teachers').success(function(data) {
        $scope.teachers = data;
    })
});

informat.controller('contactController', function($scope) {
    $scope.message = 'Contact us! JK. This is just a demo.';
});