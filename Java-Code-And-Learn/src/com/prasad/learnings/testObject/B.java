package com.prasad.learnings.testObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B {
    public static void main(String[] args) {

    }

     static void test(){
         List<A> aList = new ArrayList<>();
         A a = new A();
         for (int i=0;i<=3;i++){
             a = null;
             a.setA(i);
             a.setB(i);
             aList.add(a);

         }

         final Iterator<A> iterator = aList.iterator();
         while (iterator.hasNext()){
             A aa = iterator.next();
             System.out.println(aa.getA());

         }

     }
}
