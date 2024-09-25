package org.example;

import org.example.MODELOS.Hincha;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("************************");
        System.out.println("SISTEMA DE ABONOS 2024-2");
        System.out.println("************************");
        System.out.println("\n Bienvenido!");

        Scanner lea = new Scanner(System.in);
        Hincha hincha = new Hincha();
        System.out.print("Digite su nombre: ");
        hincha.setNombre(lea.nextLine());
        System.out.println("Digite sus apellidos: ");
        hincha.setApellido(lea.nextLine());
        System.out.println("Digite su número de documento: ");
        hincha.setNumeroDocumento(lea.nextLine());
        System.out.println("Digite su número de teléfono");
        hincha.setTelefono(lea.nextLine());
        System.out.println("Digite su email: ");
        hincha.setEmail(lea.nextLine());
        System.out.println("Digite su dirección: ");
        hincha.setDireccion(lea.nextLine());
        System.out.println("Digite un contacto externo en caso de emergencias: ");
        hincha.setContactoEmergencia(lea.nextLine());
        System.out.println("Digite la ciudad en la que está ubicado/a: ");
        hincha.setCiudad(lea.nextLine());

        System.out.println("¿En qué año naciste?: ");
        Integer year = lea.nextInt();

        System.out.println("¿En qué mes naciste?: ");
        Integer mes = lea.nextInt();

        System.out.println("¿En qué día naciste?: ");
        Integer dia = lea.nextInt();

        hincha.setFechaNacimiento(LocalDate.of(year,mes,dia));

        System.out.println(hincha);



//        LocalDate fechaPrueba = LocalDate.of(2006,9,10);
//        LocalDate fechaHoy = LocalDate.now();
//        Long diferencia = ChronoUnit.DAYS.between(fechaPrueba, fechaHoy);
//        Long diferencia2 = ChronoUnit.MONTHS.between(fechaPrueba, fechaHoy);
//        Long diferencia3 = ChronoUnit.YEARS.between(fechaPrueba, fechaHoy);
//        System.out.println(diferencia);
//        System.out.println(diferencia2);
//        System.out.println(diferencia3);
//        System.out.println(fechaHoy);





    }
}