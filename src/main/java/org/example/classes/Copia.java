package org.example.classes;

public class Copia {
    public String codigo;
    public String situacao;
    public String descritivo;

    public Copia(String codigo, String situacao, String descritivo) {
        setCodigo(codigo);;
        setSituacao(situacao);
        setDescritivo(descritivo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    private Boolean guardar() { return null; }
    private Boolean carregar() { return null; }
    private String listar() { return null; }

    public String mostrar() {
        System.out.println(getCodigo());
        System.out.println(getSituacao());
        System.out.println(getDescritivo());
        return "";
    }

}
