package org.models;

import org.base.IGestor;

import java.util.UUID;

public class Gestor implements IGestor {
    private UUID Id;
    private String nome;
    private String cpf;
    private String email;
    private ECommerce workPrivileges;

    public Gestor(UUID Id, String nome, String cpf, String email, ECommerce workPrivileges) {
        this.Id = Id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.workPrivileges = workPrivileges;
    }

    public String getInfoName() {
        return this.nome;
    }

    public String getInfoCPF() {
        return this.cpf;
    }

    public String getInfoEmail() {
        return this.email;
    }

    @Override
    public Integer inserirProduto() {
        return 0;
    }

    @Override
    public Integer alterarProduto() {
        return 0;
    }

    @Override
    public Integer removerProduto() {
        return 0;
    }

    @Override
    public Produto listarProduto(String codigo) {
        return null;
    }

    @Override
    public Produto[] listarProdutos() {
        return new Produto[0];
    }
}
