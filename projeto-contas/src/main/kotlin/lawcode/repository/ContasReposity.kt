package lawcode.repository

import lawcode.entity.Contas
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.time.LocalDate

interface ContasReposity : JpaRepository<Contas, Int> {
    @Query("SELECT SUM(c.valor) FROM Contas c")
    fun sumValor(): Double

    fun findByDataVencimentoGreaterThanEqualOrderByDataVencimentoAsc(data: LocalDate): List<Contas>
}