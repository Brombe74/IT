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
      <h2>Dati passeggero</h2>
      <form method="post">
        <strong>Inserisci il Nome:</strong> <input type="text" name="nome"> <br>
        <strong>Inserisci il cognome</strong> <input type="text" name="cognome"> <br>
        <strong>Inserisci la nazionalità</strong> <input type="text" name="nazionalità"> <br>
        <strong>Inserisci il numero di passaporto o della carta d'identità</strong> <input type="text" name="id_p"><br>
        <strong>Inserisci aeroporto di provenienza</strong> <input type="text" name="aeroporto"><br>
        <strong>Inserire motivo del viaggio</strong> <input type="text" name="motivo">
        <input type="submit" name="bottone">
      </form>
    </div>

    <div class="content">
      <h2>Dati merce</h2>
      <form method="post">
          <strong>Inserisci il genere del bagaglio</strong> <input type="text" name="genere"> <br>
          <strong>Inserisci la descrizione del bagaglio</strong> <input type="text" name="descrizione"> <br>
          <strong>Inserisci la quantità dichiarata</strong> <input type="text" name="quantità"> <br>
      </form>
    </div>

    <div class="content">
      <h2>Dati controllo</h2>
      <form method="post">
        <strong>Inserisci il punto di controllo</strong> <input type="text" name="punto_controllo"> <br>
        <strong>Inserisci l'identificativo dell'addetto</strong> <input type="text" name="id_a"> <br>
        <strong>Inserisci data e ora inizio controllo</strong> <input type="text" name="date_i"> <br>
        <strong>Inserisci data e ora fine controllo</strong> <input type="text" name="date_f"> <br>
        <strong>Inserisci l'esito</strong> <input type="text" name="esito"> <br>
        <strong>Inserisci dazio previsto</strong> <input type="text" name="dazio"> <br>
      </form>
    </div>

<!--     <div>
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

-->
  </body>
</html>
<?php
if($connect)
$connect->close();
 ?>
