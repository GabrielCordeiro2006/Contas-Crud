package controller
import dto.ContasResposta
import entity.Contas
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import repository.ContasReposity
import java.time.LocalDate

@RestController
@RequestMapping("/contas")
class ContasController(val repositorio: ContasReposity) {


    @GetMapping("/total")
    fun getTotal(): ResponseEntity<ContasResposta> {
        val total = repositorio.sumValor()
        val resposta = ContasResposta(total)
        return ResponseEntity.ok(resposta)
    }

    @PostMapping
    fun post(@RequestBody @Valid novaConta: Contas): ResponseEntity<Contas> {
        val contaSalva = repositorio.save(novaConta)
        return ResponseEntity.status(201).body(contaSalva)
    }

    @GetMapping
    fun get(): ResponseEntity<List<Contas>> {
        val contas = repositorio.findAll()
        return if (contas.isEmpty()) {
            ResponseEntity.status(204).build()
        } else {
            ResponseEntity.status(200).body(contas)
        }
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): ResponseEntity<Contas> {
        val conta = repositorio.findById(id)
        return ResponseEntity.of(conta)
    }

    @PutMapping("/{id}")
    fun put(
        @PathVariable id: Int,
        @RequestBody @Valid contaAtualizada: Contas
    ): ResponseEntity<Contas> {
        return if (!repositorio.existsById(id)) {
            ResponseEntity.status(404).build()
        } else {
            contaAtualizada.id = id
            val contaSalva = repositorio.save(contaAtualizada)
            ResponseEntity.status(200).body(contaSalva)
        }
    }

    @GetMapping("/filtro")
    fun getByDataVencimento(@RequestParam dataVencimento: LocalDate): ResponseEntity<List<Contas>> {
        val contas = repositorio.findByDataVencimento(dataVencimento)
        return if (contas.isEmpty()) {
            ResponseEntity.status(204).build()
        } else {
            ResponseEntity.status(200).body(contas)
        }
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int): ResponseEntity<Void> {
        return if (!repositorio.existsById(id)) {
            ResponseEntity.status(404).build()
        } else {
            repositorio.deleteById(id)
            ResponseEntity.status(204).build()
        }
    }
}

