package br.com.projetoVerao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.projetoVerao.model.Cliente;
import br.com.projetoVerao.repository.ProdutoRepository;

/**
 *
 * @author Equipe Senac
 */
@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/listProdutos")
    public String listar(Cliente cliente, ModelMap model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "Produtos/listProduto";
    }
}
