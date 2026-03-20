package model;

public class Pedido {


    private Cliente cliente;
    private Hamburgueria hamburgueria;

    public Pedido(Cliente cliente, Hamburgueria hamburgueria) {
        this.cliente = cliente;
        this.hamburgueria = hamburgueria;
    }

    public String getStatus() {
        return cliente.getNomeInteiro() + " " + hamburgueria.getIngredientes();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hamburgueria getHamburgueria() {
        return hamburgueria;
    }

    public void setHamburgueria(Hamburgueria hamburgueria) {
        this.hamburgueria = hamburgueria;
    }
}