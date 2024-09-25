package org.base;

import org.models.Produto;

public interface IGestor {
    public Integer inserirProduto();
    public Integer alterarProduto();
    public Integer removerProduto();
    public Produto listarProduto(String codigo);
    public Produto[] listarProdutos();
}
