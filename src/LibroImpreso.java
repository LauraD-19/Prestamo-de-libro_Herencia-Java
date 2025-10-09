public class LibroImpreso extends Libro{
    private double Peso;

    public LibroImpreso() {
    }

    public LibroImpreso(String titulo, String autor, double precio, int cantidadE, boolean disponibilidad, double peso) {
        super(titulo, autor, precio, cantidadE, disponibilidad);
        this.Peso = peso;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }


    @Override
    public String toString() {
        return "Libros impresos: "+super.toString() +
                " Peso=" + Peso;
    }
    @Override
    public String mostrarInfo(){
        return "Lista de libros: \n"+" --Titulo: "+Titulo+" --Autor: "+Autor+" -- Precio: "+ Precio+ " --Cantidad de ejemplares: "+CantidadE+" --Disponibilidad: "+Disponibilidad+" --Peso del libro: "+Peso;
    }
}
