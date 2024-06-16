import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cambio cambio;
        int opcion = 0;
        Double cantidad = 0.0;
        Scanner lectura = new Scanner(System.in);
        Consulta cambioDivisa = new Consulta();

        while(opcion != 7) {
            System.out.println("********************************************");
            System.out.println("Conversor DE Mony");
            System.out.println("""
                    1. Real brasileño a Dolares Estado Unidenses.
                    2. Dolares Estado Unidenses a  Real brasileño.
                    3. Dolares Estado Unidenses a Pesos Colombianos.
                    4. Pesos Colombianos a  Dolares Estado Unidenses.
                    5. Dolares Estado Unidenses a Pesos Argentinos.
                    6. Pesos Argentinos a  Dolares Estado Unidenses.
                    7. Salir.""");
            System.out.println("********************************************");
            System.out.println("Seleccione la opción:");

            try {
                opcion=Integer.parseInt(lectura.nextLine());

                switch (opcion){
                    case 1:
                        System.out.println("Usted selecciono Real brasileño a Dolares Estado Unidenses.");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        cambio= cambioDivisa.convierteDivisa("BRL","USD",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+cambio.conversion_rate());
                        System.out.println(cantidad+" [BLR]"+ " son "+ cambio.conversion_result()+" [USD]" );
                        break;
                    case 2:
                        System.out.println("Usted selecciono Dolares Estado Unidenses a Real brasileño.");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        cambio = cambioDivisa.convierteDivisa("USD","BRL",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+cambio.conversion_rate());
                        System.out.println(cantidad+" [USD]"+ " son "+ cambio.conversion_result()+" [BRL]" );
                        break;
                    case 3:
                        System.out.println("Usted selecciono Dolares Estado Unidenses a Pesos Colombianos.");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        cambio = cambioDivisa.convierteDivisa("USD","COP",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+cambio.conversion_rate());
                        System.out.println(cantidad+" [USD]"+ " son "+ cambio.conversion_result()+" [COP]" );
                        break;
                    case 4:
                        System.out.println("Usted selecciono Pesos Colombianos a Dolares Estado Unidenses");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        cambio = cambioDivisa.convierteDivisa("COP","USD",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+cambio.conversion_rate());
                        System.out.println(cantidad+" [COP]"+ " son "+ cambio.conversion_result()+" [USD]" );
                        break;
                    case 5:
                        System.out.println("Usted selecciono Dolares Estado Unidenses a Pesos Argentinos");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        cambio = cambioDivisa.convierteDivisa("USD","ARS",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+cambio.conversion_rate());
                        System.out.println(cantidad+" [USD]"+ " son "+ cambio.conversion_result()+" [ARS]" );
                        break;
                    case 6:
                        System.out.println("Usted selecciono Pesos Argentinos a Dolares Estado Unidenses");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        cambio = cambioDivisa.convierteDivisa("ARS","MXN",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+cambio.conversion_rate());
                        System.out.println(cantidad+" [ARS]"+ " son "+ cambio.conversion_result()+" [USD]" );
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
    }
}