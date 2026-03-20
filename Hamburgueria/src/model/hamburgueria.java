package model;

import java.util.ArrayList;

public class Hamburgueria {

    private ArrayList<String> ingredientes;

    public Hamburgueria(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}