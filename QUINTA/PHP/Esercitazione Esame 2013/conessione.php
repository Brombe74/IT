<?php
include("dbconfig.php");

$Name="";
$Surname="";
$nation="";
$id_pa="";
$airport="";
$motivation="";



if(isset($_POST["bottone"]))
{
  $Name=$_POST["nome"];
  $Surname=$_POST["cognome"];
  $nation=$_POST["nazionalità"];
  $id_pa=$_POST["id_p"];
  $airport=$_POST["aeroporto"];
  $motivation=$_POST["motivo"];
}


$connect = mysqli_connect($server, $username, $password)
      or die("Connessione non riuscita: " . mysqli_error($connect));
      print ("Connesso con successo <br />");

mysqli_select_db($connect, $database)
      or die ("Impossibile selezionare il db");

      $query= "CREATE TABLE IF NOT EXISTS Passeggero
      (
        Nome varchar(20) NOT NULL,
        Cognome varchar(20) NOT NULL,
        Nazionalita varchar(10) NOT NULL,
        Numero passaporto/identià char(10) NOT NULL,
        Aeroporto di provenienza varchar(10),
        Motivo viaggio varchar (20) NOT NULL,
        PRIMARY KEY (Numero passaporto/identià)
      );";

      if($connect->query($query)===TRUE)
      {
        echo "Record inserito <br>";
      }

      $query= "INSERT INTO `Passeggero`(`Nome`,`Cognome`,`Nazionalita`, `Numero passaporto/identià`, `Aeroporto di provenienza`, `Motivo viaggio`)
      VALUES('$Name','$Surname','$nation','$id_pa','$airport','$motivation');";

      if($connect->query($query)===TRUE)
      {
        echo "Record inserito <br>";
      }

      else
      {
        echo "Error: <br>".$connect->error;
      }

      $query="SELECT * FROM Passeggero WHERE Nome='Daniel';";
      $query_select="SELECT * FROM Passeggero ORDER BY `Cognome`;"

      if($connect->query($query)===TRUE)
      {

      }

      else
      {
        echo "Error: <br>".$connect->error;
      }
?>
