package ProyectoGitVSC;
public class Mensajes {

    public void mostrarSaludo() {
        System.out.println("¡Hola! Bienvenido al programa.");
    }

    public void mostrarDespedida() {
        System.out.println("Adiós, ¡que tengas un buen día!");
    }

    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        saludo.mostrarSaludo();
        saludo.mostrarDespedida();
    }
}
