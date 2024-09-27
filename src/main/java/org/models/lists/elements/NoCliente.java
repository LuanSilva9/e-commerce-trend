package org.models.lists.elements;

import org.models.Cliente;
import org.models.Gestor;
import org.models.Produto;

public class NoCliente {
    private Cliente cliente;
    private NoCliente proximo;

    public void setCliente(Cliente cliente) { this.cliente = cliente;}
    public Cliente getCliente() { return this.cliente; }

    public void setProximo(NoCliente proximo) { this.proximo = proximo; }
    public NoCliente getProximo() { return this.proximo; }
}

