/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;
import java.util.Scanner;

/**
 *
 * @author Berny
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { //1: CALCULAR LA SUMA DE 3 NOTAS
        /**
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;
        
        System.out.println("Ingrese 3 notas: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1 + nota2 + nota3;
        
        System.out.println("\nLa suma es: "+suma);
        **/
        //2: SALARIO SEMANAL
        /**
        float salarioSem, salarioPH;
        int horasSem;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las horas semanales: ");
        horasSem = entrada.nextInt();
        
        System.out.println("Ingrese el salario por hora: ");
        salarioPH = entrada.nextFloat();
        
        salarioSem = horasSem * salarioPH;
        
        System.out.println("El salario semanal del trabajador: "+salarioSem);
        **/
        
        /**3: Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
         * Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que 
         * poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad
         * de dinero que tienen entre los tres.
        **/
        
        /**
        Scanner entrada = new Scanner(System.in);
        float cantDinero, dinJuan, dinLuis, total;
        
        System.out.println("Ingrese cantidad de dinero que posee Guillermo: ");
        cantDinero = entrada.nextFloat();
        
        dinLuis = cantDinero / 2;
        dinJuan = (cantDinero + dinLuis) / 2;
        
        total = cantDinero + dinLuis + dinJuan;
        System.out.println("Entre los tres tienen un total de "+total); System.out.print("dolares");
        **/
        
        /**4: Una compañia de venta de autos usados, paga a su personal de ventas un salario
        de $1000 mensuales, más una comisión de $150 por cada auto vendido, más del 5% del
        * valor de la venta por auto. Cada mes el capturista de la empresa ingresa en la computadora
        * los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un
        * vendedor dado.
         **/ 
        /**
        Scanner entrada = new Scanner (System.in);
        double  sueldo, comisionTotal = 0;
        int autosVend, sueldoBase = 1000, valorVeh, comisionXVenta = 150;
        
        String cadena;
        System.out.println("Nombre del empleado:");
        cadena = entrada.nextLine();
        
        System.out.println("Ingrese cantidad de autos vendidos: ");
        autosVend = entrada.nextInt();
        
        if(autosVend > 1)
        {
            for(int i = 0; i < autosVend; i++)
            {
                System.out.println("Ingrese el valor del vehiculo "+i+": ");
                valorVeh = entrada.nextInt();
                
                comisionTotal += (0.05 * valorVeh);
            }
            
            sueldo = sueldoBase + comisionTotal + (comisionXVenta * autosVend);
            System.out.println("\nEl sueldo del empleado" +cadena+ "es: $" +sueldo);
        }
        
        else //No produjo ventas
        {
            sueldo = sueldoBase;
            System.out.println("El sueldo es de: $" +sueldo);
        }
        **/
        
        /**5: La calificacion final de un estudiante de Informática se calcula
        con base a las calificaciones de cuatro aspectos de su rendimiento 
        academico: Participación, primer examen parcial, segunda examen parcial,
        y examen final. Sabiendo que las calificaciones anteriores entrar a la
        calificación final con ponderaciones del 10%, 25%, 25% y 40%. Hacer un 
        programa que calcule e imprima la calificación final obtenida por un
        estudiante.
        
        
        Scanner entrada = new Scanner(System.in);
        
        float pParcial, sParcial, eFinal, particip, notaF;
        
        System.out.println("Ingrese nota de participacion: ");
        particip = entrada.nextFloat();
        particip *= 0.10f;
        
        System.out.println("Ingrese nota primer parcial: ");
        pParcial = entrada.nextFloat();
        pParcial *= 0.25f;
        
        System.out.println("Ingrese nota segundo parcial: ");
        sParcial = entrada.nextFloat();
        sParcial *= 0.25f;
        
        System.out.println("Ingrese nota examen final: ");
        eFinal = entrada.nextFloat();
        eFinal *= 0.40f;
        
        notaF = pParcial + sParcial + eFinal + particip;
        System.out.println("La nota final del alumno es: "+notaF);
        **/
        
        /**6: Hacer un programa que calcule el cuadrado de una suma.
         * 
         */
        /**
        Scanner entrada = new Scanner(System.in);
        double x, y, res;
        
        System.out.println("Ingrese primer numero: ");
        x = entrada.nextDouble();
        
        System.out.println("Ingrese segundo numero: ");
        y = entrada.nextDouble();
        
        res = Math.pow((x+y), 2);
        System.out.println("El cuadrado de la suma entre "+x+" y "+y+" es: "+res);
        **/
        
        /**7: Construir un programa que, dado un numero total de horas, devuelve
        el numero de semanas, dias y horas equivalentes. Por ejemplo, dado un
        total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
        **/
        /**
        Scanner entrada = new Scanner(System.in);
        int cantHoras;
        float semanasEq, diasEq, horasEq;
        
        System.out.println("Ingrese cantidad de horas a convertir: ");
        cantHoras = entrada.nextInt();

        semanasEq = cantHoras / 168;
        diasEq = cantHoras % 168 / 24;
        horasEq = cantHoras % 24;
        
        System.out.println("Numero de semanas equivalentes: "+semanasEq);
        System.out.println("Numero de dias equivalentes: "+diasEq);
        System.out.println("Numero de horas equivalentes: "+horasEq);
        **/
        
    }
}
