package br.com.ufape.petshare.services.exceptions;

public class AuthenticationException extends RuntimeException {

	public AuthenticationException(String message) {
		super(message);
	}
}
