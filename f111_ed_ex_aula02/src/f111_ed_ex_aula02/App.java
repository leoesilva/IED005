package f111_ed_ex_aula02;

public class App {
    public static void main(String[] args) throws Exception {
        imprimirInteiros();
    }

    private static void imprimirInteiros() {
        StringBuilder sb = new StringBuilder();
        int num = 10;
        while (num <= 100) {
            if(num > 10 && num % 10 == 0) {
                sb.append("\n");
            }
            if (num < 100) {
                sb.append(num + ", ");
            } else {
                sb.append(num + ".");
            }            
            num++;
        }
        System.out.println(sb);
    }
}
