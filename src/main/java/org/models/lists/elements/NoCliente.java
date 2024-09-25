package org.models.lists.elements;

import org.models.Cliente;

public class NoCliente {
    private Cliente cliente;
    private NoCliente proximo;

    public void setProximo(NoCliente proximo) {
        this.proximo = proximo;
    }

    public NoCliente getProximo() {
        return this.proximo;
    }
}

