
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <title>Es1 Prova funzioni</title>
  </head>
  <body>
    <strong>I numeri primi all'interno dell'intervallo [1;6] sono :</strong>
    <?php
    function primi($a,$b)
    {
      $counter;

      for ($i=1; $i <=$b ; $i++)
      {
        $counter=0;

        for ($c=2; $c<($i%2)+1; $c++)
        {
          if($i%2==0)
          {
            $counter=$counter+1;
            break;
          }
        }

        if($counter==0 && $i!=1)
        {
          print("$i/");
        }
      }
    }

    primi(1,6);
     ?>
  </body>
</html>
