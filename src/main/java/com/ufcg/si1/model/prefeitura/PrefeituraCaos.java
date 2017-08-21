package com.ufcg.si1.model.prefeitura;

import javax.persistence.Entity;

@Entity
public class PrefeituraCaos extends Prefeitura {

    private static final float LIMITE_EFICIENCIA_BAIXA = 0.05F;
    private static final float LIMITE_EFICIENCIA_REGULAR = 0.02F;

    public PrefeituraCaos() {
        super(LIMITE_EFICIENCIA_BAIXA, LIMITE_EFICIENCIA_REGULAR);
    }

}
