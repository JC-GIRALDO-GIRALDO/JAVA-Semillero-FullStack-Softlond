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

        //-9)
        //-Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.
        
   }
}
