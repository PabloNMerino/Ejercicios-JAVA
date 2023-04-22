package com.example.ClinicaOdontologica.Controller;

import com.example.ClinicaOdontologica.Entity.Paciente;
import com.example.ClinicaOdontologica.Exception.ResourceNotFoundException;
import com.example.ClinicaOdontologica.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<String> crearPaciente(@RequestBody Paciente paciente) {

        pacienteService.crearPaciente(paciente);
        return ResponseEntity.ok("Paciente creado exitosamente");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscarPaciente(@PathVariable Long id) {
        Optional<Paciente> pacienteOptional = pacienteService.buscarPaciente(id);
        if(pacienteOptional.isPresent()) {
            return ResponseEntity.ok(pacienteOptional.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<String> actualizarPaciente(@RequestBody Paciente paciente) {
        Optional<Paciente> pacienteOptional = pacienteService.buscarPaciente(paciente.getId());
        if(pacienteOptional.isPresent()) {
            pacienteService.actualizarPaciente(paciente);
            return ResponseEntity.ok("Paciente de id " + paciente.getId() + " actualizado exitosamente");
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPaciente(@PathVariable Long id) throws ResourceNotFoundException {
        Optional<Paciente> pacienteOptional = pacienteService.buscarPaciente(id);
        if(pacienteOptional.isPresent()) {
            pacienteService.eliminarPaciente(id);
            return ResponseEntity.ok("Paciente de id " + id + " eliminado exitosamente");
        }
        else{
            throw new ResourceNotFoundException("No se encontro el odontolodo de id " + id);
        }
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> listarPacientes() {
        return ResponseEntity.ok(pacienteService.listarPacientes());
    }

    @GetMapping("/buscarporemail/{email}")
    public ResponseEntity<Paciente> buscarPorEmail(@PathVariable String email) {
        Optional<Paciente> pacienteOptional = pacienteService.buscarPorEmail(email);
        if(pacienteOptional.isPresent()) {
            return ResponseEntity.ok(pacienteOptional.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}
