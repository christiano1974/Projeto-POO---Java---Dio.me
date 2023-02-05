package one.digitalinnovation.gof.Subsistema1;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no subsistema de CRM.");
        System.out.println("\t ----- \t");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
