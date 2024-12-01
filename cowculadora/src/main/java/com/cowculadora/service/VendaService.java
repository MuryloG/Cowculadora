package com.cowculadora.service;

import com.cowculadora.model.Venda;
import com.cowculadora.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public List<Venda> findAll() {
        return vendaRepository.findAll();
    }

    public Venda save(Venda venda) {
        return vendaRepository.save(venda);
    }

    public void delete(Long id) {
        vendaRepository.deleteById(id);
    }
}