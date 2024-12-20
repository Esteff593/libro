public class libro{
    public String isbn;
    public String titulo;
    public String autor;
    public boolean estado;
    
    public Libro (String isbn, String titulo,String autor,boolean estado){
    this.isbn=isbn;
    this.titulo=titulo;
    this.autor=autor;
    this.estado=estado;
    }
	public void prestar(String libro) {
		System.out.println("Libro prestado"+libro);
	}
}
