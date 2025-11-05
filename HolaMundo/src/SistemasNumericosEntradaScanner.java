import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();
            //numeroDecimal = Integer.parseInt(numeroStr);
        } catch (InputMismatchException e) {
            System.out.println("Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        //entero a binario
        String resultadoBinario = "numeroBinario = " + numeroDecimal +" = " + Integer.toBinaryString(numeroDecimal);


        //octal
        String resultadoOctal = "numeroOctal = " + numeroDecimal +" = " + Integer.toOctalString(numeroDecimal);


        //hexadecimal
        String resultadoHexadecimal = "numeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);



        String mensaje = resultadoBinario + "\n";
        mensaje += resultadoOctal + "\n";
        mensaje += resultadoHexadecimal;

        System.out.println(mensaje);

    }
}
