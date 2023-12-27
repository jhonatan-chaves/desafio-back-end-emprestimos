package br.com.jhonatanchaves.desafiobackendemprestimos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jhonatanchaves.desafiobackendemprestimos.model.CostumerLoans;
import br.com.jhonatanchaves.desafiobackendemprestimos.model.EmprestimoModel;
import br.com.jhonatanchaves.desafiobackendemprestimos.model.Loans;
import br.com.jhonatanchaves.desafiobackendemprestimos.repository.EmprestimoRepository;

@RestController
@RequestMapping(value = "/emprestimos")
public class EmprestimoController {

	@PostMapping(value = "/", produces = "application/json")
	public ResponseEntity<CostumerLoans> usuario(@RequestBody CostumerLoans costumerLoans) {

		List<EmprestimoModel> list = new ArrayList<EmprestimoModel>();
		EmprestimoRepository emprestimoRepository = new EmprestimoRepository();

		if (costumerLoans.getRenda() <= 3000.00
				|| costumerLoans.getRenda() > 3000.00 && costumerLoans.getRenda() < 5000.00
						&& costumerLoans.getIdade() <= 30 && costumerLoans.getCidade().equalsIgnoreCase("sp")) {
			list.add(emprestimoRepository.emPessoal());
		}

		if (costumerLoans.getRenda() >= 5000.00) {
			list.add(emprestimoRepository.emConsignado());
		}

		if (costumerLoans.getRenda() <= 3000.00
				|| costumerLoans.getRenda() > 3000.00 && costumerLoans.getRenda() < 5000.00
						&& costumerLoans.getIdade() <= 30 && costumerLoans.getCidade().equalsIgnoreCase("sp")) {

			list.add(emprestimoRepository.emGarantia());
		}

		Loans loans = new Loans();
		loans.setNome(costumerLoans.getNome());
		loans.setLon(list);

		return new ResponseEntity(loans, HttpStatus.OK);
	}

}
