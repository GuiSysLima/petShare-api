package br.com.ufape.petshare.services.exceptions;

public class AuthorizationException extends RuntimeException {

	public AuthorizationException(String message) {
		super(message);
	}
}
