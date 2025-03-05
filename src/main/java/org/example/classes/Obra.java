package org.example.classes;

public class Obra {
    private String codigo;
    private String titulo;
    private String autores;
    private String editora;
    private String ano;
    private String descritivo;
    private String isbn;

    public Obra(String codigo, String titulo, String autores, String editora, String ano, String descritivo, String isbn) {
        setCodigo(codigo);
        setTitulo(titulo);
        setAutores(autores);
        setEditora(editora);
        setAno(ano);
        setDescritivo(descritivo);
        setIsbn(isbn);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public String getEditora() {
        return editora;
    }

    public String getAno() {
        return ano;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public String getIsbn() {
        return "*****";
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private Boolean guardar() { return null; };
    private Boolean carregar() { return null; };
    private Boolean listar() { return null; };


    public String mostrar() {
        System.out.println(getCodigo());
        System.out.println(getTitulo());
        System.out.println(getAutores());
        System.out.println(getEditora());
        System.out.println(getAno());
        System.out.println(getDescritivo());
        System.out.println(getIsbn());
        return "";
    }
}
