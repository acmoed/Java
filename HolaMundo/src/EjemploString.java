public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación java");
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);


        //Comparación de contenido
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);
        
        //Comparación de contenido, no hace distinción de mayúsculas y minúsculas
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        //comparación de objetos, NO de valores
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);
    }
}
