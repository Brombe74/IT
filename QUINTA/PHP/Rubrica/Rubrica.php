<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Rubrica</title>
  </head>
  <body>
    <div class="header">
      <div class="page_title">
          Rubrica
      </div>

    </div>

    <div class="content">
      <form method="post">
        <strong>Inserisci il Nome:</strong> <input type="text" name="nome"> <br>
        <strong>Inserisci il cognome</strong> <input type="text" name="cognome"> <br>
        <strong>Inserisci numero di telefono</strong> <input type="text" name="telefono"> <br>
        <input type="submit" name="bottone">
      </form>
    </div>

          <?php
          if(isset($_POST["bottone"]))
          {
            $Name=$_POST["nome"];
            $Surname=$_POST["cognome"];
            $phone=$_POST["telefono"];
          }  
           ?>

  </body>
</html>