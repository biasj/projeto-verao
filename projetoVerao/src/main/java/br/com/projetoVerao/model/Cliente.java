package br.com.projetoVerao.model;

import br.com.projetoVerao.Enums.UF;
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
@Table(name = "Cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank(message = "Por favor, informe seu nome.")
    @Size(min = 3, max = 30, message = "O nome deve estar entre {min} e {max} caracteres.")
    @Column(name = "nome", nullable = false)
    private String nome;

    @NotBlank(message = "Por favor, informe seu cpf.")
    @Size(min = 12, max = 12, message = "O cpf deve conter entre {max} dígitos.")
    @Column(name = "cpf", nullable = false)
    private String cpf;

    @NotBlank(message = "Por favor, informe o logradouro.")
    @Size(min = 5, max = 30, message = "O logradouro deve estar entre {min} e {max} caracteres.")
    @Column(name = "logradouro", nullable = false)
    private String logradouro;

    @NotNull(message = "Por favor, informe o número.")
    @Size(min = 1, max = 5, message = "O número deve estar entre {min} e {max} dígitos.")
    @Column(name = "numero", nullable = false)
    private int numero;

    @Column(name = "complemento")
    private String complemento;

    @NotBlank(message = "Por favor, informe o bairro.")
    @Size(min = 10, max = 30, message = "O bairro deve estar entre {min} e {max} caracteres.")
    @Column(name = "bairro", nullable = false)
    private String bairro;

    @NotBlank(message = "Por favor, informe o cep.")
    @Size(min = 1, max = 30, message = "O cep deve estar entre {min} e {max} dígitos.")
    @Column(name = "cep", nullable = false)
    private String cep;

    @NotNull(message = "Por favor, informe o estado.")
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private UF estado;

}
