package br.com.ufape.petshare.controller.exceptions;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	private String fieldName;
	private String message;
}
