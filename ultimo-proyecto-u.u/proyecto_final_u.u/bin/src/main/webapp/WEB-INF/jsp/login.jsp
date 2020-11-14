<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <title>LASER Airlines</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<style>
  body,  h1,  h2,  h3,  h4,  h5,  h6 {
    font-family: "Raleway", Arial, Helvetica, sans-serif
  }

  .myLink {
    display: none
  }
</style>

<body class="w3-light-grey">

  <!-- Navigation Bar -->
  <div class="w3-bar w3-white w3-border-bottom w3-xlarge">
    <a href="#" class="w3-bar-item w3-button w3-text-red w3-hover-red"><b><i
          class="fa fa-map-marker w3-margin-right"></i>LASER Airlines</b></a>
    <a href="#" class="w3-bar-item w3-button w3-right w3-hover-red w3-text-grey"><i class="fa fa-search"></i></a>
  </div>

  <!-- Header -->
  <header class="w3-display-container w3-content" style="max-width:1500px">

    <img class="w3-image"
      src="https://stemcell.keck.usc.edu/wp-content/uploads/2017/11/150324_flights-hero-image_1330x742.jpg" alt="avion"
      width="1500" height="700">
      
    <div class="w3-display-middle" style="width:65%">

      <div class="w3-bar w3-black">
        <button class="w3-bar-item w3-button tablink" onclick="openLink(event, 'Flight');"><i
            class="fa fa-plane w3-margin-right"></i>Login</button>

      </div>

      <!-- Tabs -->
      <div id="Flight" class="w3-container w3-white w3-padding-16 myLink">
        <h3>Ingrese sus datos:</h3>
        <div class="w3-row-padding" style="margin:0 -16px;">


          <form action="/login" method="post" class="form">
            <div class="w3-half">
              <label>Usuario:&nbsp; </label>
              <input class="form-controller w3-input w3-border" placeholder="Su nombre de usuario" type="text"
                name="username">
            </div>

            <div class="w3-half">
              <label>Contraseña:</label>
              <input class="w3-input w3-border form-controller" type="password" name="password"
                placeholder="su contraseña">
            </div>

            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
            <input class="btn btn-success w3-button w3-dark-grey" type="submit">
          </form>
        </div>
      </div>
      </div>
  </header>






  <!-- Footer -->
  <footer class="w3-container w3-center w3-opacity w3-margin-bottom">
    <h5>Nuestras RRSS:</h5>
    <div class="w3-xlarge w3-padding-16">
      <i class="fa fa-facebook-official w3-hover-opacity"></i>
      <i class="fa fa-instagram w3-hover-opacity"></i>
      <i class="fa fa-twitter w3-hover-opacity"></i>
      <i class="fa fa-linkedin w3-hover-opacity"></i>
    </div>
    <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank"
        class="w3-hover-text-green">w3.css</a> and grupo 2 develop team</p>
  </footer>

  <script>
    // Tabs
    function openLink(evt, linkName) {
      var i, x, tablinks;
      x = document.getElementsByClassName("myLink");
      for (i = 0; i < x.length; i++) {
        x[i].style.display = "none";
      }
      tablinks = document.getElementsByClassName("tablink");
      for (i = 0; i < x.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" w3-red", "");
      }
      document.getElementById(linkName).style.display = "block";
      evt.currentTarget.className += " w3-red";
    }

    // Click on the first tablink on load
    document.getElementsByClassName("tablink")[0].click();
  </script>

</body>

</html>