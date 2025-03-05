package org.example.classes;

public class Leitor {
    private String codigo;
    private String nome;
    private String email;
    private String telefone;
    private String documento;

    public Leitor(String codigo, String nome, String email, String telefone, String documento) {
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setDocumento(documento);
    }

    public String getCodigo() { return codigo; }

    public String getNome() { return nome; }

    public String getEmail() { return email; }

    public String getTelefone() { return telefone; }

    public String getDocumento() { return documento; }

    public void setCodigo(String codigo) { this.codigo = codigo; }

    public void setNome(String nome) { this.nome = nome; }

    public void setEmail(String email) { this.email = email; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public void setDocumento(String documento) { this.documento = documento; }


    private Boolean guardar() { return null; }
    private Boolean carregar() { return null; }
    private Boolean listar() { return null; }

    public String mostrar() {
        System.out.println(getCodigo());
        System.out.println(getNome());
        System.out.println(getEmail());
        System.out.println(getTelefone());
        System.out.println(getDocumento());
        return "";
    }
}
