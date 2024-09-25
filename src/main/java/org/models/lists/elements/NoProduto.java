package org.models.lists.elements;

import org.models.Produto;

public class NoProduto {
    private Produto produto;
    private NoProduto proximo;

    public void setProximo(NoProduto proximo) {
        this.proximo = proximo;
    }

    public NoProduto getProximo() {
        return this.proximo;
    }
}
