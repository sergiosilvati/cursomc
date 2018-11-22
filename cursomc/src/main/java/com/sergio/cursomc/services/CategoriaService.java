package com.sergio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergio.cursomc.domain.Categoria;
import com.sergio.cursomc.repositories.CategoriaRepository;
import com.sergio.cursomc.services.exceptions.ObjectNotFoundException;



@Service
public class CategoriaService {

	// Autowired o sprint cria automaticamente uma instancia de repo
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + 
		Categoria.class.getName()));
	}
}
