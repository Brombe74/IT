<?php
include("dbconfig.php");

$Name="";
$Surname="";
$phone="";


if(isset($_POST["bottone"]))
{
  $Name=$_POST["nome"];
  $Surname=$_POST["cognome"];
  $phone=$_POST["telefono"];
}


$connect = mysqli_connect($server, $username, $password)
      or die("Connessione non riuscita: " . mysqli_error($connect));
      print ("Connesso con successo <br />");

mysqli_select_db($connect, $database)
      or die ("Impossibile selezionare il db");

      $query= "CREATE TABLE IF NOT EXISTS Rubrica
      (
        Nome varchar(20) NOT NULL,
        Cognome varchar(20) NOT NULL,
        Telefono varchar(20) NOT NULL
      );";

      if($connect->query($query)===TRUE)
      {
        echo "Record inserito <br>";
      }

      $query= "INSERT INTO `Rubrica`(`Nome`,`Cognome`,`Telefono`) VALUES('$Name','$Surname','$phone');";

      if($connect->query($query)===TRUE)
      {
        echo "Record inserito <br>";
      }

      else
      {
        echo "Error: <br>".$connect->error;
      }

      $query="SELECT * FROM Rubrica WHERE Nome='Daniel';";
      $query_select="SELECT * FROM Rubrica ORDER BY `Cognome`;"

      if($connect->query($query)===TRUE)
      {

      }

      else
      {
        echo "Error: <br>".$connect->error;
      }
?>
