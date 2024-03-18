package arraysdemo;

public class twoDim {
    public static void main(String[] args) {
        int ar[][]=new int[2][2];

        ar[0][0]=3;
        ar[0][1]=7;
        ar[1][0]=5;
        ar[1][1]=9;

        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                System.out.print(ar[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }
}
