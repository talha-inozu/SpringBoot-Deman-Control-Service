package com.nirengi.dcs.data.repository;

import com.nirengi.dcs.data.entity.DemandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandRepository extends CrudRepository<DemandEntity,Long> {
}
