package com.buenoponto.controledeponto.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.buenoponto.controledeponto.model.Usuario;
import com.buenoponto.controledeponto.service.UsuarioService;

@RestController
public class ControlePonto {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public Usuario inserirHorario(@Valid @RequestBody Usuario usuario) {
		return usuarioService.salvarUsuario(usuario);
	}

}
