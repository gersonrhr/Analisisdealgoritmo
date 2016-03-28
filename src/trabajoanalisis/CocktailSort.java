package trabajoanalisis;

import java.util.*;
import trabajoanalisis.CocktailMuestra;
 
public class CocktailSort{
 
    public int as=0;

    public int getAs() {
        return as;
    }
    
  public static void sort( int[] array ){
    boolean swapped;
    do {
      swapped = false;
      for (int i =0; i<=  array.length  - 2;i++) {
        if (array[ i ] > array[ i + 1 ]) {
          //test whether the two elements are in the wrong order
          int temp = array[i];
          array[i] = array[i+1];
          array[i+1]=temp;
          swapped = true;
        }
      }
      if (!swapped) {
        //we can exit the outer loop here if no swaps occurred.
        break;
      }
      swapped = false;
      for (int i= array.length - 2;i>=0;i--) {
        if (array[ i ] > array[ i + 1 ]) {
          int temp = array[i];
          array[i] = array[i+1];
          array[i+1]=temp;
          swapped = true;
        }
      }
    //if no elements have been swapped, then the list is sorted
    } while (swapped);
  }
 
  long ejecutar(int n){
//     n=100;
    
    Random rnd= new Random();
    
    int [] array=new int [n];
    
    for (int i=0; i<n; i++){
    array[i]=rnd.nextInt()%1000;
    }
    CocktailMuestra desorden=new CocktailMuestra();
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