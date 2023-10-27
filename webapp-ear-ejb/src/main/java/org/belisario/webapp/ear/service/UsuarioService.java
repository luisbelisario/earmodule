package org.belisario.webapp.ear.service;

import jakarta.ejb.Local;
import org.belisario.webapp.ear.model.Usuario;

import java.util.List;

@Local
public interface UsuarioService {

    List<Usuario> listar();
}
