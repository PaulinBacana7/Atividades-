import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        realizarSoma();
        calcularMedia();
        converterTemperatura();
        contarVogais();
        exibirTabuada();
    }

    public static void realizarSoma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int soma = (int) (num1 + num2);

        System.out.println("A soma dos números é: " + soma);
    }

    public static void calcularMedia() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite mais um número: ");
        int n3 = scanner.nextInt();

        float media = (n1 + n2 + n3) / 3.0f;

        System.out.println("A média dos números é: " + media);
    }

    public static void converterTemperatura() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura (Celsius): ");
        float temperatura = scanner.nextFloat();

        float temperaturaConvertida = (temperatura * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + temperaturaConvertida + "F");
    }

    public static void contarVogais() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de caracteres: ");

        String sequencia = scanner.next();

        System.out.println(sequencia);
        char[] caracteres = sequencia.toUpperCase().toCharArray();

        int qtdVogais = 0;

        for (char caractere : caracteres) {
            if (caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
                qtdVogais++;
            }
        }

        System.out.println("A sua sequência de caracteres possui: " + qtdVogais + " vogais.");
    }

    public static void exibirTabuada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " multiplicado por " + i + " é igual a " + numero * i);
        }
    }
}
