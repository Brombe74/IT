<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <title>RIepilogo informazioni</title>
  </head>
  <?php
    $bgcolor=$_POST["Red"].$_POST["Green"].$_POST["Blue"];
   ?>
  <body style="background-color: #<?php echo $bgcolor ?>">

     <p><strong>Colore Rosso:</strong> <?php echo $_POST["Red"]; ?></p>
     <p><strong>Colore Verde:</strong> <?php echo $_POST["Green"]; ?></p>
     <p><strong>Colore Blu:</strong> <?php echo $_POST["Blue"]; ?></p>

  </body>
</html>
