package com.lucas.loja.exception;

public class ProdutoNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ProdutoNotFoundException(String msg) {
		super(msg);
	}
}
