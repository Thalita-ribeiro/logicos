package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

        //Trabalho na terça (v ou f)

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        //Operador Unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\" ? " + comprouTV50);
        System.out.println("Comprou TV 32\" ? " + comprouTV32);
        System.out.println("Comprou sorvete? " + comprouSorvete);
        //Operador Unário!
        System.out.println("Mais saudável? " + !comprouSorvete);
    }
}
