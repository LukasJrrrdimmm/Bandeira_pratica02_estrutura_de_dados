package qsort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("teste de partition");
        for (int len = 0; len < 10; len++)
            for (int l = 0; l < len; l++)
                for (int r = l+1; r < len; r++)
                    Ex3.test_partition(Ex3.random_array(len), l, r);
        System.out.println("teste de quicksort");
        for (int len = 0; len < 10; len++)
            for (int j = 0; j <= len; j++)
                Ex3.test(Ex3.random_array(len));
        System.out.println("SUCESSO");
	}

}
