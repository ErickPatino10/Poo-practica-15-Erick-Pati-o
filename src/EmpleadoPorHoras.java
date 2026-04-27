public class EmpleadoPorHoras extends Empleado  {
    private  double pagoHoras;


    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double pagoHoras) {
        super(nombre, horasTrabajadas);
        this.pagoHoras = pagoHoras;
    }

    public void setPagoHoras(double pagoHoras) {
        if (pagoHoras > 0)
            this.pagoHoras = pagoHoras;
        else
            System.out.println("Pago ivalido");
    }

    public double getPagoHoras() {
        return pagoHoras;
    }

    public Double calcularSalario(){
        return getHorasTrabajadas() * pagoHoras;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario: "+calcularSalario());
    }
}

