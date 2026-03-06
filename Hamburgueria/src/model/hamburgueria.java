package model;

public class hamburgueria {
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;
    private String ingrediente4;


    public hamburgueria(String ingrediente1, String ingrediente2, String ingrediente4, String ingrediente3) {
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente4 = ingrediente4;
        this.ingrediente3 = ingrediente3;
    }

    public String getTodosIn(){
           return ingrediente1 + "," + ingrediente2 + "," + ingrediente4 + "," + ingrediente3b h;
    }
    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public String getIngrediente4() {
        return ingrediente4;
    }

    public void setIngrediente4(String ingrediente4) {
        this.ingrediente4 = ingrediente4;
    }
}
