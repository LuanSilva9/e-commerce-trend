package org.models.lists;

import org.models.lists.elements.NoGestor;

public class ListaGestor {
    private NoGestor inicio;

    public ListaGestor() {
        inicio = null;
    }

    public Boolean isEmpty() {
        return inicio == null;
    }

    public Integer getSize() {
        if(isEmpty()) return 0;

        Integer size = 0;

        NoGestor tempNode = inicio;

        while(tempNode.getProximo() != null) {
            size++;
            tempNode.setProximo(tempNode.getProximo().getProximo());
        }

        return size;
    }
}
