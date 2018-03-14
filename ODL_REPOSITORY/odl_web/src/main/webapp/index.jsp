<!DOCTYPE html>
<html lang="FR-fr">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
	
<title>Projet ODL - Bienvenue</title>
<script type="text/javascript" src="resources/js/jquery/jquery-3.3.1.min.js"></script>	
<script type="text/javascript" src="resources/js/bootstrap/bootstrap.min.js"></script>
<link href="resources/css/bootstrap/bootstrap.css" rel="stylesheet" type="text/css">
<link href="resources/css/Accueil_CSS.css" rel="stylesheet" type="text/css">
	
<!--The following script tag downloads a font from the Adobe Edge Web Fonts server for use within the web page. We recommend that you do not modify it.-->

</head>
<body>
 <h1 class = "titremenu">PROJET ODL</h1>
<!-- barre du menu -->
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
<div class="collapse navbar-collapse" id="navbarSupportedContent">
	 	
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active" ><a class="nav-link" href="#">ACCUEIL</a><span class="sr-only">(current)</span></li>
        <li class="nav-item"><a class="nav-link" href="#">FILMS</a></li>
        <li class="nav-item"><a class="nav-link" href="#">MUSIQUES</a></li>
        <li class="nav-item"><a class="nav-link" href="#">LIVRES</a></li>
        <li class="nav-item"><a class="nav-link" href="#">AUTRES</a></li>
    </ul>
	
	 <ul class="navbar-nav navbar-right">		 
		    <li class="dropdown order-1">
                    <button type="button" id="dropdownMenu1" data-toggle="dropdown" class="btn btn-outline-secondary dropdown-toggle">Mon Compte<span class="caret"></span></button>
                    <ul class="dropdown-menu dropdown-menu-right mt-1" >
		 
		 
                      <li class="p-3" id="formcon">
                            <form class="form" role="form" >
                                <div class="form-group">
                                    <input id="loginInput" placeholder="Identifiant" class="form-control form-control-sm" type="text" required>
                                </div>
                                <div class="form-group">
                                    <input id="passwordInput" placeholder="Mot de passe" class="form-control form-control-sm" type="text" required>
                                </div>
                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary btn-block">Connexion</button>
                                </div>
                                <div class="form-group text-xs-center">
                                    <small><a href="#">Mot de passe oublié?</a></small>
                                </div>
								<hr>
								</form>
								<form class="form" role="form" action="./getAllUtilisateurs" method="get">
								  <div class="form-group text-xs-center" >
                                   <button type="submit" class="btn btn-primary btn-block" id="inscription">Inscription</button>
                                </div>
                            </form>
                        </li>
				</ul>
						</li>
                   
 	 </ul>
	 </div>
</nav>
<!-- FIN barre du menu -->		

<div class="divbbienvenue">
  <div >
    <div >
      <div >
        <h2 >Bienvenue.</h2>
			<p> Créez, éditez, Partagez vos Bibliothèques Multimédia</p>
	</div>
    </div>
  </div>
</div>
<div>
  <div>
    <div>
      <h2>Création</h2>
      <p>Créer une nouvelle Bibliothèque</p>
    <a href="#" >Créer</a></div>
    <div>
      <h2>Édition</h2>
      <p>Éditer une de vos bibliothèques</p>
      <a href="#">Éditer</a></div>
  </div>
</div>
<hr>
<div>
  <div>
    <div>
      <h3> Vidéothèque</h3>
      <p>Importez, classifiez , prêtez et notez vos films</p>
    </div>
    <div>
      <h3>Musicothèque</h3>
      <p>Importez, classifiez , prêtez et notez vos albums</p>
    </div>
    <div>
      <h3>Bibliothèque</h3>
      <p>Importez, classifiez , prêtez et notez vos livres</p>
    </div>
    <div>
      <h3> Autres</h3>
      <p>Importez, classifiez , prêtez et notez vos autres divertissements personnels (Jeux vidéos, collections ...)</p>
    </div>
  </div>
</div>
<div>


<hr>
<div>
  <div>
<div>
  <h2>Contact</h2>
  <address>
  <strong>DOUILLET Simon</strong>
  </address>
  <address>
  concepteur et développeur
  </address>
</div>
    
    <div >
      <h2>Informations</h2>
    </div>
  </div>
</div>
	</div>
  <hr>
<footer>
  <div>
    <div>
      <div>
        <p class="card-footer" id="footerAccueil">Projet_ODL 2018 v0.0.6-SNAPSHOT</p>
      </div>
    </div>
  </div>
</footer>
</body>
</html>
