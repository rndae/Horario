import java.util.Comparator;

public class Orden
{
    private Orden(){ 
        throw new RuntimeException("No es para crear instancia de"); }
    
    public static void ordenar(Object[] h, Comparator comparador){
        /* +Merge Sort+ */
        int n=h.length;
        for(int k = 1; k <= n; k = k+k)
            for(int lo = 0; lo <n-k ;lo += k+k  ){
                if(noOrdenado(comparador, h, lo+k-1)){
                    merge(h, new Object[n], lo, lo+k-1, Math.min(lo+2*k-1, n-1), comparador);
                }
            }
    }
    
    private static void merge(Object[] a, Object[] aux, int lo, int mid,int hi, Comparator c){
        for(int k = lo; k <= hi; k++)
            aux[k] = a[k]; 
        
        int i=lo , j = mid+1;
        for(int k = lo; k <= hi; k++){
            if (i>mid) a[k] = aux[j++];
            else if(j>hi) a[k] = aux[i++];
            else if(menor(c, a[j],a[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
    
    private static boolean noOrdenado(Comparator c,Object[] a,int mid){
        return menor(c,a[mid+1],a[mid]); //mid+1<mid
    }
    
    private static boolean menor(Comparator c, Object v,Object w){
        return c.compare(v,w)<0;
    }
    
    private static void inter(Object[] a, int i, int j){
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
