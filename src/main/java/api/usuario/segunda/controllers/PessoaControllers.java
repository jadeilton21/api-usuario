package api.usuario.segunda.controllers;

import api.usuario.segunda.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaControllers {

    @Autowired
    private PessoaRepository repository;
}
