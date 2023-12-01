Aluno Paulo Gabriel Lopes Souza 

// Exercício 1

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();
        
        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade atual é: " + idade + " anos");

        scanner.close();
    }
}

// Exercício 2 

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        switch (escolha) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:

                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}

// Exercício 3

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}

// Exercício 4

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}

// Exercício 5

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

// Exercício 6

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();

        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + tempFahrenheit);

        scanner.close();
    }
}

// Exercício 7

import java.util.Scanner;

public class MediaSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}

// Exercício 8

import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros anual: ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o período em anos: ");
        int periodo = scanner.nextInt();

        double jurosSimples = principal * (1 + taxaJuros * periodo);

        System.out.println("Valor total após " + periodo + " anos: " + jurosSimples);

        scanner.close();
    }
}

// Exercício 9 

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura : ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        scanner.close();
    }
}



