import java.util.*;
public class utility
{
    public static String valIniziali(int[] V)
    {   int i;
        String valori=" ";
       
        
        for(i=0;i<V.length;i++)
        {
            valori=valori+V[i]+"/";
        }
        
        return valori;
    }
    
    public static int[] vettore()
    {   
        int V[]=new int [12];    
        int i;
       
        
        Random rnd=new Random();
        
        for(i=0;i<V.length;i++)
        {
           V[i]=rnd.nextInt(100);
        }
        
        return V;
    
    }
    
    public static String trasformavettore(int V[])
    {
        int i;
        String valori="";
        
        for(i=0;i<V.length;i++)
        {
            valori=valori+V[i]+"/";
        }
        
        return valori;
    }
    
    public static int[] BubbleSort(int V[])
    {
       
	boolean flag=true;
	int n=V.length-1;
	int limit=0,temp=0;
	while (flag && n>0){
		flag=false;
		for (int i=0;i<n;i++){
			if (V[i]>V[i+1]){    
				temp=V[i];
				V[i]=V[i+1];
				V[i+1]=temp;
				flag=true;
				limit=i;
			}
		}
		n=limit;
	}
        
        return V;
    }
    
    public static int[] SelectionSort(int V[])
    {
     int i,j,tmp;   
    
        for (i=0; i<V.length-1; i++)
        {   for (j=i+1;j<V.length;j++)
           {    if (V[j] < V[i])
                    {
                       tmp = V[j];
                       V[j] = V[i];
                       V[i] = tmp;
                    }
           }
        }
       return V;
    }
    
    public static int[] InsertionSort(int V[])
    {
     int j; 
        for (int i = 1; i < V.length; i++) 
        {
           int tmp = V[i]; 
      
          for (j = i - 1; (j >= 0) && (V[j] > tmp); j--) 
              {
                V[j + 1] = V[j];
              }
    
           V[j + 1] = tmp;  
                       
        }
     return V;
    }
}