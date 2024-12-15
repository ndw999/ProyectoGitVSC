package ProyectoGitVSC;

public class Tarea {

    public void mostrarTareas() {
        System.out.println("Lista de tareas:");
        System.out.println("1. Ir al gimnasio");
        System.out.println("2. Hacer la compra");
        System.out.println("3. Ir a clase");
    }

    public void nuevaTarea(String tarea) {
        System.out.println("Tarea añadida: " + tarea);
    }

    public static void main(String[] args) {
        Tarea tareas = new Tarea();
        tareas.mostrarTareas();
        tareas.nuevaTarea("Estudiar Github");
    }
}

