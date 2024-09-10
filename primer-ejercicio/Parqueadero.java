
public class Parqueadero {
    private Carro[][] matriz;
    private double tarifaPorHora;

    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        this.matriz = new Carro[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        // probemos si la posición está dentro del rango de la matríz
        if (fila < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length) {
            return false;//lo enterior quiere decir que está fuera de los límites, allí no se puede parquear carro,
            //si las condiciones se cumplen.
            // matriz.length da la cantidad de filas que hay en el arreglo.
            // matríz[0].length da la cantidad de columnas en la primera fila.
        }
        if (matriz[fila][columna] != null) { // !=null; lo que hace es verificar que el valor de la posición "fila:columna" sea diferente de null.
            // null se usa como referencia para indicar que un espacio está vacío.
            return false; // quiere decir que la posición a la que intentamos acceder en la matríz esta ocupado.
        }
        //parqueamos carro en una posición específica.
        matriz[fila][columna] = carro;
        return true;
    }

    public void mostrarEstadoParqueadero() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == null) {
                    System.out.println("[ ]");
                } else {
                    System.out.println("[X]");
                }
            }
        }
        System.out.println();
    }
// creamos el método para calcular el costo total a pagar por hora en el parqueadero.
public double cobrarPorTiempo(Carro carro, int horas){
    return horas * tarifaPorHora;
    }
}