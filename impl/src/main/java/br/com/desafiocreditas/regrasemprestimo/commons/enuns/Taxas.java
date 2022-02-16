package br.com.desafiocreditas.regrasemprestimo.commons.enuns;

import lombok.Getter;

@Getter
public enum Taxas {

    DOIS_PORCENTO(2), TRES_PORCENTO(3), QUATRO_PORCENTO(4);

    private int taxa;

    Taxas(int taxa) {
        this.taxa = taxa;
    }
}
