public class Main {
    public static void main(String[] args) {
        array(100);

    } public  static  void array(int numbers){
        int counter =0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
             counter =counter+i;
                
            }
        }
        System.out.println(counter);
    }
}