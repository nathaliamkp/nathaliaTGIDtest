package com.test.nathalia.entity;

import com.test.nathalia.exception.NoBalanceAvaible;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;

@Entity(name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @CPF
    @NotBlank(message = "this field cannot be blank")
    @NotNull(message = "this field cannot be null")
    private String cpf;
    @NotBlank(message = "this field cannot be blank")
    @NotNull(message = "this field cannot be null")
    private String name;
    @Email
    @NotBlank(message = "this field cannot be blank")
    @NotNull(message = "this field cannot be null")
    private String email;
    @ManyToOne
    private Enterprise enterprise;






}
