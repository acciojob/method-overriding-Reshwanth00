package com.driver;

public class Main {
    public static class A{
        public Static String meth(){
            return "Invoking method from class A";
        }
    
    }
    public static class B extends A{
        public Static String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String [] args)
        B abj = new B();
        String S = B.meth();
        System.out.println(S);
        
    }
}
