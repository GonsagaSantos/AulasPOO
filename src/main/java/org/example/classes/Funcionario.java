package org.example.classes;

public class Funcionario {
    public String codigo;
    public String nome;
    public String email;
    public String telefone;
    public String documento;
    public String cargo;

    public Funcionario(String codigo, String nome, String email, String telefone, String documento, String cargo) {
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setDocumento(documento);
        setCargo(cargo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    private Boolean guardar() { return null; }
    private Boolean carregar() { return null; }
    private String listar() { return null; }

    public String mostrar() {
        System.out.println(getCodigo());
        System.out.println(getNome());
        System.out.println(getDocumento());
        System.out.println(getEmail());
        System.out.println(getTelefone());
        System.out.println(getCargo());
        return "";
    }

}
