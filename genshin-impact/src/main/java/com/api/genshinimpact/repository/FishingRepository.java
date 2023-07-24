package com.api.genshinimpact.repository;

import com.api.genshinimpact.arm.Fishing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishingRepository extends CrudRepository<Fishing, Integer> {
}
