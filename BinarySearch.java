
public class BinarySearch {
    public static void main(String[] args) throws Exception {
        int a[] = {10,20,30,40,50};  
        int k = 30;  
        int l=a.length-1;  
        binarySearch(a,0,l,k);     
  }
  public static void binarySearch(int a[], int f, int l, int k){  
    int m = (f + l)/2;  
    while( f <= l ){  
       if ( a[m] < k ){  
         f = m + 1;     
       }else if ( a[m] == k ){  
         System.out.println("Element is found at index: " + m);  
         break;  
       }else{  
          l = m - 1;  
       }  
       m = (f + l)/2;  
    }  
    if ( f > l ){  
       System.out.println("Element is not found!");  
    }  
}
}
