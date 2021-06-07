/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Pati
 */
public class DAOFactory {
    private static final PostoDAO PDAO = new PostoDAO();
    
    public static PostoDAO getCadastroDAO(){
        return PDAO;
    }//fecha método
    
    private static final MedicamentoDAO MDAO = new MedicamentoDAO();
    
    public static MedicamentoDAO getMedicamentoDAO(){
        return MDAO;
    }
}
