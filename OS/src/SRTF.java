public class SRTF {

    static void findWaitingTime(int[][] mat, int n, int wt[]) {
        int rt[] = new int[n];

        // Copy the burst time into rt[]
        for (int i = 0; i < n; i++)
            rt[i] = mat[i][2];

        int complete = 0, t = 0, minm = Integer.MAX_VALUE;
        int shortest = 0, finish_time;
        boolean check = false;

        while (complete != n) {

            for (int j = 0; j < n; j++) {
                if ((mat[j][1] <= t) && (rt[j] < minm) && rt[j] > 0) {
                    minm = rt[j];
                    shortest = j;
                    check = true;
                }
            }

            if (check == false) {
                t++;
                continue;
            }

            rt[shortest]--;

            minm = rt[shortest];
            if (minm == 0)
                minm = Integer.MAX_VALUE;

            if (rt[shortest] == 0) {

                complete++;
                check = false;

                finish_time = t + 1;

                wt[shortest] = finish_time - mat[shortest][2] - mat[shortest][1];

                if (wt[shortest] < 0)
                    wt[shortest] = 0;
            }
            // Increment time
            t++;
        }
    }

    // Method to calculate turn around time
    static void findTurnAroundTime(int[][] mat, int n, int wt[], int tat[]) {

        for (int i = 0; i < n; i++)
            tat[i] = mat[i][2] + wt[i];
    }

    // Method to calculate average time
    static void findavgTime(int mat[][], int n) {
        int wt[] = new int[n], tat[] = new int[n];
        int total_wt = 0, total_tat = 0;

        findWaitingTime(mat, n, wt);

        findTurnAroundTime(mat, n, wt, tat);
        System.out.println();
        System.out.println("Processes || Burst time || Waiting time || Turn around time");

        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            System.out.print("   " + mat[i][0] + "      ||");
            System.out.print("      " + mat[i][2] +(mat[i][2] > 9 ?  "     ||  " : "     ||  "));
            System.out.print("   " + wt[i] +(wt[i] > 9 ?  "       ||  " : "        ||  "));
            System.out.println("     " + tat[i]);
        }

        System.out.println("Average waiting time = " +
                (float) total_wt / (float) n);
        System.out.println("Average turn around time = " +
                (float) total_tat / (float) n);
    }

    // Driver Method
    public static void main(String[] args) {
        int num = 4;
        int mat[][] = new int[num][3];
        int[] pID = {1,2,3,4};
        int[] bt = {6,8,7,3};
        int[] at = {1,1,2,3};
        for (int i = 0; i < num; i++) {
            mat[i][0] = pID[i];
            mat[i][1] = at[i];
            mat[i][2] = bt[i];
        }

        findavgTime(mat,num);
    }

}
