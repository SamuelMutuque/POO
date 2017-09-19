/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernete;

import CarroDao.MarcaDao;
import CarroDao.carroDao;
import CarroDao.carroDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Mutuque
 */
public class Teste {
    public static void main(String[] args) {
        
       // Marca marca=new Marca();
        Carro carro=new Carro();
//        carro.setNome(JOptionPane.showInputDialog("Digite o Nome"));
//        carro.setMorada(JOptionPane.showInputDialog("Digite o Morada"));
//        carro.setSexo(JOptionPane.showInputDialog("Digite o Sexo"));
carroDao dao=new carroDao();
//        dao.inserir(carro);
        
        //dao.Excluir(carro);
        
        
//        marca.setMarca(JOptionPane.showInputDialog("Digite o Marca"));
//        marca.setModelo(JOptionPane.showInputDialog("Digite o Modelo"));
//        marca.setAno(JOptionPane.showInputDialog("Digite o Ano"));
//        MarcaDao Mdao=new MarcaDao();
//        Mdao.Gravar(marca);
        
    //dao.Actualizar(carro);
      dao.Listar(carro);
        
        
    }
   
}
