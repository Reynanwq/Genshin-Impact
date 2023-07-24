package com.api.genshinimpact.repository;

import com.api.genshinimpact.arm.StatisticCharacters;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticCharactersRepository extends CrudRepository<StatisticCharacters, Integer> {
}
