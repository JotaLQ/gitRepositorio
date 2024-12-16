// clase base o superclase
class Animal {
    // datos atributos
    String nombre;
    int edad;

    // constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodo
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// subclase
class Perro extends Animal {
    // Atributo específico de la subclase
    String raza;

    // constructor
    public Perro(String nombre, int edad, String raza) {
        // Llamar al constructor de la superclase
        super(nombre, edad);
        this.raza = raza;
    }

    // método sobrescrito de la superclase
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    // método específico de la subclase
    public void mostrarRaza() {
        System.out.println("La raza del perro es: " + raza);
    }
}

public class herencias {
    public static void main(String[] args) {
        // crear un objeto de la subclase Perro
        Perro miPerro = new Perro("Max", 3, "Labrador");

        // llamar a métodos heredados
        System.out.println("Nombre del perro: " + miPerro.nombre);
        System.out.println("Edad del perro: " + miPerro.edad);

        // llamar a métodos sobrescritos
        miPerro.hacerSonido();

        // llamar a métodos específicos de la subclase
        miPerro.mostrarRaza();
    }
}
