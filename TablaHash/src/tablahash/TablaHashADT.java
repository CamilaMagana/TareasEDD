/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablahash;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author camil
 * @param <K>
 * @param <V>
 */
public class TablaHashADT<K, V> {
     private class Entrada {
        public K llave;
        public V valor;
        public int hash;

        public Entrada(K llave, V valor) {
            this.llave = llave;
            this.valor = valor;
            this.hash = llave.hashCode();
        }

        @Override
        public boolean equals(Object otherEntry) {
            Entrada other = (Entrada) otherEntry;
            if(this.hash != other.hash) return false;
            return this.llave.equals(other.llave);
        }
    }

    private int tamanio;
    private ArrayList<Entrada>[] entradas;

    public TablaHashADT(int tamanio) {
        this.tamanio = tamanio;
        this.entradas = new ArrayList[tamanio];
        for(int i = 0; i < tamanio; i++) {
            entradas[i] = new ArrayList<>();
        }
    }

    private int normalizeIndex(int llaveHasheada) {
        return (llaveHasheada & 0x7FFFFFFF) % tamanio;
    }

    public void add(K llave, V valor) {
        Entrada entrada = new Entrada(llave, valor);
        int indice = normalizeIndex(entrada.hash);
        
        int entradaIndice = entradas[indice].indexOf(entrada);
        if (entradaIndice >= 0) {
            entradas[indice].add(entradaIndice, entrada);
        } else {
            entradas[indice].add(entrada);
        }
    }

    public V valueOf(K keyToSearch) {
        int bucketIndex = normalizeIndex(keyToSearch.hashCode());
        Entrada entradaAux = new Entrada(keyToSearch, null);
        int entradaIndex = entradas[bucketIndex].indexOf(entradaAux);
        
        if(entradaIndex < 0) {
            return null;
        } else {
            return entradas[bucketIndex].get(entradaIndex).valor;
        }
    }

    public void remove(K llaveAEliminar) {
        Entrada entradaAux = new Entrada(llaveAEliminar, null);
        int bucketIndex = normalizeIndex(entradaAux.hashCode());
        entradas[bucketIndex].remove(entradaAux);
    }

}
