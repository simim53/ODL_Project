<!DOCTYPE html>
<html lang="fr" >
<head>
  <meta charset="UTF-8">
  <title>Connexion/Inscription</title>
 
      <link rel="stylesheet" href="css/style.css">  
</head>

<body>
  <div class="form">
      
      <ul class="tab-group">
        <li class="tab active"><a href="#login">Connexion</a></li>
        <li class="tab"><a href="#signup">Inscription</a></li>
      </ul>
      
      <div class="tab-content">
      
        <div id="login">   
          <h1>Bienvenue</h1>
          
          <form action="/" method="post">
          
            <div class="field-wrap">
            <label>
              Identifiant <span class="req">*</span>
            </label>
            <input type="login"required autocomplete="off"/>
          </div>
          
          <div class="field-wrap">
            <label>
              Mot de passe<span class="req">*</span>
            </label>
            <input type="password"required autocomplete="off"/>
          </div>
          
          <p class="forgot"><a href="#">mot de passe oublié ?</a></p>
          
          <button class="button button-block"/>Se connecter</button>
          
          </form>

        </div>
        
      
        <div id="signup">   
          <h1>Formulaire d'inscription :</h1>
          
          <form action="/" method="post">
          
          <div class="top-row">
            <div class="field-wrap">
              <label>
                Nom<span class="req">*</span>
              </label>
              <input type="text" required autocomplete="off" />
            </div>
        
            <div class="field-wrap">
              <label>
                Prénom<span class="req">*</span>
              </label>
              <input type="text"required autocomplete="off"/>
            </div>
          </div>

          <div class="field-wrap">
            <label>
              Adresse Email <span class="req">*</span>
            </label>
            <input type="email"required autocomplete="off"/>
          </div>
          
          <div class="field-wrap">
            <label>
              Mot de Passe<span class="req">*</span>
            </label>
            <input type="password"required autocomplete="off"/>
          </div>
          
          <button type="submit" class="button button-block"/>S'inscire<button>
          
          </form>

        </div>
        
      
      </div><!-- tab-content -->
      
</div> <!-- /form -->
  <script src="js/jquery.min.js"></script>

    <script  src="js/index.js"></script>

</body>
</html>
