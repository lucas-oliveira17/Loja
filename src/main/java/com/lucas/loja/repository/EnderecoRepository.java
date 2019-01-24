package com.lucas.loja.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucas.loja.domain.Endereco;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, String>{

}
