package lista;

import modelo.Tarefa;

public class No {

    private No ant;
    private No prox;
    private Tarefa tarefa;

    public No(No ant, No prox, Tarefa tarefa) {
        this.ant = ant;
        this.prox = prox;
        this.tarefa = tarefa;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
}
