
public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	
	public Time(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public int getMinuto() {
		return minuto;
	}


	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}


	public int getSegundo() {
		return segundo;
	}


	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public String exibirHoraUniversal() {
		return formataNum(this.hora)+":"+formataNum(this.minuto)+":"+formataNum(this.segundo);
	}
	
	public String exibirHoraPadrao() {
		if(this.hora == 0){
			return formataNum(this.hora)+":"+formataNum(this.minuto)+":"+formataNum(this.segundo)+" AM";
		}
		else if(this.hora == 12){
			return formataNum(this.hora)+":"+formataNum(this.minuto)+":"+formataNum(this.segundo)+" PM";
		}
		else if(this.hora<12) {
			return formataNum(this.hora)+":"+formataNum(this.minuto)+":"+formataNum(this.segundo)+" AM";
		}
		else {
			int newhora = this.hora - 12;
			return formataNum(newhora)+":"+formataNum(this.minuto)+":"+formataNum(this.segundo)+" PM";
		}
	}
	
	private String formataNum(int num) {
		return (num<10)? "0"+num : String.copyValueOf(num);
	}
}
