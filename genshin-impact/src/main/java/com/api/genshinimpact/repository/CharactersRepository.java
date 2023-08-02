package com.api.genshinimpact.repository;

import com.api.genshinimpact.entities.Characters;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharactersRepository extends CrudRepository<Characters, Integer> {
}
