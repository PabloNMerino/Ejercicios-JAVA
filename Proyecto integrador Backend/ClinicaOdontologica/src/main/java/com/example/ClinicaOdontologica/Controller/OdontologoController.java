package com.example.ClinicaOdontologica.Controller;

import com.example.ClinicaOdontologica.Entity.Odontologo;
import com.example.ClinicaOdontologica.Exception.ResourceNotFoundException;
import com.example.ClinicaOdontologica.Service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    private OdontologoService odontologoService;
    @PostMapping
    public ResponseEntity<String> crearOdontologo(@RequestBody Odontologo odontologo) {
        odontologoService.crearOdontologo(odontologo);
        return ResponseEntity.ok("Odontologo creado exitosamente");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Odontologo> buscarOdontologo(@PathVariable Long id) {
        Optional<Odontologo> odontologoOptional = odontologoService.buscarOdontologo(id);
        if(odontologoOptional.isPresent()) {
            return ResponseEntity.ok(odontologoOptional.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<String> actualizarOdontologo(@RequestBody Odontologo odontologo) {
        Optional<Odontologo> odontologoOptional = odontologoService.buscarOdontologo(odontologo.getId());
        if(odontologoOptional.isPresent()) {
            odontologoService.actualizarOdontologo(odontologo);
            return ResponseEntity.ok("Odontologo de id " + odontologo.getId() + " actualizado exitosamente");
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarOdontologo(@PathVariable Long id) throws ResourceNotFoundException {
        Optional<Odontologo> odontologoOptional = odontologoService.buscarOdontologo(id);
        if(odontologoOptional.isPresent()) {
            odontologoService.eliminarOdontologo(id);
            return ResponseEntity.ok("Odontologo de id " + id + " eliminado exitosamente");
        }
        else{
            throw new ResourceNotFoundException("No se encontro el odontolodo de id " + id);
        }
    }

    @GetMapping
    public ResponseEntity<List<Odontologo>> listarOdontologos() {
        return ResponseEntity.ok(odontologoService.listarOdontologos());
    }
}
