public class Casting {
    public static void main(String[] args) {
        // Implicito y se calcula exactitud
        char c = 'z';
        int charToInteger = c;

        System.out.println("Char: " + c + " to Integer: " + charToInteger);


        // Implicito de int a long y despues explicito de long a short por lo que finalmente se calcula estimación
        int i = 250;
        long intToLong = i;

        System.out.println("Integer: " + i + " to Long: " + intToLong + " to Short: " + (short) intToLong);


        //Explicito y se calcula estimación
        double d = 301.067;

        System.out.println("Double: " + d + " to Long: " + (long) d);


        // Primero explicita para poder pasar de double a float y realizar la suma (ya int to float es implicita), finalmente se calcula exactitud
        int i2 = 100;
        float intToFloat = i2 + (float) 5000.66;

        System.out.println("Integer: " + i2 + " to Float: " + intToFloat);


        // Explicito int to byte y es estimación
        int i3 = 737;
        i3 *= 100;
        System.out.println("Integer: " + i3 + " to Byte: " + (byte) i3);


        // Explicito y estimación
        double d2 = 298.638;
        d2 /= 25;

        System.out.println("Double: " + d2 + " to Long: " + (long) d2);
    }
}
