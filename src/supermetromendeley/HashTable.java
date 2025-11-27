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

public class HashTable {
    //okay so we can have a list of the ones that are empty, and the ones that are not empty. 
    //We can make the hash table a list of rows.
    Object[] Table;
    String EmptyKeys;
    String UsedKeys;
    int Size;
    int PrimeFactor = 257;
    //we gotta be able to add a row, then able to read a text file and just add everything. 
    //cada resumen es un archivo de texto, que contiene titulo, autores, resumen y palabras clave
    // por tanto, la tabla se inicializa vacía
    
    //okok, idea: lets do closed hashing, initialize the table on any kind of object, most of them will be integers (signalling empty), then you do list[djkalsa] make = resumen or smth
    public HashTable() {
        Table = new Object[257];
        for (int i=0; i<=(PrimeFactor-1); i++){
            Table[i] = i;
            EmptyKeys.concat(Integer.toString(i) + " ");
        }
        UsedKeys = "";
        Size = 0;
    }
    
    public int Hash(String Key){
        int Index = 0;
        for (int iter = 0; iter <= Key.length(); iter++) {
            Index += Key.charAt(iter)*iter;
        }
        Index = Index % PrimeFactor;
        return Index;
    }
    
    public void AddResumen(String Título, String Autores, String Resumen, String palabrasClaves) {
        if (EmptyKeys.isBlank()) {
            System.out.print("Error: Space Limit Exceeded");
            return;
        }
        Resumen ResAnadir = new Resumen(Título, Autores, Resumen, palabrasClaves);
        int newkey = Hash(Título);
        while ((CheckExist(newkey)==true)) {
            newkey += 1;
            newkey %= PrimeFactor;
        }
        
        ResAnadir.setKey(newkey);
        Table[newkey] = ResAnadir;
        UsedKeys.concat(Integer.toString(newkey) + " ");
        EmptyKeys.replace(Integer.toString(newkey), "");
        Size++;
    }
    
    public boolean CheckExist(int Key) {
        boolean Exists;
        String KeyStr = Integer.toString(Key);
        if (!UsedKeys.contains(KeyStr) || EmptyKeys.contains(KeyStr)) {
            Exists = false;
        }
        else {
            Exists = true;
        }
        
        return Exists;
    }
    
    public String GetResTitle(int key) {
        Object tocheck = Table[key];
        if (tocheck instanceof Resumen) {
            Resumen ResToCheck = (Resumen) tocheck;
            return ResToCheck.getTítulo();
        }
        else {
            System.out.print("Object was not a Resumen");
            return "";
        }
        
    }
    
    //assuming that the tittle does exist given it will be selected from a dropdown
    public int getKeybyTitle(String Tittle) {
        int hashkey = Hash(Tittle);
        if (!CheckExist(hashkey)) {
            return -1;
        }
        int auxKey = hashkey;
        while (GetResTitle(hashkey) != Tittle) {
            hashkey += 1;
            hashkey %= PrimeFactor;
            if (hashkey == auxKey) {
                return -1;
            }
        }
        return hashkey;
    }
}