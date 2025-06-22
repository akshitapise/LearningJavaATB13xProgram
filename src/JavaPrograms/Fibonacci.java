package JavaPrograms;

public class Fibonacci {
    public static void main(String[] args) {
        int a= 0;
        int b=1;
        int k;
        for (int i = 0; i <= 5 ; i++) {
            k = a+b;
            b=a;
            a=k;
            System.out.println(k);

        }
    }
}
/*
              sum = K+i,
k i           i=k; sum+i

1+0 = 1 sum
1+1=  2 sum
2+1 =3
3+2 = 5
*/