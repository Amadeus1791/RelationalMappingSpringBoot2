package com.example.jparelations.repo;

import com.example.jparelations.model.Capital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapitalRepo extends JpaRepository<Capital, Long> {

}
