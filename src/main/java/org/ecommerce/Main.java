package org.ecommerce;

import org.models.ECommerce;
import org.models.Gestor;
import org.models.lists.ListaGestor;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ECommerce eCommerce = new ECommerce();

        ListaGestor listaGestor = new ListaGestor();

        Gestor test = new Gestor(UUID.randomUUID(), "Luan", "000.000.000-01", "luan.getjava@email.com", eCommerce);
    }
}
