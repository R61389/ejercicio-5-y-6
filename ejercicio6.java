import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner imput = new Scanner(System.in);
    System.out.print("ingrese el numero de alumnos: ");
    int num;
    double med;
    num = imput.nextInt();
    double[] arreglo = new double[num];
    for (int i=0;i<num;i++){
      System.out.print("introduce altura de alumno " + (i+1) + ":");
      arreglo[i] = imput.nextDouble();
    }
    med = arreglo[0];
    for (int i=1;i<num;i++){
      med = med + arreglo[i];
    }
    med = med/num;
    System.out.println("la media de los alumnos es : " + med);
    int bajos = 0;
    int altos = 0;
    int medianos = 0;
    for (int i=0;i<num;i++){
      if (arreglo[i]<med){
        bajos = bajos+1;
      }
      else if(arreglo[i]>med){
        altos = altos+1;
      }
      else if(arreglo[i]==med){
        medianos = medianos+1;
      }
    }
    System.out.println("los alumnos sobre la media son : " + altos);
    System.out.println("los alumnos bajo la media son : " + bajos);
    System.out.println("los alumnos igual a la media son : " + medianos);
  }
}