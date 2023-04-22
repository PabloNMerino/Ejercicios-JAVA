package com.example.partidos.Service;

import com.example.partidos.Model.Estado;
import com.example.partidos.Model.Partido;
import com.example.partidos.Repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartidoService {
    @Autowired
    private PartidoRepository partidoRepository;

    public Partido registrarPartido(Partido partido) {
        return partidoRepository.save(partido);
    }

    public List<Partido> listarPartidos() {
        return partidoRepository.findAll();
    }

    public Optional<List<Partido>> findByEstado(Estado estado){
        return partidoRepository.findByEstado(estado);
    }
}
