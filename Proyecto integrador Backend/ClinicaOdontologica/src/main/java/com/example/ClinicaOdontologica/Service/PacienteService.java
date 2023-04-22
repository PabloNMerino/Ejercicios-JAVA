package com.example.ClinicaOdontologica.Service;

import com.example.ClinicaOdontologica.Entity.Paciente;
import com.example.ClinicaOdontologica.Repository.PacienteRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    private Logger logger = Logger.getLogger(PacienteService.class);

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente crearPaciente(Paciente paciente) {
        logger.info("Solicitando crear nuevo paciente");
        return pacienteRepository.save(paciente);
    }

    public Optional<Paciente> buscarPaciente(Long id) {
        logger.info("Solicitando buscar paciente de id " + id);
        return pacienteRepository.findById(id);
    }

    public void actualizarPaciente(Paciente paciente) {
        logger.info("Solicitando actualizar paciente de id " + paciente.getId());
        pacienteRepository.save(paciente);
    }

    public void eliminarPaciente(Long id) {
        logger.info("Solicitando eliminar paciente de id " + id);
        pacienteRepository.deleteById(id);
    }

    public List<Paciente> listarPacientes() {
        logger.info("Solicitando listar todos los paciente");
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> buscarPorEmail(String email) {
        logger.info("Solicitando buscar paciente por email: " + email);
        return pacienteRepository.findByEmail(email);
    }

}
