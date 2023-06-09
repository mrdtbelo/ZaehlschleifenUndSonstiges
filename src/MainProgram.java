public class MainProgram {

    public static void main(String[] args) {
        rectangleStars(5,8);
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
            sum = sum + i;
        }
        return sum;
    }

    public static int powerOfTwo(int p){
        if(p < 0) return -1;

        int result = 1;
        for (int i = 0; i<= p; i++ ) {
            result = result * 2;
        }
        return result;
    }

    public static int sumUpPowerOfTwo(int n){
        int sum = 0;
        for(int i = 0; i<= n; i++){
            sum = sum + powerOfTwo(i);
        }
        return sum;
    }

    public static void rectangleStars(int width, int height){
        for(int i = 0; i <= height; i++){
            for(int j = 0; j <= width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rectangleStarsSave(int width, int height){
        boolean groesserAls0 = true;
        if(width > 0 && height > 0){
            groesserAls0 = false;
            rectangleStars(width,height);
        }
        rectangleStars(width, height);
    }

    public static void triangleStars(int width){
        for(int i = 0; i <= width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}