package org.example.classes;

public class Emprestimo {
    public String codigo;
    public String dataEmprestimo;
    public String dataPrevisto;
    public String dataDevolvido;
    public float multa;
    public String situacao;

    public Emprestimo(String codigo, String dataEmprestimo, String dataPrevisto, String dataDevolvido, float multa, String situacao) {
        setCodigo(codigo);
        setDataEmprestimo(dataEmprestimo);
        setDataPrevisto(dataPrevisto);
        setDataDevolvido(dataDevolvido);
        setMulta(multa);
        setSituacao(situacao);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataPrevisto() {
        return dataPrevisto;
    }

    public void setDataPrevisto(String dataPrevisto) {
        this.dataPrevisto = dataPrevisto;
    }

    public String getDataDevolvido() {
        return dataDevolvido;
    }

    public void setDataDevolvido(String dataDevolvido) {
        this.dataDevolvido = dataDevolvido;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    private Boolean cadastrar() { return null; }
    private Boolean carregar() { return null; }
    private Boolean devolver() { return null; }
    private String listar() { return null; }

    public String mostrar() {
        System.out.println(getCodigo());
        System.out.println(getSituacao());
        System.out.println(getDataEmprestimo());
        System.out.println(getDataDevolvido());
        System.out.println(getDataPrevisto());
        System.out.println(getMulta());
        return "";
    }

}
