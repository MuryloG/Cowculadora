package com.cowculadora.service;

import com.cowculadora.model.Atendimento;
import com.cowculadora.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    public List<Atendimento> findAll() {
        return atendimentoRepository.findAll();
    }

    public Atendimento save(Atendimento atendimento) {
        return atendimentoRepository.save(atendimento);
    }

    public void delete(Long id) {
        atendimentoRepository.deleteById(id);
    }
}