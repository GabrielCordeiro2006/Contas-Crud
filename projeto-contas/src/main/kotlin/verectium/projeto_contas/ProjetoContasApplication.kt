package verectium.projeto_contas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["verectium.projeto_contas", "entity"])
class ProjetoContasApplication

fun main(args: Array<String>) {
	runApplication<ProjetoContasApplication>(*args)
}