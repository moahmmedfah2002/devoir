package com.ensa.devoir.repo;

import com.ensa.devoir.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepo extends JpaRepository<Compte, Integer> {

}
