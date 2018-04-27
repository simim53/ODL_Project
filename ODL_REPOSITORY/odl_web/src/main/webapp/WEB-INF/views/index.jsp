<!DOCTYPE html>
<html lang="FR-fr">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Projet ODL - Bienvenue</title>
<script type="text/javascript"
	src="resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript"
	src="resources/js/bootstrap/bootstrap.min.js"></script>
<link href="resources/css/bootstrap/bootstrap.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/Accueil_CSS.css" rel="stylesheet"
	type="text/css">
</head>

<body>
	<div>
	<!-- 
		<h1 class="text-center justify-content-center" id="titrepageacceuil">Projet
			ODL</h1>
	 -->	
	 <nav
			class="navbar navbar-light navbar-expand-md navigation-clean-button">
			<div class="container">
				<a href="#" class="navbar-brand">Menu :</a>
				<button data-toggle="collapse" data-target="#navcol-1"
					class="navbar-toggler">
					<span class="sr-only">Toggle navigation</span><span
						class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navcol-1">
					<ul class="nav navbar-nav mr-auto">
						<li role="presentation" class="nav-item"><a href="#"
							class="nav-link active">Accueil</a></li>
						<li role="presentation" class="nav-item"><a href="#"
							class="nav-link">Films</a></li>
						<li role="presentation" class="nav-item"><a href="#"
							class="nav-link">Musiques</a></li>
						<li role="presentation" class="nav-item"><a href="#"
							class="nav-link">Livres</a></li>
						<li class="dropdown"><a data-toggle="dropdown"
							aria-expanded="false" href="#"
							class="dropdown-toggle nav-link dropdown-toggle">Autres</a>
							<div role="menu" class="dropdown-menu">
								<a  role="presentation" href="#" class="dropdown-item">element</a><a
									role="presentation" href="#" class="dropdown-item">element</a><a
									role="presentation" href="#" class="dropdown-item">element</a>
							</div></li>
					</ul>
					<span class="navbar-text actions">
						<li class="dropdown order-1" id="connex"><a
							data-toggle="dropdown" aria-expanded="false" href="#"
							class="dropdown-toggle nav-link dropdown-toggle">Connexion</a>
							<ul class="dropdown-menu dropdown-menu-right mt-1">
								<li class="p-3" id="formcon">
									<form action="${loginUrl}" method="POST">
										<div class="form-group">
											<input id="loginInput" placeholder="Identifiant"
												class="form-control form-control-sm" type="text" name="username" required>
										</div>
										<div class="form-group">
											<input id="passwordInput" placeholder="Mot de passe"
												class="form-control form-control-sm" type="password" name="password" required>
										</div>
										<div class="form-group">
											<button class="btn btn-light action-button" role="button"
												style="background-color: #566fc6;" id="btnseconnecter"
												type="submit">Se connecter</button>
										</div>
										<div class="form-group text-xs-center">
											<small><a href="#">Mot de passe oubliÃ©?</a></small>
										</div>
									</form>
								</li>
							</ul></li> <a class="btn btn-light action-button" role="button" href="#"
						style="background-color: #566fc6;">Inscription</a>
					</span>
				</div>
			</div>
		</nav>

	</div>
	<div class="article-list">
		<div class="container">
			<div class="intro">
				<h2 class="text-center">Bienvenue</h2>
				<p class="text-center">
					<br /> Créez, Éditez, Partagez vos Bibliothèques Multimédia<br />
					<br />
				</p>
			</div>
			<div class="row articles">
				<div class="col-sm-6 col-md-4 item">
					<a href="#"></a><img src="resources/img/creation.jpeg"
						style="width: 350px;" alt="creation" />
					<h3 class="name">
						<br /> Création<br />
					</h3>
					<p class="description">
						<br /> Créer une nouvelle bibliothèque<br />
					</p>
				</div>
				<div class="col-sm-6 col-md-4 item">
					<a href="#"></a><img src="resources/img/edition.jpg"
						style="width: 351px;" alt="edition" />
					<h3 class="name">
						<br /> Édition<br />
					</h3>
					<p class="description">
						<br /> Éditer une de vos bibliothèques<br />
					</p>
				</div>
				<div class="col-sm-6 col-md-4 item">
					<a href="#"></a><img src="resources/img/sharing.jpg"
						style="width: 350px;" alt="partage" />
					<h3 class="name">
						<br /> Gestion<br />
					</h3>
					<p class="description">
						<br /> Gérer vos bibliothèques, avis, fiches, prêts...<br />
					</p>
				</div>
			</div>
		</div>
	</div>
  
	<div class="footer-basic">
		<footer>
			<p class="copyright">Projet ODL © 2018 _ V.0.0.6</p>
		</footer>
	</div>
</body>
</html>