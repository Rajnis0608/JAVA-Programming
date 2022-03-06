import java.util.Scanner;

class SJF {

    static int[][] mat = new int[10][6];

    static void arrangeArrival(int num, int[][] mat)
    {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (mat[j][1] > mat[j + 1][1]) {
                    for (int k = 0; k < 5; k++) {
                        int temp = mat[j][k];
                        mat[j][k] = mat[j + 1][k];
                        mat[j + 1][k] = temp;
                    }
                }
            }
        }
    }

    static void completionTime(int num, int[][] mat)
    {
        int temp, val = -1;
        mat[0][3] = mat[0][1] + mat[0][2];
        mat[0][5] = mat[0][3] - mat[0][1];
        mat[0][4] = mat[0][5] - mat[0][2];

        for (int i = 1; i < num; i++) {
            temp = mat[i - 1][3];
            int low = mat[i][2];
            for (int j = i; j < num; j++) {
                if (temp >= mat[j][1] && low >= mat[j][2]) {
                    low = mat[j][2];
                    val = j;
                }
            }
            mat[val][3] = temp + mat[val][2];
            mat[val][5] = mat[val][3] - mat[val][1];
            mat[val][4] = mat[val][5] - mat[val][2];
            for (int k = 0; k < 6; k++) {
                int tem = mat[val][k];
                mat[val][k] = mat[i][k];
                mat[i][k] = tem;
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int num = 4;
        int[] pID = {1,2,3,4};
        int[] at = {2,0,4,5};
        int[] bt = {3,4,2,4};
        for (int i = 0; i < num; i++) {
            mat[i][0] = pID[i];
            mat[i][1] = at[i];
            mat[i][2] = bt[i];
        }
        System.out.println();
        System.out.println("Input Data...");
        System.out.println("Process || Arrival_time || Burst_time");
        for (int i = 0; i < num; i++) {
            System.out.print(" " + mat[i][0] + "      ||");
            System.out.print("     " + mat[i][1] +(mat[i][1] > 9 ?  "         ||  " : "        ||  "));
            System.out.println("     " + mat[i][2]);
        }

        arrangeArrival(num, mat);
        completionTime(num, mat);
        System.out.println();
        System.out.println("Process ID || Arrival Time || Burst Time || Waiting Time || Turnaround Time");
        for (int i = 0; i < num; i++) {
            System.out.print(" " + (i + 0) + "         ||");
            System.out.print("     " + mat[i][1] +(mat[i][1] > 9 ?  "       ||  " : "        ||  "));
            System.out.print("     " + mat[i][2] +(mat[i][2] > 9 ?  "   ||  " : "    ||  "));
            System.out.print("     " + mat[i][4] +(mat[i][4] > 9 ?  "     ||  " : "      ||  "));
            System.out.println("     " + mat[i][5] );
        }
    }
}
