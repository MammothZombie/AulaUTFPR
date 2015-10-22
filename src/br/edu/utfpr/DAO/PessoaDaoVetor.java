/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.DAO;

import br.edu.utfpr.Modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoVetor implements Dao{
    
    private Pessoa lista[];
    private int i;

    public PessoaDaoVetor() {
        lista = new Pessoa[5];
        i = 0;
    }
    
    

    @Override
    public void adicionar(Pessoa p) {
        lista[i] = p;
        i++;
        System.out.println("A Pessoa \"" + p.getNome() + "\" foi adicionada");
        
    }

    @Override
    public void remover(Pessoa p) {
        //lista[i] = 
        System.out.println("A Pessoa \"" + p.getNome() + "\" foi removida"); 
    }

    @Override
    public void listarTudo() {
        System.out.println("--Inicio--");
        for (i=0; i<5; i++){
            System.out.println("V["+ i +"] = " + lista[i]);
        }
        System.out.println("--Final--");
        System.out.println("Pessoas adicionadas: " + i);
        
    }
    
}
