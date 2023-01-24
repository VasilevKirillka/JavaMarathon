package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][]array=new int[3][5];

        for(int i=0; i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]=(int)Math.round(Math.random()*50);
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        int maxSum=0;
        int maxSumInd=0;
        for(int i=0; i< array.length;i++){
            int sum=0;
            for (int j=0;j<array[i].length;j++){
                sum+=array[i][j];
            }
            if(sum>=maxSum){
                maxSum=sum;
                maxSumInd=i;
            }
            System.out.println(sum);
        }

        System.out.println(maxSumInd);



    }
}
