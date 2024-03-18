package com.neogiciel.springelastic.manager;

import com.neogiciel.springelastic.model.Livre;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LivreRepository extends ElasticsearchRepository<Livre, String> {
    

}
