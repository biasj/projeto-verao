package br.com.projetoVerao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

/**
 *
 * @author Equipe Senac
 */
@Entity
@Data
@Table(name = "Produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank(message = "Por favor, informe o nome do produto.")
    @Size(min = 5, max = 30, message = "O nome do produto deve estar entre {min} e {max} caracteres.")
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @NotBlank(message = "Por favor, informe uma descrição do produto.")
    @Size(min = 5, max = 50, message = "A descrição do produto deve estar entre {min} e {max} caracteres.")
    @Column(name = "nome", nullable = false)
    private String descricao;
    
    @NotNull(message = "informe um valor ao produto.")
    @NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
    @Column(name = "valor", nullable = false)
    private BigDecimal valor;
}
