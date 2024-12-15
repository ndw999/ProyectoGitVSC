package ProyectoGitVSC;
public class Saludo {

    public void mostrarSaludo() {
        System.out.println("Hola");
    }

    public void mostrarDespedida() {
        System.out.println("Adiós");
    }

    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        saludo.mostrarSaludo();
        saludo.mostrarDespedida();
    }
}
