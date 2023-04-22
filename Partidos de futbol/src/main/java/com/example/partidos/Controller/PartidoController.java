package com.example.partidos.Controller;

import com.example.partidos.Model.Estado;
import com.example.partidos.Model.Partido;
import com.example.partidos.Service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/partidos")
public class PartidoController {
    @Autowired
    private PartidoService partidoService;
    @PostMapping
    public ResponseEntity<Partido> registrarPartido(@RequestBody Partido partido) {
        return ResponseEntity.ok(partidoService.registrarPartido(partido));
    }

    @GetMapping
    public ResponseEntity<List<Partido>> listarPartidos() {
        return ResponseEntity.ok(partidoService.listarPartidos());
    }

    @GetMapping("/{estado}")
    public ResponseEntity<Optional<List<Partido>>> listarPartidosEnVivo(@PathVariable Estado estado) {
        return ResponseEntity.ok(partidoService.findByEstado(estado));
    }
}
