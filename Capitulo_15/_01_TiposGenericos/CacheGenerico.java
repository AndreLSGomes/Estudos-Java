package Capitulo_15._01_TiposGenericos;

public class CacheGenerico<T> {
	
	/*
		Indica um atributo genérico, T é um parâmetro de generalização
		E–> Element; K–> Key; N–> Number; T–> Type e V–> Value.
	 */
	private T valor;
	
	// Métodos acessores
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}

}
