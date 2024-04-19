package PBL7;

public class Ebook extends ItemBibliotecaDigital implements Baixavel{

    private int numeroPaginas;
    private String formato;

    public Ebook(String titulo, String autor) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
        this.formato = formato;
    }
    @Override
    public String descricao(){
        return "Ebook: " + getTitulo() + " - Autor: " + getAutor() + " - Numero de páginas: " + numeroPaginas +
                "Formato" + formato;
    }

    @Override
    public void baixar() { System.out.println("Baixando Ebook: " + getTitulo());}
}
