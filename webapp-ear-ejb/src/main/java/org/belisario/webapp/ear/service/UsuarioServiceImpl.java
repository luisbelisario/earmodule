package org.belisario.webapp.ear.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.belisario.webapp.ear.model.Usuario;
import org.belisario.webapp.ear.repository.UsuarioRepository;

import java.util.List;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {

    @Inject
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listar() {
        return usuarioRepository.listar();
    }
}
