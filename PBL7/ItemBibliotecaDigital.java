package PBL7;

public abstract class ItemBibliotecaDigital {
    private String Titulo;
    private String Autor;

    public ItemBibliotecaDigital(String titulo, String autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public String getAutor() {
        return Autor;
    }
    public String getTitulo() {
        return Titulo;
    }

    abstract String descricao();
}
