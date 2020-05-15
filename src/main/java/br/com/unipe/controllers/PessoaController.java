package br.com.unipe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unipe.models.PessoaModel;
import br.com.unipe.services.PessoaService;

@RestController
@RequestMapping("api/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public  ResponseEntity<PessoaModel> getById(@PathVariable Integer id) throws Exception {
			
		return ResponseEntity.ok(this.pessoaService.getById(id));
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<PessoaModel>>  getAll(){
		
		return ResponseEntity.ok(this.pessoaService.getAll());
		
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<PessoaModel>  save(@RequestBody PessoaModel pessoa){
		
		PessoaModel newPesso = pessoaService.insert(pessoa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newPessoa.getId())
				.toUri();
		
		
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Void> update(PessoaModel pessoa, Integer id){
		
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(Integer id) throws Exception{
		
		return ResponseEntity.noContent().build();

		
	}

}
