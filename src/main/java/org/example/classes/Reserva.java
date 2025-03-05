package org.example.classes;

public class Reserva {
    public String codigo;
    public String dataReserva;
    public String dataPrevista;
    public String situacao;

    public Reserva(String codigo, String dataReserva, String dataPrevista, String situacao) {
        setCodigo(codigo);
        setDataReserva(dataReserva);
        setDataPrevista(dataPrevista);
        setSituacao(situacao);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    private String cadastrar() { return null; }
    private String cancelar() { return null; }
    private String retirar() { return null; }

    public String mostrar() {
        System.out.println(getCodigo());
        System.out.println(getDataReserva());
        System.out.println(getDataPrevista());
        System.out.println(getSituacao());
        return "";
    }

}
