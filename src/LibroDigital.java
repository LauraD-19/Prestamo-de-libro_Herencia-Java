public class LibroDigital extends Libro {
    private double Tamaño;

    public LibroDigital() {
    }

    public LibroDigital(String titulo, String autor, double precio, int cantidadE, boolean disponibilidad, double tamaño) {
        super(titulo, autor, precio, cantidadE, disponibilidad);
        this.Tamaño = tamaño;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(double tamaño) {
        Tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Libros digitales: " + super.toString() +
                " Tamaño=" + Tamaño;
    }
    @Override
    public String mostrarInfo(){
        return "Lista de libros: \n"+" --Titulo: "+Titulo+" --Autor: "+Autor+" -- Precio: "+ Precio+ " --Cantidad de ejemplares: "+CantidadE+" --Disponibilidad: "+Disponibilidad+" --Tamaño del libro: "+Tamaño;
    }

}
