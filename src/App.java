import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = a * b;
        List<Double> list = new ArrayList<>();

        for (double i = 10; i < 91; i += 10) {
            double calc = Math.ceil((c * i) / 100.0);
            list.add(calc);
        }

        for(int i = 0; i < list.size(); i++){
            if(i == list.size() -1){
                System.out.printf("%.0f\n",list.get(i));
            }else{
                System.out.printf("%.0f",list.get(i));
                System.out.print(" ");
            }
        }

        sc.close();

    }
}
