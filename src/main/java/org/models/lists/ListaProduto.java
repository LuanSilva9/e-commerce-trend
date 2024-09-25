package org.models.lists;

import org.models.lists.elements.NoProduto;

public class ListaProduto {
    private NoProduto inicio;

    public ListaProduto() {
        inicio = null;
    }

    public Boolean isEmpty() {
        return inicio == null;
    }

    public Integer getSize() {
        if(isEmpty()) return 0;

        Integer size = 0;

        NoProduto tempNode = inicio;

        while(tempNode.getProximo() != null) {
            size++;
            tempNode.setProximo(tempNode.getProximo().getProximo());
        }

        return size;
    }
}
