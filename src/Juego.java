//Nombre : Andres David Mendez Rodriguez
//Id : 704011

public class Juego {
    private int papel = 1;
    private int tijera = 2;
    private int piedra = 3;


    public Juego() {
    }

    public int getPapel() {
        return papel;
    }

    public void setPapel(int papel) {
        this.papel = papel;
    }

    public int getTijera() {
        return tijera;
    }

    public void setTijera(int tijera) {
        this.tijera = tijera;
    }

    public int getPiedra() {
        return piedra;
    }

    public void setPiedra(int piedra) {
        this.piedra = piedra;
    }

    public int juego(int jug1, int jug2) {
        // condicion = 1 es ganador jugador 1
        // condicion = 2 es ganador jugador 2
        //condicion -1 = empate


        if (jug1 == tijera && jug2 == papel || jug1 == piedra && jug2 == tijera || jug1 == papel && jug2 == piedra) {
            // jugador 1 toma valor de 1 y es ganador de los duelos
            return 1;
        } else if (jug2 == tijera && jug1 == papel || jug2 == piedra && jug1 == tijera || jug2 == papel && jug1 == piedra) {
            // jugador 2 toma valor de 2 y es ganador de los duelos
            return 2;
        } else {
            // Empate
            return 3;
        }


    }
/*
    public int contadorganadas(int jganador) {
        int victoriasj1 = 0;
        int victoriasj2 = 0;
        int empates = 0;

        int arj1 = 0;
        int arj2 = 0;
        int emp=0;
        if (jganador == 1) {
            arj1 = victoriasj1++;

            System.out.println("El jugador  1 a ganado " + victoriasj1 + " duelos ");

            return arj1;


        } else if (jganador == 2) {

            victoriasj2++;
            arj2 = victoriasj2++;
            System.out.println("El jugador  2 a ganado " + victoriasj2 + " duelos ");
            return arj2;

        } else   {

            empates++;
            emp=empates++;
            System.out.println("Empate");
            System.out.println("se han acunmulado un total de " + empates + " empates ");
            return emp;
        }*/
    }




