/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernete;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mutuque
 */

@Entity
@Table(name="Carros")
public class Carro {
   
    private int id;
    private String nome;
    private String sexo;
    private String morada;
   // private Marca marca;

   // private List<Marca> marca;
    
    
    public Carro() {
    }

//    public Marca getMarca() {
//        return marca;
//    }
//
//    public void setMarca(Marca marca) {
//        this.marca = marca;
//    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    @OneToMany
//    public List<Marca> getMarca() {
//        return marca;
//    }
//
//    public void setMarca(List<Marca> marca) {
//        this.marca = marca;
//    }
    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", morada=" + morada + '}';
    }
    
    
    
}
