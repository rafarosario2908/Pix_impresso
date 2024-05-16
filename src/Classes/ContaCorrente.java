package Classes;

public class ContaCorrente extends Conta {

  public ContaCorrente(int idConta, int numero,
      int agencia, int digitoVerificador,
      String nome, String cpf,
      String numeroCartao, String senha) {
    super(idConta, numero, agencia,
        digitoVerificador, nome, cpf,
        numeroCartao, senha);
    this.setTipoConta();
  }

  @Override
  public void setTipoConta() {
    super.setTipoConta(1);
  }
}
