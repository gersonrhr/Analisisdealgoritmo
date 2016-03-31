package trabajoanalisis;

import java.util.*;
import trabajoanalisis.Muestra;
 
public class CocktailSort{
 
    public int as=0;

    public int getAs() {
        return as;
    }
    
public static int[] sort(int[] datos) 
{
    boolean cambiado = true;
    int i = 0;
    int j = datos.length - 1;
    while(i < j && cambiado) 
    {
        cambiado = false;
        for(int k = i; k < j; k++) 
        {
            if(datos[k] > datos[k + 1]) 
            {
                int temp = datos[k];
                datos[k] = datos[k + 1];
                datos[k + 1] = temp;
                cambiado = true;
            }
        }
        j--;
        if(cambiado) 
        {
            cambiado = false;
            for(int k = j; k > i; k--) 
            {
                if(datos[k] < datos[k - 1]) 
                {
                    int temp = datos[k];
                    datos[k] = datos[k - 1];
                    datos[k - 1] = temp;
                    cambiado = true;
                }
            }
        }
        i++;
    }
    return datos;    
}
 
  long ejecutar(int n){
//     n=100;
    
    Random rnd= new Random();
    
    int [] array=new int [n];
    
    for (int i=0; i<n; i++){
    array[i]=rnd.nextInt()%1000;
    }
    Muestra desorden=new Muestra();
    desorden.desordenllenar(array);
    
//    System.out.println("Before: " + Arrays.toString(array));
    long inicio=System.currentTimeMillis();
    sort(array);
    long fin=System.currentTimeMillis();
    long tiempo=fin-inicio;
//    System.out.println("After:  " + Arrays.toString(array));
//    desorden.ordenllenar(array);
    
//    System.out.println("After:  " + Arrays.toString(array));
    desorden.ordenllenar(array);
     return tiempo;
  }
  long ejecutarsin(int n){
//     n=100;
    
    Random rnd= new Random();
    
    int [] array=new int [n];
    
    for (int i=0; i<n; i++){
    array[i]=rnd.nextInt()%1000;
    }
//    CocktailMuestra desorden=new CocktailMuestra();
//    desorden.desordenllenar(array);
//    System.out.println("Before: " + Arrays.toString(array));
    long inicio=System.currentTimeMillis();
    sort(array);
    long fin=System.currentTimeMillis();
    long tiempo=fin-inicio;
//    System.out.println("After:  " + Arrays.toString(array));
//    desorden.ordenllenar(array);
    return tiempo;
  
  }
  public static void main() {
 
//    int [] array = {5,3,0,2,4,1,0,7,2,9,1,4}; 
//    n=100;
//    Random rnd= new Random();
//    
//    int [] array=new int [n];
//    
//    for (int i=0; i<n; i++){
//    array[i]=rnd.nextInt()%1000;
//    }
//    CocktailMuestra desorden=new CocktailMuestra();
//    desorden.desordenllenar(array);
////    System.out.println("Before: " + Arrays.toString(array));
//    sort(array);
////    System.out.println("After:  " + Arrays.toString(array));
// 
//  }

  }
}