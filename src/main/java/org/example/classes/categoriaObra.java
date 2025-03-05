package org.example.classes;

public class categoriaObra {
    public String codigo;
    public String tipo;

    public categoriaObra(String codigo, String tipo) {
        setCodigo(codigo);
        setTipo(tipo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private Boolean guardar() {return null;}
    private Boolean carregar() {return null;}

    public String mostrar() {
        System.out.println(getCodigo());
        System.out.println(getTipo());
        return "";
    }
}
