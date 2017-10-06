/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpon@gmail.com.
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

import java.util.Random;

/**
 *
 * @author José A. Pacheco Ondoño - joanpon@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constantes
        final char LETRA_INI = 'A';
        final char LETRA_FIN = 'Z';
        
        // Instanciar Random
        Random rnd = new Random();

        // Variable
        char letra;

        // Generar dato
        // La suma de char puede exceder un char
        // El cast debe englobar todo
        letra = (char) (rnd.nextInt(LETRA_FIN - LETRA_INI + 1) + LETRA_INI);

        // Mensaje
        System.out.printf("Letra de inicio de examen .: %c\n", letra);
    }
}
