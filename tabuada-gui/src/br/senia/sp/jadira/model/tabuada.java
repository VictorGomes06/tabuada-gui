package br.senia.sp.jadira.model;

public class tabuada {

	private int multiplicando;
	private int multiplicador;
	
	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}
	public int getMultiplicando() {
		return multiplicando;
	}
	
	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}
	public int getMultiplicador() {
		return multiplicador;
	}
	
	public String[] calcular(){
		
		String tabuada[] = new String[multiplicador + 1];
		
		for (int index = 0; index <=  multiplicador; index++) {
			int resultado = multiplicando * index;
			tabuada[index] = multiplicando + " x " + index + " = " + resultado;
			
		}
		
		
		
		return tabuada;
		
		
		
		
		
	}
	
}
