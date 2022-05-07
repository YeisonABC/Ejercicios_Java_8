package com.ejercicio1;

import java.util.*;

/*
 Alice y Bob crearon cada uno un problema para HackerRank. Un revisor califica los dos desafíos, otorgando puntos en una escala del 1 al 100 para tres categorías: claridad del problema , originalidad y dificultad .

La calificación del desafío de Alice es el triplete a = (a[0], a[1], a[2]) , y la calificación del desafío de Bob es el triplete b = (b[0], b[1], b [2]) .

La tarea es encontrar sus puntos de comparación comparando a[0] con b[0] , a[1] con b[1] y a[2] con b[2] .

Si a[i] > b[i] , Alice recibe 1 punto.
Si a[i] < b[i] , Bob recibe 1 punto.
Si a[i] = b[i] , entonces ninguna persona recibe un punto.
Los puntos de comparación son los puntos totales que ganó una persona.

Dados a y b , determine sus respectivos puntos de comparación.

*/

class ejercicio1 {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    //se crea el objeto a devolver
    List<Integer> resultado = new ArrayList<>();
    // index de alice y bob ya que con el objeto List no se puede obtener el index facilmente
    int indiceA=0;
    int indiceB=0;
    //contadores de puntos para bob y alice
    int puntoB=0;
    int puntoA=0;
    //iteracion de alice
   for (Integer alice : a) {
       indiceA++;
       //iteracion de bob
       for (Integer bob : b) {
           indiceB++;
           //si los indices son iguales se realiza la operacion de puntuacion
           if (indiceA==indiceB) {                         
           if (alice > bob) {
               puntoA++;         
            }else if (alice < bob) {
                puntoB++;   
            }
           }          
       }
       // se reinicia el indice de bob a cero 
       indiceB=0;
   }
   resultado.add(puntoA);
   resultado.add(puntoB);
   return resultado;
    }
}

