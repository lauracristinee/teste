package conta_corrente_etim_azul;


public class ContaCorrente {
	public String nomeTitular;
	public double saldo;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		this.saldo -= valor;
		return true;
	}
	
	public boolean tranferir(double valor, ContaCorrente contaDestino) {
		if(this.saldo < valor) {
			return false;
		}
		this.saldo -= valor;
		contaDestino.saldo += valor;
		return true;
	}

}
