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
 public fichaVO(int idficha, String nome, String raca, String classe, int level, int xp) {
        this.idficha = idficha;
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.level = level;
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
