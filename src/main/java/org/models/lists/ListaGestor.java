package org.models.lists;

import org.models.Gestor;
import org.models.lists.elements.NoGestor;

public class ListaGestor {
    private NoGestor inicio;

    public ListaGestor() {
        inicio = null;
    }

    public Boolean isEmpty() {
        return inicio == null;
    }

    public Gestor getGestorByName(String nome) {
        if(isEmpty()) return null;

        NoGestor noGestor = inicio;

        while(noGestor != null && nome != noGestor.getGestor().getInfoName()) {
            noGestor = noGestor.getProximo();
        }

        if(noGestor == null) return null;

        return noGestor.getGestor();
    }

    public Gestor getGestorByCpf(String CPF) {
        if(isEmpty()) return null;

        NoGestor noGestor = inicio;

        while(noGestor != null && CPF != noGestor.getGestor().getInfoCPF()) {
            noGestor = noGestor.getProximo();
        }

        if(noGestor == null) return null;

        return noGestor.getGestor();
    }

    public Gestor getGestorByEmail(String Email) {
        if(isEmpty()) return null;

        NoGestor noGestor = inicio;

        while(noGestor != null && Email != noGestor.getGestor().getInfoEmail()) {
            noGestor = noGestor.getProximo();
        }

        if(noGestor == null) return null;

        return noGestor.getGestor();
    }

    public Integer setGestor(Gestor gestor) {
        if(isEmpty()) {
            NoGestor noGestor = new NoGestor();
            noGestor.setGestor(gestor);
            noGestor.setProximo(inicio);

            inicio = noGestor;

            return 200;
        }

        NoGestor noGestor = new NoGestor();
        noGestor.setGestor(gestor);
        noGestor.setProximo(null);

        NoGestor tmpNode = inicio;

        while(tmpNode.getProximo() != null) {
            tmpNode = tmpNode.getProximo();
        }

        tmpNode = noGestor;

        return 200;
    }

    public Integer getSize() {
        if(isEmpty()) return 0;

        Integer size = 0;

        NoGestor tempNode = inicio;

        while(tempNode.getProximo() != null) {
            size++;
            tempNode = tempNode.getProximo();
        }

        return size;
    }
}
