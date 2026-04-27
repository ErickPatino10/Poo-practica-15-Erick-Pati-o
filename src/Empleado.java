public class Empleado {
    private String nombre;
    private int horasTrabajadas;


    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        setHorasTrabajadas(horasTrabajadas);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        if (horasTrabajadas > 0)
            this.horasTrabajadas = horasTrabajadas;
        else
            System.out.println("Horas invalidas de trabajo");
    }

    public void  mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Horas trabajadas: "+horasTrabajadas);

    }
}
