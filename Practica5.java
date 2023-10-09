class Persona {
    private String nombre;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}

class PersonaFamilia extends Persona {
    private String relacion;
    private String direccion;
    private String telefono;

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}

class PersonaEscuela extends Persona {
    private int grado;
    private String materiaFavorita;
    private double promedio;

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getGrado() {
        return grado;
    }

    public void setMateriaFavorita(String materiaFavorita) {
        this.materiaFavorita = materiaFavorita;
    }

    public String getMateriaFavorita() {
        return materiaFavorita;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }
}

class PersonaEmpleo extends Persona {
    private String puesto;
    private double salario;
    private String empresa;

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }
}

public class Practica5 {
    public static void main(String[] args) {
        // Crear una persona de contexto familiar
        PersonaFamilia personaFamilia = new PersonaFamilia();
        personaFamilia.setNombre("Christopher");
        personaFamilia.setEdad(21);
        personaFamilia.setRelacion("Amigo");
        personaFamilia.setDireccion("123 Calle Principal");
        personaFamilia.setTelefono("664-33660055");

        // Crear una persona de contexto escolar
        PersonaEscuela personaEscuela = new PersonaEscuela();
        personaEscuela.setNombre("Valentina");
        personaEscuela.setEdad(21);
        personaEscuela.setGrado(5);
        personaEscuela.setMateriaFavorita("Artes");
        personaEscuela.setPromedio(8.5);

        // Crear una persona de contexto laboral
        PersonaEmpleo personaEmpleo = new PersonaEmpleo();
        personaEmpleo.setNombre("Alejandro Segura Aguilar");
        personaEmpleo.setEdad(22);
        personaEmpleo.setPuesto("Ingeniero de Software");
        personaEmpleo.setSalario(75000.0);
        personaEmpleo.setEmpresa("Samsung");

        // Imprimir los datos de las personas
        System.out.println("Persona en contexto familiar:");
        System.out.println("Nombre: " + personaFamilia.getNombre());
        System.out.println("Edad: " + personaFamilia.getEdad());
        System.out.println("Relación: " + personaFamilia.getRelacion());
        System.out.println("Dirección: " + personaFamilia.getDireccion());
        System.out.println("Teléfono: " + personaFamilia.getTelefono());

        System.out.println("\nPersona en contexto escolar:");
        System.out.println("Nombre: " + personaEscuela.getNombre());
        System.out.println("Edad: " + personaEscuela.getEdad());
        System.out.println("Grado: " + personaEscuela.getGrado());
        System.out.println("Materia Favorita: " + personaEscuela.getMateriaFavorita());
        System.out.println("Promedio: " + personaEscuela.getPromedio());

        System.out.println("\nPersona en contexto laboral:");
        System.out.println("Nombre: " + personaEmpleo.getNombre());
        System.out.println("Edad: " + personaEmpleo.getEdad());
        System.out.println("Puesto: " + personaEmpleo.getPuesto());
        System.out.println("Salario: $" + personaEmpleo.getSalario());
        System.out.println("Empresa: " + personaEmpleo.getEmpresa());
    }
}
