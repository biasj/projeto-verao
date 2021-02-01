package br.com.projetoVerao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projetoVerao.model.Categoria;

/**
 *
 * @author Equipe Senac
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
