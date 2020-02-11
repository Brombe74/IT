<?php
include("Connessione.php");
 ?>

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

    <div>
      <h3>QUERY</h3>
      <?php
       if($connect)
       {
         $select_result=$connect->query($query_select);

         if ($select_result->num_rows>0)
         {
          while ($row=$select_result->fetch_assoc())
          {
            echo $row ["cognome"];
          }
         }
       }
       ?>
    </div>


  </body>
</html>
<?php
if($connect)
$connect->close();
 ?>
