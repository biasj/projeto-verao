package br.com.projetoVerao.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author Equipe Senac
 */
@Entity
@Data
@Table(name = "Estoque")
public class Estoque implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank(message = "Por favor, informe o tamanho do produto.")
    @Column(name = "tamanho", nullable = false)
    private String tamanho;

    @NotNull(message = "Por favor, informe uma quantidade de produtos.")
    @Size(max = 1000, message = "A quantidade de produtos deve conter no máximo {max}.")
    @Column(name = "quantidade", nullable = false)
    private Long quantidade;

    @NotBlank(message = "Por favor, informe a cor do produto.")
    @Column(name = "cor", nullable = false)
    private String cor;

    @JoinColumn(name = "codigo_categoria")
    private Categoria categoria;
    
    @JoinColumn(name = "codigo_produto")
    private Produto produto;

}
