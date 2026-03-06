import model.hamburgueria;
public class Main {
    public static void main(String[] args) {
        hamburgueria client = new hamburgueria("pão de cima", "queijo", "carne", "pão de baixo");

        System.out.println(client.getTodosIn());
    }
}