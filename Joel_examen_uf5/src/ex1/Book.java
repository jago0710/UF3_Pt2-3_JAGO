package ex1;

public class Book {

    private int id;
    private String title;
    private String author;
    private int valor; //Del 0 al 5

    public Book(int id, String title, String author, int valor) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", valor=" + valor +
                "} \n";
    }

    public static int verificarValor(int valor){
        if (valor >= 0 && valor <= 5) {
            return valor;
        } else {
            System.out.println("El valor tiene que ser entre 0 y 5");
            return -1;
        }
    }

}
