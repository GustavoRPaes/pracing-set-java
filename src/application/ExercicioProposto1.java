package application;

import java.text.Collator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ExercicioProposto1 {

	public static void main(String[] args) {
		
		Set<String> cores = new HashSet<>();{{
			cores.add("Vermelho");
			cores.add("Laranja");
			cores.add("Amarelo");
			cores.add("Verde");
			cores.add("Azul");
			cores.add("Anil");
			cores.add("Violeta");
		}}
		System.out.println("Exiba todas as cores que o arco-irís tem: ");
        for (String cor : cores) {
            System.out.println(cor);
        }

//		Iterator<String> exibirCores = cores.iterator();
//		while(exibirCores.hasNext()) {
//			Object element = exibirCores.next();
//			System.out.println(element + " ");
//		}
		System.out.println();
		
		System.out.println("A quantidade de cores que o arco-irís tem: " + cores.size());
		System.out.println();
		
		System.out.println("Exiba as cores em ordem alfabética: ");
		TreeSet<String> cores1 = new TreeSet<>(cores);
		System.out.println(cores1);
		System.out.println();

		
		System.out.println("Exiba as cores em ordem inversa da que foi informada: ");
		System.out.println(cores1.descendingSet());
		System.out.println();
		
		System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor : cores) {
            if(cor.toLowerCase().startsWith("v"))
            	System.out.println(cor);
        }
        System.out.println();
		
		
		System.out.println("Remova todas as cores que não começam com a letra “v”");
		Iterator<String> iterator2 = cores.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().toLowerCase().startsWith("v")) iterator2.remove();
        }
        System.out.println(cores);
		System.out.println();
		
		System.out.println("Limpe o conjunto: ");
		cores.clear();
		System.out.println(cores);
		System.out.println();

		System.out.println("Confira se o conjunto está vazio: ");
		System.out.println(cores.isEmpty());

		

	}

}
