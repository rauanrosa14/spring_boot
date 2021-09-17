package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    private EntityManager entitymanager;


    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM usuarios";
        List<Usuario> resultado = entitymanager.createQuery(query).getResultList();
        return resultado;
    }
}
