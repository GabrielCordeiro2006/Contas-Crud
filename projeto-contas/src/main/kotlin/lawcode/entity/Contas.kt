package lawcode.entity

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.PositiveOrZero
import jakarta.validation.constraints.Size
import java.time.LocalDate
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "Contas")
data class Contas (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @NotBlank(message = "A etiqueta é obrigatória")
    @Size(max = 100, message = "A etiqueta não pode ter mais de 100 caracteres")
    val etiqueta: String = "", // Valor padrão

    val dataVencimento: LocalDate = LocalDate.now(), // Valor padrão

    val url: String? = null, // Valor padrão

    val pago: Boolean = false, // Valor padrão

    @PositiveOrZero(message = "O valor deve ser positivo ou zero")
    val valor: Double = 0.0, // Valor padrão

    @Size(max = 255, message = "O comentário não pode ter mais de 255 caracteres")
    val comentario: String? = null // Valor padrão
)