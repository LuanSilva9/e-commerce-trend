package org.models.lists;

import org.models.Cliente;
import org.models.Gestor;
import org.models.lists.elements.NoCliente;

public class ListaCliente {
    private NoCliente inicio;

    public ListaCliente() {
        inicio = null;
    }

    public Boolean isEmpty() {
        return inicio == null;
    }

    public Integer setCliente(Cliente cliente) {
        if(isEmpty()) {
            NoCliente noCliente = new NoCliente();
            noCliente.setCliente(cliente);
            noCliente.setProximo(inicio);

            inicio = noCliente;

            return 200;
        }

        NoCliente noCliente = new NoCliente();
        noCliente.setCliente(cliente);
        noCliente.setProximo(null);

        NoCliente tmpNode = inicio;

        while(tmpNode.getProximo() != null) {
            tmpNode = tmpNode.getProximo();
        }

        tmpNode = noCliente;

        return 200;
    }

    public Integer getSize() {
        if(isEmpty()) return 0;

        Integer size = 0;

        NoCliente tempNode = inicio;

        while(tempNode.getProximo() != null) {
            size++;
            tempNode.setProximo(tempNode.getProximo().getProximo());
        }

        return size;
    }
}
