var a;
var b;
var ris;


function somma()
{
   a=document.getElementById("valore1").value;
   a=eval(a);

   b=document.getElementById("valore2").value;
   b=eval(b);
   ris=a+b;
   
   document.getElementById("risultato").value=ris;
}

function sottrazione()
{
   a=document.getElementById("valore1").value;
   a=eval(a);

   b=document.getElementById("valore2").value;
   b=eval(b);
   ris=a-b;
   
   document.getElementById("risultato").value=ris;
}

function moltiplicazione()
{
   a=document.getElementById("valore1").value;
   a=eval(a);

   b=document.getElementById("valore2").value;
   b=eval(b);
   ris=a*b;
   
   document.getElementById("risultato").value=ris;
}

function divisione()
{
   a=document.getElementById("valore1").value;
   a=eval(a);

   b=document.getElementById("valore2").value;
   b=eval(b);
   ris=a-b;
   
   if(b==0)
	{
		document.getElementById("risultato").value="Non puoi fare divisione per 0";
	}
   
   document.getElementById("risultato").value=ris;
}

function media()
{
   a=document.getElementById("valore1").value;
   a=eval(a);

   b=document.getElementById("valore2").value;
   b=eval(b);
   ris=Math.round(a,b);
   
   document.getElementById("risultato").value=ris;
}

function potenza()
{
   a=document.getElementById("valore1").value;
   a=eval(a);

   b=document.getElementById("valore2").value;
   b=eval(b);
   ris=Math.pow(a,b);
   
   document.getElementById("risultato").value=ris;
}
