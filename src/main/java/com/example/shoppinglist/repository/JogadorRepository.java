package com.example.shoppinglist.repository;

import com.example.shoppinglist.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {

    <Optional>Jogador findByNome(String nome);

    @Query("SELECT j FROM Jogador j ORDER BY j.pontos DESC")
    List<Jogador> findAllWithPoints();

    @Query("SELECT COUNT(p) FROM Partida p WHERE p.jogador1 = :nome OR p.jogador2 = :nome")
    int countPartidasByNome(@Param("nome") String nome);
}
