package com.exemplo.fullstackapp.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.fullstackapp.exception.ResourceNotFoundException;
import com.exemplo.fullstackapp.model.Employee;
import com.exemplo.fullstackapp.repository.EmployeeRepository;
import com.exemplo.fullstackapp.service.SequenceGeneratorService;

@CrossOrigin(origins="http://localhost:4200")

/*
	A anotação Spring RestController é uma anotação de que é anotada com
	@Controller e @ResponseBody . Essa anotação é aplicada a uma classe
	para marcá-la como um manipulador de solicitação. A anotação Spring
	RestController é usada para criar serviços da Web RESTful usando
	Spring MVC.
*/
@RestController

/*
	@RequestMapping é a anotação mais comum e amplamente usada no Spring MVC.
	Ele é usado para mapear solicitações da Web em classes de manipulador
	específicas e/ou métodos de manipulador . @RequestMapping pode ser aplicado
	à classe do controlador, bem como aos métodos. Possui as seguintes opções
	opcionais. name: Atribua um nome a este mapeamento.
*/
@RequestMapping("/api/v1")
public class EmplyeeController {
	
	// Aplicando as injeções de dependência
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	/*---------------------------------*/
	/* Construção das requisições HTTP */
	/*---------------------------------*/
	
	// Método para trazer todos os registros do Banco de dados
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	// Método para identificar e trazer um único registro do banco de dados
	@GetMapping("/employees/{id}")
	public  ResponseEntity<Employee> getEmployeeId(@PathVariable(value = "id") Long employeeId) throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Colaborador não encontrado: " + employeeId));
		
		return ResponseEntity.ok().body(employee);
	}
	
	// Método para adicionar (criar) um registro no Banco de Dados
	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		employee.setId(sequenceGeneratorService.generatorSequence(Employee.SEQUENCE_NAME));
		return employeeRepository.save(employee);
	}
	
	// Método para atualizar registros no Banco de dados
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Colaborador não encontrado: " + employeeId));

		// Manipulando valores a partir da construção do model
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		
		final Employee updateEmployee = employeeRepository.save(employee);
		
		return ResponseEntity.ok(updateEmployee);
	}
	
	// Método para excluir registros do Banco de Dados
	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId) 
			throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Colaborador, com este id, não encontrado: " + employeeId));
		// construindo o processo de exclusão do registro
		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("excluido", Boolean.TRUE);
		
		return response;		
	}
}