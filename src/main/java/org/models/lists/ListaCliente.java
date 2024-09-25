package org.models.lists;

import org.models.lists.elements.NoCliente;

public class ListaCliente {
    private NoCliente inicio;

    public ListaCliente() {
        inicio = null;
    }

    public Boolean isEmpty() {
        return inicio == null;
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
