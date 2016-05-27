import java.util.HashMap;
import java.util.Map;

public class Tradutora {

	private Map<String, String> dicionarioIngles = new HashMap<String, String>();
	private String[] traducao;

	public String traduzir(String palavra) {
			traducao = palavra.split(" ");
			String textoOuPalavraTraduzida = "";
			for (String p : traducao) {
				textoOuPalavraTraduzida += verificarPalavra(p) + " ";
			}
			return textoOuPalavraTraduzida.trim();
	}

	private String verificarPalavra(String palavra) {
		if (dicionarioIngles.get(palavra) == null || dicionarioIngles.get(palavra) == "") {
			return "Palavra não Encontrada no Dicionario";
		}else{
			return dicionarioIngles.get(palavra);
		}
	}

	public void adicionar(String palavra, String traducao) {
			dicionarioIngles.put(palavra,traducao);
	}
}
