package com.example.ClinicaOdontologica.Security;


import com.example.ClinicaOdontologica.Entity.Usuario;
import com.example.ClinicaOdontologica.Entity.UsuarioRole;
import com.example.ClinicaOdontologica.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DatosInicialesUSuarios implements ApplicationRunner {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder cifrador= new BCryptPasswordEncoder();

        //USUARIO USER
        String passsSinCifrar= "digital";
        String passCifrado= cifrador.encode(passsSinCifrar);
        Usuario usuarioAInsertar= new Usuario("Pablo","PabloNM07","pablonicolasm@hotmail.com",passCifrado, UsuarioRole.ROLE_USER);
        usuarioRepository.save(usuarioAInsertar);

        //USUARIO ADMIN
        String passinCrifrar2="banquito";
        String passCifrado2= cifrador.encode(passinCrifrar2);
        Usuario usuarioAInsertar2= new Usuario("Esteban","Quito","equito@dh.com",passCifrado2,UsuarioRole.ROLE_ADMIN);
        usuarioRepository.save(usuarioAInsertar2);

    }
}
