package org.models;

import org.base.ICliente;
import org.models.lists.ListaProduto;

import java.util.UUID;

public class Cliente implements ICliente {
    private UUID Id;
    private String nome;
    private String cpf;
    private String email;
    private Integer saldo;
    private ListaProduto produtosAdquiridos;


    @Override
    public Boolean comprarProduto() {
        return null;
    }

    @Override
    public Boolean devolverProduto() {
        return null;
    }

    @Override
    public Boolean avaliarCompra() {
        return null;
    }

    @Override
    public Produto verProduto(String codigo) {
        return null;
    }

    @Override
    public Produto[] verProdutos() {
        return new Produto[0];
    }
}
