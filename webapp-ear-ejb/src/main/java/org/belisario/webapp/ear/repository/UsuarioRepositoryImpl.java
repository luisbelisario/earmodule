package org.belisario.webapp.ear.repository;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.belisario.webapp.ear.model.Usuario;

import java.util.List;

@RequestScoped
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @Inject
    private EntityManager em;


    @Override
    public List<Usuario> listar() {
        return em.createQuery("select u FROM Usuario u", Usuario.class).getResultList();
    }
}
