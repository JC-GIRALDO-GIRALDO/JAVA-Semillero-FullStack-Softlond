import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;

public class Taller1 {
    public static void main(String[] args) {

        /*
        //-1)
        //-Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.

        // Solicitar al usuario el primer número entero
        String inputNumero1 = JOptionPane.showInputDialog("Ingresa el primer número entero: ");

        // Convertir la entrada del usuario a un valor entero
        int numero1 = Integer.parseInt(inputNumero1);

        // Solicitar al usuario el segundo número entero
        String inputNumero2 = JOptionPane.showInputDialog("Ingresa el segundo número entero: ");

        // Convertir la entrada del usuario a un valor entero
        int numero2 = Integer.parseInt(inputNumero2);

        // Realizar las operaciones
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2;

        // Mostrar los resultados
        String mensaje1 = "Resultados:\n"
                + "Suma: " + suma + "\n"
                + "Resta: " + resta + "\n"
                + "Multiplicación: " + multiplicacion + "\n"
                + "División: " + division;
        JOptionPane.showMessageDialog(null, mensaje1);
        */

        /*
        //-2)
        //-Escribe un programa que pida al usuario un número entero y determine si es par o impar.

         // Solicitar al usuario un número entero
         String inputNumeroParImpar = JOptionPane.showInputDialog("Ingresa un número entero: ");

         // Convertir la entrada del usuario a un valor entero
         int esParImpar = Integer.parseInt(inputNumeroParImpar);

        // Determinar si el número es par o impar y mostrar el resultado
        String resultado = (esParImpar % 2 == 0) ? "Es par" : "Es impar";
        System.out.println(resultado);

         // Mostrar el resultado en un cuadro de diálogo
         String mensaje2 = "El número ingresado es par o impar: " + resultado;
         JOptionPane.showMessageDialog(null, mensaje2);
        */

        /*
        //-3)
        //-Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.

        // Solicitar al usuario el radio del círculo
        String inputRadio = JOptionPane.showInputDialog("Ingresa el radio del círculo: ");
        double radio = Double.parseDouble(inputRadio);

        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Calcular el perímetro del círculo
        double perimetro = 2 * Math.PI * radio;

        // Mostrar los resultados en cuadros de diálogo
        String mensaje = "Área del círculo: " + area + "\nPerímetro del círculo: " + perimetro;
        JOptionPane.showMessageDialog(null, mensaje);
        */

        /*
        //-4)
        //-Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.

        // Solicitar al usuario su edad
        String inputEdad = JOptionPane.showInputDialog("Ingrese su edad: ");

        // Convertir la entrada del usuario a un valor entero
        int edad = Integer.parseInt(inputEdad);
  
        // Determinar si el usuario es mayor o menor de edad utilizando el operador ternario
        String mensaje3 = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
  
        // Mostrar el mensaje en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, mensaje3);
        */

        /* 
        //-5)
        //-Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.

        // Solicitar al usuario los dos números enteros
         String inputNumeroEntero1 = JOptionPane.showInputDialog("Ingresa Primer Numero Entero: ");
        int entero1 = Integer.parseInt(inputNumeroEntero1);

        String inputNumeroEntero2 = JOptionPane.showInputDialog("Ingresa segundo Numero Entero: ");
        int entero2 = Integer.parseInt(inputNumeroEntero2);

        // Determinar cuál es el número mayor
        String mensaje4;
            if (entero1 > entero2) {
                mensaje4 = "El número mayor es: " + entero1;
            } else if (entero1 < entero2) {
                mensaje4 = "El número mayor es: " + entero2;
            } else {
                mensaje4 = "Los números son iguales";
            }

         // Mostrar el resultado
         System.out.println(mensaje4);
        */

        /* 
        //-6)
        //-Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.

        // Solicitar al usuario un número
        String inputPositivoNegativo = JOptionPane.showInputDialog("Ingresa un número: ");
        int positivoNegativo = Integer.parseInt(inputPositivoNegativo);

        // Determinar si el número es positivo, negativo o igual a 0
        String mensaje5;
            if (positivoNegativo > 0) {
                mensaje5 = "El número es positivo";
            } else if (positivoNegativo < 0) {
                mensaje5 = "El número es negativo";
            } else {
            mensaje5 = "El número es 0";
            }

        // Mostrar el resultado
        System.out.println(mensaje5);
        */

        /* 
        //-7)
        //-Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.

        // Solicitar al usuario un número entero positivo
        String inputNumeroTabla = JOptionPane.showInputDialog("Ingresar Numero entero a Multiplicar: ");
        int numeroTabla = Integer.parseInt(inputNumeroTabla);

        // Mostrar la tabla de multiplicar del número hasta el 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numeroTabla * i;
            System.out.println(numeroTabla + " x " + i + " = " + resultado);
        }
        */

        /* 
        //-8)
        //-Realiza un programa que simule un juego de adivinar un número. 
        //El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. 
        //El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.

        // Generar un número aleatorio entre 1 y 100
        int numeroAdivinar = (int) (Math.random() * 100) + 1;

        // Juego: el usuario debe adivinar el número
        int numeroIngresado;
        do {
        // Solicitar al usuario que ingrese un número
        String inputNumero = JOptionPane.showInputDialog("Adivina el número (entre 1 y 100): ");
        numeroIngresado = Integer.parseInt(inputNumero);
   
            // Verificar si el número ingresado es mayor o menor que el número a adivinar
            if (numeroIngresado < numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "El número a adivinar es mayor.");
            } else if (numeroIngresado > numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "El número a adivinar es menor.");
            } else {
                JOptionPane.showMessageDialog(null, "¡Felicitaciones! Has adivinado el número.");
            }
        } while (numeroIngresado != numeroAdivinar);
        */

        /* 
        //-9)
        //-Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.

        // Solicitar al usuario un número entero positivo
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(inputNumero);
  
        // Calcular el factorial del número
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
  
        // Mostrar el resultado del factorial
        String mensaje6 = "El factorial de " + numero + " es: " + factorial;
        JOptionPane.showMessageDialog(null, mensaje6);
        */

        /* 
        //-10)
        //-Crea un programa que muestre los primeros 20 números de la serie Fibonacci. 
        //La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …

        // Mostrar los primeros 20 números de la serie Fibonacci
        int numeroAnterior = 0;
        int numeroActual = 1;
     
        System.out.println("Serie Fibonacci:");
     
        for (int i = 1; i <= 20; i++) {
            System.out.print(numeroAnterior + " ");
     
            int siguienteNumero = numeroAnterior + numeroActual;
            numeroAnterior = numeroActual;
            numeroActual = siguienteNumero;
        }
        */
        
        /* 
        //-11)
        //-Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. 
        //El usuario debe ingresar las longitudes de los tres lados.

        // Solicitar al usuario las longitudes de los tres lados del triángulo
        String inputLadoA = JOptionPane.showInputDialog("Ingrese la longitud del lado a:");
        double ladoA = Double.parseDouble(inputLadoA);
   
        String inputLadoB = JOptionPane.showInputDialog("Ingrese la longitud del lado b:");
        double ladoB = Double.parseDouble(inputLadoB);
   
        String inputLadoC = JOptionPane.showInputDialog("Ingrese la longitud del lado c:");
        double ladoC = Double.parseDouble(inputLadoC);
   
        // Calcular el semiperímetro
        double semiperimetro = (ladoA + ladoB + ladoC) / 2;
   
        // Calcular el área utilizando la fórmula de Herón
        double area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
   
        // Mostrar el resultado del área del triángulo en un cuadro de diálogo
        String mensaje7 = "El área del triángulo es: " + area;
        JOptionPane.showMessageDialog(null, mensaje7);
        */

        /* 
        //-12)
        //-Realiza un programa que pida al usuario un número entero y determine si es un número primo o no.

        // Solicitar al usuario un número entero
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(inputNumero);
 
        // Verificar si el número es primo
        boolean esPrimo = true;
        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
 
        // Mostrar el resultado
        String mensaje8 = (esPrimo) ? "El número es primo." : "El número no es primo.";
        JOptionPane.showMessageDialog(null, mensaje8);
        */

        /* 
        //-13)
        //-Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales.

          // Solicitar al usuario un número decimal
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número decimal:");
        double numero = Double.parseDouble(inputNumero);

        // Solicitar al usuario el número de decimales para redondear
        String inputDecimales = JOptionPane.showInputDialog("Ingrese el número de decimales para redondear:");
        int decimales = Integer.parseInt(inputDecimales);

        // Redondear el número a la cantidad específica de decimales utilizando DecimalFormat
        DecimalFormat decimalFormat = new DecimalFormat("#." + "0".repeat(decimales));
        String resultado = decimalFormat.format(numero);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Número redondeado: " + resultado);
        */

        //-14)
        //-Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. 
        //Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.

        /* 
        // Solicitar al usuario un número entero positivo
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(inputNumero);

        // Calcular la suma de los divisores propios del número
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        // Verificar si el número es un número perfecto
        boolean esNumeroPerfecto = (sumaDivisores == numero);

        // Mostrar el resultado
        String mensaje9 = (esNumeroPerfecto) ? "El número es un número perfecto." : "El número no es un número perfecto.";
        JOptionPane.showMessageDialog(null, mensaje9);
        */

        /* 
        //-15)
        //-Crea un programa que pida al usuario un número entero y determine si es un número capicúa. 
        //Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.

        // Solicitar al usuario un número entero
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(inputNumero);

        // Convertir el número a una cadena de caracteres
        String numeroComoCadena = Integer.toString(numero);

        // Verificar si el número es un número capicúa
        boolean esCapicua = true;
        int longitud = numeroComoCadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (numeroComoCadena.charAt(i) != numeroComoCadena.charAt(longitud - 1 - i)) {
                esCapicua = false;
                break;
            }
        }

        // Mostrar el resultado
        String mensaje10 = (esCapicua) ? "El número es un número capicúa." : "El número no es un número capicúa.";
        JOptionPane.showMessageDialog(null, mensaje10);
        */

        /* 
        //-16)
        //-Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario. 

        // Solicitar al usuario el número límite
        String inputLimite = JOptionPane.showInputDialog("Ingrese el número límite para la serie de Fibonacci:");
        int limite = Integer.parseInt(inputLimite);

        // Imprimir la serie de Fibonacci hasta el número límite
        int numeroAnterior = 0;
        int numeroActual = 1;

        System.out.println("Serie de Fibonacci hasta " + limite + ":");

        while (numeroActual <= limite) {
            System.out.print(numeroAnterior + " ");

            int siguienteNumero = numeroAnterior + numeroActual;
            numeroAnterior = numeroActual;
            numeroActual = siguienteNumero;
        }
        */

        /* 
        //-17)
        //-Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.

        // Solicitar al usuario dos números enteros
        String inputInicio = JOptionPane.showInputDialog("Ingrese el número de inicio del rango:");
        int inicio = Integer.parseInt(inputInicio);

        String inputFin = JOptionPane.showInputDialog("Ingrese el número de fin del rango:");
        int fin = Integer.parseInt(inputFin);

        // Mostrar los números primos en el rango
        System.out.println("Números primos en el rango [" + inicio + ", " + fin + "]:");
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

        // Función para verificar si un número es primo
        public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
        */

        /* 
        //-18)
        //-Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. 
        //Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.

        // Definir los caracteres que se pueden usar en la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Longitud de la contraseña
        int longitudContrasena = 8;

        // Generar la contraseña aleatoria
        String contrasena = generarContrasenaAleatoria(caracteres, longitudContrasena);

        // Mostrar la contraseña generada en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasena);
        }

        public static String generarContrasenaAleatoria(String caracteres, int longitud) {
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            contrasena.append(caracterAleatorio);
        }

        return contrasena.toString();
        */

        /* 
        //-19)
        //-Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas.

        // Solicitar al usuario su nombre
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");

        // Convertir el nombre a mayúsculas y mostrarlo en una ventana emergente
        String nombreEnMayusculas = nombre.toUpperCase();
        JOptionPane.showMessageDialog(null, "Nombre en mayúsculas: " + nombreEnMayusculas);

        // Convertir el nombre a minúsculas y mostrarlo en una ventana emergente
        String nombreEnMinusculas = nombre.toLowerCase();
        JOptionPane.showMessageDialog(null, "Nombre en minúsculas: " + nombreEnMinusculas);
        */

        /* 
        //-20)
        //-Realiza un programa que solicite al usuario una cadena y luego invierta su orden.

        // Solicitar al usuario una cadena
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");

        // Invertir la cadena
        String cadenaInvertida = invertirCadena(cadena);

        // Mostrar la cadena invertida en una ventana emergente
        JOptionPane.showMessageDialog(null, "Cadena invertida: " + cadenaInvertida);
        }

        public static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder(cadena);
        return cadenaInvertida.reverse().toString();
        */

        /* 
        //-21)
        //-Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella.

        // Solicitar al usuario una cadena
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");

        // Solicitar al usuario la letra a buscar
        String letraBuscada = JOptionPane.showInputDialog("Ingrese la letra a buscar:");

        // Convertir la letra a buscar a minúscula (para ser insensible a mayúsculas/minúsculas)
        letraBuscada = letraBuscada.toLowerCase();

        // Contar las veces que aparece la letra en la cadena
        int contador = contarLetra(cadena, letraBuscada);

        // Mostrar el resultado en una ventana emergente
        JOptionPane.showMessageDialog(null, "La letra '" + letraBuscada + "' aparece " + contador + " veces en la cadena.");
        }

        public static int contarLetra(String cadena, String letra) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.toString(caracter).toLowerCase().equals(letra)) {
                contador++;
            }
        }

        return contador;
        */

        /* 
        //-22)
        //-Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo 
        //(se lee igual de izquierda a derecha que de derecha a izquierda).

        // Solicitar al usuario una frase
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        // Eliminar espacios y convertir a minúsculas (para ser insensible a mayúsculas/minúsculas)
        String fraseSinEspacios = frase.replaceAll("\\s+", "").toLowerCase();

        // Verificar si la frase es un palíndromo
        boolean esPalindromo = esPalindromo(fraseSinEspacios);

        // Mostrar el resultado en una ventana emergente
        if (esPalindromo) {
            JOptionPane.showMessageDialog(null, "La frase es un palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "La frase NO es un palíndromo.");
        }
        }

        public static boolean esPalindromo(String frase) {
        int longitud = frase.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (frase.charAt(i) != frase.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
        */

        /* 
        //-23)
        //-Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene

        // Solicitar al usuario una oración
        String oracion = JOptionPane.showInputDialog("Ingrese una oración:");

        // Contar las palabras en la oración
        int cantidadPalabras = contarPalabras(oracion);

        // Mostrar el resultado en una ventana emergente
        JOptionPane.showMessageDialog(null, "La oración tiene " + cantidadPalabras + " palabras.");
        }

        public static int contarPalabras(String oracion) {
        // Eliminar espacios en blanco al inicio y al final de la oración
        oracion = oracion.trim();

        // Si la oración está vacía, no hay palabras
        if (oracion.isEmpty()) {
            return 0;
        }

        // Contar las palabras contando los espacios en blanco
        int cantidadPalabras = 1;
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == ' ') {
                cantidadPalabras++;
            }
        }

        return cantidadPalabras;
        */

        //-24)
        //-Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra.
        
   }
}

