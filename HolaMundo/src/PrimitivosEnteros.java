public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo Byte corresponde en Bytes a = " + Byte.BYTES);
        System.out.println("Tipo Byte corresponde en Bites a = " + Byte.SIZE);
        System.out.println("Valor máximo de un Byte = " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un Byte = " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en Bytes a = " + Short.BYTES);
        System.out.println("Tipo Short corresponde en Bites a = " + Short.SIZE);
        System.out.println("Valor máximo de un Short = " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un Short = " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo Int corresponde en Bytes a = " + Integer.BYTES);
        System.out.println("Tipo Int corresponde en Bites a = " + Integer.SIZE);
        System.out.println("Valor máximo de un Int = " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un Int = " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroInt = " + numeroLong);
        System.out.println("Tipo Long corresponde en Bytes a = " + Long.BYTES);
        System.out.println("Tipo Long corresponde en Bites a = " + Long.SIZE);
        System.out.println("Valor máximo de un Long = " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un Long = " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775807L;

    }
}
