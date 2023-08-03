package DSA;

public class LinearSearchAlgo {

    public static void main(String[] args) {

        int[] shops = {4,7,1,9,8,3,5,0};

        // count through numbers
        for(int shop:shops){
            if(shop == 3){
                System.out.println("->" + shop + "<-");
                break;
            }
            System.out.println(shop+", ");
        }


    }
}
