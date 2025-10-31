import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio {
    //EJERCICIOS IF

    Scanner scanner = new Scanner(System.in);

    public String ejercicio1() {
        //Crea un programa que pida la edad del usuario y determine si es mayor de edad (18 años o más). Muestra un mensaje indicando si puede votar o no.
        byte edad;
        String resultado;
        while (true) {
            System.out.println("Introduce tu edad");
            try {
                edad = scanner.nextByte();
                if (edad <= 0) {
                    resultado = "La edad debe estar comprendida entre 1 y 127 años";
                } else if (edad < 18) {
                    resultado = "Lo sentimos, aún no tiene edad suficiente para votar";
                } else {
                    resultado = "Eres mayor de edad y puedes votar";
                }
                ;
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor numérico de tipo entero entre 1 y 127");
                scanner.nextLine();
            }
        }
        return resultado;
    }

    public String ejercicio2() {
        //Desarrolla un programa que pida un número al usuario y determine si es positivo, negativo o cero. Muestra el resultado por consola.
        double num;
        String resultado;
        while (true) {
            System.out.println("Introduce el número que quieras: ");
            try {
                num = scanner.nextDouble();
                if (num < 0) {
                    resultado = "El número introducido es negativo";
                } else if (num == 0) {
                    resultado = "El número introducido es cero";
                } else {
                    resultado = "El número introducido es positivo";
                }
                ;
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor numérico");
                scanner.nextLine();
            }

        }
        return resultado;
    }

    public String ejercicio3() {
//        Escribe un programa que pida la nota de un examen (entre 0 y 10) y determine si el alumno ha aprobado (nota mayor o igual a 5) o ha suspendido.
        float num;
        String resultado;
        bucle:
        while (true) {
            System.out.println("Introduce la nota del examen: ");
            try {
                num = scanner.nextFloat();
                if (num < 0 || num > 10) {
                    System.out.println("El número introducido está fuera del rango evaluable");
                    continue bucle;
                } else if (num < 5) {
                    resultado = "Lo sentimos, has suspendido";
                } else {
                    resultado = "Enhorabuena! Has aprobado";
                }
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor numérico entre 0 y 10");
                scanner.nextLine();
            }
        }
        return resultado;
    }

    public String ejercicio4() {
        //Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€, aplica un descuento del 10%. Muestra el importe original y el importe final a pagar.
        double precioOriginal;
        double descuentoAplicado;
        double importeFinal;
        String resultado;
        bucle:
        while (true) {
            System.out.println("Introduce el importe de la compra");
            try {
                precioOriginal = scanner.nextDouble();
                if (precioOriginal < 0) {
                    System.out.println("El precio de la compra no puede ser inferior a 0");
                    continue bucle;
                }
                if (precioOriginal >= 100) {
                    descuentoAplicado = precioOriginal * 0.1;
                    importeFinal = precioOriginal * 0.9;
                } else {
                    descuentoAplicado = 0;
                    importeFinal = precioOriginal;
                }
                ;
                break;

            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor numérico");
                scanner.nextLine();
            }
        }
        resultado = String.format("Importe original: %.2f€%nDescuento aplicado: %.2f€%nImporte final: %.2f€", precioOriginal, descuentoAplicado, importeFinal);
        return resultado;
    }

    public String ejercicio5() {
//        Desarrolla un programa que pida un número entero y determine si es par o impar usando el operador módulo. Muestra un mensaje personalizado para cada caso.
        int num;
        String resultado = "El número %d es %s";
        while (true) {
            System.out.println("Introduce un número de tipo entero: ");
            try {
                num = scanner.nextInt();
                if (num % 2 == 0) {
                    resultado = String.format(resultado, num, "par");
                } else {
                    resultado = String.format(resultado, num, "impar");
                }
                ;
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un numero de tipo entero");
                scanner.nextLine();
            }
        }
        return resultado;
    }

    public String ejercicio6() {
//        Escribe un programa que pida la edad del usuario y determine si puede acceder a contenido para mayores de 16 años. Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".
        byte edad;
        String acceso = "";

        while (true) {
            System.out.println("Introduce tu edad: ");
            try {
                edad = scanner.nextByte();
                if (edad < 16) {
                    acceso = "denegado";
                } else {
                    acceso = "permitido";
                }
                ;
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un numero de tipo entero");
                scanner.nextLine();
            }
        }

        return "Acceso " + acceso;

    }

    public String ejercicio7() {
//        Crea un programa que pida una nota numérica (0-10) y determine la calificación: Suspenso (0-4), Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10).
        float notaExamen;
        String resultado = "Tu calificación es: %s";
        bucle:
        while (true) {
            System.out.println("Introduce tu nota: ");
            try {
                notaExamen = scanner.nextFloat();
                if (notaExamen < 0 || notaExamen > 10) {
                    System.out.println("El número introducido está fuera del rango evaluable");
                    continue bucle;
                } else if (notaExamen < 5) {
                    resultado = String.format(resultado, "SUSPENSO");
                } else if (notaExamen < 7) {
                    resultado = String.format(resultado, "APROBADO");
                } else if (notaExamen < 9) {
                    resultado = String.format(resultado, "NOTABLE");
                } else {
                    resultado = String.format(resultado, "SOBRESALIENTE");
                }
                ;
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un numero entre 0 y 10");
                scanner.nextLine();
            }
        }

        return resultado;


    }

    public String ejercicio8() {
        //Desarrolla un programa que pida dos números al usuario y determine cuál es mayor, o si son iguales. Muestra el resultado por consola.
        double num1, num2;
        String resultado;
        while (true) {
            System.out.println("Introduce el primer número: ");
            try {
                num1 = scanner.nextDouble();
                System.out.println("Introduce el segundo número: ");
                num2 = scanner.nextDouble();
                break;

            } catch (InputMismatchException error) {
                System.out.println("Debe de introducir un valor numérico");
                scanner.nextLine();
            }

        }
        if (num1 > num2) {
            resultado = "El número " + num1 + " es mayor que " + num2;
        } else if (num1 == num2) {
            resultado = "Los números " + num1 + " y " + num2 + " son iguales";
        } else {
            resultado = "El número " + num2 + " es mayor que " + num1;
        }
        return resultado;
    }

    public String ejercicio9() {
//        Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario. Calcula el IMC (peso / altura²) y determina si está en peso normal (IMC entre 18.5 y 24.9), por debajo del peso normal (IMC menor a 18.5) o por encima del peso normal (IMC mayor a 24.9).
        double peso, altura, imc;
        String resultado;

        while (true) {
            System.out.println("Introduce tu peso en kg:");
            try {
                peso = scanner.nextDouble();
                System.out.println("Introduce tu altura en metros: ");
                altura = scanner.nextDouble();
                break;

            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor numerico");
                scanner.nextLine();
            }
        }
        imc = (peso / (altura * altura));
        resultado = String.format("Tu IMC es: %.2f%n", imc);
        if (imc < 18.5) {
            resultado += "Estas por debajo de tu peso";
        } else if ((imc < 25)) {
            resultado += "Estás en peso normal";
        } else {
            resultado += "Estás por encima del peso normal";
        }
        return resultado;
    }

    public String ejercicio10() {
//        Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción. La altura mínima es 120 cm y la máxima es 200 cm. Si está dentro del rango, muestra "Puedes subir", si no, indica el motivo (demasiado bajo o demasiado alto).
        double altura;
        String acceso;

        while (true) {
            System.out.println("Introduce tu altura en cm: ");
            try {
                altura = scanner.nextDouble();
                if (altura < 120 || altura > 200) {
                    acceso = "No puedes subir a la atracción.\n";
                    if (altura < 120) {
                        acceso += "Altura mínima: 120cm";
                    } else {

                        acceso += "Altura máxima: 200cm";
                    }
                } else {
                    acceso = "Puedes subir a la atracción"
                    ;
                }
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir valor numérico");
                scanner.nextLine();
            }
        }

        return acceso;

    }

    public String ejercicio11() {
//        Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false). Aplica descuentos según estas reglas: Si es socio Y la compra es mayor o igual a 200€, descuento del 20%. Si es socio Y la compra es menor de 200€, descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€, descuento del 5%. En cualquier otro caso, no hay descuento. Muestra el importe original, el descuento aplicado y el importe final.
        double importeCompra, importeDescuento, importeFinal;
        byte descuentoAplicado;
        boolean socio;
        String estadoSocio, comparacionCompra;
        String resultado = "Importe original: %.2f€%n%s y tu compra es %s€%nDescuento aplicado: %d%%: %.2f€%nImporte final: %.2f€";

        while (true) {
            System.out.println("Introduce el importe de la compra");
            try {
                importeCompra = scanner.nextDouble();
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor numerico");
            }
        }
        while (true) {
            System.out.println("¿Eres socio? (true/false)");
            try {
                socio = scanner.nextBoolean();
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir true or false");
                scanner.nextLine();
            }
        }
        if (socio) {
            estadoSocio = "Eres socio";
            if (importeCompra >= 200) {
                descuentoAplicado = 20;
                comparacionCompra = ">= 200";
            } else {
                descuentoAplicado = 10;
                comparacionCompra = "< 200";
            }
        } else {
            estadoSocio = "No eres socio";
            if (importeCompra >= 300) {
                descuentoAplicado = 5;
                comparacionCompra = ">= 300";
            } else {
                descuentoAplicado = 0;
                comparacionCompra = "< 300";
            }
        }
        importeDescuento = importeCompra * descuentoAplicado / 100;
        importeFinal = importeCompra - importeDescuento;
        resultado = String.format(resultado, importeCompra, estadoSocio, comparacionCompra, descuentoAplicado, importeDescuento, importeFinal);

        return resultado;
    }

    public String ejercicio12() {
//        Crea un programa que pida al usuario crear una contraseña. La contraseña debe cumplir estos requisitos: tener al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password". El programa debe verificar cada condición por separado usando operadores lógicos y mostrar si la contraseña es válida o no, indicando qué requisitos no cumple.
//
//Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto).
        String password;
        byte longitud;
        boolean longitudValida, numero, prohibida, valida;

        String mensaje = "Longitud de la cadena: %d%n¿Tiene al menos 8 caracteres?: %s%n¿Contiene al menos un número?: %s%n¿Es una contraseña prohibida?: %s%n¿Es válida? (cumple todos los requisitos): %s%n";

        System.out.println("Introduce una contraseña que contenga 8 caracteres incluyendo al menos un número: (No puede ser 12345678 ni password)");
        password = scanner.next();
        longitud = (byte) password.length();
        longitudValida = (password.length() >= 8);
        numero = password.matches(".*\\d.*");
        prohibida = (password.equals("12345678") || password.equals("password"));
        valida = (longitudValida && numero && !prohibida);
        mensaje = String.format(mensaje, longitud, longitudValida, numero, prohibida, valida);
        if (!valida) {
            if (!longitudValida) {
                mensaje += "Contraseña NO válida. Debe tener al menos 8 caracteres.\n";
            }
            ;
            if (!numero) {
                mensaje += "Contraseña NO válida. Debe tener al menos un número.\n";
            }
            ;
            if (prohibida) {
                mensaje += "Contraseña NO válida. La contraseña no puede ser de las prohibidas.\n";
            }
        } else {
            mensaje += "Contraseña aceptada\n";
        }

        return mensaje;
    }

    public String ejercicio13() {
        List<String> diasValidos = List.of("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo");
        int edad;
        String diaSemana;
        String resultado = "Edad: %d años%nDía de la semana: %s%n¿Eres menor de 12?: %s%n¿Tienes entre 12 y 17?: %s%n¿Tienes entre 18 y 64 años?: %s%n¿Tienes 65 años o más?: %s%n¿Es martes?: %s%n¿Es jueves?: %s%n";
        boolean menor, adolescente, adulto, anciano, martes, jueves;
        bucle1:
        while (true) {
            System.out.println("Introduce tu edad: ");
            try {
                edad = scanner.nextInt();
                if (edad <= 0) {
                    System.out.println("La edad no puede ser menor que 0");
                    continue bucle1;
                } else if (edad > 130) {
                    System.out.println("No creo que tanto años...");
                    continue bucle1;
                }
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor numérico de tipo entero");
                scanner.nextLine();
            }
        }
        bucle2:
        while (true) {
            System.out.println("Introduce el dia de la semana: ");
            try {
                diaSemana = scanner.next().toLowerCase();
                if (!diasValidos.contains(diaSemana)) {
                    continue bucle2;
                }
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un dia de la semana válido");
                scanner.nextLine();
            }
        }

        menor = edad < 12;
        adolescente = edad >= 12 && edad < 18;
        adulto = edad >= 18 && edad < 65;
        anciano = edad >= 65;
        martes = diaSemana.equals("martes");
        jueves = diaSemana.equals("jueves");

        resultado = String.format(resultado, edad, diaSemana, menor, adolescente, adulto, anciano, martes, jueves);

        if (menor) {
            resultado += "Precio de la entrada: 0.0€. (Entrada gratuita para menores todos los dias)";
        }
        if (adolescente) {
            if (martes) {
                resultado += "Precio de la entrada: 0.0€. (Entrada gratuita para adolescentes los martes)";
            } else {
                resultado += "Precio de la entrada: 5.0€. (Los adolescentes tienen descuentos los martes)";
            }
        }
        if (adulto) {
            if (jueves) {
                resultado += "Precio de la entrada: 7.0€. (Entrada con descuento para adultos por ser jueves)";
            } else {
                resultado += "Precio de la entrada: 10.0€. (Los adultos tienen descuentos los jueves)";
            }
        }
        if (anciano) {
            resultado += "Precio de la entrada: 6.0€. (Precio definitivo diario)";
        }
        return resultado;
    }

    public String ejercicio14() {
        //Desarrolla un programa que determine si una persona es elegible para un préstamo bancario. Pide: edad, ingresos mensuales (€), y si tiene deudas pendientes (true/false). Los requisitos son: Edad entre 21 y 65 años, ingresos mensuales de al menos 1000€, y NO tener deudas pendientes. El programa debe evaluar cada condición y mostrar si es elegible o no, explicando qué requisitos no cumple.
        byte edad;
        double ingresosMensuales;
        boolean deudasPendiente, edadRequerida, ingresosRequeridos, valido;
        String resultado = "¿Edad entre 21 y 65?: %s%n¿Ingresos >= 1000€?: %s%n¿Sin deudas pendientes?: %s%n¿Es elegible para el préstamo?: %s%n";

        bucleEdad:
        while (true) {
            System.out.println("Introduce tu edad: ");
            try {
                edad = scanner.nextByte();
                if (edad <= 0) {
                    System.out.println("Debe introducir una edad verdadera");
                    continue bucleEdad;
                }
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor de tipo entero");
                scanner.nextLine();
            }
        }
        while (true) {
            System.out.println("Introduce tus ingresos mensuales");
            try {
                ingresosMensuales = scanner.nextDouble();
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor numérico");
                scanner.nextLine();
            }
        }
        while (true) {
            System.out.println("Tienes deudas pendientes? (true/false): ");
            String palabraGuardada = scanner.next();
            if (palabraGuardada.equals("true") || palabraGuardada.equals("false")) {
                deudasPendiente = Boolean.parseBoolean(palabraGuardada);
                break;
            } else {
                System.out.println("Debes introducir true o false");
            }
        }

        if (edad >= 21 && edad < 65) {
            edadRequerida = true;
        } else {
            resultado += "Debe tener entre 21 y 65 años para poder solicitar el prestamo\n";
            edadRequerida = false;
        }
        ;
        if (ingresosMensuales >= 1000) {
            ingresosRequeridos = true;
        } else {
            resultado += "Debe tener ingresos mensuales superiores a 1000€ para solicitar el prestamo\n";
            ingresosRequeridos = false;
        }
        if (deudasPendiente) {
            resultado += "Ya tiene deudas pendiente y no podemos agravar la situación\n";
        }

        if (!deudasPendiente && ingresosRequeridos && edadRequerida) {
            valido = true;
            resultado += "¡Felicidades! Eres elegible para solicitar el préstamo.\n";
        } else {
            resultado += "Lo sentimos no cumple los requisitos\n";
            valido = false;
        }

        resultado = String.format(resultado, edadRequerida, ingresosRequeridos, !deudasPendiente, valido);
        return resultado;
    }

    public String ejercicio15() {
        //Crea un programa que calcule el coste de envío de un paquete. Pide: peso del paquete (kg), distancia de envío (km), y si es envío urgente (true/false). Las reglas son: Precio base: 5€. Si el peso es mayor de 5kg, añadir 2€ por cada kg adicional. Si la distancia es mayor de 100km, añadir 10€. Si es envío urgente, multiplicar el precio total por 1.5. Muestra todos los cálculos paso a paso.
        int peso, distancia, BASE = 5, precioKiloAdicional = 2, pesoAdicional, costeAdicional, costeDistanciaAdicional = 0, subtotal;
        boolean urgente;
        double recargoUrgente, total;
        String modoDistancia;
        String resultado = "Precio base: %d€%nPeso: %dkg. (excede 5kg en %dkg)%nCoste adicional por peso: %d€%nDistancia: %dkm (%s de 100km)%nCoste adicional por distancia: %d€%nSubtotal: %d€%n¿Es envío urgente?: %s%nRecargo por urgencia (x1.5): %.2f€%nCoste total de envío: %.2f€%n";

        while (true) {
            System.out.println("Introduce el peso del paquete: ");
            try {
                peso = scanner.nextInt();
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor de tipo entero");
            }
        }
        while (true) {
            System.out.println("Introduce la distancia de envío (km): ");
            try {
                distancia = scanner.nextInt();
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir un valor de tipo entero");
            }
        }
        while (true) {
            System.out.println("¿Es envío urgente? (true/false): ");
            try {
                urgente = scanner.nextBoolean();
                break;
            } catch (InputMismatchException error) {
                System.out.println("Debe introducir true o false");
            }
        }

        if (peso > BASE) {
            pesoAdicional = peso - BASE;
            costeAdicional = pesoAdicional * precioKiloAdicional;
        } else {
            pesoAdicional = 0;
            costeAdicional = 0;
        }
        if (distancia > 100) {
            modoDistancia = "mayor";
            costeDistanciaAdicional = 10;
        } else if (distancia == 100) {
            modoDistancia = "igual";

        } else {
            modoDistancia = "menor";
        }
        subtotal = BASE + costeAdicional + costeDistanciaAdicional;

        if (urgente) {
            recargoUrgente = subtotal * 0.5;
        } else {
            recargoUrgente = 0;
        }
        total = subtotal + recargoUrgente;

        resultado = String.format(resultado, BASE, peso, pesoAdicional, costeAdicional, distancia, modoDistancia, costeDistanciaAdicional, subtotal, urgente, recargoUrgente, total);

        return resultado;
    }

    //EJERCICIOS SWITCH/FOR

    public void ejercicio16() {
        //Crea un programa que pida un número del 1 al 7 y use un switch para mostrar el día de la semana correspondiente (1=Lunes, 2=Martes, etc.).
        int num;
        System.out.println("Iniciando programa de selección de dia de la semana");
        System.out.println("Introduce un número del 1 al 7");
        num = scanner.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("El dia " + num + " es: Lunes");
            }
            case 2 -> {
                System.out.println("El dia " + num + " es: Martes");
            }
            case 3 -> {
                System.out.println("El dia " + num + " es: Miercoles");
            }
            case 4 -> {
                System.out.println("El dia " + num + " es: Jueves");
            }
            case 5 -> {
                System.out.println("El dia " + num + " es: Viernes");
            }
            case 6 -> {
                System.out.println("El dia " + num + " es: Sábado");
            }
            case 7 -> {
                System.out.println("El dia " + num + " es: Domingo");
            }
            default -> {
                System.out.println("No ha cerrado un día de la semana válido");
            }
        }
        System.out.println("Cerrando el programa");
    }

    public void ejercicio17() {
        //Desarrolla un programa que pida una letra de calificación (A, B, C, D, F) y use un switch para mostrar el mensaje correspondiente: A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".
        char letra;
        System.out.println("Iniciando programa de evaluación");
        System.out.println("Introduce una letra de la A a la F");
        letra = scanner.next().toUpperCase().charAt(0);
        switch (letra) {
            case 'A' -> {
                System.out.println("Calificación " + letra + ": Excelente");
            }
            case 'B' -> {
                System.out.println("Calificación " + letra + ": Muy bien");
            }
            case 'C' -> {
                System.out.println("Calificación " + letra + ": Bien");
            }
            case 'D' -> {
                System.out.println("Calificación " + letra + ": Suficiente");
            }
            case 'E' -> {
                System.out.println("Calificación " + letra + ": Insuficiente");
            }
            default -> {
                System.out.println("Carácter introducido no contemplado en el rango");
            }
        }
        System.out.println("Cerrando el programa");
    }

    public void ejercicio18() {
//Escribe un programa que pida dos números y una operación (+, -, *, /). Usa un switch para realizar la operación correspondiente y mostrar el resultado.
        double num1, num2;
        char operacion;
        System.out.println("iniciando programa de calculadora\nIntroduce el primero numero a operar: ");
        num1 = scanner.nextDouble();
        System.out.println("introduce el sugundo número a operar: ");
        num2 = scanner.nextDouble();
        System.out.println("Que operación quieres hacer? (+,-,*,/)");
        operacion = scanner.next().charAt(0);

        switch (operacion) {
            case '+' -> {
                System.out.println("Resultado: " + num1 + " " + operacion + " " + num2 + " = " + (num1 + num2));
            }
            case '-' -> {
                System.out.println("Resultado: " + num1 + " " + operacion + " " + num2 + " = " + (num1 - num2));
            }
            case '*' -> {
                System.out.println("Resultado: " + num1 + " " + operacion + " " + num2 + " = " + (num1 * num2));
            }
            case '/' -> {
                System.out.printf("Resultado: %.1f + %.1f = %.1f%n", num1, num2, (num1 / num2));
            }
            default -> {
                System.out.println("operador no admitida");
            }
        }
        System.out.println("Cerrando el programa");
    }

    public void ejercicio19() {
        //Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil, 2=Configuración, 3=Ayuda, 4=Salir. Pide al usuario que elija una opción y usa un switch para mostrar el mensaje correspondiente a cada opción.
        int eleccion;
        System.out.print("--- MENÚ ---\n1. Ver perfil\n2. Configuración\n3. Ayuda\n4. Salir\n");
        System.out.print("Elige una opción: ");
        eleccion = scanner.nextInt();
        switch (eleccion) {
            case 1 -> {
                System.out.println("Has seleccionado: Ver perfil");
            }
            case 2 -> {
                System.out.println("Has seleccionado: Configuración");
            }
            case 3 -> {
                System.out.println("Has seleccionado: Ayuda");
            }
            case 4 -> {
                System.out.println("Has seleccionado: Salir");
            }
            default -> {
                System.out.println("Debe seleccionar una de las opciones.");
            }
        }
    }

    public void ejercicio20() {
//        Desarrolla un programa que pida un mes (número del 1 al 12) y use un switch para determinar la estación del año: Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).
        int num;
        System.out.println("Introduce el numero del mes: (1-12)");
        num = scanner.nextInt();
        switch (num) {
            case 12, 1, 2 -> {
                System.out.println("El mes " + num + " corresponde a: Invierno");
            }
            case 3, 4, 5 -> {
                System.out.println("El mes " + num + " corresponde a: Primavera");
            }
            case 6, 7, 8 -> {
                System.out.println("El mes " + num + " corresponde a: Verano");
            }
            case 9, 10, 11 -> {
                System.out.println("El mes " + num + " corresponde a: Otoño");
            }
            default -> {
                System.out.println("tiene que introducir valores válidos");
            }
        }

    }

    public void ejercicio21() {
//        Escribe un programa que pida un número y use un bucle for para mostrar su tabla de multiplicar del 1 al 10.
        int numero;
        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();
        System.out.println("Tabla del " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, (numero * i));
        }
    }

    public void ejercicio22() {
//        Crea un programa que pida un número N y use un bucle for para calcular la suma de todos los números desde 1 hasta N. Muestra el resultado final.
        int num, suma = 0;
        System.out.println("Introduce un número: ");
        num = scanner.nextInt();
        System.out.print("Sumando: ");
        for (int i = 1; i <= num; i++) {
            if (i == num) {
                System.out.print(i + "\n");
            } else {
                System.out.printf("%d + ", i);
            }
            suma += i;
        }
        System.out.println("La suma de los número del 1 al " + num + " es: " + suma);
    }

    public void ejercicio23() {
//        Desarrolla un programa que pida un número N y use un bucle for para contar cuántos números pares e impares hay desde 1 hasta N. Muestra ambos contadores.
        int numero, pares = 0, impares = 0;
        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();
        System.out.println("Recorriendo los números del 1 al " + numero + "...");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                pares += 1;
            } else {
                impares += 1;
            }
        }
        System.out.println("Numeros pares encontrados: " + pares);
        System.out.println("Numeros impares encontrados: " + impares);
    }

    public void ejercicio24() {
//        Escribe un programa que pida un número entero positivo y calcule su factorial usando un bucle for. El factorial de N es: N! = N × (N-1) × (N-2) × ... × 1
        int numero, factorial = 1;
        System.out.println("Introduce un numero positivo: ");
        numero = scanner.nextInt();
        System.out.println("Calculando " + numero + "!");
        for (int i = numero; i > 0; i--) {
            if (i == 1) {
                System.out.print(i + "\n");
            } else {
                System.out.print(i + " x ");
            }
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public void ejercicio25(){
//        Crea un programa que muestre un menú con 3 tipos de ejercicios: 1=Flexiones, 2=Abdominales, 3=Sentadillas. Pide al usuario que elija un ejercicio y cuántas repeticiones quiere hacer. Usa un switch para determinar el ejercicio y un for para contar las repeticiones una a una.
        int seleccion, repeticiones;
        String ejercicio;
        System.out.println("--- EJERCICIOS ---\n1. Flexiones\n2. Abdominales\n3. Sentadillas\nElige un ejercicio (1-3): ");
        seleccion = scanner.nextInt();
        System.out.println("¿Cuántas repeticiones?");
        repeticiones = scanner.nextInt();
        switch (seleccion){
            case 1 ->  {
                System.out.println("Has elegido: Flexiones");
                ejercicio = "flexiones";
            }
            case 2 -> {
                System.out.println("Has elegido: Abdominales");
                ejercicio = "abdominales";
            }
            case 3 -> {
                System.out.println("Has elegido: Sentadilla");
                ejercicio = "sentadillas";
            }default -> {
                System.out.println("Debe seleccionar una de las 3 opciones");
                ejercicio = null;
            }
        }
        if (seleccion >0 && seleccion <4){
        for (int i = 1; i <= repeticiones ; i++) {
            try {
                System.out.println("Repetición " + i + " completada");
                Thread.sleep(3000);
            }catch (InterruptedException error){
                error.printStackTrace();
            }
        }

        System.out.println("¡EJERCICIO COMPLETADO! Has hecho "+ repeticiones + " " + ejercicio);}
    }
}
