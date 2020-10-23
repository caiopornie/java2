import java.util.HashMap;
import java.util.Map;

public class TestMap1 {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.depositar(10);
		c1.setNome("Lucas");
		c1.setLimite(200);
		Conta c2 = new Conta();
		c2.depositar(10);
		c2.setNome("Lucas");
		c2.setLimite(200);
		Conta c3 = new Conta();
		c3.depositar(10);
		c3.setNome("Lucas");
		c3.setLimite(200);	
	
		Map<String, Conta> mapContas = new HashMap<String, Conta>();
		mapContas.put("cliente1", c1);
		mapContas.put("cliente1", c2);
		mapContas.put("cliente1", c3);
	
		Conta contaRecuperada = mapContas.get("cliente2");
		System.out.println(contaRecuperada);
		System.out.println(contaRecuperada.getNome());
		System.out.println(contaRecuperada.getLimite());
		System.out.println(contaRecuperada.getSaldo());

	}
}
