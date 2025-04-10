package entity

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.PositiveOrZero
import jakarta.validation.constraints.Size
import java.time.LocalDate

@Entity
@Table(name = "contas")
data class Contas (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @NotBlank(message = "A etiqueta é obrigatória")
    @Size(max = 100, message = "A etiqueta não pode ter mais de 100 caracteres")
    val etiqueta: String,

    val dataVencimento: LocalDate,

    val url: String?,

    val pago: Boolean = false,

    @PositiveOrZero(message = "O valor deve ser positivo ou zero")
    val valor: Double,

    @Size(max = 255, message = "O comentário não pode ter mais de 255 caracteres")
    val comentario: String?
)