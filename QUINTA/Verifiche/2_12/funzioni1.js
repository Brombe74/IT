var var1;
var var2;
var var3;
var ris1;
var ris2;
var ris3;
var somma;

function terna()
{
  var1=document.getElementById("a").value;
  var1=eval(var1);

  var2=document.getElementById("b").value;
  var2=eval(var2);

  var3=document.getElementById("c").value;
  var3=eval(var3);

  ris1=Math.pow(var1,2);
  ris2=Math.pow(var2,2);
  ris3=Math.pow(var3,2);

  somma=var1+var2;

  if(somma==ris3)
    {
      window.alert("I valori inseriti formano una terna");
    }
  else
  {
      window.alert("I valori inseriti NON formano una terna")
  }
}
