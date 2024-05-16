package Classes;

public class CaixaEletronico {
    
private int identificador;
private String localizacao;
private double saldo;

public CaixaEletronico(int identificador, String localizacao, double saldo) {
    this.identificador = identificador;
    this.localizacao = localizacao;
    this.saldo = saldo;
}
public int getIdentificador() {
    return identificador;
}
public void setIdentificador(int identificador) {
    this.identificador = identificador;
}
public String getLocalizacao() {
    return localizacao;
}
public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
}
public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}

}
