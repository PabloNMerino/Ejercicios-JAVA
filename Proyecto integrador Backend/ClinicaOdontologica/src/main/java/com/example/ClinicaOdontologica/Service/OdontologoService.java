package com.example.ClinicaOdontologica.Service;

import com.example.ClinicaOdontologica.Entity.Odontologo;
import com.example.ClinicaOdontologica.Repository.OdontologoRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OdontologoService {

    private Logger logger = Logger.getLogger(OdontologoService.class);

    @Autowired
    private OdontologoRepository odontologoRepository;

    public Odontologo crearOdontologo(Odontologo odontologo) {
        logger.info("Solicitando crear nuevo odontologo");
        return odontologoRepository.save(odontologo);
    }

    public Optional<Odontologo> buscarOdontologo(Long id) {
        logger.info("Solicitando buscar odontologo de id " + id);
        return odontologoRepository.findById(id);
    }

    public void actualizarOdontologo(Odontologo odontologo) {
        logger.info("Solicitando actualizar odontologo de id " + odontologo.getId());
        odontologoRepository.save(odontologo);
    }

    public void eliminarOdontologo(Long id) {
        logger.info("Solicitando eliminar odontologo de id " + id);
        odontologoRepository.deleteById(id);
    }

    public List<Odontologo> listarOdontologos() {
        logger.info("Solicitando listar todos los odontologo");
        return odontologoRepository.findAll();
    }
}
