package com.ta.upms.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ta.upms.project.model.Userdata;

@Repository
public interface UserdataRepository extends CrudRepository<Userdata, Long> {
	Optional<Userdata> findById(Long id);
}