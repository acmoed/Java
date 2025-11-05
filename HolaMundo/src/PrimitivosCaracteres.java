public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracterUnicode =  '\u0040';
        System.out.println("caracterUnicode = " + caracterUnicode);
        
        char caracterASCII = 64;
        System.out.println("caracterASCII = " + caracterASCII);
        System.out.println("(caracterASCII == caracterUnicode) = " + (caracterASCII == caracterUnicode));

        char simbolo ='@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracterASCII));

        char varUnicode =  '\u0040';
        System.out.println("caracterUnicode = " + varUnicode);

        System.out.println("Tipo Char corresponde a Bytes a = " + Character.BYTES);
        System.out.println("Tipo Char corresponde en Bites a = " + Character.SIZE);
        System.out.println("Valor máximo de un Char = " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un Char = " + Character.MIN_VALUE);

        char espacio = ' ';
        System.out.println("espacio = " + espacio);
        char retroceso = '\b';
        System.out.println("retroceso =" + retroceso);
        char tabulador = '\t';
        System.out.println("tabulador = " + tabulador + "tabulador");
        char nuevaLinea = '\n';
        System.out.println("nuevaLinea = " + nuevaLinea + "Nueva linea");
        char retornoCarro = '\r';
        System.out.println("retornoCarro = " + retornoCarro);
        System.out.println("Nueva linea" + System.getProperty("line.separator") + "nueva linea");

    }
}
