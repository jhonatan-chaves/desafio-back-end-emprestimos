package br.com.jhonatanchaves.desafiobackendemprestimos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.com.jhonatanchaves.desafiobackendemprestimos.model.CostumerLoans;


@SpringBootApplication
@EntityScan(basePackages = {"br.com.jhonatanchaves.desafiobackendemprestimos.model"})
@ComponentScan(basePackages = {"br.*"})
@EnableJpaRepositories(basePackages = {"br.com.jhonatanchaves.desafiobackendemprestimos.repository"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableAutoConfiguration
class DesafioBackEndEmprestimosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBackEndEmprestimosApplication.class, args);
		
		
		
	}

}
