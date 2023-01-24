public class For_test {
    public static void main(String[] args) {
        //int[] weights = {92, 93, 95, 94, 90, 89, 85, 0, 0, 0, 0, 0 };
        int[] weights = new int[12];
        weights[0] = 92;
        weights[1] = 93;
        weights[2] = 95;
        weights[3] = 94;
        weights[11] = 96;
        int januaryWeight = weights[1];
        System.out.println(januaryWeight);
        System.out.println(weights[2]);
        System.out.println(weights[3]);
        int january = 11;
        System.out.println(weights[january]);  //How to do new PSVM ?
        System.out.println();


        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        System.out.println();
        System.out.println(weights.length);
    }
}
