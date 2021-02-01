package br.com.projetoVerao.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.projetoVerao.model.Categoria;
import br.com.projetoVerao.repository.CategoriaRepository;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listarTodos() {
        return categoriaRepository.findAll();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Categoria> FindByCodigo(@PathVariable long codigo) {

        Optional<Categoria> buscado = this.categoriaRepository.findById(codigo);

        return buscado.isPresent()
                ? ResponseEntity.ok(buscado.get()) : ResponseEntity.notFound().build();

    }

    @DeleteMapping("/{codigo}")
    public void deletebyId(@PathVariable long codigo) {
        categoriaRepository.deleteById(codigo);
    }

}
