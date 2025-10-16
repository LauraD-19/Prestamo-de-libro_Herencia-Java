public class Libro {
    protected String Titulo;
    protected String Autor;
    protected double Precio;
    protected int CantidadE;
    protected boolean Disponibilidad;
    protected int codigo;



    public Libro() {
    }

    public Libro(String titulo, String autor, double precio, int cantidadE, boolean disponibilidad, int codigo) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.Precio = precio;
        this.CantidadE = cantidadE;
        this.Disponibilidad = disponibilidad;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getCantidadE() {
        return CantidadE;
    }

    public void setCantidadE(int cantidadE) {
        CantidadE = cantidadE;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        Disponibilidad = disponibilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String mostrarInfo(){
        return "Lista de libros: \n"+" --Titulo: "+Titulo+" --Autor: "+Autor+" -- Precio: "+ Precio+ " --Cantidad de ejemplares: "+CantidadE+" --Disponibilidad: "+Disponibilidad+" --Código: "+codigo;
    }
}
