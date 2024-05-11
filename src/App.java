import java.util.ArrayList;
import java.util.Scanner;

import Classes.conta;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<conta> contas = new ArrayList<conta>();
        contas.add(new conta(1,
                123,
                1234,
                "Rafael Rosario",
                "12345678910",
                1234567899,
                "123245",
                "1234"));
        Scanner scanner = new Scanner(System.in);
        // Entrada
        // 1 - Ir até um caixa eletronico
        // 2 - Inserir 0 Cartão
        // 2.1 validar os dados dos cartâo
        System.out.println("insira o numero do cartão: ");
        String numeroCartao = scanner.nextLine();

        conta contaSaque = null;
        for (conta conta : contas) {
            if (conta.getNumeroCartao().equals(numeroCartao)) {
                contaSaque = conta;
                break;

            }

            if (contaSaque == null) {
                throw new Error("conta não encontrada");
            }

        }

        // 3 - Inserir a senha
        System.out.println("insira a sua senha: ");
        String senha = scanner.nextLine();

        

        // 4 - Validar a Senha
        if (!contaSaque.getSenha().equals(senha)) {
            throw new Error("Senha incorreta! ");
            
        }
        // 5 - Informar o valor do saque
        // processamento
        // 6 - Validar se o caixa possui saldo
        // 7 - Validar se a conta possui saldo
        // 8 - Liberar o dinheiro para o cliente
        // 9 - Registrar a Transação
        // 10 - Encerrar a operação

    }
}
