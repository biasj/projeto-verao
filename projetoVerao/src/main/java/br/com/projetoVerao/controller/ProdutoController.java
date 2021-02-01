package br.com.projetoVerao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.com.projetoVerao.model.Cliente;
import br.com.projetoVerao.model.Produto;
import br.com.projetoVerao.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Equipe Senac
 */
@Controller
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/listProdutos")
    public String listar(Cliente cliente, ModelMap model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produto/lista";
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Produto> FindBycodigo(@PathVariable long codigo) {

        return produtoRepository.findById(codigo)
                .map(Produto -> ResponseEntity.ok(Produto))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{codigo}")
    public void deleteProduto(@PathVariable long codigo) {
        produtoRepository.deleteById(codigo);
    }

}
