package com.bancoMathias.bancoApp.exception;

public class PessoaNotFoundExc extends Exception {

	private static final long serialVersionUID = 1L;

	public PessoaNotFoundExc() {
		super();

	}

	public PessoaNotFoundExc(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public PessoaNotFoundExc(String message, Throwable cause) {
		super(message, cause);
		
	}

	public PessoaNotFoundExc(String message) {
		super(message);
		
	}

	public PessoaNotFoundExc(Throwable cause) {
		super(cause);
		
	}
	
}
