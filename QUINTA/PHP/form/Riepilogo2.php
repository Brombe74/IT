<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <title>RIepilogo informazioni</title>
  </head>
  <body>
    <?php
     function ipotenusa($a,$b)
     {
     //$temp=sqrt(pow($a,2)+pow($b,2));
     $temp=sqrt(($a*$a)+($b*$b));
        print("L'ipotenusa del triangolo e':");
        print($temp);
     }
     ?>
     <p><strong>Lato A:</strong> <?php echo $_POST["A"]; ?></p>
     <p><strong>LatoB:</strong> <?php echo $_POST["B"]; ?></p>
     <p><?php ipotenusa($_POST["A"],$_POST["B"]) ?></p>

  </body>
</html>
