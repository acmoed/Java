public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb  = new StringBuilder(a);  //anexar elementos con el metodo append

        long inicio = System.currentTimeMillis(); //toma el tiempo en milisegundos


        for (int i = 0; i<10000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500 = 2 milisegundos , 1000 = 3 milisegundos

            //c += a + b + "\n"; //500 = 15 milisegundos

            sb.append(a).append(b).append("\n"); //500 = 0 milisegundos, 1000 = 0 milisegundos
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c= " + c);
        System.out.println("sb = " +sb.toString());
    
    }
    
}
