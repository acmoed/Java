public class ConversionDeTipos {
    public static void main(String[] args) {
        
        //Conversión de Strings a enteros y reales
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "True";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);


        //Conversión de Strings (var) a enteros y reales
        var numeroStrVar = "50";
        var numeroIntVar = Integer.parseInt(numeroStrVar);
        System.out.println("numeroIntVar = " + numeroIntVar);
    

        var realStrVar = "98765.43e-3";
        var realDoubleVar = Double.parseDouble(realStrVar);
        System.out.println("realDoubleVar = " + realDoubleVar);

        var logicoStrVar = "True";
        var logicoBooleanVar = Boolean.parseBoolean(logicoStrVar);
        System.out.println("logicoBooleanVar = " + logicoBooleanVar);
        
    }
}
