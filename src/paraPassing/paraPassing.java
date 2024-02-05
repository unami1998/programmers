package paraPassing;

class paraPassing {
    public void change ( int i, int[] j){
        i = 20;
        j[3] = 400;
        System.out.println(i);
        System.out.println(j[0] + "," + j[1]);

    }

    public void display ( int i, int[] j){
        System.out.println("i->" + i);
        System.out.print("j:");
        for (int k = 0; k < j.length; k++)
            System.out.print(j[k] + "");
    }

    public static void main(String[] args){
        paraPassing pp = new paraPassing();
        int i = 10;
        int[] j = {1, 2, 3, 4};
        //pp.change(i, j);
        pp.display(i, j);

    }
}

