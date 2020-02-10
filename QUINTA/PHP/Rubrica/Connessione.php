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
        Nome varchar(10) NOT NULL,
        Cognome varchar(10) NOT NULL,
        Telefono varchar(10) NOT NULL
      );";

      if($connect->query($query)===TRUE)
      {
        echo "Record inserito";
      }

      $query= "INSERT INTO `Rubrica`(`Nome`,`Cognome`,`Telefono`) VALUES('$Name','$Surname','$phone');";

      if($connect->query($query)===TRUE)
      {
        echo "Record inserito";
      }

      else
      {
        echo "Error: <br>".$connect->error;
      }

?>
