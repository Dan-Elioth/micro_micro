package com.example.persona.service;

import com.example.persona.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    public List<Categoria> list();

    public Categoria save(Categoria categoria);

    public Categoria update(Categoria categoria);

    public Optional<Categoria> listById(Integer id);

    public void deleteById(Integer id);
}
