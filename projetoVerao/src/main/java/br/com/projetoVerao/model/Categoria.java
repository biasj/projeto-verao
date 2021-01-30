package br.com.projetoVerao.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author Equipe Senac
 */
@Entity
@Data
@Table(name = "Categoria")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank(message = "Por favor, informe o tipo do produto.")
    @Size(min = 5, max = 30, message = "O tipo do produto deve estar entre {min} e {max} caracteres.")
    @Column(name = "tipo", nullable = false)
    private String tipo;
}
