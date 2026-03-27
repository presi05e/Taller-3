import java.util.Scanner;

public class tablamultiplicar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println(" ===== TABLA DE MULTIPLICAR ===== ");
            System.out.println("   ___________________________________________");
            System.out.println("  |                                           |");
            System.out.println("  |  \\(^o^)/  Aprende multiplicando  \\(^o^)/  |");
            System.out.println("  |___________________________________________|");

            System.out.print("\nIngrese un numero: ");
            int num = sc.nextInt();

            System.out.println("\n Tabla del " + num + ":\n");

            for (int i = 1; i <= 10; i++) {

                System.out.println("  " + num + " x " + i + " = " + (num * i));
            }

            System.out.println("\n Fin de la tabla ( 0 _ 0 )");

        } catch (Exception e) {

            System.out.println(" Error: ingrese solo numeros ¯\\(°_o)/¯");
        }
    }
}