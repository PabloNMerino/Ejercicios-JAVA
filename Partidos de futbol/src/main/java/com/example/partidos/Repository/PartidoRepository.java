package com.example.partidos.Repository;

import com.example.partidos.Model.Estado;
import com.example.partidos.Model.Partido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PartidoRepository extends MongoRepository<Partido, Long> {

    Optional<List<Partido>> findByEstado(Estado estado);
}
