import java.util.*;

public class Practica5 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int personas;
    int mujeres=0;
    int hombres=0;
    int sex;
    System.out.println("Ingrese el numero de personas que deas digitar");
    personas=scanner.nextInt();
    for (int k=1; k<=personas;k++){
        System.out.println("Ingrese l numero de su sexo, Maculino=0, Femenino=1");
        sex=scanner.nextInt();
        System.out.println("Ingrese su edad");
        int edad=scanner.nextInt();
        if (sex==0 & edad<18){
            hombres+=1;
        }
        if (sex==1 & edad>=18){
            mujeres+=1;
        }
    }
    System.out.println("El número de mujeres mayores de edad es de "+mujeres);
    System.out.println("El número de hombres menores de edad es de "+hombres);
}
}