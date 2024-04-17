package api.usuario.segunda.controllers;

import api.usuario.segunda.doMain.Pessoa;
import api.usuario.segunda.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaControllers {

    @Autowired
    private PessoaRepository repository;


    public void cadastrarPessoa(@RequestBody Pessoa pessoa){


    }
}
