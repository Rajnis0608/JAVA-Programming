import java.util.Scanner;

public class MultilevelQueueScheduling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p[] = new int[20];
        int bt[] = new int[20];
        int su[] = new int[20];
        int wt[] = new int[20];
        int tat[] = new int[20];
        int i, k, n, temp;
        float wtavg, tatavg;
        System.out.println("Enter the number of processes:");
        n= sc.nextInt();
        for(i=0;i<n;i++)
        {
            p[i] = i;
            System.out.println("Enter the Burst Time of Process"+ i + ":" );
            bt[i] = sc.nextInt();
            System.out.println("System/User Process (0/1) ? ");
            su[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
            for(k=i+1;k<n;k++)
                if(su[i] > su[k])
                {
                    temp=p[i];
                    p[i]=p[k];
                    p[k]=temp;
                    temp=bt[i];
                    bt[i]=bt[k];
                    bt[k]=temp;
                    temp=su[i];
                    su[i]=su[k];
                    su[k]=temp;
                }
        wtavg = wt[0] = 0;
        tatavg = tat[0] = bt[0];
        for(i=1;i<n;i++)
        {
            wt[i] = wt[i-1] + bt[i-1];
            tat[i] = tat[i-1] + bt[i];
            wtavg = wtavg + wt[i];
            tatavg = tatavg + tat[i];
        }
        System.out.println("\nPROCESS\t SYSTEM/USER PROCESS \tBURST TIME\tWAITING TIME\tTURNAROUND TIME");
        for(i=0;i<n;i++){
            System.out.print(" " + p[i] +(p[i] > 9 ?  "     ||  " : "      ||  "));
            System.out.print("         " + su[i] +(su[i] > 9 ?  "     ||  " : "      ||  "));
            System.out.print("     " + bt[i] +(bt[i] > 9 ?  "   ||  " : "    ||  "));
            System.out.print("     " + wt[i] +(wt[i] > 9 ?  "     ||  " : "      ||  "));
            System.out.println("   " + tat[i] );
        }
        System.out.printf("\nAverage Waiting Time is --- %f",wtavg/n);
        System.out.printf("\nAverage Turnaround Time is --- %f",tatavg/n);
    }
}

// 4 5 0 3 1 7 0 9 1