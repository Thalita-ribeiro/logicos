package fundamentos;

import java.util.Scanner;

public class DesafioConversam {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro salário: ");
        String valor1 = ler.next().replace(",", ".");

        System.out.println("Digite o segundo salário: ");
        String valor2 = ler.next().replace(",", ".");

        System.out.println("Digite o terceiro salário: ");
        String valor3 = ler.next().replace(",", ".");

        double salario1= Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("O valor da média é: " + media);

        ler.close();
    }
}
