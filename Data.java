/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg20;

import java.util.Random;

public class Data {
    private String data;
    private String ora;

    public Data(String data, String ora) {
        this.data = data;
        this.ora = ora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String v[] = {"Gennaio", "Febbraio", "Marzo"};
        Random r = new Random();
        int x = r.nextInt(31);
        String y = "20.45";
        data = x + " " + v + " " + y;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }
    
}
