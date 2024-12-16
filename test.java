import javax.swing.*;

public class test {

    public static void main(String[] args) {

        // Arreglos regiones y provincias
        String[] regiones = {"Costa", "Sierra", "Oriente", "Galápagos"};
        String[][] provincias = {
            {"Guayas", "Esmeraldas"}, 
            {"Pichincha", "Azuay"},   
            {"Napo", "Sucumbíos"},     
            {"Galápagos"}              
        };
        
        // Arreglo votos
        int[][][] votos = new int[4][2][3];  

        // Boolean que sirve como control de flujo del ciclo while
        boolean continuar = true;
        boolean cancelado = false;  // Nuevo flag para controlar la cancelación
        
        //Bloque de codigo: Selección de la región, provincia y el ingreso de votos
        while (continuar) {
            
            // Solicitud de selección de la región
            String region_seleccionada = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione la región:",
                    "Selección de región",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    regiones,
                    regiones[0]
            );

            // Verificar si el usuario presionó "Cancelar"
            if (region_seleccionada == null) {
                cancelado = true;
                break;
            }

            // índice de la región seleccionada
            int indice_region = -1;
            for (int i = 0; i < regiones.length; i++) {
                if (regiones[i].equals(region_seleccionada)) {
                    indice_region = i;
                    break;
                }
            }

            // Solicitud de selección de la provincia
            String[] provinciasDeRegion = provincias[indice_region];
            String provincia_seleccionada = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione la provincia de " + region_seleccionada + ":",
                    "Selección de provincia",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    provinciasDeRegion,
                    provinciasDeRegion[0]
            );

            // Verificar si el usuario presionó "Cancelar"
            if (provincia_seleccionada == null) {
                cancelado = true;
                break;
            }

            // índice de la provincia seleccionada
            int indice_provincia = -1;
            for (int i = 0; i < provinciasDeRegion.length; i++) {
                if (provinciasDeRegion[i].equals(provincia_seleccionada)) {
                    indice_provincia = i;
                    break;
                }
            }

            // Votos para cada uno de los 3 candidatos
            String mensaje = "Ingrese los votos para cada candidato en la provincia de " + provincia_seleccionada;
            int[] votosProvincia = new int[3];
            for (int i = 0; i < 3; i++) {
                while (true) {
                    String input = JOptionPane.showInputDialog(
                            null,
                            mensaje + " (Candidato " + (i + 1) + "):",
                            "Ingreso de votos",
                            JOptionPane.QUESTION_MESSAGE
                    );

                    // Verificar si el usuario cancela la operacion
                    if (input == null) {
                        cancelado = true;  // Marcar como cancelado
                        break;
                    }

                    // convertir la entrada a un número entero con Try
                    try {
                        votosProvincia[i] = Integer.parseInt(input);
                        break; // Si se convierte correctamente, salir del bucle
                    } catch (NumberFormatException e) {
                        // si ocurre una excepción, eso señala que el valor no es un numero mostrando mensaje de error
                        JOptionPane.showMessageDialog(
                                null,
                                "Error: Por favor ingrese un número válido.",
                                "Entrada inválida",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                }

                // Si el usuario canceló en cualquier momento, salir del ciclo principal
                if (cancelado) {
                    break;
                }
            }

            // Si el usuario canceló, salir del ciclo principal
            if (cancelado) {
                break;
            }

            // Guardar votos en la matriz
            for (int i = 0; i < 3; i++) {
                votos[indice_region][indice_provincia][i] += votosProvincia[i];
            }

            // preguntar si se desea ingresar más actas
            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea ingresar más actas?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION
            );
            // Si no, mostrara los resultados de los votos
            if (respuesta == JOptionPane.NO_OPTION) {
                continuar = false;  // Finalizar el ciclo, pero no se marca como "cancelado"
            }
        }

        // Mostrar los resultados finales si no fue cancelado
        if (!cancelado) {
            StringBuilder resultados = new StringBuilder("Resultados finales:\n\n");
            for (int i = 0; i < regiones.length; i++) {
                resultados.append("Región: ").append(regiones[i]).append("\n");
                for (int j = 0; j < provincias[i].length; j++) {
                    resultados.append("  Provincia: ").append(provincias[i][j]).append("\n");
                    for (int k = 0; k < 3; k++) {
                        resultados.append("    Candidato ").append(k + 1).append(": ").append(votos[i][j][k]).append(" votos\n");
                    }
                }
            }

            JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados de Elecciones", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
