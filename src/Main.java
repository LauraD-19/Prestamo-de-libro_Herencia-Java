import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        List<Libro>LibroList=new ArrayList<>();
        int op;
        String buscar;
        int op4;
        System.out.println("Bienvenido (•◡•) /");

        do{
            System.out.println("Por favor eliga una de las siguientes opciones:");
            System.out.println(" 1. Para crear un nuevo libro impreso \n 2. Para crear un nuevo digital\n 3. Mostrar los libros \n 4.Buscar libro\n 5.Mostrar libros digitales \n 6.Mostrar libros Impresos \n 7.Buscar libro por titulo \n 8. Salir");
            op = teclado.nextInt();
            switch (op){
                case 1://crear impreso
                    Libro_Impreso(teclado, LibroList);
                    break;
                case 2://crear digital
                    Libro_Digital (teclado, LibroList);
                    break;
                case 3://Mostrar libros
                    for (Libro L: LibroList){
                        System.out.println(L.mostrarInfo());
                    }
                    break;
                case 4://Buscar libro
                    System.out.println("Nombre del libro deseas buscar?:");
                    buscar=teclado.next();
                    for (Libro L: LibroList){
                        if(buscar.equalsIgnoreCase(L.getTitulo())){//equalsIgnoreCase:independiente de qeu el usuario escriva en minusculas o mayusculas pueda buscar el libro
                            System.out.println(L);
                        }else {
                            System.out.println("El libro no se encontro o no esta bien escrito \n Por favor intentelo de nuevo");
                            break;
                        }
                    }
                    break;
                case 5://mostrar digitales
                    for (Libro L : LibroList){
                        if (L instanceof LibroDigital){
                            System.out.println(L);
                        }
                    }
                case 6:// mostrar impresos
                    for (Libro L : LibroList){
                        if (L instanceof LibroImpreso){
                            System.out.println(L);
                        }
                    }
                case 7:
                    System.out.println("Saliendo...");
                    System.out.println("Que tenga buen día ʕ•́ᴥ•̀ʔっ ...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");

            }
        }while (op != 7);
    }
    private static void Libro_Impreso(Scanner teclado, List<Libro>LibroList){
        int codigo=0;
        teclado.nextLine();
        System.out.println("Escriba el nombre del libro:");
        String Nombre = teclado.nextLine();
        System.out.println("Escriba el nombre del Autor:");
        String Autor = teclado.nextLine();
        System.out.println("Precio del libro:");
        double Precio = teclado.nextInt();
        System.out.println("Cantidad de ejemplares:");
        int CantidadE= teclado.nextInt();
        System.out.println("Disponibilidad del libro (true para disponible y false para no):");
        boolean Disponibilidad= teclado.nextBoolean();
        System.out.println("Peso del libro:");
        double Peso = teclado.nextInt();

        codigo++;
        Libro Libro_Im= new LibroImpreso(Nombre,Autor,Precio,CantidadE,Disponibilidad,codigo,Peso);
        LibroList.add(Libro_Im);
        System.out.println("--Libro registrado...");
    }

    private static void Libro_Digital(Scanner teclado, List<Libro>LibroList) {
        int codigo=0;
        teclado.nextLine();
        System.out.println("Escriba el nombre del libro:");
        String Nombre = teclado.nextLine();
        System.out.println("Escriba el nombre del Autor:");
        String Autor = teclado.nextLine();
        System.out.println("Precio del libro:");
        double Precio = teclado.nextInt();
        System.out.println("Cantidad de ejemplares:");
        int CantidadE= teclado.nextInt();
        System.out.println("Disponibilidad del libro (true para disponible y false para no):");
        boolean Disponibilidad= teclado.nextBoolean();
        System.out.println("Tamaño del libro:");
        double Tamaño = teclado.nextInt();


        codigo++;
        Libro Libro_D= new LibroDigital(Nombre,Autor,Precio,CantidadE,Disponibilidad,codigo,Tamaño);
        LibroList.add(Libro_D);
        System.out.println("--Libro registrado...");
    }







}