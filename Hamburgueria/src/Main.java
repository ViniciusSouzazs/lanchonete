import model.Cliente;
import model.Hamburgueria;
import model.Pedido;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingredientesList = new ArrayList<String>();
        ingredientesList.add("Pão");
        ingredientesList.add("Ovo");
        ingredientesList.add("Presunto");
        ingredientesList.add("Queijo");
        ingredientesList.add("Tomate");
        ingredientesList.add("Molho da Casa");
        ingredientesList.add("Hamburguer");
        ingredientesList.add("Cebola Roxa");

        Cliente Cliente = new Cliente("Vinicius", "Souza");
        Hamburgueria Hamburgueria = new Hamburgueria(ingredientesList);

        Pedido pedido1 = new Pedido(Cliente, Hamburgueria);

        System.out.println(Hamburgueria.getIngredientes());


    }
}