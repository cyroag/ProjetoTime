import java.util.Scanner;

public class TimeTeste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		
		Time t = new Time(15, 00, 58);
		
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHoraUniversal());
		
		System.out.println("Deseja alterar o horário? (SIM - 1/NÃO - 2)");
		
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			System.out.println("Digite o novo horário:");
			t.setTime(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
		}
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHoraUniversal());
		
		teclado.close();
	}
}
