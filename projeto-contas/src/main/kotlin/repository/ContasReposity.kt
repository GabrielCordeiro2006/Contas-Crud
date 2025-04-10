package repository

import entity.Contas
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.time.LocalDate

interface ContasReposity : JpaRepository<Contas, Int> {
    @Query("SELECT SUM(c.valor) FROM Conta c")
    fun sumValor(): Double

    fun findByDataVencimento(dataVencimento: LocalDate): List<Contas>
}