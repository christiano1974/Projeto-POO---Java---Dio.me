package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Strategy.ComportamentoNormal;

public class Test {
    public static <Comportamento> void main(String [] args){

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        System.out.println(lazy1);
        System.out.println("");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        SingletonEager eager1 = SingletonEager.getInstancia();
        System.out.println(eager1);
        System.out.println("");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        SingletonLazyHolder lazyHolder1 = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder1);

    }
}
