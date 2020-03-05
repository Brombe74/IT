<?php
include("dbconfig.php");

$Name="";
$Surname="";
$nation="";
$id_pa="";
$airport="";
$motivation="";
$description="";
$genre="";
$amount="";
$control="";
$id_agent="";
$start="";
$finish="";
$result="";
$payment="";


if(isset($_POST["bottone"]))
{
  $Name=$_POST["nome"];
  $Surname=$_POST["cognome"];
  $nation=$_POST["nazionalità"];
  $id_pa=$_POST["id_p"];
  $airport=$_POST["aeroporto"];
  $motivation=$_POST["motivo"];
  $description=$_POST["descrizione"];
  $genre=$_POST["genere"];
  $amount=$_POST["quantità"];
  $control=$_POST["punto_controllo"];
  $id_agent=$_POST["id_a"];
  $start=$_POST["date_i"];
  $finish=$_POST["date_f"];
  $result=$_POST["esito"];
  $payment=$_POST["dazio"];
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

      $query=NULL;

      $query= "CREATE TABLE IF NOT EXISTS MERCE
      (
        Descrizione varchar(20) NOT NULL,
        Genere varchar(10) NOT NULL,
        Quantità varchar(4) NOT NULL,
        Proprietario char(10) NOT NULL,
        PRIMARY KEY (Genere,Proprietario),
        FOREIGN KEY (Proprietario) REFERENCES Passeggero(passaporto/identià)
      );";

      $query=NULL;

      $query= "CREATE TABLE IF NOT EXISTS Controllo
      (
        punto_controllo
        id_a
        date_i
        date_f
        esito
        dazio
      );";

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

      $query=NULL;

      $query= "INSERT INTO `MERCE`(`Descrizione`,`Genere`,`Quantità`, `Proprietario`)
      VALUES('$description','$genre','$amount','$id_pa');";

      if($connect->query($query)===TRUE)
      {
        echo "Record inserito <br>";
      }

      else
      {
        echo "Error: <br>".$connect->error;
      }

      $query=NULL;

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
