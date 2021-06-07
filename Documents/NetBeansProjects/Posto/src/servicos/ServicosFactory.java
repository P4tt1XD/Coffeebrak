/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Pati
 */
public class ServicosFactory {
    private static PostoServicos postserv = new PostoServicos();
    
    public static PostoServicos getPostoServicos(){
        return postserv;
    }//fecha metodo
    
    
}
