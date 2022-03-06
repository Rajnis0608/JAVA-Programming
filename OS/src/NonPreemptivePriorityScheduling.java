import java.util.Scanner;

public class NonPreemptivePriorityScheduling {
    int burstTime[] = {4,3,7,4,2};
    int arrivalTime[] = {0,0,6,11,12};
    int priority[] = {1,2,1,3,2};

    String[] processId = {"P0","P1","P2","P3","P4"};
    int n = 5;

    public void sortTimeAndPriority()
    {


        int temp;
        String stemp;
        for (int i = 0; i < n; i++)
        {

            for (int j = 0; j < n - i - 1; j++)
            {
                if (arrivalTime[j] > arrivalTime[j + 1])
                {
                    //swapping arrival time
                    temp = arrivalTime[j];
                    arrivalTime[j] = arrivalTime[j + 1];
                    arrivalTime[j + 1] = temp;

                    //swapping burst time
                    temp = burstTime[j];
                    burstTime[j] = burstTime[j + 1];
                    burstTime[j + 1] = temp;

                    //swapping priority
                    temp = priority[j];
                    priority[j] = priority[j + 1];
                    priority[j + 1] = temp;

                    //swapping process identity
                    stemp = processId[j];
                    processId[j] = processId[j + 1];
                    processId[j + 1] = stemp;

                }
                //sorting according to priority when arrival timings are same
                if (arrivalTime[j] == arrivalTime[j + 1])
                {
                    if (priority[j] > priority[j + 1])
                    {
                        //swapping arrival time
                        temp = arrivalTime[j];
                        arrivalTime[j] = arrivalTime[j + 1];
                        arrivalTime[j + 1] = temp;

                        //swapping burst time
                        temp = burstTime[j];
                        burstTime[j] = burstTime[j + 1];
                        burstTime[j + 1] = temp;

                        //swapping priority
                        temp = priority[j];
                        priority[j] = priority[j + 1];
                        priority[j + 1] = temp;

                        //swapping process identity
                        stemp = processId[j];
                        processId[j] = processId[j + 1];
                        processId[j + 1] = stemp;

                    }
                }
            }

        }
    }

    void priorityNonPreemptiveAlgorithm()
    {
        int finishTime[] = new int[n];
        int waitingTime[] = new int[n];
        int turnAroundTime[] = new int[n];

        sortTimeAndPriority();

        //calculating waiting & turn-around time for each process
        finishTime[0] = arrivalTime[0] + burstTime[0];
        turnAroundTime[0] = finishTime[0] - arrivalTime[0];
        waitingTime[0] = turnAroundTime[0] - burstTime[0];

        for (int i = 1; i < n; i++)
        {
            finishTime[i] = burstTime[i] + finishTime[i - 1];
            turnAroundTime[i] = finishTime[i] - arrivalTime[i];
            waitingTime[i] = turnAroundTime[i] - burstTime[i];
        }
        float sum = 0;
        for (int n : waitingTime)
        {
            sum += n;
        }
        float averageWaitingTime = sum / n;

        sum = 0;
        for (int n : turnAroundTime)
        {
            sum += n;
        }
        float averageTurnAroundTime = sum / n;

        //print on console the order of processes along with their finish time & turn around time
        System.out.println();
        System.out.format("%20s%20s%20s%20s%20s%20s%20s\n", "ProcessId", "BurstTime", "ArrivalTime", "Priority", "FinishTime", "WaitingTime", "TurnAroundTime");
        for (int i = 0; i < n; i++) {
            System.out.format("%20s%20d%20d%20d%20d%20d%20d\n", processId[i], burstTime[i], arrivalTime[i], priority[i], finishTime[i], waitingTime[i], turnAroundTime[i]);
        }

        System.out.format("%100s%20f%20f\n", "Average", averageWaitingTime, averageTurnAroundTime);
    }

    public static void main(String[] args)
    {
        NonPreemptivePriorityScheduling obj = new NonPreemptivePriorityScheduling();
        obj.priorityNonPreemptiveAlgorithm();
    }
}
