import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Nombre : Andres David Mendez Rodriguez
//Id : 704011

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> ganadasj1 =new ArrayList<>();
        ArrayList<Integer> ganadasj2 =new ArrayList<>();
        ArrayList<String>  mostrarj1 = new ArrayList<>();
        ArrayList<String>  mostrarj2 = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int victoriasj1=0;
        int victoriasj2=0;
        int empates = 0;

        int arj1=0;
        int arj2=0;



        while (!salir){
            System.out.println("1. Jugar ");
            System.out.println("2  Reiniciar juego  ");
            System.out.println("3. Terminar Juego");


            System.out.println("Introduce una opcion por favor");

            Juego jue = new Juego();
            Random ale = new Random();
            //genero numero random
            int j1= 1+ ale.nextInt(3);
            if (j1==1 ){
                mostrarj1.add("Papel");
            } else if (j1==2 ) {
                mostrarj1.add("Tijera");

            } else if (j1==3) {
                mostrarj1.add("Piedra");
            }

            int j2= 1+ ale.nextInt(3);
            if (j2==1 ){
                mostrarj2.add("Papel");
            } else if (j2==2 ) {
                mostrarj2.add("Tijera");

            } else if (j2==3) {
                mostrarj2.add("Piedra");
            }



            int jganador = jue.juego(j1,j2);
            opcion= teclado.nextInt();
            switch (opcion){
                case 1:
                if (ganadasj1.size()<3 && ganadasj2.size()<3  ) {

                    if (jganador == 1 ) {
                        victoriasj1++;
                        ganadasj1.add(victoriasj1);

                        System.out.println("El jugador N-1 acumulo   " + victoriasj1 + " Victorias ");
                        System.out.println("Contador de Ganadas Jug N-1 :->>>> " + ganadasj1.toString());
                        System.out.println("Lanzamiento de jugador  N-1 :->>>> "+mostrarj1.toString());
                        System.out.println("Lanzamiento de jugador  N-2 :->>>> "+mostrarj2.toString());

                    } else if (jganador == 2) {

                        victoriasj2++;
                        ganadasj2.add(victoriasj2);
                        System.out.println("El jugador N-2  acumulo     :->>>> " + victoriasj2 + " Victorias ");
                        System.out.println("Contador de Ganadas Jug N-2 :->>>> " + ganadasj2.toString());
                        System.out.println("Lanzamiento de jugador N-1 :->>>> "+mostrarj1.toString());
                        System.out.println("Lanzamiento de jugador N-2 :->>>> "+mostrarj2.toString());

                    } else if (jganador == 3) {
                        System.out.println("Esta Lanzada fue Empate");
                        empates++;
                        System.out.println("se han acunmulado un total de " + empates + " empates ");
                    }
                }else {
                    if (ganadasj1.size()==3 ) {
                        System.out.println("Jugador Num_1 Gana con tres victorias");
                        System.out.println("Para seguir Jugando ");
                        System.out.println( "reinicia el Juego para continuar diviertiendote");
                    }else if (ganadasj2.size()==3){

                        System.out.println("Jugador Num_2 Gana con tres victorias");
                        System.out.println("Para seguir Jugando ");
                        System.out.println("reinicia el Juego para continuar diviertiendote");

                    }
                }
                            break;


                case 2:
                    System.out.println("Reiniciado con exito ");
                    ganadasj1.clear();
                    ganadasj2.clear();
                    mostrarj1.clear();
                    mostrarj2.clear();
                    victoriasj1=0;
                    victoriasj2=0;
                    break;


                case 3:
                    System.out.println("Exito gracias por jugar");

                    salir = true;
                    break;

                default:
                    System.out.println("Opcion Invalida intente nuevamente");
            }


        }


    }
}