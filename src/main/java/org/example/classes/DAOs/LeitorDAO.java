package org.example.classes.DAOs;

import org.example.Connections.ConexaoSQLServer;
import org.example.classes.Leitor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LeitorDAO {
    private ConexaoSQLServer conexao = new ConexaoSQLServer();

    public int inserir(Leitor obj) {
        conexao.conectar();
        String sql = "INSERT INTO Leitor(codigo, nome, email, telefone, documento) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conexao.preparedStatement(sql);
        try {
            stmt.setString(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getDocumento());

            return stmt.executeUpdate();  // <-- ESSENCIAL
        } catch (SQLException e) {
            System.err.println("Erro ao inserir: " + e.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

    public int alterar(Leitor obj) {
        conexao.conectar();
        String sql = "UPDATE Leitor SET nome = ?, email = ?, telefone = ?, documento = ? WHERE codigo = ?";
        PreparedStatement stmt = conexao.preparedStatement(sql);
        try {
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getEmail());
            stmt.setString(3, obj.getTelefone());
            stmt.setString(4, obj.getDocumento());
            stmt.setString(5, obj.getCodigo());

            return stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar: " + e.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

    public int remover(Leitor obj){
        conexao.conectar();
        String sql = "DELETE FROM leitor WHERE codigo=?";
        PreparedStatement stmt = conexao.preparedStatement(sql);
        try{
            stmt.setString(1, obj.getCodigo());
            return stmt.executeUpdate();
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
            return 0;
        }
        finally{
            conexao.desconectar();
        }
    }

    public Leitor retorna(String codigo){
        conexao.conectar();
        String Sql = "SELECT * FROM Leitor WHERE codigo=?";
        PreparedStatement stmt = conexao.preparedStatement(Sql);
        try{
            stmt.setString(1, codigo);
            ResultSet retorno = stmt.executeQuery();
            if(retorno.next()){
                Leitor obj = new Leitor(retorno.getString("codigo"),
                                        retorno.getString("nome"),
                                        retorno.getString("documento"),
                                        retorno.getString("email"),
                                        retorno.getString("telefone"));

                return obj;
            } else {
                return null;
            }
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally{
            conexao.desconectar();
        }
    }

}
