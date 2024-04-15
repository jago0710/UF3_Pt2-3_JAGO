package Ex4;

import java.util.ArrayList;

public class PepoCompany {

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {

    }

    private boolean usuarioExiste(Cliente cliente){
        boolean existe = false;
        for (Cliente c : clientes) {
            if (c.getDni().equals(cliente.getDni())){
                existe = true;
                break;
            }
        }
        return existe;
    }

    public void addCliente(Cliente cliente){
        if (usuarioExiste(cliente)) {
            System.out.println("Este usuario ya existe!");
        } else {
            clientes.add(cliente);
        }
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        PepoCompany.clientes = clientes;
    }



}
