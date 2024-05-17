package Classes;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(int idConta, int numero,
      int agencia, int digitoVerificador,
      String nome, String cpf,
      String numeroCartao, String senha, double saldo) {
    super(idConta, numero, agencia,
        digitoVerificador, nome, cpf,
        numeroCartao, senha, saldo);
  //  this.setTipoConta();
   // this.setTipoConta();
  }

  @Override
  public void setTipoConta() {
    super.setTipoConta(3);
  }

}
