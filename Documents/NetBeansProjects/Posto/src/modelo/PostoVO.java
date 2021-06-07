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
public class PostoVO {
    
    private int idpaciente;
    private long cartao;
    private String nome;
    private String estCivil;
    private String cor;
    private String sexo;
    private long rg;
    private String nacionalidade;
    private String endereco;
    private int num;
    private long cep;
    private String cidade;
    private String estado;
    private int tel;

    public PostoVO() {
    }
    
    /**
     * 
     * @param id id do usuario
     * @param cartao numero do cartão
     * @param nome nome do paciente
     * @param estCivil estado cicvil do paciente
     * @param cor cor do paciente
     * @param sexo sexo do paciente
     * @param rg rg do paciente
     * @param nacionalidade nacionalidade do apciente
     * @param endereco endereco do paciente
     * @param num numero da residenciaa
     * @param cep cep do paciente
     * @param cidade cidade do paciente
     * @param estado estado do paciente
     * @param tel contato do paciente
     */
    public PostoVO(int id, long cartao, String nome, String estCivil, String cor, String sexo, long rg, String nacionalidade, String endereco, int num, long cep, String cidade, String estado, int tel) {
        this.idpaciente = idpaciente;
        this.cartao = cartao;
        this.nome = nome;
        this.estCivil = estCivil;
        this.cor = cor;
        this.sexo = sexo;
        this.rg = rg;
        this.nacionalidade = nacionalidade;
        this.endereco = endereco;
        this.num = num;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.tel = tel;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int id) {
        this.idpaciente = id;
    }

    public long getCartao() {
        return cartao;
    }

    public void setCartao(long cartao) {
        this.cartao = cartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Id :" + idpaciente + 
                "Cartão :" + cartao + 
                "Nome :" + nome + 
                "Estado Civil :" + estCivil + 
                "Cor :" + cor + 
                "Sexo :" + sexo + 
                "Rg :" + rg + 
                "Nacionalidade :" + nacionalidade + 
                "Endereco :" + endereco + 
                "Num :" + num + 
                "Cep :" + cep + 
                "Cidade :" + cidade + 
                "Estado :" + estado + 
                "Telefone :" + tel;
    }
    
    
    
    
    
    
    
}
