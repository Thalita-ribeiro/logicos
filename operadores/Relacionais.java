package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {

        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);

        double nota = 7.0;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim." : "Não";

        System.out.printf("Tem desconto? %s " , resultado);
    }
}
