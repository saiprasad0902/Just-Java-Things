package com.prasad.learnings.coding;

public class Fibonacci {
    public static void main(String[] args) {
        fibRec a = new fibRec();
        fibNonRec b = new fibNonRec();
        for(int i=1; i<=5; i++){
            System.out.print(a.findFib(i) +" ");
        }

        for(int i=1; i<=5; i++){
            System.out.println(b.findFib(i));
        }
    }

    static class fibRec{
        public int findFib(int number) {
            if(number == 1 || number == 2){
                return 1;
            }
            return findFib(number-1) + findFib(number -2);
        }
    }

    static class fibNonRec{
        public int findFib(int number) {
            if(number == 1 || number == 2){ return 1; }
            int fibo1=1, fibo2=1, fibonacci=1;
            for(int i= 3; i<= number; i++){
                //Fibonacci number is sum of previous two Fibonacci number
                fibonacci = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = fibonacci;
            }
            return fibonacci;
    }
  }
}
