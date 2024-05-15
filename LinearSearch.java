
public class LinearSearch {
    public static void main(String[] args) throws Exception {
        int[] a= {10,20,30,50,70,90};    
        int k = 50;    
        System.out.println(k+" is found at index: "+search(a, k));    
    }
    public static int search(int[] a, int k){    
        for(int i=0;i<a.length;i++){    
            if(a[i] == k){    
                return i;    
            }    
        }    
        return -1;    
    }    
}
