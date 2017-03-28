
package spp.cbarraganc.p02.p4;
/**
 *
 * @author
 * José Eduardo De Llano Barragán   A01410712   IC
 * Alberto Barnetche Suarez         A01411570   ISS
 * Carlos Barragán Carrión          A01410357   IMT
 * Carlos Miguel De León García     A01410399   IMA
 * 
 */
public class SPPCBarraganCP02P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                System.out.println("Bienvenido");
        double promedio =promedio();
            System.out.println("El promedio de esta matriz es: "+promedio);
        valorMax();
        valorMen();
        sumaDiagonal();
        sumaDebajo();
        sumaEncima();
    }
    public static double promedio(){
     double promedio;
     int suma=0,cont=0;
        int [][]matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for (int i=0;i<matrix.length;i++){
              for(int j=0; j<matrix[i].length;j++){
                suma=suma+matrix[i][j];
                cont++;
        }
    }
    
    promedio =suma/cont;
        return promedio;    
    }
    
    public static void valorMax(){
        int [][]matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        int mayor=matrix[0][0];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(mayor<matrix[i][j]){
                    mayor=matrix[i][j];
                }
            }
        }
        System.out.println("El mayor es: "+mayor);
    }
    
    public static void valorMen(){
        int [][]matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,5,12},
                                 {16,15,14,13}};
        int menor=matrix[0][0];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(menor>matrix[i][j]){
                    menor=matrix[i][j];
                }
            }
        }
        System.out.println("El menor es: "+menor);
    }
    
    public static void sumaDiagonal(){
     int suma=0;
        int [][]matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for (int i=0;i<matrix.length;i++){
            suma=suma+matrix[i][i];
        }
        System.out.println("La suma de la diagonal es: "+suma);
    }
    
    public static void sumaDebajo(){
        int suma=0;
        int[][] matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for (int i=1;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                suma =suma+matrix[i][j];
            }
            
        }System.out.println("La suma de los números debajo de la diagonal es: "+suma);
    }
    
    public static void sumaEncima(){
        int suma=0;
        int[][] matrix={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for(int j=0;j<matrix.length;j++){
            for(int i=j-1;i>=0;i--){
                suma=suma+matrix[i][j];
            }
        }
        System.out.println("La suma de los números sobre la diagonal es: "+suma);
    }
}