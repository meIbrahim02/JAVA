public class array2d {
    public static void main(String[] args) {
        // 2D array = an array where each element is an array
        //            useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"briyani", "butter chicken", "chicken korma"};

        String[][] groceries = {fruits, vegetables, meats};

        groceries[0][0] = "pineapple";
        groceries[1][0] = "celery";
        groceries[1][2] = "brinjal";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
