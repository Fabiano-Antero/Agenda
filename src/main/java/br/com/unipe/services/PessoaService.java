package br.com.unipe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unipe.models.PessoaModel;
import br.com.unipe.respositories.PessoaRespository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRespository pessoaRespository;
	
	
	public PessoaModel getById(Integer id) throws Exception {
		return this.pessoaRespository.findById(id).orElseThrow(() -> new Exception());
	}
	
	public List<PessoaModel> getAll(){
		return this.pessoaRespository.findAll();
	}
	
	public PessoaModel save(PessoaModel pessoa){
		return this.pessoaRespository.save(pessoa);
	}
	
	public void update(PessoaModel pessoa, Integer id){

		this.pessoaRespository.save(pessoa);
	}
	
	public void delete(Integer id) throws Exception{
		
		PessoaModel pessoa = this.getById(id);
		this.pessoaRespository.delete(pessoa);
		
	}
	
	
}
