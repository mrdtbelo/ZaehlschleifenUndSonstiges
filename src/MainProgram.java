public class MainProgram {

    public static void main(String[] args) {
        rectangleStars(1,4);
        System.out.println(powerOfTwo(3));

        }

    public static void printSomeNumbers() {
        for (int i = 6; i <= 23; i++) {
            System.out.println("Wert von i: " + i);

        }
    }
    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println("Wert von i: " + i);
        }
    }
    public static int sumUp(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + 1;
        }
        return sum;
    }
    public static int powerOfTwo(int p){
        if(p < 0) return -1;
        int powerOf2 = 1;
        for (int i = 0; i<= p; i++ ) {
            powerOf2 = powerOf2 * 2;
        } return powerOf2;
    }
    public static int sumUpPowerOfTwo(int n){
        int sum = 0;
        for(int i = 0; i<= n; i++){
            sum = sum + powerOfTwo(i);
        } return sum;
    }
    public static void rectangleStars(int width, int height){
        for(int i = 0; i <= width; i++){
            for(int j = 0; j <= height; j++){
                //System.out.print();

            }
        }
    }
}
