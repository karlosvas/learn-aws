package src.math;

public class Conversiones {
    public static void main(String[] args) {
        double anguloGrados = 45;
        double anguloRadianes = Math.toRadians(anguloGrados);
        double anguloConvert = Math.toDegrees(anguloRadianes);

        // Radianes
        System.out.println("Original -> " + anguloGrados);
        System.out.println("Radial: " + anguloRadianes + " Degrees: " + anguloConvert);
        
        // Seno
        double res = Math.sin(anguloRadianes); 
        System.out.println("Seno " + res);

        // Coseno
        double res2 = Math.cos(anguloRadianes); 
        System.out.println("Coseno " + res2);

        // Tangente
        double res3 = Math.tan(anguloRadianes); 
        System.out.println("Coseno " + res3);

        // Arco coseno
        double res4 = Math.acos(anguloRadianes);
        System.out.println("Arco Coseno " + res4);

        // Arco seno
        double res5 = Math.asin(anguloRadianes);
        System.out.println("Arco seno " + res5);

         // Arco tangente
         double res6 = Math.atan(anguloRadianes);
         System.out.println("Arco seno " + res6);
    }
}
