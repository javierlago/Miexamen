package Ejercicio1;


import Metodos.Mismetodos;

import java.io.IOException;

public class Examen {



    public static void main(String[] args) throws IOException {
        int numeros;
        int numerointroducido;
        int contadorceros=0;
        int contadormayores=0;
        int contadormenores=0;
        Mismetodos.Imprime("Cuantos numeros desea comprobar?" );
        numerointroducido=Mismetodos.pedirNumero();
        Mismetodos.Imprime("A continuacion ir introduciendo los numeros");
        for(int i=numerointroducido;i > 0; i--){
            numeros=Mismetodos.pedirNumero();
                    if(Mismetodos.espositivo(numeros)){
                        contadormayores++;
                                } else if (numeros==0) {
                                    contadorceros++;
                                        } else if (!Mismetodos.espositivo(numeros)) {
                                            contadormenores++;
            }


        }

Mismetodos.Imprime("El numero de mayores es de "+contadormayores+
                         "\nEl numero de menores es de "+contadormenores+
                                "\nY el numero de iguales a cero es de "+contadorceros);





    }









}
