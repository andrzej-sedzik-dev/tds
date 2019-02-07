<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="Videopoint tutorial">
  <link rel="icon" href="/ico/favicon.ico">
  <title>System zgłoszeń serwisu samochodowego</title>
  <link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
  <link href="/css/dashboard.css" rel="stylesheet">
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <span class="navbar-brand">System zgłoszeń serwisu samochodowego</span>
    </div>
    <p class="navbar-text">Użytkownik: ${user!'niezalogowany'} </p>
    <form class="navbar-form" method="post" action="/logout">
      <button type="submit" class="btn btn-default">Wyloguj</button>
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
  </div>
</nav>

<div class="container-fluid">
  <div class="row">
    <div class="col-sm-3 col-md-2 sidebar">
      <ul class="nav nav-sidebar">
        <li class="active"><a href="/index">O systemie</a></li>
        <li><a href="/issues">Zgłoszenia</a></li>
        <li><a href="/issue">Zgłoś problem</a></li>
      </ul>
    </div>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
      <h1>
        O systemie
      </h1>
      <div>
        System obsługi zgłoszeń seriwsu umożliwia komunikację z serwisem samochodowym, dodawanie komentarzy,
        zgłaszanie usterek.
      </div>
    </div>
  </div>
</div>



<script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>



</body>
</html>
