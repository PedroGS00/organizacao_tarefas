package lista;

import modelo.Tarefa;

public class Lista {

    private No atual, inicio, aux;

    public No getInicio() {
        return inicio;
    }

    public boolean empty() {
        return inicio == null;
    }

    public int size(){
        int cont = 0;
        No ref = inicio;
        while (ref != null) {
            cont++;
            ref = ref.getProx();
        }
        return cont;
    }

    public Tarefa front(){
        if (empty()) {
            return null;
        }
        No ref = inicio;
        Tarefa tarefaPrioritaria = ref.getTarefa();
        while (ref != null) {
            if (ref.getTarefa().getPrioridade() < tarefaPrioritaria.getPrioridade()) {
                tarefaPrioritaria = ref.getTarefa();
            }
            ref = ref.getProx();
        }
        return tarefaPrioritaria;
    }

    public void exibir() {
        No ref = atual;
        while (ref != null) {
            System.out.println(ref.getTarefa());
            ref = ref.getAnt();
        }
    }

    public void exibir(No ref) {
        if (ref != null) {
            System.out.println(ref.getTarefa());
            exibir(ref.getProx());
        }
    }

    public Tarefa tarefa(int id){
        No ref = inicio;
        Tarefa tarefa;
        while (ref != null) {
            tarefa = ref.getTarefa();
            if (id == tarefa.getId()){
                return tarefa;
            }
            ref = ref.getProx();
        }
        return null;
    }

    public void enqueque(Tarefa tarefa){
        if (empty()) {
            inicio = new No(null, null, tarefa);
            aux = inicio;
        } else {
            atual  = new No(aux, null, tarefa);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public boolean dequeue(int id) {
        No ref = inicio;
        while (ref != null) {
            if (ref.getTarefa().getId() == id) {
                if (ref.getAnt() != null) {
                    ref.getAnt().setProx(ref.getProx());
                } else {
                    inicio = ref.getProx();
                }
                if (ref.getProx() != null) {
                    ref.getProx().setAnt(ref.getAnt());
                }
                return true;
            }
            ref = ref.getProx();
        }
        return false;
    }


}
