package questao3;

public class Pessoa {
    String nome;
    double altura;
    double peso;
    double IMC;

    public static void calcIMC(Pessoa pessoa) {
        pessoa.IMC = pessoa.peso / (pessoa.altura * pessoa.altura);
    }
}
