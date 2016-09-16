package projeto02at2;

public class Dutchflag {
	static void swap(int[] a, int i, int j) {
        int h;
        h = a[i];
        a[i] = a[j];
        a[j] = h;
        
    }

    static void dutch_flag(int[] a) {
    	int b = 0, i = 0;
    	int n = a.length - 1;
    	int i1 = 0;
    	int c = 0;
    	System.out.println(a.length);
    	int r = n;
    	int count = 0;
    	while(count <= r){
    		if (b == a.length)
    			break;
    		System.out.println("b = " + b + " i = " + count + " r = " + r);
    		switch(a[count]){
    		case 0:
    			swap(a,count,b);
            	b++;
            	count++;
    			break;
    		case 2:
    			swap(a,count,r);
    			r--;
    			break;
    		case 1:
    			count++;
    		}
    	}
    }
}

