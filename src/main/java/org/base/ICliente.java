package org.base;

import org.models.Produto;

public interface ICliente {
    public Boolean comprarProduto();
    public Boolean devolverProduto();
    public Boolean avaliarCompra();
    public Produto verProduto(String codigo);
    public Produto[] verProdutos();
}
