<!DOCTYPE html>
<html>
  <head>
    <style media="screen">

      table
      {
        margin: 0 auto;
        border-collapse: collapse;
        background: cyan;
      }
      tr:nth-child(odd) td:nth-child(even), tr:nth-child(even) td:nth-child(odd)
      {
         background: white;
      }
    </style>

  </head>
<body>

  <h1>Output con document write</h1>
  <h4>Sequenz adi fibonacci di 5</h4>

  <?php
    $fib=5;
    $sequenza= array();

    for ($i=0; $i < $fib ; $i++)
    {
      $sequenza[$i]=$i+($i-1);
    }

  for($i=0;i<$fib;$i++)
  {
    echo "$sequenza[$i]";
  }
  ?>

  <h4>Tavola Pitagorica di 5</h4>

  <?php
  {
    $n_pit=5;

    echo "<table border=\"1\">";
    for ($riga=1; $riga<$n_pit+1;$riga++)
    {
      echo "<tr>";

      for ($colonna=1; $colonna<$n_pit+1;$colonna++)
        echo "<td>" . $riga*$colonna . "</td>";

      echo "</tr>";
    }
    echo "</table>";
  }
  ?>


</body>
</html>
