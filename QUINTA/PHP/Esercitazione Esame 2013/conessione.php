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
        Numero_passaporto_identià char(10) NOT NULL,
        Aeroporto_di_provenienza varchar(10),
        Motivo_viaggio varchar (20) NOT NULL,
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
        FOREIGN KEY (Proprietario) REFERENCES Passeggero(Numero_passaporto_identià)
      );";

      $query=NULL;

      $query= "CREATE TABLE IF NOT EXISTS Controllo
      (
        punto_controllo varchar(10) NOT NULL,
        id_a char(10) NOT NULL,
        id_p char(10) NOT NULL,
        merce varchar(10) NOT NULL,
        date_i DateTime NOT NULL,
        date_f DateTime NOT NULL,
        esito varchar(10) NOT NULL
        dazio varchar(5) NOT NULL,
        FOREIGN KEY (merce) REFERENCES MERCE(Genere)
        FOREIGN KEY (id_p) REFERENCES Passeggero(Numero_passaporto/identià)
        PRIMARY KEY (id_a)
      );";

      $query= "INSERT INTO `Passeggero`(`Nome`,`Cognome`,`Nazionalita`, `Numero passaporto_identià`, `Aeroporto di provenienza`, `Motivo viaggio`)
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

      $query= "INSERT INTO `Controllo`(`punto_controllo`,`id_a`,`Numero passaporto_identià`,`merce`,`date_i`, `date_f`, `esito`, `dazio`)
      VALUES('$control','$id_agent','$id_pa','$genre', '$start', '$finish', '$result', '$payment');";

      $query=NULL;

      $query_select="SELECT Controllo.id_a, Controllo.punto_controllo, SUM(Controllo.dazio) AS TotaleDazio
      FROM Controllo
      GROUP BY Controllo.id_a, Controllo.punto_controllo;";

      $query_select=NULL;

      $query_select="SELECT MERCE.genere, COUNT(*) AS Controllo.merce
      FROM MERCE, Controllo
      WHERE Merce.Genere=Controllo.merce
      AND Controllo.esito= 'Positivo'
      GROUP BY Merce.genere;";

      $query_select=NULL;

      $query_select="SELECT Controllo.id_a
      FROM Controllo
      WHERE  Controllo.esito='negativo'
      GROUP BY Controllo.id_a;";

      $query_select=NULL;

      $query_select="SELECT Passeggero.id_p, Passeggero.Cognome, Passeggero.Nome,Passeggero.Nazionalita
      WHERE Passeggero.Numero_passaporto_identià=Controllo.id_p
      AND YEAR(Controllo.date_i)= YEAR (CURDATE())
      AND Controllo.esito=='fermo'
      ORDER BY Passeggero.Nazionalita, Passeggero.Cognome, Passeggero.Nome;";

      $query_select=NULL;

      $query_select="SELECT Controllo.id_a
      WHERE YEAR(Controllo.date_i)= YEAR (CURDATE())
      AND MONTH(Controllo.date_i)= MONTH (CURDATE())
      AND DAY(Controllo.date_i)= DAY (CURDATE())
      ORDER BY Controllo.id_a;";

      if($connect->query($query)===TRUE)
      {

      }

      else
      {
        echo "Error: <br>".$connect->error;
      }
?>
