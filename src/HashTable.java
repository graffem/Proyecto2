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

public class HashTable {
    //okay so we can have a list of the ones that are empty, and the ones that are not empty. 
    //We can make the hash table a list of rows.
    List<Resumen> Table;
    List EmptyKeys;
    List UsedKeys;
    int Size;
    //we gotta be able to add a row, then able to read a text file and just add everything. 
    //cada resumen es un archivo de texto, que contiene titulo, autores, resumen y palabras clave
    // por tanto, la tabla se inicializa vacía
    public HashTable() {
        Table = new ArrayList<>();
        EmptyKeys = new ArrayList();
        UsedKeys = new ArrayList();
        Size = 0;
    }
    
    public void AddResumen(String Título, String Autores, String Resumen, String palabrasClaves) {
        Resumen ResAnadir = new Resumen(Título, Autores, Resumen, palabrasClaves);
    }
    
}
