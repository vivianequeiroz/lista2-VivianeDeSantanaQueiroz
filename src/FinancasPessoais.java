import java.math.BigDecimal;
import java.time.LocalDate;

public class FinancasPessoais {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(); 
		usuario.setNome("Viviane Queiroz");
		System.out.println("***** Bem-vindo à sua aplicação de orçamento financeiro, " + usuario.getNome() + "! ****");
		
		Usuario renda = new Usuario(); 
		renda.setRenda("2.340,00");
		
		String rendaTotal = renda.getRenda();
		
		BigDecimal rendaConversao = new BigDecimal(rendaTotal.replaceAll("\\.", "").replace(",","."));  
		System.out.println("");
		System.out.println("Sua renda atual é de:........: R$" + rendaConversao);
		System.out.println("");
		
		
		LocalDate atual = LocalDate.now();
		LocalDate registrada = atual.minusWeeks(3);
		
		
		System.out.println("Segue aqui sua lista de gastos atualizada em " + registrada + ":");
		
		 
		System.out.println(ListaGastosMensais.ALIMENTACAO + "................. - R$300.00");
		System.out.println(ListaGastosMensais.SAUDE + "....................... - R$210.00");
		System.out.println(ListaGastosMensais.LAZER + "....................... - R$100.00");
		System.out.println(ListaGastosMensais.TRANSPORTE + ".................. - R$280.00");
		System.out.println(ListaGastosMensais.EDUCACAO + ".................... - R$320.00");
		
		}	
}
		
		
		


