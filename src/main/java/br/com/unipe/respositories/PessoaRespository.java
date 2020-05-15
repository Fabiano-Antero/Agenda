package br.com.unipe.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unipe.models.PessoaModel;

@Repository
public interface PessoaRespository extends JpaRepository<PessoaModel, Integer>{

}
