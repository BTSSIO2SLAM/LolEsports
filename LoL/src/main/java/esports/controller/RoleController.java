package esports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import esports.entity.Role;
import esports.repository.RoleRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/roles")
public class RoleController {

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private RoleRepository roleRepository;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Role> getAllRoles() {
		// This returns a JSON or XML with the users
		return roleRepository.findAll();
	}
}