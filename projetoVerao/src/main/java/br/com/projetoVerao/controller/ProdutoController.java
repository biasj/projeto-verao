package br.com.projetoVerao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.projetoVerao.model.Produto;
import br.com.projetoVerao.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Equipe Senac
 */
@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/listProdutos")
    public String listar(Produto produto, ModelMap model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produto/lista";
    }
}
