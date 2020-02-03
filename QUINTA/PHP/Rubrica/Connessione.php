<?php
include("Rubrica.php");
include("dbconfig.php");

$connect = mysqli_connect($server, $username, $password)
      or die("Connessione non riuscita: " . mysqli_error($connect));
      print ("Connesso con successo <br />");

mysqli_select_db($connect, $database)
      or die ("Impossibile selezionare il db");

      $query= "CREATE TABLE IF NOT EXISTS Rubrica
      (
        Nome varchar(10),
        Cognome varchar(10),
        Telefono varcjar(10)
      );";

      $query= "INSERT INTO Rubrica('Nome','Cognome','Telefono') VALUES('$Name','$Surname','$phone')";
?>
