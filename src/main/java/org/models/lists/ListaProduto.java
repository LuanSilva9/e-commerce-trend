package org.models.lists;

import org.models.Produto;
import org.models.lists.elements.NoProduto;

public class ListaProduto {
    private NoProduto inicio;

    public ListaProduto() {
        inicio = null;
    }

    public Boolean isEmpty() {
        return inicio == null;
    }

    public Integer setProduto(Produto produto) {
        if(isEmpty()) {
            NoProduto noProduto = new NoProduto();
            noProduto.setProduto(produto);
            noProduto.setProximo(inicio);

            inicio = noProduto;

            return 200;
        }

        NoProduto noProduto = new NoProduto();
        noProduto.setProduto(produto);
        noProduto.setProximo(null);

        NoProduto tmpNode = inicio;

        while(tmpNode.getProximo() != null) {
            tmpNode = tmpNode.getProximo();
        }

        tmpNode = noProduto;

        return 200;
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
