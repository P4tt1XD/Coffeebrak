/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Pati
 */
public class FichaDAO {
    public void cadastroFicha(fichaVO fVO) throws SQLException{
                
                Connection con = ConexaoBanco.getConexao();
                Statement stat = con.createStatement();
                
                try {
                    String sql = "";
                    
                    sql = "insert into ficha(idficha, nome,"
                            + "classe,raca, level, alinhamento, xp)"
                            + "values(null, nome'"+fVO.getNome()+"',"
                            + "raca'"+fVO.getRaca()+"', "
                            + "level'"+fVO.getLevel()+"',"
                            + "xp'"+fVO.getXP()+"',"
                            + "alinhamento"+fVO.getAlinh()+"',"
                            + "classe"+fVO.getClasse()+")";
                    //executando o mysql
                    stat.execute(sql);
                    
                } catch (SQLException e) {
                    throw new SQLException ("Erro ao inserir personagem!");
                    
                }finally{
                    con.close();
                    stat.close();
                }//fecha try
    }
          public void alterarPersonagem(fichaVO fVO) throws SQLException {

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
            sql = "update ficha set nome='"+fVO.getNome()+"',"
                    + "classe'"+fVO.getCLasse()+"',"
                    + "raca"+fVO.getRaca()+"'," 
                    + "level"+fVO.getLevel()+"',"
                    + "alinhamento"+fVO.getAlinh()+"',"
                    + " where idficha = "+fVO.getIdFicha();

            //Executando o sql
            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar personagem!"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
          
     public ArrayList<fichaVO> buscarFicha() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from ficha";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<fichaVO> ficha = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                fichaVO f = new fichaVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                m.setIdFicha(rs.getInt("idFicha"));
                m.setNome(rs.getString("nome"));
                m.setRaca(rs.getString("raça"));
                m.setClasse(rs.getInt("classe"));
               

                /* Inserindo o objeto pVO no ArrayList */
                ficha.add(f);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return ficha;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar medicamento! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
}
