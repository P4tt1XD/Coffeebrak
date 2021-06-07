/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.MedicamentoDAO;
import dao.PostoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.MedicamentoVO;
import modelo.PostoVO;

/**
 *
 * @author Pati
 */
public class MedicamentosServicos {
    
        public void cadastrarMedicamento(MedicamentoVO mVO) throws SQLException{
       MedicamentoDAO mDAO = DAOFactory.getMedicamentoDAO();
        mDAO.cadastroMedicameno(mVO);

    }//fecha método
    
    public ArrayList<MedicamentoVO> buscarMedicamento() throws SQLException{
        MedicamentoDAO mDAO = DAOFactory.getMedicamentoDAO();
       return mDAO.buscarMedicamento();
    }//fecha métod
    
}
