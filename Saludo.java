public class Saludo {

    public void imprimirSaludo() {
        System.out.println("Hola");
    }

    public void imprimirDespedida() {
        System.out.println("Adiós");
    }

    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        saludo.mostrarSaludo();
        saludo.mostrarDespedida();
    }
}
