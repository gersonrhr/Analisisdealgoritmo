package trabajoanalisis;

import java.util.*;
import trabajoanalisis.Muestra;
 
public class CocktailSort{
 
    public int as=0;

    public int getAs() {
        return as;
    }
    
public static int[] sort(int[] numbers) 
{
      boolean swapped = true;
      int i = 0;
      int j = numbers.length - 1;
      while(i < j && swapped) 
      {
         swapped = false;
         for(int k = i; k < j; k++) 
         {
            if(numbers[k] > numbers[k + 1]) 
            {
               int temp = numbers[k];
               numbers[k] = numbers[k + 1];
               numbers[k + 1] = temp;
               swapped = true;
            }
         }
         j--;
         if(swapped) 
         {
            swapped = false;
            for(int k = j; k > i; k--) 
            {
               if(numbers[k] < numbers[k - 1]) 
               {
                  int temp = numbers[k];
                  numbers[k] = numbers[k - 1];
                  numbers[k - 1] = temp;
                  swapped = true;
               }
            }
         }
         i++;
      }
      return numbers;    
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