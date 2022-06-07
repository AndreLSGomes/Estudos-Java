package com.exemplo.fullstackapp.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/*
	@Document é uma anotação fornecida pelo projeto de dados Spring.
	Ele é usado para identificar um objeto de domínio, que é persistido
	no MongoDB . Assim, você pode usá-lo para mapear uma classe Java em
	uma coleção dentro do MongoDB.
*/
@Document(collection = "employee")
public class Employee {
	
	/*
		A anotação @Transient, é uma anotação do JPA, que serve para indicar
		que um atributo de uma classe não sera utilizado no banco de dados, ou
		em um método get para indicar que essa propriedade não será utilizada no
		banco de dados. Não será feito o mapeamento objeto relacional dele.
		
		Marca um campo como temporário para a estrutura de mapeamento. Assim, a
		propriedade não será persistida e não será mais inspecionada pela estrutura
		de mapeamento.
	*/
	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";
	
	/*
		A anotação @Id especifica a chave primária de uma entidade e a
		@GeneratedValue fornece a especificação de estratégias de geração
		para os valores das chaves primárias.
	*/
	@Id
	private long id;
	
	@NotBlank
	@Size(max=100)
	@Indexed(unique=true)
	private String firstName;
	private String lastName;
	
	@NotBlank
	@Size(max=100)
	@Indexed(unique=true)
	private String emailId;
	
	// Construtor Padrão
	public Employee() {}
	
	// Construtor
	public Employee(long id, String firstName, String lastName, String email) {
		super();
		this.id        = id;
		this.firstName = firstName;
		this.lastName  = lastName;
		this.emailId   = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}

	// Méotodos acessores
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}