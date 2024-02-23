public class week22 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int r = (int)(Math.random()*100);
                arr[i][j] = r;
            }
        }

        for(int n[] : arr){
            for(int m : n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }
    }
}
