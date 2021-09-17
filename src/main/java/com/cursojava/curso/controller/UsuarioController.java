package com.cursojava.curso.controller;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements UsuarioDao{

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuario(){
        List<Usuario> usuarios = new ArrayList<Usuario>();

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNome("Rauan");
        usuario.setApelido("Erineu");
        usuario.setEmail("ms5844639@gmail.com");
        usuario.setTelefone("");
        usuario.setDescricao("DESENVOLVEDOR FULL STACK JAVA");
        usuario.setPassword("12345678");

        Usuario usuario1 = new Usuario();
        usuario.setId(2L);
        usuario1.setNome("CArlos");
        usuario1.setApelido("Carlinhos");
        usuario1.setEmail("Carlosdd@gmail.com");
        usuario1.setTelefone("974 3202-3232");
        usuario1.setDescricao("DESENVOLVEDOR FULL WEB");
        usuario1.setPassword("123453254");

        Usuario usuario2 = new Usuario();
        usuario.setId(3L);
        usuario2.setNome("ana");
        usuario2.setApelido("aninha");
        usuario2.setEmail("");
        usuario2.setTelefone("937 25427535");
        usuario2.setDescricao("DESENVOLVEDOR SENIOR JAVA");
        usuario2.setPassword("352sbvsjkd");

        usuarios.add(usuario);
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        return usuarios;
    }

    @RequestMapping(value = "usuario/234")
    public Usuario deleteUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNome("Rauan");
        usuario.setApelido("Erineu");
        usuario.setEmail("ms5844639@gmail.com");
        usuario.setTelefone("");
        usuario.setPassword("12345678");
        return usuario;
    }

    @RequestMapping(value = "usuario/463")
    public Usuario editUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNome("Rauan");
        usuario.setApelido("Erineu");
        usuario.setEmail("ms5844639@gmail.com");
        usuario.setTelefone("");
        usuario.setPassword("12345678");
        return usuario;
    }

    @RequestMapping(value = "usuario/0634")
    public Usuario readUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNome("Rauan");
        usuario.setApelido("Erineu");
        usuario.setEmail("ms5844639@gmail.com");
        usuario.setTelefone("");
        usuario.setPassword("12345678");
        return usuario;
    }


    @Override
    public List<Usuario> getUsuarios() {
        return null;
    }
}
