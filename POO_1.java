class Main {
  public static void main(final String[] args) {
    System.out.println(" ");
    System.out.println("\t ---------- \t");
    System.out.println(" ");
    final Cliente cliente1 = new Cliente();
    cliente1.setNomeCompleto("João da Silva");
    cliente1.setCpf("023.111.000");
    cliente1.setEndereco("AV. São Paulo 231, apt.31, bairro: Água Verde, Pará - PA");
    cliente1.setCep("80.321 - 210");
    cliente1.cadastro();
    System.out.println("");
    System.out.println("-----------");
    final Cliente cliente2 = new Cliente();
    cliente2.setNomeCompleto("Maria Garcia");
    cliente2.setCpf("032.211.001 - 23");
    cliente2.setEndereco("Rua Dr. Pedrosa 32, apt 101, bairro: Centro, Curitiba - PR");
    cliente2.setCep("84.321 - 110");
    cliente2.cadastro();
    System.out.println(" ");
    System.out.println("---------");
    System.out.println("Conta - Corrente.");
    System.out.println(" ");
    final Conta conta1 = new Conta();
    conta1.setNomeCompleto("Moíses Ribeiro.");
    conta1.setCpf("011.321.342 - 11");
    conta1.setEndereco("Rua Mal. Floriano 123, apt 05, bairro: Xaxim, Belo Horizonte - MG");
    conta1.setCep("55.120 - 213");
    conta1.setNumeroAgencia("001");
    conta1.setNumeroConta("233.455 - 2");
    conta1.setSaldo(5000);
    conta1.cadastro();
    System.out.println("Saldo: " + conta1.getSaldo());
    System.out.println("Deposito de 800 reais.");
    conta1.deposito(800);
    System.out.println("Novo Saldo: " + conta1.getSaldo());
    System.out.println("Saque de 500 reais");
    conta1.saque(500);
    System.out.println("Novo Saldo: " + conta1.getSaldo());
    System.out.println("");
    System.out.println("------------");
  }
}
class Cliente{
  String nomeCompleto;
  String cpf;
  String endereco;
  String cep;
  
public String getNomeCompleto() {
	return nomeCompleto;
}
public void setNomeCompleto(final String nomeCompleto) {
	this.nomeCompleto = nomeCompleto;
}
public String getCpf() {
	return cpf;
}
public void setCpf(final String cpf) {
	this.cpf = cpf;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(final String endereco) {
	this.endereco = endereco;
}
public String getCep() {
	return cep;
}
public void setCep(final String cep) {
	this.cep = cep;
}
public void cadastro(){
  System.out.println("Cadastro do cliente: ");
  System.out.println("Nome: " + getNomeCompleto());
  System.out.println("CPF: " + getCpf());
  System.out.println("Endereço: " + getEndereco());
  System.out.println("CEP: " + getCep());
}
}
class Conta extends Cliente{
  String numeroConta;
  String numeroAgencia;
  float saldo;
  
private Object valor;
  
public String getNumeroConta() {
	return numeroConta;
}
public void setNumeroConta(final String numeroConta) {
	this.numeroConta = numeroConta;
}
public String getNumeroAgencia() {
	return numeroAgencia;
}
public void setNumeroAgencia(final String numeroAgencia) {
	this.numeroAgencia = numeroAgencia;
}
public float getSaldo() {
	return saldo;
}
public void setSaldo(final float saldo) {
	this.saldo = saldo;
}
public void deposito (final float valor) {
    saldo += valor;
  }
public void saque (final float valor){
    saldo -= valor;
}
public float saldo(){
    return this.getSaldo();
}
}
