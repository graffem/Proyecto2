package supermetromendeley;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7juli
 */
public class HashDevicePlaceholder {
    public int Hash(String Key, int TableSize){
        int Index = 0;
        for (int iter = 0; iter <= Key.length(); iter++) {
            Index += Key.charAt(iter)*iter*iter;
        }
        Index = Index % TableSize;
        return Index;
    }
}
