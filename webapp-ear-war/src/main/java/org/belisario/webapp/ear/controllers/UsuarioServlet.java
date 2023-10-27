package org.belisario.webapp.ear.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.belisario.webapp.ear.model.Usuario;
import org.belisario.webapp.ear.service.UsuarioService;

import java.io.IOException;
import java.util.List;

@WebServlet({"/listar", "/"})
public class UsuarioServlet extends HttpServlet {

    @Inject
    UsuarioService usuarioService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("usuarios", usuarioService.listar());

        getServletContext().getRequestDispatcher("/listar.jsp").forward(req, resp);
    }
}
