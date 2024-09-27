package org.models.lists.elements;

import org.models.Gestor;
import org.models.Produto;

public class NoProduto {
    private Produto produto;
    private NoProduto proximo;

    public void setProduto(Produto produto) { this.produto = produto;}
    public Produto getProduto() { return this.produto; }

    public void setProximo(NoProduto proximo) { this.proximo = proximo; }
    public NoProduto getProximo() { return this.proximo; }
}
