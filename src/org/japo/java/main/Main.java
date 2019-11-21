/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static void main(String[] args) {

        //Constantes
        final String ANIMAL_VACA = "Vaca";
        final int CANTIDAD_VACA = 3;
        final String ANIMAL_OVEJA = "Oveja";
        final int CANTIDAD_OVEJA = 14;
        final String ANIMAL_BURRO = "Burro";
        final int CANTIDAD_BURRO = 2;
        final String ANIMAL_GALLINA = "Gallina";
        final int CANTIDAD_GALLINA = 18;

        //Variables
        int totalPatas;
        int totalPares;

        int patasVaca;
        int patasOveja;
        int patasBurro;
        int patasGallina;

        //Cabecera
        System.out.println("Secuencia de Patas");
        System.out.println("==================");

        //Datos Vaca
        System.out.printf("Animal .........: %s %n", ANIMAL_VACA);
        System.out.printf("Cantidad .......: %d %n", CANTIDAD_VACA);

        //Patas Vaca
        patasVaca = CANTIDAD_VACA * 4;
        System.out.printf("Patas ..........: %d %n", patasVaca);

        //Separador
        System.out.println("---");

        //Datos Oveja
        System.out.printf("Animal .........: %s %n", ANIMAL_OVEJA);
        System.out.printf("Cantidad .......: %d %n", CANTIDAD_OVEJA);

        //Patas Oveja
        patasOveja = CANTIDAD_OVEJA * 4;
        System.out.printf("Patas ..........: %d %n", patasOveja);

        //Separador
        System.out.println("---");

        //Datos Burro
        System.out.printf("Animal .........: %s %n", ANIMAL_BURRO);
        System.out.printf("Cantidad .......: %d %n", CANTIDAD_BURRO);

        //Patas Burro
        patasBurro = CANTIDAD_BURRO * 4;
        System.out.printf("Patas ..........: %d %n", patasBurro);

        //Separador
        System.out.println("---");

        //Datos Gallina
        System.out.printf("Animal .........: %s %n", ANIMAL_GALLINA);
        System.out.printf("Cantidad .......: %d %n", CANTIDAD_GALLINA);

        //Patas Burro
        patasGallina = CANTIDAD_GALLINA * 2;
        System.out.printf("Patas ..........: %d %n", patasGallina);

        //Separador
        System.out.println("---");

        //Cálculo Total de Patas y pares
        totalPatas = patasVaca + patasOveja + patasBurro + patasGallina;
        totalPares = totalPatas / 2;

        //Totales
        System.out.printf("Total de Patas.: %d %n", totalPatas);
        System.out.printf("Total de Pares.: %d %n", totalPares);

    }//main

}//class
