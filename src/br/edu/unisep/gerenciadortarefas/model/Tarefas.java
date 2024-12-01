package br.edu.unisep.gerenciadortarefas.model;

public class Tarefas {
    package br.edu.unisep.tarefas.model;

    public class Tarefas {
        private String tarefa;

        public Tarefas() {
        }

        public Tarefas(String tarefa) {
            this.tarefa = tarefa;
        }

        public String getTarefa() {
            return tarefa;
        }

        public void setTarefa(String tarefa) {
            this.tarefa = tarefa;
        }

        @Override
        public String toString() {
            return "Tarefas{" +
                    "tarefa='" + tarefa + '\'' +
                    '}';
        }
    }
}
