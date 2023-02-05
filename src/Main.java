import one.digitalinnovation.gof.Strategy.*;
import one.digitalinnovation.gof.facede.facede;


public class Main {
    public static void main(String[] args) {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        System.out.println("\t --------------- \t");
        robo.setStrategy(defensivo);
        robo.mover();
        System.out.println("\t -----------\t");
        robo.setStrategy(agressivo);
        robo.mover();

        // Facede

        facede fac = new facede();
        fac.migrarCliente("Venildo", "14801788");
    }
}