package com.example.ClinicaOdontologica.Service;

import com.example.ClinicaOdontologica.DTO.TurnoDTO;
import com.example.ClinicaOdontologica.Entity.Turno;
import com.example.ClinicaOdontologica.Repository.TurnoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TurnoService {

    private Logger logger = Logger.getLogger(TurnoService.class);

    @Autowired
    private TurnoRepository turnoRepository;
    @Autowired
    ObjectMapper mapper;

    public Turno crearTurno(TurnoDTO turnoDto) {
        logger.info("Solicitando crear nuevo turno");
        Turno turno = mapper.convertValue(turnoDto, Turno.class);
        return turnoRepository.save(turno);
    }

    public TurnoDTO buscarTurno(Long id) {
        logger.info("Solicitando buscar turno de id " + id);
        Optional<Turno> turnoBuscado = turnoRepository.findById(id);
        TurnoDTO turnoDTO = null;
        if(turnoBuscado.isPresent())
             turnoDTO = mapper.convertValue(turnoBuscado, TurnoDTO.class);

        return turnoDTO;
    }

    public void actualizarTurno(TurnoDTO turnoDto) {
        logger.info("Solicitando actualizar turno de id " + turnoDto.getId());
        Turno turno = mapper.convertValue(turnoDto, Turno.class);
        turnoRepository.save(turno);
    }

    public void eliminarTurno(Long id) {
        logger.info("Solicitando eliminar turno de id " + id);
        turnoRepository.deleteById(id);
    }

    public List<TurnoDTO> listarTurnos() {
        logger.info("Solicitando listar todos los turnos");
        List<Turno> turnos = turnoRepository.findAll();
        List<TurnoDTO> turnosDTO = new ArrayList<>();
        for (Turno turno: turnos) {
            turnosDTO.add(mapper.convertValue(turno, TurnoDTO.class));
        }
        return turnosDTO;
    }

}
