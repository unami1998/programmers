public class studyArray {
    static void basic(){
        int[][] array = new int[][]{{5, 8, 10, 6},{11, 20, 1, 3, 2}};
        int i, j;
        for( i=0; i<array.length; i++)          //  0              , a.length->2
        {
            for( j=0; j<array[i].length; j++)   //  j=0  j=1 j=2 j=3   a[i].length->
            {
                System.out.printf("%2d   ", array[i][j]);
            }
            System.out.println();

        }
    }

    public static void main(String[] args){
        basic();
    }
}
