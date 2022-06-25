public class Main {

    public static void main(String[] args) {
      coche miCoche = new coche();
        miCoche.añadirpuerta();
        miCoche.añadirpuerta();
        miCoche.añadirpuerta();
        miCoche.añadirpuerta();
        miCoche.añadirpuerta();
        System.out.println(miCoche.puertas + " puertas");
        int resultado;
        resultado = suma (14, 6, 29);
        System.out.println(resultado + " es la suma de las tres variables (a,b,c)");
    }
    public static int suma (int a, int b, int c){
        return a + b + c;



    }
    static class coche {

        public int puertas = 5;
        public void añadirpuerta(){
            this.puertas++;
        }
    }

}
