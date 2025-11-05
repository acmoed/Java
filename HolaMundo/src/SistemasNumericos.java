import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        //entero a binario
        String resultadoBinario = "numeroBinario = " + numeroDecimal +" = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        // binario a entero
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //octal
        String resultadoOctal = "numeroOctal = " + numeroDecimal +" = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        //octal a entero
        int numeroOctal = 0764;

        //hexadecimal
        String resultadoHexadecimal = "numeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);

        //Hexadecimal a entero
        int numeroHex =0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario + "\n";
        mensaje += resultadoOctal + "\n";
        mensaje += resultadoHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
