import java.util.Scanner;
public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("para que quieres calcular el area \n 1) Cuadrado \n 2)Triangulo \n 3)Circulo \n 4)Pentagono \n 5)Hexagono");
      //  System.out.println("Introduce la opción");
       // int op = sc.nextInt();
        double resultado = 0.0;
        
        //switch (op) {
          //  case 1:
                System.out.println("Introduce el lado del cuadrado: ");
                double ladoCuadrado = sc.nextDouble();
                resultado = AreaCuadrado.computeArea(ladoCuadrado);
                System.out.println("El area del cuadrado es: " + resultado);
             //   break;
            
           // case 2:
                System.out.println("Introduce la base del triangúlo: ");
                double base = sc.nextDouble();
                System.out.println("Introduce la altura del triangúlo");
                double altura = sc.nextDouble();
                resultado = AreaTriangulo.computeArea(base, altura);
                System.out.println("El area del triangulo es: " + resultado);
             //   break;

           // case 3:
                System.out.println("Introduce el radio del circulo: ");
                double radio = sc.nextDouble();
                resultado = Areacirculo.computeArea(radio);
                System.out.println("\n El area del circulo es: " + resultado);
            //    break;
            
           // case 4: 
                System.out.println("Introduce el lado del pentagono: ");
                double ladoPen = sc.nextDouble();
                resultado = AreaPentagono.computeArea(ladoPen);
                System.err.println("El area del pentagono es: " + resultado);
             //   break;

         //   case 5: 
                System.err.println("introduce el lado del hexágono: ");
                double ladoHex = sc.nextDouble();
                resultado = AreaHexagono.computeArea(ladoHex);
                System.out.println("El area del Hexagono es: " + resultado);
           //     break;

           // case 0: 
             //   break;
           // default:
              //  System.out.println("Opción erronea vuelve a intentarlo");
             //   break;
     //   }
        sc.close();
    }
}
