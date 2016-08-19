package projeto02;

import java.util.LinkedList;

//import projeto02EX.Mergesort;

public class main {

	public static void main(String[] args) {
		int M = 10;
		//Ex1 a = new Ex1();
		System.out.println("teste de split");
        for (int len = 0; len < 10; len++) {
            LinkedList<Integer> l = Ex1.random_list(len);
            System.out.println("         l = " + l);
            int occ[] = Ex1.occurrences(l);
            LinkedList<Integer> l1 = new LinkedList<Integer>(), l2 = new LinkedList<Integer>();
            Mergesort.split(l, l1, l2);
            int[] new_occ = Ex1.occurrences(l);
            for (int i = 0; i < M; i++)
                if (occ[i] != new_occ[i]) {
                    System.out.println("ERRO : split modificou seu parametro (l = " + l + ")");
                    System.exit(1);
                }
            System.out.println("  split(l) = " + l1 + " / " + l2);
            int occ0[] = Ex1.occurrences(l1);
            int occ1[] = Ex1.occurrences(l2);
            for (int i = 0; i < M; i++)
                if (occ0[i] + occ1[i] != occ[i]) {
                    System.out.println("ERRO : os elementos diferem");
                    System.exit(1);
                }
        }
        System.out.println("teste de merge");
        for (int len = 0; len < 5; len++) {
            LinkedList<Integer> l1 = new LinkedList<Integer>(), l2 = new LinkedList<Integer>();
            for (int i = 0; i < len; i++) {
                l1.add(2 * i);
                l2.add(2 * i + 1);
            }
            System.out.println("            l1 = " + l1);
            System.out.println("            l2 = " + l2);
            int occ1[] = Ex1.occurrences(l1);
            int occ2[] = Ex1.occurrences(l2);
            LinkedList<Integer> l = Mergesort.merge(l1, l2);
            System.out.println("  merge(l1,l2) = " + l);
            if (!Ex1.is_sorted(l)) {
                System.out.println("ERRO : o resultado nao esta ordenado");
                System.exit(1);
            }
            int occ[] = Ex1.occurrences(l);
            for (int i = 0; i < M; i++)
                if (occ1[i] + occ2[i] != occ[i]) {
                    System.out.println("ERRO : os elementos diferem");
                    System.exit(1);
                }
        }
        System.out.println("teste de mergesort");
        for (int len = 0; len < 10; len++)
            for (int j = 0; j <= len; j++)
                Ex1.test(Ex1.random_list(len));
        System.out.println("SUCESSO");
    }

	}
