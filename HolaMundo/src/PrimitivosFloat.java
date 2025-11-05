public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 15000.0f;
        System.out.println("realFloat = " + realFloat);

        //abreviado con exponente
        float realFloatAbre = 1.5e4f; //abreviado con exponente
        System.out.println("realFloat = " + realFloatAbre);

        //abreviado con exponente y negativo
        float realFloatAbreNeg = 1.5e-4f; //abreviado con exponente
        System.out.println("realFloat = " + realFloatAbreNeg);

        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo Float corresponde a Bytes a = " + Float.BYTES);
        System.out.println("Tipo Float corresponde en Bites a = " + Float.SIZE);
        System.out.println("Valor máximo de un Float = " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un Float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235e38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo Double corresponde a Bytes a = " + Double.BYTES);
        System.out.println("Tipo Double corresponde en Bites a = " + Double.SIZE);
        System.out.println("Valor máximo de un Double = " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un Double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);

    }
}
