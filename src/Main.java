public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.edad = 29;
    cliente.Nombre = "Bruce";
    cliente.telefono=941606903;
    cliente.credito=1000;

        System.out.println("Edad:"+cliente.edad);
        System.out.println("Nombre:"+cliente.Nombre);
        System.out.println("Telefono:"+cliente.telefono);
        System.out.println("Credito:"+cliente.credito);

    trabajador Trabajador = new trabajador();
        Trabajador.edad = 29;
        Trabajador.Nombre = "Bruce";
        Trabajador.telefono=941606903;
        Trabajador.salario=1000;

        System.out.println("Edad:"+Trabajador.edad);
        System.out.println("Nombre:"+Trabajador.Nombre);
        System.out.println("Telefono:"+Trabajador.telefono);
        System.out.println("Salario:"+Trabajador.salario);

    }
}

class Persona{
    int edad;
    String Nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class trabajador extends Persona{
    int salario;
}