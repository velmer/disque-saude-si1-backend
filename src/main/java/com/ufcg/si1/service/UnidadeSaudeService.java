package com.ufcg.si1.service;

import com.ufcg.si1.model.unidadesaude.UnidadeSaude;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeSaudeService implements CrudService<UnidadeSaude, Long> {

    @Override
    public List<UnidadeSaude> listaTodos() {
        return null;
    }

    @Override
    public UnidadeSaude getPorId(Long aLong) {
        return null;
    }

    @Override
    public UnidadeSaude salva(UnidadeSaude unidadeSaude) {
        return null;
    }

    @Override
    public UnidadeSaude atualiza(UnidadeSaude unidadeSaude) {
        return null;
    }

    @Override
    public boolean removePorId(Long aLong) {
        return false;
    }
}
