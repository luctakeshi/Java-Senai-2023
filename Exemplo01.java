// Tipos de variáveis em Java

/*
 * String -> Armazena Texto
 * char -> Armazena uma unica letra
 * int -> Números inteiros 
 * float -> Armazena decimais 
 * double -> Armazena grandes números decimais 
 */

/* Regras para criar variáveis:
 * Toda váriavel DEVE começar com letra minúscula
 * Não pode haver espaço no nome da variável
 * nomeAluno, enderecoCliente, produtoAdquirido
 */

 public class Exemplo01{
    
    public static void main(String[] args) {
        
        String nome = "Lucas Vaini";
        int idade = 16;
        boolean chuva = true; // Em variáveis booleanas, eu uso true ou false 
        char letra = 'L'; //todo char DEVE estar em aspas simples ''
        double salario = 3550.49;
        float altura = (float) 1.80;

        System.out.println(nome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Minha inicial é: " + letra);
        System.out.println("Meu salário é: " + salario);
        System.out.println("Minha altura é: " + altura + " metros");
        System.out.println("Está chovendo? " + chuva);

    }

 }