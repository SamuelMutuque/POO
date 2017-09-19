/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernete;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author Mutuque
 */
@Entity
public class Marca implements Serializable  {

 
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//@ManyToOne(cascade = CascadeType.ALL)
    private String marca;
    private String modelo;
    private String ano;
   // private Carro carro;
//    @OneToOne
//  
//    @OneToMany
//  @JoinTable(name = "Carro_Marca",joinColumns = @JoinColumn(name = "carro_ida"),
//           inverseJoinColumns = @JoinColumn(name = "marca_id")  )
//    @OneToMany(cascade = CascadeType.ALL)

  //  private  List<Carro> carros;
    public Marca() {
    }

    public Marca(int id, String marca, String modelo, String ano) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        //this.carro = carro;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
//    public Carro getCarro() {
//        return carro;
//    }
//
//    public void setCarro(Carro carro) {
//        this.carro = carro;
//    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
}
