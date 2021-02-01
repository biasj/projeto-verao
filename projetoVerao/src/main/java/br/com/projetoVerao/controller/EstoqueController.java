package br.com.projetoVerao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.projetoVerao.model.Estoque;
import br.com.projetoVerao.model.Produto;
import br.com.projetoVerao.repository.EstoqueRepository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Equipe Senac
 */
@Controller
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueRepository estoqueRepository;

    @GetMapping("/listEstoque")
    public String listar(Estoque estoque, ModelMap model) {
        model.addAttribute("estoque", estoqueRepository.findAll());
        return "estoque/lista";
    }
    
    @GetMapping("/{codigo}")
    public ResponseEntity<Estoque> FindBycodigo(@PathVariable long codigo){
    	
    	return estoqueRepository.findById(codigo)
    			.map(Estoque -> ResponseEntity.ok(Estoque))
    			.orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{codigo}")
    public void deleteProduto (@PathVariable long codigo) {
    	estoqueRepository.deleteById(codigo);
    }
}
