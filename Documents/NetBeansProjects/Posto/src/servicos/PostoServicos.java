/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.PostoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.PostoVO;

/**
 *
 * @author Pati
 */
public class PostoServicos {
    
     public void efetuarCadastro(PostoVO pVO) throws SQLException{
         PostoDAO pDAO = DAOFactory.getCadastroDAO();
        pDAO.efetuarCadastro(pVO);

    }//fecha método
    
    public ArrayList<PostoVO> buscarPaciente() throws SQLException{
        PostoDAO pDAO = DAOFactory.getCadastroDAO();
       return pDAO.buscarPaciente();
    }//fecha métod
    
    public void deletarPaciente(long id) throws SQLException{
        PostoDAO pDAO = DAOFactory.getCadastroDAO();
        pDAO.deletarPaciente(id);
    }//fecha metodo deletarProduto
    
     public ArrayList<PostoVO> filtrar(String query) throws SQLException {
        PostoDAO pDAO = DAOFactory.getCadastroDAO();
        return pDAO.filtrar(query);
    }//fecha método
     
     public void alterarPaciente(PostoVO pVO) throws SQLException {
        PostoDAO pDAO = DAOFactory.getCadastroDAO();
        pDAO.alterarCadastro(pVO);
    }//fecha método
}
