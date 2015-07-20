import java.text.DecimalFormat;

public class ExamplePow
{
    public static void main( String[] argv )
    {

        // System.out.println("temp " + (int) Math.pow(5, 4));
        
        DecimalFormat df = new DecimalFormat("0.00");   

        double[] arrRadio = new double[] { 0, 45, 90, 135, 180, 225, 270, 315, 360 };

        for (double radio : arrRadio)
        {
            
            double value = Math.tan(Math.toRadians(radio));
            value = ((double) Math.round(value * 1000)) / 1000;
            double degrees = Math.toDegrees(Math.atan(value));
            
            println("degrees : " + radio + " degrees -> " +  degrees + " value -> " +  value  );
        }
        
//        for (double radio : arrRadio)
//        {
//            println("sin : " + radio + " -> " + Math.sin(radio) + " -> ");
//        }
//        
//
//        for (double radio : arrRadio)
//        {
//            println("cos : " + radio + " -> " + Math.cos(radio) + " -> " );
//        }

    }
    
    public static void println( String str )
    {
        System.out.println(str);
    }
}
