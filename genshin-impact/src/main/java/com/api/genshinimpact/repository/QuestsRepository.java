package com.api.genshinimpact.repository;

import com.api.genshinimpact.arm.Quests;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestsRepository extends CrudRepository<Quests, Integer> {
}
