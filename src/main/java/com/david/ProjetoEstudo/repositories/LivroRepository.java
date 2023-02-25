package com.david.ProjetoEstudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.david.ProjetoEstudo.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
