package principal;

import lista.Lista;
import modelo.Tarefa;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.enqueque(new Tarefa("Trocar memoria ram", 5));
        lista.enqueque(new Tarefa("Adicionar SSD", 2));
        lista.enqueque(new Tarefa("Trocar fonte", 3));
        lista.enqueque(new Tarefa("Troca de tela do notebook", 1));


        lista.exibir(lista.getInicio());

        System.out.println("\nTarefa urgente: " + lista.front());

        Tarefa tarefa = lista.tarefa(2);

        // remover
        System.out.println("Removendo...");
        if (lista.dequeue(3)){
            System.out.println("Lis");
            lista.exibir(lista.getInicio());
        } else {
            System.out.println("Tarefa não encontrada!");
        }

        System.out.println("\nTamanho da lista: " + lista.size());





    }
}