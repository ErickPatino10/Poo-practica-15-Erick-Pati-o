import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese sus horas trabajadas: ");
        int hT = sc.nextInt();
        System.out.println("Ingrese su pago por horas: ");
        double pagoH = sc.nextDouble();
        EmpleadoPorHoras e1 = new EmpleadoPorHoras(nombre,hT,pagoH);
        e1.mostrarDatos();



    }
}