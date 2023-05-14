package com.example.persona.service.impl;

import com.example.persona.entity.Producto;
import com.example.persona.repository.ProductoRepository;
import com.example.persona.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> list() {
        return productoRepository.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> listById(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        productoRepository.deleteById(id);
    }
}
