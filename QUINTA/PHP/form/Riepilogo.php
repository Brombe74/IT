<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <title>RIepilogo informazioni</title>
  </head>
  <body>
    <?php
     function paga($a,$b)
     {
     $temp=$a*$b;
        print("La tua paga a giornata:");
        print($temp);
     }
     ?>
     <p><strong>Nome:</strong> <?php echo $_POST["nome"]; ?></p>
     <p><strong>Ore lavorative:</strong> <?php echo $_POST["ore"]; ?></p>
     <p><strong>Paga per ora</strong> <?php echo $_POST["paga"]; ?></p>
     <p><?php paga($_POST["paga"],$_POST["ore"]) ?></p>

  </body>
</html>
