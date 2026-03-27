import java.util.Scanner;

public class menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            try {

                System.out.println(
                        " __| |____________________________________________| |__\n"
                      + "(__   ____________________________________________   __)\n"
                      + "   | |        MENU DE OPCIONES  ( ͡° ͜ʖ ͡°)          | |\n"
                      + "   | |  1. Suma n Fibonacci                       | |\n"
                      + "   | |  2. N-avo numero primo                     | |\n"
                      + "   | |  3. Raices ecuacion cuadratica             | |\n"
                      + "   | |  4. Promedio de numeros                    | |\n"
                      + "   | |  5. Salir                                  | |\n"
                      + " __| |____________________________________________| |__\n"
                      + "(__   ____________________________________________   __)\n"
                );

                System.out.print("Seleccione una opcion: ");
                int opcion = sc.nextInt();

                if (opcion == 1) {

                    System.out.print("Ingrese n");
                    int n = sc.nextInt();

                    int a = 0, b = 1, suma = 0;

                    for (int i = 0; i < n; i++) {
                        suma += a;
                        int temp = a + b;
                        a = b;
                        b = temp;
                    }

                    System.out.println("Suma Fibonacci: " + suma);
                }

                else if (opcion == 2) {

                    System.out.print("Ingrese n");
                    int n = sc.nextInt();

                    int contador = 0, numero = 1;

                    while (contador < n) {
                        numero++;
                        if (esPrimo(numero)) contador++;
                    }

                    System.out.println("Primo: " + numero);
                }

                else if (opcion == 3) {

                    System.out.print("Ingrese A");
                    double A = sc.nextDouble();

                    System.out.print("Ingrese B");
                    double B = sc.nextDouble();

                    System.out.print("Ingrese C");
                    double C = sc.nextDouble();

                    double d = (B * B) - (4 * A * C);

                    if (d < 0) {
                        System.out.println("No tiene soluciones reales ¯\\_( ͡° ͜ʖ ͡°)_/¯");
                    } else {

                        double r = raiz(d);

                        double x1 = (-B + r) / (2 * A);
                        double x2 = (-B - r) / (2 * A);

                        System.out.println("Raiz 1: " + x1);
                        System.out.println("Raiz 2: " + x2);
                    }
                }

                else if (opcion == 4) {

                    System.out.print("Cantidad de numeros");
                    int n = sc.nextInt();

                    double suma = 0;

                    for (int i = 1; i <= n; i++) {
                        System.out.print("Numero " + i );
                        suma += sc.nextDouble();
                    }

                    System.out.println("Promedio: " + (suma / n));
                }

                else if (opcion == 5) {
                    System.out.println("Fin del programa (• ◡•)");
                    break;
                }

                else {
                    System.out.println("Opcion invalida (ಠ_ಠ)");
                }

            } catch (Exception e) {

                System.out.println("Error: ingrese solo lo que se le esta pidiendo (⌐■_■)︻╦╤─");
                sc.nextLine(); // limpiar buffer
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static double raiz(double num) {
        double x = num, y = 1, e = 0.00001;
        while (x - y > e) {
            x = (x + y) / 2;
            y = num / x;
        }
        return x;
    }
}