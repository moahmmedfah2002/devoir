package com.ensa.devoir.repo;

import com.ensa.devoir.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo  extends JpaRepository<Client, Integer> {
}
