package Arrays_List_Exercicio01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Exercicio {

	public static void main(String[] args) {
		
        //criar uma lista e adicionar 7 notas:
		
		ArrayList<Double> notas = new ArrayList<>();
		notas.add(12.0);
		notas.add(10.0);
		notas.add(8.0);
		notas.add(1.8);
		notas.add(7.8);
		notas.add(9.2);
		notas.add(4.7);
		notas.add(7.5);
		notas.add(5.6);
		notas.add(1.8);

		
		System.out.println("Notas:");
		System.out.println(notas);
		System.out.println("===========================================");
		System.out.println("Exibindo a posição da nota 10.0");
		System.out.println("Posição:" + notas.indexOf(10.0));
		System.out.println("===========================================");
		System.out.println("Adicione na posição 7 a nota 8.0");
		notas.add(7, 8.0);
		System.out.println(notas);
		System.out.println("===========================================");
		System.out.println("Substitua a nota 1.8 por 10.0");
		notas.set(3, 10.0);
		System.out.println(notas);
		System.out.println("===========================================");
		System.out.println("Confira se a nota 7.8 esta na lista: " + notas.contains(7.8));
		System.out.println("===========================================");
        System.out.println("Exiba as notas uma abaixo da outra");
        for (Double nota : notas) {
		   System.out.println(nota);	
		}
		System.out.println("===========================================");
        System.out.println("Exiba a terceira nota adicionada:" + notas.get(2));
        System.out.println(notas);
		System.out.println("===========================================");
		System.out.println("Exiba a menor nota:" + Collections.min(notas));
		System.out.println(notas);
		System.out.println("===========================================");
		System.out.println("Exiba a maior nota:" + Collections.max(notas));
		System.out.println(notas);
		System.out.println("===========================================");
		System.out.println("Exibindo a soma das notas");
		Iterator<Double> it = notas.iterator();
		
		Double soma = 0.0;
		while(it.hasNext()) {
			double next = it.next();
			soma += next;
		}
		
		System.out.println("A soma das notas é:" + soma);
		System.out.println("===========================================");
		System.out.println("Exibindo a média das notas:" + (soma / notas.size()));
		System.out.println("===========================================");
		System.out.println(notas);
		System.out.println("Removendo a nota 9.2 " + notas.remove(9.2));//removendo pelo elemento
		System.out.println(notas);
		System.out.println("===========================================");
		System.out.println(notas);
		System.out.println("removendo pela posição,primeiro elemento " + notas.remove(1));
		System.out.println(notas);




    


		
		
		
		
	}

}
