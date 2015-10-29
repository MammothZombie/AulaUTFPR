/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.DAO;

import br.edu.utfpr.Modelo.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoDerby implements Dao{
    
    Statement stat;
    
    //quando construir um objeto, conectar ao banco
    public PessoaDaoDerby() {
        String username = "Engel";
        String password = "utfpr";
        String url = "jdbc:derby://localhost:1527/MeuBancoDeDados";
        
        //depois disso, mandar conectar
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            stat = con.createStatement();
            System.out.println("Conexão estabelecida");
        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
        
    }
    
    

    @Override
    public void adicionar(Pessoa p) {
        String instrucao = "INSERT INTO PESSOA (NOME, SOBRENOME,IDADE) VALUES(" + "'" + p.getNome() + "'" + "," + "'" +  p.getSobrenome() + "'" + "," + p.getIdade() + ")";
        System.out.println(instrucao);
        
        try {
            stat.executeUpdate(instrucao);
        } catch (Exception se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

    @Override
    public void remover(Pessoa p) {
        String instrucao = "DELETE FROM PESSOA WHERE NOME = " + "'" + p.getNome() + "'";
        System.out.println(instrucao);
        
        try {
            stat.executeUpdate(instrucao);
        } catch (Exception se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

    @Override
    public void listarTudo() {
        String instrucao = "SELECT * FROM PESSOA";
        System.out.println(instrucao);
        
        try {
            ResultSet rs = stat.executeQuery(instrucao);
            
            while (rs.next()) {
                System.out.println("Nome: " + rs.getString("NOME") + "  Sobrenome: " + rs.getString("SOBRENOME") + "  Idade: " + rs.getString("IDADE") );
                
            }
            
        } catch (Exception se) {
            System.out.println("Mensagem de erro: " + se.getMessage());
        }
    }
    
    
    
}
