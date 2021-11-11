package java_pilha;

import javax.sound.midi.MidiUnavailableException;

public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        metodo1();
    	} catch (ArithmeticException | NullPointerException ex) { // ex eh uma referencia e ArithmeticException eh uma classe
    		String msg = ex.getMessage();
    		System.out.println("Exception " + msg);
    		ex.printStackTrace();
    	}
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
    	System.out.println("Ini metodo 2");
    	metodo2();
    	System.out.println("Fim do metodo 2");
        }
    
}