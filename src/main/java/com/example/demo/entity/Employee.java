package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Department is required")
    private String department;

    private LocalDate dateOfJoining;

    
    public Long getId() 
    {
    	return id; 
    }
    public void setId(Long id) 
    { 
    	this.id = id; 
    }
    public String getName() 
    { 
    	return name; 
    }
    public void setName(String name) 
    { 
    	this.name = name; 
    }
    public String getEmail() 
    { 
    	return email; 
    }
    public void setEmail(String email) 
    { 
    	this.email = email; 
    }
    public String getDepartment() 
    { 
    	return department; 
    }
    public void setDepartment(String department) 
    { 
    	this.department = department; 
    }
    public LocalDate getDateOfJoining() 
    { 
    	return dateOfJoining; 
    }
    public void setDateOfJoining(LocalDate dateOfJoining) 
    { 
    	this.dateOfJoining = dateOfJoining; 
    }
}
