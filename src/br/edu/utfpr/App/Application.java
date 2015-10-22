/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.App;

import br.edu.utfpr.DAO.Dao;
import br.edu.utfpr.DAO.PessoaDaoArrayList;
import br.edu.utfpr.DAO.PessoaDaoVetor;
import br.edu.utfpr.Modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class Application {
    
    public static void main(String[] args){
        Pessoa joao = new Pessoa("João", "Silva", 20);
        Pessoa jose = new Pessoa("Jose", "Silva", 30);
        Pessoa maria = new Pessoa("Maria", "Silva", 40);
        Dao dao = new PessoaDaoArrayList();
        Dao d = new PessoaDaoVetor();
        
        System.out.println("Bem vindo");
        
        d.adicionar(joao);
        d.adicionar(jose);
        d.adicionar(maria);
        
        d.listarTudo();
        
        System.out.println("\n\nVamos remover...");
        //d.remover(jose);
        d.listarTudo();
        d.listarTudo();
        
    }
    
}
