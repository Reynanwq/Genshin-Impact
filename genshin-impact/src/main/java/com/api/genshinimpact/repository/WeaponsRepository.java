package com.api.genshinimpact.repository;

import com.api.genshinimpact.arm.Weapons;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponsRepository extends CrudRepository<Weapons, Integer> {
}
