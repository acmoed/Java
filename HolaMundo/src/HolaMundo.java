public class HolaMundo {
    public static void main(String[] args){

        String saludar = "Hola mundo";
        System.out.println(saludar.toUpperCase() + " desde Java");
        
        int numero = 11;
        System.out.println("numero = " + numero);

        boolean valor = false;
        if(valor){
            int numero2 = 5;
            System.out.println("numero2 = " + numero2);
        }
        else {
            System.out.println("numero2 = " + numero);
        }

        var numero3 = "15";

        String nombre;
        nombre = "Eduardo";
        if(numero > 10) {
            nombre = "juan";
        }
        System.out.println(nombre);

        int edad = 5;
    }
}
