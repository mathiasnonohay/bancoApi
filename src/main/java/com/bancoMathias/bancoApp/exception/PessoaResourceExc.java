package com.bancoMathias.bancoApp.exception;

public class PessoaResourceExc extends Exception {

	private static final long serialVersionUID = 1L;

	public PessoaResourceExc() {
		super();

	}

	public PessoaResourceExc(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public PessoaResourceExc(String message, Throwable cause) {
		super(message, cause);

	}

	public PessoaResourceExc(String message) {
		super(message);

	}

	public PessoaResourceExc(Throwable cause) {
		super(cause);
	
	}
	

}