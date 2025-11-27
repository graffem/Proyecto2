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

public class FormatHelper {
    public List ListaClaves(String PalabrasClave) {
        String Trimmed = PalabrasClave.replace("Palabras claves: ", "");
        String[] Claves = Trimmed.split(", ");
        
    }
}
