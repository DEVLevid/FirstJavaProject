package questao3;

import java.util.Scanner;

public class Teste {
    private static Pessoa[] pessoasCadastradas = new Pessoa[10];
    private static int totalPessoas = 0;

    public static void selectedQuestion() {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1. Cadastrar uma pessoa");
            System.out.println("2. Mostrar as pessoas que estão abaixo do peso (IMC < 18,5)");
            System.out.println("3. Mostrar as pessoas que estão dentro do peso ideal (IMC >= 18,5 e IMC < 25)");
            System.out.println("4. Mostrar as pessoas que estão acima do peso (IMC >= 25)");
            System.out.println("0. Sair");

            int option = scn.nextInt();
            scn.nextLine();

            switch (option) {
                case 1:
                    if (totalPessoas < pessoasCadastradas.length) {
                        Pessoa cadastrandoPessoa = new Pessoa();
                        System.out.println("Digite o nome da pessoa: ");
                        cadastrandoPessoa.nome = scn.nextLine();
                        System.out.println("Digite o peso da pessoa: ");
                        cadastrandoPessoa.peso = scn.nextDouble();
                        System.out.println("Digite a altura da pessoa: ");
                        cadastrandoPessoa.altura = scn.nextDouble();
                        Pessoa.calcIMC(cadastrandoPessoa);
                        pessoasCadastradas[totalPessoas++] = cadastrandoPessoa;
                    } else {
                        System.out.println("Limite de pessoas cadastradas atingido.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < totalPessoas; i++) {
                        if (pessoasCadastradas[i].IMC < 18.5) {
                            System.out.println(pessoasCadastradas[i].nome + " está abaixo do peso!");
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < totalPessoas; i++) {
                        if (pessoasCadastradas[i].IMC >= 18.5 && pessoasCadastradas[i].IMC < 25) {
                            System.out.println(pessoasCadastradas[i].nome + " está dentro do peso ideal!");
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < totalPessoas; i++) {
                        if (pessoasCadastradas[i].IMC >= 25) {
                            System.out.println(pessoasCadastradas[i].nome + " está acima do peso!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scn.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
