import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteTraducao {

	private Tradutora t;
	
	
	@Before
	public void inicializar(){
		 t = new Tradutora();
	}

	@Test
	public void tentarTraduzirSemPalavras() {
		Tradutora t = new Tradutora();
		assertEquals("Palavra n�o Encontrada no Dicionario",t.traduzir(""));
	}
	@Test
	public void traduzirUmaPalavras() {
		t.adicionar("bom","good");
		assertEquals("good",t.traduzir("bom"));
	}
	
	@Test
	public void traduzirDuasPalavras() {
		t.adicionar("bom","good");
		t.adicionar("�","is");
		assertEquals("good",t.traduzir("bom"));
		assertEquals("is",t.traduzir("�"));
	}
	
	@Test
	public void traduzirPalavrasSemTraducao() {
		assertEquals("Palavra n�o Encontrada no Dicionario",t.traduzir("bom"));
	}
	
	@Test
	public void traduzirFrase() {
		t.adicionar("amor","love");
		t.adicionar("bom","good");
		t.adicionar("�","is");
		assertEquals("love is good",t.traduzir("amor � bom"));
	}
	
	@Test
	public void adcionarPalavraComDuasTraducoes() {
		t.adicionar("bom","good");
		t.adicionar("bom","nice");
		assertEquals("good, nice",t.traduzir("bom"));
	}
	

}
