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
import modelo.PostoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Pati
 */
public class PostoDAO {
    public void efetuarCadastro(PostoVO Pvo) throws SQLException{
                
                Connection con = ConexaoBanco.getConexao();
                Statement stat = con.createStatement();
                
                try {
                    String sql = "";
                    
                    sql = "insert into cadastro(idpaciente, cartao, nome, estadocivil, "
                            + "cor, sexo, rg, nacionalidade, endereco, numero, "
                            + "cep, cidade, estado, telefone)"  + "values(null,"
                            + "null,'"+Pvo.getNome()+"',"+Pvo.getEstCivil()+","
                            + ""+Pvo.getCor()+","+Pvo.getSexo()+","
                            + ""+Pvo.getRg()+","+Pvo.getNacionalidade()+","
                            + ""+Pvo.getEndereco()+","+Pvo.getNum()+","
                            + ""+Pvo.getCep()+","+Pvo.getCidade()+","
                            + ""+Pvo.getEstado()+","+Pvo.getTel()+")";
                    //executando o mysql
                    stat.execute(sql);
                    
                } catch (SQLException e) {
                    throw new SQLException ("Erro ao inserir cadastro!");
                    
                }finally{
                    con.close();
                    stat.close();
                }//fecha try
    }
          public void alterarCadastro(PostoVO pVO) throws SQLException {

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
            sql = "update posto set nome='"+pVO.getNome()+"', estadocivil='"+pVO.getEstCivil()+"',"
                    + " cartao="+pVO.getCartao()+",nacionalidade='"+pVO.getNacionalidade()+"', "
                    + "endereco='"+pVO.getEndereco()+"', numero="+pVO.getNum()+",cep="+pVO.getCep()+","
                    + "estado='"+pVO.getEstado()+"',cidade="+pVO.getCidade()+",telefone="+pVO.getTel()+","
                    + " where idpaciente = "+pVO.getIdpaciente();

            //Executando o sql
            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar o cadastro!"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
          
     public ArrayList<PostoVO> buscarPaciente() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from posto";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<PostoVO> post = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                PostoVO p = new PostoVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                p.setIdpaciente(rs.getInt("idpaciente"));
                p.setNome(rs.getString("nome"));
                p.setCartao(rs.getLong("cartao"));
                p.setCor(rs.getString("cor"));
                p.setRg(rs.getLong("rg"));
                p.setSexo(rs.getString("sexo"));
                p.setEstCivil(rs.getString("estadocivil"));
                p.setEndereco(rs.getString("endereco"));
                p.setNum(rs.getInt("numero"));
                p.setCep(rs.getLong("cep"));
                p.setCidade(rs.getString("cidade"));
                p.setEstado(rs.getString("estado"));
                p.setTel(rs.getInt("telefone"));

                /* Inserindo o objeto pVO no ArrayList */
                post.add(p);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return post;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar paciente! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
     
      public void deletarPaciente(long id) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "delete from paciente where idpaciente = "+id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar paciente!" +e.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
    }//fecha deletar
      
      public ArrayList<PostoVO> filtrar (String query) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from posto "+query;

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<PostoVO> post = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                PostoVO p = new PostoVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                p.setIdpaciente(rs.getInt("idpaciente"));
                p.setNome(rs.getString("nome"));
                p.setCartao(rs.getLong("cartao"));
                p.setCor(rs.getString("cor"));
                p.setRg(rs.getLong("rg"));
                p.setSexo(rs.getString("sexo"));
                p.setEstCivil(rs.getString("estadocivil"));
                p.setEndereco(rs.getString("endereco"));
                p.setNum(rs.getInt("numero"));
                p.setCep(rs.getLong("cep"));
                p.setCidade(rs.getString("cidade"));
                p.setEstado(rs.getString("estado"));
                p.setTel(rs.getInt("telefone"));

                /* Inserindo o objeto pVO no ArrayList */
                post.add(p);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return post;

        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar produtos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
                
 }//fecha classe

