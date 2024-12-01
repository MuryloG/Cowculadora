package com.cowculadora.service;

import com.cowculadora.model.Lote;
import com.cowculadora.repository.LoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoteService {

    @Autowired
    private LoteRepository loteRepository;

    public List<Lote> findAll() {
        return loteRepository.findAll();
    }

    public Lote save(Lote lote) {
        return loteRepository.save(lote);
    }

    public void delete(Long id) {
        loteRepository.deleteById(id);
    }
}