package esports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import esports.entity.Partie;
import esports.repository.PartieRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/parties")
public class PartieController {

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private PartieRepository partieRepository;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Partie> getAllParties() {
		// This returns a JSON or XML with the users
		return partieRepository.findAll();
	}
}
