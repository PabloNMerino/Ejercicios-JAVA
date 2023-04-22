package com.example.ClinicaOdontologica.Controller;

import com.example.ClinicaOdontologica.DTO.TurnoDTO;
import com.example.ClinicaOdontologica.Entity.Turno;
import com.example.ClinicaOdontologica.Exception.BadRequestException;
import com.example.ClinicaOdontologica.Exception.ResourceNotFoundException;
import com.example.ClinicaOdontologica.Service.OdontologoService;
import com.example.ClinicaOdontologica.Service.PacienteService;
import com.example.ClinicaOdontologica.Service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    @Autowired
    private TurnoService turnoService;
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private OdontologoService odontologoService;

    @PostMapping
    public ResponseEntity<Turno> crearTurno(@RequestBody TurnoDTO turnoDTO) throws BadRequestException {
        if(pacienteService.buscarPaciente(turnoDTO.getPaciente().getId()).isPresent() && odontologoService.buscarOdontologo(turnoDTO.getOdontologo().getId()).isPresent()) {
            return ResponseEntity.ok(turnoService.crearTurno(turnoDTO));
        }
        else {
            throw new BadRequestException("Esta faltando el paciente o el odontologo");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<TurnoDTO> buscarTurno(@PathVariable Long id) {
        return ResponseEntity.ok(turnoService.buscarTurno(id));
    }

    @PutMapping
    public ResponseEntity<String> actualizarTurno(@RequestBody TurnoDTO turnoDTO) {
         turnoService.actualizarTurno(turnoDTO);
         return ResponseEntity.ok("Turno de id " + turnoDTO.getId() + " actualizado correctamente");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarTurno(@PathVariable Long id) throws ResourceNotFoundException {
        Optional<TurnoDTO> turnoBuscado = Optional.of(turnoService.buscarTurno(id));
        if(turnoBuscado.isPresent()) {
            turnoService.eliminarTurno(id);
            return ResponseEntity.ok("Turno de id " + id + " eliminado");
        }
        else{
            throw new ResourceNotFoundException("No se encontro el odontolodo de id " + id);
        }
    }

    @GetMapping
    public ResponseEntity<List<TurnoDTO>> listarTurnos() {
        return ResponseEntity.ok(turnoService.listarTurnos());
    }
}
