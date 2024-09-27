package org.models.lists.elements;

import org.models.Gestor;

public class NoGestor {
    private Gestor gestor;
    private NoGestor proximo;

    public void setGestor(Gestor gestor) { this.gestor = gestor;}
    public Gestor getGestor() { return this.gestor; }

    public void setProximo(NoGestor proximo) {
        this.proximo = proximo;
    }
    public NoGestor getProximo() {
        return this.proximo;
    }
}

