package ex1;
import java.util.ArrayList;
import java.util.Scanner;

public class TestBookManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book libro1 = new Book(1, "Pulgarcito", "Esteban", 3);
        Book libro2 = new Book(2, "BlaBla", "Laila", 5);
        Book libro3 = new Book(3, "Pitufinos", "Eva", 4);
        Book libro4 = new Book(4, "Duendes", "Alfonso", 1);
        Book libro5 = new Book(5, "Resetas", "George", 0);
        ArrayList<Book> libros = new ArrayList<>();
        BookManager biblioteca = new BookManager(libros);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
        boolean next = true;
        while (next) {
            System.out.println("1. mostrar tots els llibres actuals.\n" +
                    "2. retornar el llibre en funció del títol del llibre.\n" +
                    "3. retornar el llibre en funció del autor del llibre.\n" +
                    "4. actualitzar el rating d'un llibre.\n" +
                    "5. retornar una llista ordenada descendent dels llibres en funció dels ratings.\n" +
                    "6. retornar una llista dels millors N llibres en funció dels ratings.\n" +
                    "7. retornar una llista amb els llibres amb rating més gran que un valor minRating.\n" +
                    "8. eliminar un llibre de la llista en funció del id del llibre.\n" +
                    "9. eliminar un llibre amb el mètode remove(Book book). \n" +
                    "0. SALIR =>");
            System.out.print("Introduce una opción: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("mostrar tots els llibres actuals.");
                    biblioteca.mostrarTodosLosLibros();
                    break;
                case 2:
                    System.out.println("retornar el llibre en funció del títol del llibre.");
                    System.out.println(biblioteca.buscarLibroXTitulo("Resetas"));
                    break;
                case 3:
                    System.out.println("retornar el llibre en funció del autor del llibre.");
                    System.out.println(biblioteca.buscarLibroXAutor("Eva"));
                    break;
                case 4:
                    System.out.println("actualitzar el rating d'un llibre");
                    biblioteca.actualizacionRatingLibro();
                    break;
                case 5:
                    System.out.println("retornar una llista ordenada descendent dels llibres en funció dels ratings. ");
                    System.out.println(biblioteca.listaOrdenadaDes());
                    break;
                case 6:
                    System.out.println("retornar una llista dels millors N llibres en funció dels ratings.");
                    System.out.println(biblioteca.listaMejoresLibros());
                    break;
                case 7:
                    System.out.println("retornar una llista amb els llibres amb rating més gran que un valor minRating.");
                    System.out.println(biblioteca.listaLibrosConRatingMasGrande(3));
                    break;
                case 8:
                    System.out.println("eliminar un llibre de la llista en funció del id del llibre.");
                    biblioteca.eliminarLibroDeListaPoId(2);
                    break;
                case 9:
                    System.out.println("eliminar un llibre amb el mètode remove(Book book).");
                    biblioteca.agregarLibro(libro4);
                    break;
                case 0:
                    System.out.println("saliendo...");
                    next = false;
                    break;
            }
        }
    }
}
