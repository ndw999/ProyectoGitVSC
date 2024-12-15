public class Mensajes {

    public void imprimirSaludo() {
        System.out.println("¡Hola! Bienvenido al programa.");
    }

    public void imprimirDespedida() {
        System.out.println("Adiós, ¡que tengas un buen día!");
    }

    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        saludo.imprimirSaludo();
        saludo.imprimirDespedida();
    }
}
