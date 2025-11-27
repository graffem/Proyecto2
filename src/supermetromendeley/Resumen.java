package supermetromendeley;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7juli
 */
import java.util.ArrayList;
import java.util.List;

public class Resumen {
    int Key;
    String Título;
    String Autores;
    String cuerpoResumen;
    String palabrasClaves;

    public Resumen(String Título, String Autores, String Resumen, String palabrasClaves) {
        this.Título = Título;
        this.Autores = Autores;
        this.cuerpoResumen = Resumen;
        this.palabrasClaves = palabrasClaves;
    }
    
    public int getKey() {
        return Key;
    }

    public String getTítulo() {
        return Título;
    }

    public String getAutores() {
        return Autores;
    }

    public void setKey(int Key) {
        this.Key = Key;
    }
    
    public void Analize() {
        
    }
    

}
