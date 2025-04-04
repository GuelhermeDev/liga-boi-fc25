package com.example.shoppinglist.repository;

import com.example.shoppinglist.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TimeRepository extends JpaRepository<Time, Long> {
}
