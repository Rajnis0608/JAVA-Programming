public class FCFS {
    static void findWaitingTime(int n, int bt[], int wt[]) {
        wt[0] = 0;

        for (int i = 1; i < n; i++) {
            wt[i] = bt[i - 1] + wt[i - 1];
        }
    }

    static void findTurnAroundTime(int n, int bt[], int wt[], int tat[]) {
        for (int i = 0; i < n; i++) {
            tat[i] = bt[i] + wt[i];
        }
    }

    static void findavgTime(int n, int bt[]) {
        int wt[] = new int[n], tat[] = new int[n];
        int total_wt = 0, total_tat = 0;

        findWaitingTime(n, bt, wt);

        findTurnAroundTime(n, bt, wt, tat);

        System.out.println();
        System.out.println("Process || Burst_time || Waiting_time || Turn_around");

        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            System.out.print(" " + (i + 1) + "      ||");
            System.out.print("     " + bt[i] +(bt[i] > 9 ?  "     ||  " : "      ||  "));
            System.out.print("     " + wt[i] +(wt[i] > 9 ?  "     ||  " : "      ||  "));
            System.out.println("   " + tat[i] );
        }
        System.out.println();
        float s = (float)total_wt /(float) n;
        int t = total_tat / n;
        System.out.println("Average waiting time = "+ s);
        System.out.printf("Average turn around time = " +  t);
    }

    public static void main(String[] args) {

        int processes[] = {1, 2, 3};
        int n = processes.length;

        int burst_time[] = {10, 5, 8};

        findavgTime(n, burst_time);

    }
}
