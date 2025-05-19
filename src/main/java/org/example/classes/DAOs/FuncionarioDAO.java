package org.example.classes.DAOs;

import org.example.Connections.ConexaoSQLServer;
import org.example.classes.Funcionario;
import org.example.classes.Leitor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAO {
    private ConexaoSQLServer conexao = new ConexaoSQLServer();

    public int inserir(Funcionario obj) {
        conexao.conectar();
        String sql = "INSERT INTO Funcionario(Codigo, Nome, Email, Telefone, Documento, Cargo) values(?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conexao.preparedStatement(sql);
        try {
            stmt.setString(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getDocumento());
            stmt.setString(6, obj.getCargo());
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
            return 0;
        }
        finally {
            conexao.desconectar();
        }
        return 0;
    }

    public int alterar(Funcionario obj){
        conexao.conectar();

        String sql = "UPDATE Funcionario SET Nome=?, Email=?, Telefone=?, Documento=?, Cargo=? WHERE Codigo=?";
        PreparedStatement stmt = conexao.preparedStatement(sql);
        try{
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getDocumento());
            stmt.setString(6, obj.getCargo());
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

    public int remover(Funcionario obj){
        conexao.conectar();
        String sql = "DELETE FROM Funcionario WHERE Codigo=?";
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

    public Funcionario retorna(String codigo){
        conexao.conectar();
        String Sql = "SELECT * FROM Funcionario WHERE codigo=?";
        PreparedStatement stmt = conexao.preparedStatement(Sql);
        try{
            stmt.setString(1, codigo);
            ResultSet retorno = stmt.executeQuery();
            if(retorno.next()){
                Funcionario obj = new Funcionario(
                                    retorno.getString("Codigo"),
                                    retorno.getString("Nome"),
                                    retorno.getString("Email"),
                                    retorno.getString("Telefone"),
                                    retorno.getString("Documento"),
                                    retorno.getString("Cargo")
                );
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
