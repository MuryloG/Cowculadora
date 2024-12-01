package com.cowculadora.service;

import com.cowculadora.model.Medicamento;
import com.cowculadora.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public List<Medicamento> findAll() {
        return medicamentoRepository.findAll();
    }

    public Medicamento save(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    public void delete(Long id) {
        medicamentoRepository.deleteById(id);
    }
}