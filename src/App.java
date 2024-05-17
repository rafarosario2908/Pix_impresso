
import java.util.ArrayList;
import java.util.Scanner;

import Classes.CaixaEletronico;
import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;
import Classes.ContaSalario;
import Classes.Transacao;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Conta> contas = new ArrayList<Conta>();

        contas.add(new ContaCorrente(1,
                123,
                1234,
                0,
                "Rafael rosario",
                "123.456.789-00",
                "123456789",
                "123",
                5000));

        contas.add(new ContaSalario(2,
                123,
                1234,
                0,
                "Rafael rosario",
                "123.456.789-00",
                "123456789",
                "123",5000));
        contas.add(new ContaPoupanca(3,
                123,
                1234,
                0,
                "Rafael rosario",
                "123.456.789-00",
                "123456789",
                "123",
                1000));

        // TODO - Criar uma lista de caixas eletronicos
        ArrayList<CaixaEletronico> caixaEletronicos = new ArrayList<CaixaEletronico>();

        // TODO - Criar objetos do tipo caixa eletronico
        caixaEletronicos.add(new CaixaEletronico(1,
                "Pato Branco",
                10.000));
        caixaEletronicos.add(new CaixaEletronico(2,
                "Clevelandia",
                10.000));
        caixaEletronicos.add(new CaixaEletronico(3,
                "Mariopolis",
                10.000));


        
        ArrayList<Transacao> transacoes = new ArrayList<Transacao>();

        Scanner scanner = new Scanner(System.in);
        // ENTRADA
        // 1 - Ir até um caixa eletrônico
        // 2 - Inserir o cartão
        // 2.1 - Ler os dados do cartão
        // se o número do cartão for igual ao número do cartão de uma conta
        System.out.println("Insira o numero do cartão: ");
        String numeroCartao = scanner.nextLine();

        Conta contaSaque = null;
        for (Conta conta : contas) {
            if (conta.getNumeroCartao().equals(numeroCartao)) {
                contaSaque = conta;
                break;
            }
        }

        if (contaSaque == null) {
            scanner.close();
            throw new Error("Conta não encontrada");
        }

        // 3 - Inserir a senha
        // 4 - Validar a senha (processamento intermediario)
        // se a senha estiver incorreta, vai mostrar um erro e terminar o programa
        System.out.println("Insira a senha: ");
        String senha = scanner.nextLine();

        if (!contaSaque.getSenha().equals(senha)) {
            scanner.close();
            throw new Error("Senha inválida");
        }

        // TODO - 5.1 - Informar o id do Caixa Eletronico

        System.out.println("incira o valor do saque: ");
        double valorSaque = scanner.nextDouble();

        System.out.println("Insira o numero do terminal: ");
        int terminal = scanner.nextInt();

        CaixaEletronico localCaixa = null;
        scanner.close();

        for (CaixaEletronico caixaEletronico : caixaEletronicos) {

            if (caixaEletronico.getIdentificador() == terminal) {
                localCaixa = caixaEletronico;
                break;

            }

        }

        if (localCaixa == null) {
            throw new Error("terminal nao encontrado");

        }

        // 5 - Informar o valor do saque
       if(localCaixa.getSaldo()< valorSaque)
       {
        throw new Error("saldo insuficiente");
       }

       if (contaSaque.getSaldo() < valorSaque) {
        throw new Error("Conta sem saldo");
    }


            // 7 - Validar se a conta possui saldo
            if (contaSaque.getSaldo() < valorSaque) {
                throw new Error("Conta sem saldo");
            }
            // 8 - Liberar o dinheiro para o cliente
            System.out.println("Por favor aguarde... \n O dinheiro estará disponível em instantes");
            // 9 - Registrar a transação
            Transacao transacao = new Transacao(1,
                    contaSaque.getIdConta(),
                    localCaixa.getIdentificador(),
                    valorSaque,
                    'D');


                    transacoes.add(transacao);
    
            // SAÍDA
    
            // 10 - Encerrar a operação
            System.out.println("Operação concluída! \n Obrigado por utilizar o sistema Pix Impresso");
            // 10.1 - Mostrar o comprovante da transação em tela
            System.out.println("Comprovante: ");
            System.out.println("Data: " + transacao.getDataHora().toString());
            System.out.println("Valor: " + transacao.getValor());
            System.out.println("Tipo: " + transacao.getTipoTransacao());
        // TODO - 5.2 - Buscar o caixa eletronico na lista

        // PROCESSAMENTO
        // 6 - Validar se o caixa possui saldo
        // 7 - Validar se a conta possui saldo
        // 8 - Liberar o dinheiro para o cliente
        // 9 - Registrar a transação

        // SAÍDA
        // 10 - Encerrar a operação
        // 10.1 - Mostrar o comprovante da transação em tela
    }
}
