package projeto02;

import java.util.LinkedList;

public class Mergesort {
	static LinkedList<Integer> r1 = new LinkedList<Integer>();
	static LinkedList<Integer> r2 = new LinkedList<Integer>();
	static LinkedList<Integer> r = new LinkedList<Integer>();
	public Mergesort(){
		
		
	}
	static void split(LinkedList<Integer> l, LinkedList<Integer> l1, LinkedList<Integer> l2) {
        //int i1 = 0, i2 = 0;
		int leng = l.size();
        //System.out.println(leng);
       
        double result = leng%2;
        int count = 0;
        int lim1 = 0;
        if(result == 0){
    		lim1 = leng/2;
    	}else{
    		lim1 = (leng - 1)/2;
    	}
        while(count < l.size()){
        	if(count < lim1){
        		r1.add(l.get(count));
        		l1.add(l.get(count));
        	}else{
        		r2.add(l.get(count));
        		l2.add(l.get(count));
        		
        	}
        	count++;
        }
        /*count = 0;
        int count2 = 0;
        int selS = 0;
        int elementr = 0;
        while(count < R1.size()){
        	count2 = 0;
        	selS = R1.peekFirst();
        	while(count2 < R1.size()){
        		if(selS > R1.get(count2))
        			selS = R1.get(count2);
        		count2++;
        	}
        	l1.addFirst(selS);
        	R1.remove(selS);
        	count++;
        }*/
        r = l;
    }

    static LinkedList<Integer> merge(LinkedList<Integer> l1,
                                     LinkedList<Integer> l2) {
    	int c1 = 0, c2 = 0;
    	//r2 = l2;
    	LinkedList<Integer> l_Ordenado = new LinkedList<Integer>();
    	while(c1 < l1.size() && c2 < l2.size()){
    		if(l1.get(c1)<l2.get(c2)){
    			l_Ordenado.add(l1.get(c1));
    			c1++;
    		}else{
    			l_Ordenado.add(l2.get(c2));
    			c2++;
    		}
    		if(c1 == l1.size()){
    			while(c2 != l2.size()){
    				l_Ordenado.add(l2.get(c2));
    				c2++;
    			}
    		}
    		if(c2 == l2.size()){
    			while(c1 != l1.size()){
    				l_Ordenado.add(l1.get(c1));
    				c1++;
    			}
    		}
    	}
    	
        return l_Ordenado; // a ser completada
    }

    static LinkedList<Integer> mergesort(LinkedList<Integer> l) {
    	LinkedList<Integer> merg = new LinkedList<Integer>();
    	LinkedList<Integer> i1 = new LinkedList<Integer>(),
    			i2 = new LinkedList<Integer>();
    	if(l.size() > 1){
    		split(l, i1, i2);
    			i1 = mergesort(i1);
    			i2 = mergesort(i2);
    			merg = merge(i1, i2);
    			return merg;
    		}else{
    			return l;
    		}
    	}
    }
