/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Pati
 */
public class MedicamentoVO {
    
    private int idmedicamento;
    private String nome;
    private String fabricante;
    private int quant;

    public MedicamentoVO() {
    }
    
    /**
     * 
     * @param idmedicamento id do medicamento
     * @param nome nome do medicamento
     * @param fabricante fabricante do medimaneto
     * @param quant quantidade do medicamento
     */
    public MedicamentoVO(int idmedicamento, String nome, String fabricante, int quant) {
        this.idmedicamento = idmedicamento;
        this.nome = nome;
        this.fabricante = fabricante;
        this.quant = quant;
    }

    public int getIdmedicamento() {
        return idmedicamento;
    }

    public void setIdmedicamento(int idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "Id medicamento :" + idmedicamento 
                + "Nome :" + nome + 
                "Fabricante :" + fabricante + 
                "Quantidade :" + quant;
    }
    
}
