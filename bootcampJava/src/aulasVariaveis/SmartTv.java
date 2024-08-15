package aulasVariaveis;

public class SmartTv {
	boolean ligada; 
	int canal, volume;
	public int aumentarvolume(int volume) {
		volume ++;
		return volume;
	}
	public void diminuirvolume() {
		volume = volume --;
	}
	public void ligartv() {
		ligada = true;
	}
	public void mudarcanal(int novocanal) {
		canal = novocanal;
	}
	public void aumentarcanal() {
		canal = canal ++;
	}
	public void diminuircanal() {
		canal = canal --;
	}
}
