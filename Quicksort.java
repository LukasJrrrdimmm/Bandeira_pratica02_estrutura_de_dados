package qsort;

public class Quicksort {
	static void swap(int[] a, int i, int j) {
		int h;
        h = a[i];
        a[i] = a[j];
        a[j] = h;
    }

    static int partition(int[] a, int l, int r) {
        int m = l;
        //System.out.println(l + " is l " + r + " is r " + a.length);
        
        while(m != r){
        	//System.out.println("m = " + m + " r = " + r + " l = " + l);
        	if(a[m] < a[l]){
        		int i = m;
        		swap(a, a[l], a[m]);
        		
        		m++;
        	}else
        	
        		if(a[m] > a[r]){
        		//int i = r;
        		//while(i > m){
        			swap(a, a[m], a[r]);
        			r--;
        			m++;
        			//i--;
        		//}
        	}
        	
        }
    	return m;
    }

    static void quickrec(int[] a, int l, int r) {
        // a ser completada
    }

    static void quicksort(int[] a) {
        // a ser completada
    }
}
