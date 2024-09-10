public class Main {
    String placa;
    String marca;
    String modelo;
    public static void main(String[]args){

       Parqueadero parqueadero = new Parqueadero(5,10,1000);

        Carro carro1 = new Carro("ALT890","FORD","FOCUS");
        Carro carro2 = new Carro("RCT007","SEAT","IBIZA");
        Carro carro3 = new Carro("JOT014","SEAT","LEÓN");
        Carro carro4 = new Carro("ATO818","VOLKSVAGEN","GOLF");
        Carro carro5 = new Carro("XIX999","RENAULT","MAGANE");
        Carro carro6 = new Carro("PKM210","AUDI","A4");

        // aquí estacionamos algunos carros en distintas posiciones del parqueadero.
        boolean parqueo1 = parqueadero.parquearCarro(carro1,0,0);
        System.out.println("Carro1 estacionado: " + (parqueo1 ? "Éxito" : "Fallido"));
        boolean parqueo2 = parqueadero.parquearCarro(carro2,4,9);
        System.out.println("Carro2 estacionado: " + (parqueo2 ? "Éxito" : "Fallido"));
        boolean parqueo3 = parqueadero.parquearCarro(carro3,3,7);
        System.out.println("Carro3 estacionado: " + (parqueo3 ? "Éxito" : "Fallido"));
        // Ahora trataremos de parquear otro carro en una posición ocupada para verificar que nuestro método si funcione.
        boolean parqueo4 = parqueadero.parquearCarro(carro4,0,0);
        System.out.println("Carro4 no puede ser estacionado allí: " + (parqueo4 ? "Éxito" : "Fallido"));

        // si queremos estacionar más carros solo es cuestión de reutilizar código y editar lo requerido.
        boolean parqueo5 = parqueadero.parquearCarro(carro5,1,0);
        System.out.println("Carro5 estacionado: " + (parqueo5 ? "Éxito" : "Fallido"));
        //al final mostramos el estado del parqueadero.
        System.out.println("Estado del parqueadero");
        parqueadero.mostrarEstadoParqueadero();
        // calcularemos el costo total por tiempo de parqueadero
        double costoCarro1= parqueadero.cobrarPorTiempo(carro1,3);
        System.out.println("total tarifa de parqueo a pagar por 3 horas: " + costoCarro1);
        double costoCarro2 = parqueadero.cobrarPorTiempo(carro2,4);
        System.out.println("total tarifa de parqueo a pagar por 4 horas: " + costoCarro2);
        double costoCarro3 = parqueadero.cobrarPorTiempo(carro3,10);
        System.out.println("total tarifa de parqueo a pagar por 10 horas: " + costoCarro3);
    }
}
