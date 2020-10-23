import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);

    float height;
    float weight;
    float bmi;

    System.out.println("Buenos dias! Bienvenido a la calculadora de indice de edad corporal, por sus siglas: B.M.I ");
    System.out.println("Cargando...");

    System.out.println("");
    System.out.print("ingrese su peso- ");
    weight = enter.nextFloat();
    System.out.print("ingrese su altura- ");
    height = enter.nextFloat();
    System.out.println("Calculando...");
    System.out.println("");
    bmi = weight / (height * height);
    System.out.println("Listo! el indice de edad corporal segun los datos administrados es de " + bmi);
    if (bmi < 18.5) {
      System.out.println("Esto indica que usted posee un peso muy bajo! tenga cuidado!");
    } else if (bmi >= 18.5 && bmi <= 24.9) {
      System.out.println("Esto indica que usted posee un peso adecuado! siga asi!");
    } else if (bmi > 24.9) {
      System.out.println("Esto indica que usted posee un peso alto! tenga cuidado!");
    } else {
      System.out.println("Esto indica que usted posee un peso demasiado alto! vaya al medico!");
    }

  }

}
