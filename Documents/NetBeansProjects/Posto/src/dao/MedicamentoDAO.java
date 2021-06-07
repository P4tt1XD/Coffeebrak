/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.MedicamentoVO;
import modelo.PostoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Pati
 */
public class MedicamentoDAO {
        public void cadastroMedicameno(MedicamentoVO mVO) throws SQLException{
                
                Connection con = ConexaoBanco.getConexao();
                Statement stat = con.createStatement();
                
                try {
                    String sql = "";
                    
                    sql = "insert into medicamentos(idmedicamento, nome,"
                            + "fabricante, quantidade)"
                            + "values(null, nome'"+mVO.getNome()+"',"
                            + "fabricante'"+mVO.getFabricante()+"', "
                            + "quantidade"+mVO.getQuant()+")";
                    //executando o mysql
                    stat.execute(sql);
                    
                } catch (SQLException e) {
                    throw new SQLException ("Erro ao inserir medicamento!");
                    
                }finally{
                    con.close();
                    stat.close();
                }//fecha try
    }
          public void alterarMedicamento(MedicamentoVO mVO) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //String que receberá instrução SQL
            String sql;

            /* Montando a instrução INSERT para inserir
             um objeto pVO no Banco MySQL */
            sql = "update medicamento set nome='"+mVO.getNome()+"',"
                    + "fabricante'"+mVO.getFabricante()+"',"
                    + "quantidade"+mVO.getQuant()+"" 
                    + " where idmedicamento = "+mVO.getIdmedicamento();

            //Executando o sql
            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar medicamento!"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
          
     public ArrayList<MedicamentoVO> buscarMedicamento() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from medicamento";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<MedicamentoVO> med = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                MedicamentoVO m = new MedicamentoVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                m.setIdmedicamento(rs.getInt("idmedicamento"));
                m.setNome(rs.getString("nome"));
                m.setFabricante(rs.getString("fabricante"));
                m.setQuant(rs.getInt("quantidade"));
               

                /* Inserindo o objeto pVO no ArrayList */
                med.add(m);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return med;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar medicamento! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
}
