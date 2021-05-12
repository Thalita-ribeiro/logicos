package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro númeoro: ");
        double valor1 = ler.nextDouble();

        System.out.println("Digite o segundo númeoro: ");
        double valor2 = ler.nextDouble();

        System.out.println("Informe a operação ");
        String operacao = ler.next();

        double resultado = "+".equals(operacao) ? valor1 + valor2 : 0;
        resultado = "-".equals(operacao) ? valor1 - valor2 : resultado;
        resultado = "*".equals(operacao) ? valor1 * valor2 : resultado;
        resultado = "/".equals(operacao) ? valor1 / valor2 : resultado;
        resultado = "%".equals(operacao) ? valor1 % valor2 : resultado;

        System.out.printf("%.2f %s  %.2f = %.2f ", valor1, operacao, valor2, resultado);

        ler.close();
    }
}
