public class break_continue {
    public static void main(String[] args) {
        // break = break out of a loop (STOP)
        // continue = skip current iteration of loop (SKIP)
        for(int i = 0; i<0; i++){
            if(i == 5){
                break;
            }
            System.out.println(i + "");
        }

        for(int j = 0; j<0; j++){
            if(j == 5){
                continue;
            }
            System.out.println(j + "");
        }
    }
}
