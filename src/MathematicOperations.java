public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Redondea entero hacia arriba
        System.out.println(Math.ceil(x));

        // Redondea entero hacia arriba
        System.out.println(Math.floor(x));

        // Redondea un numero elevado a otro
        System.out.println(Math.pow(x, y));

        // Redondea el numero mayor
        System.out.println(Math.max(x, y));

        // Devuelve la raiz cuadrada de un numero
        System.out.println(Math.sqrt(y));


        // Calcular area de un cuadrado con un radio de 8cm
        var radius = 8;
        System.out.println(Math.PI * (Math.pow(radius, 2)));

        //Area de una esfera
        //4 * Pi * r2
        System.out.println(4 * Math.PI * Math.pow(y, 2));
    }
}
