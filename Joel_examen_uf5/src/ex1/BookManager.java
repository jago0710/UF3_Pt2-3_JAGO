package ex1;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    public static Scanner sc = new Scanner(System.in);

    private ArrayList<Book> listaLibros;

    public BookManager(ArrayList<Book> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void agregarLibro(Book book){
        listaLibros.add(book);
    }

    public void mostrarTodosLosLibros(){
        for ( Book book : listaLibros) {
            System.out.println(book);
        }
    }

    public Book buscarLibroXTitulo(String titulo){
        for ( Book book : listaLibros) {
            if (book.getTitle().equals(titulo)){
                return book;
            }
        }
        return null;
    }

    public Book buscarLibroXAutor(String autor){
        for ( Book book : listaLibros) {
            if (book.getAuthor().equals(autor)){
                return book;
            }
        }
        return null;
    }

    public void actualizacionRatingLibro(){
        try{
            System.out.println("Indica el titulo del libro que quieres cambiar el rating");
            String titulo = sc.nextLine();
            Book libro = buscarLibroXTitulo(titulo);
            System.out.println("Ingresa el nuevo Rating: ");
            int nuevoRating = sc.nextInt();
            if (Book.verificarValor(nuevoRating) == -1) {
                System.out.println("Vuelve a intentarlo");
                actualizacionRatingLibro();
            } else {
                libro.setValor(nuevoRating);
            }
        }catch (Exception e){
            System.out.println("Error al ingresar un dato" + e);
        }
    }

    public ArrayList<Book> listaOrdenadaDes(){
        ArrayList<Book> listaOrdenada = new ArrayList<>();
        for (int i = 5; i >= 0; i--) {
            for (Book book : listaLibros) {
                if (book.getValor() == i) {
                    listaOrdenada.add(book);
                }
            }
        }
        return listaOrdenada;
    }

    public ArrayList<Book> listaMejoresLibros(){
        ArrayList<Book> listaMejoresLibros = new ArrayList<>();
        for (Book book : listaLibros) {
            if(book.getValor() == 5){
                listaMejoresLibros.add(book);
            }
        }
        return listaMejoresLibros;
    }

    public ArrayList<Book> listaLibrosConRatingMasGrande(int minRating){
        ArrayList<Book> listaRatingMasGrande = new ArrayList<>();
        for (Book book : listaLibros) {
            if (book.getValor() > minRating) {
                listaRatingMasGrande.add(book);
            }
        }
        return listaRatingMasGrande;
    }

    public void eliminarLibroDeListaPoId(int idLibro){
        for (Book book : listaLibros) {
            if (book.getId() == idLibro) {
                listaLibros.remove(idLibro);
            }
        }
    }

    public void eliminarLibro(Book book){
        listaLibros.remove(book);
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "listaLibros=" + listaLibros +
                '}';
    }
}
