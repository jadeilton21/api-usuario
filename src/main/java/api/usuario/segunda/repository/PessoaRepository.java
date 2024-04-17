package api.usuario.segunda.repository;

import api.usuario.segunda.doMain.Pessoa;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class PessoaRepository {

    public void save(Pessoa pessoa) {
        System.out.println("Salvo - Pessoa salva no Banco de Dados!");
        System.out.println(pessoa);
    }

    public void update(Pessoa pessoa) {
    }
}
