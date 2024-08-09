package conta_corrente_etim_azul;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ContaCorrenteTest { final double VARIACAO = 0.1; // magic number - ao inves de colocar um número solto, atribuimos esse valor, declaramos como final, para podermos reutilizar

//teste
@Test
public void testeDepositar() {
	//cenário
	ContaCorrente cc = new ContaCorrente ("Ricardo");
	cc.depositar(100);
	assertEquals(100, cc.saldo, VARIACAO);
	// comparando doubles, variação para compensar.
	cc.depositar(100);
	assertEquals(200, cc.saldo, VARIACAO);
	cc.depositar(100);
	assertEquals(300, cc.saldo, VARIACAO);
	//tudo isso esta dentro de um teste , para outros o @
}

@Test
public void testeSacar() {
	//cenário
	ContaCorrente cc = new ContaCorrente ("Ricardo");
	cc.depositar(300);
	//ação
	cc.sacar(10);
	//verificação
	assertEquals(290, cc.saldo, VARIACAO);
	// comparando doubles, variação para compensar.
	cc.sacar(100);
	assertEquals(190, cc.saldo, VARIACAO);
	cc.sacar(100);
	assertEquals(90, cc.saldo, VARIACAO);
}

@Test
public void testeTransferir() {
	//cenário
	ContaCorrente cc1 = new ContaCorrente ("Ricardo");
	ContaCorrente cc2 = new ContaCorrente ("Ana");
	cc1.depositar(200);
	//ação
	cc1.tranferir(50,cc2);
	assertEquals(150, cc1.saldo, VARIACAO);	
	assertEquals(50, cc2.saldo, VARIACAO);

}

}


/*

import org.junit.Test;
public class ContaCorrenteTest {

	final double VARIACAO = 0.1; //FINAL = CONSTANTE 
	//TESTE
	@Test
	public void testDepositar() {
		//CENÁRIO 
		ContaCorrente cc = new ContaCorrente();
		
		cc.depositar(100);
		assertEquals(100, cc.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
		
		cc.depositar(100);
		assertEquals(200, cc.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
		
	
		cc.depositar(100);
		assertEquals(300, cc.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
		
		
	}
		//VALOR ESPERADO 
		// VAI VERIFICAR SOZINHO SE ESTA CERTO, CHECK VERDE 
		// PORQUE DEU RISCADO = FOI CRIADO UM METODO MELHOR E VAI DAR OUTRAS OPÇOES 

	@Test
	public void testSacarSaldoSuficiente() {
		
		//CENÁRIO 
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(300);
		
		//acão
		cc.sacar(50);
		//verificação 
		assertEquals(250, cc.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
		
		
		
	}
		
		@Test
		public void testSacarSaldoInsuficiente() {
			
			//CENÁRIO = NÃO PRECISA DO SALDO, SALDO = 0
			ContaCorrente cc = new ContaCorrente();
			
			
			//acão
			cc.sacar(50);
			//verificação 
			assertEquals(0, cc.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
		
		}
			
			@Test
			public void testTransferir() {
			
				//CENÁRIO 
				ContaCorrente conta1 = new ContaCorrente();
				ContaCorrente conta2 = new ContaCorrente();
				
				conta1.depositar(200);
				
				//Ação
				
				conta1.tranferir(50, conta2);
				assertEquals(150, conta1.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS	
				assertEquals(50, conta2.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
			
				
	}
}
*/

// 