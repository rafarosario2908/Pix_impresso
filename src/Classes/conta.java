package Classes;

public class conta {
    private int numero;
    private int agencia;
    private int digitoVerificador;
    private String nome;
    private String cpf;
    // (1-conta |corrente 2-conta salario 3-conta poupança)
    private int tipoConta;
    private String numeroCartao;
    private String senha;


    public conta(int numero, int agencia, int digitoVerificador, String nome, String cpf, int tipoConta,
            String numeroCartao, String senha) {
        this.numero = numero;
        this.agencia = agencia;
        this.digitoVerificador = digitoVerificador;
        this.nome = nome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
        this.numeroCartao = numeroCartao;
        this.senha = senha;
    }


    public int getNumero() {
        return numero;
    }


    public int getAgencia() {
        return agencia;
    }


    public int getDigitoVerificador() {
        return digitoVerificador;
    }


    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }


    public int getTipoConta() {
        return tipoConta;
    }


    public String getNumeroCartao() {
        return numeroCartao;
    }


    public String getSenha() {
        return senha;
    }



    
}
