package fundamentos;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Wrappers {
    public static void main(String[] args) {
        //É A VERSAO OBJETO DO TIPO PRIMITIVO
        Byte b = 100;
        Short s = 1000;
        Integer i = 1000; //int
        Long l = 10000L;
        Float f = 123f;
        Double d = 12.34433;
        Character c = '#'; //char

        b.byteValue();
        b.toString();

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
    }
}
