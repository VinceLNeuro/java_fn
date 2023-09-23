public class Product {
    // write your method here

    /**
    * product - This method returns the product x and y.
    * @param x The first non-negative integer
    * @param y The second non-negative integer
    */
    public static int product(int x, int y){
        // Create a variable to store the product (or here the cumulative sum of x for y times)
        int prod = 0;
        for (int i=0;i<y;i++){ //sum x for y times
            prod += x;
        }
        
        return prod;
    }

    public static void main(String[] arg) {
        // test your method here
        System.out.println(product(10,5));
    }
}