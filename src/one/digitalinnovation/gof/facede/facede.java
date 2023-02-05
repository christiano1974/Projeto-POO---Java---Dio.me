package one.digitalinnovation.gof.facede;


import one.digitalinnovation.gof.Subsistema1.CrmService;
import one.digitalinnovation.gof.Subsistema2.CepApi;

public class facede {
    public void migrarCliente(String nome, String cep){
        nome = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cep,estado);
    }

}
