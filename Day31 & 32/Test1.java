/* 

1.A railway station needs to determine the minimum number of platforms required
so that no train has to wait.

You are given the arrival and departure times of n trains.

Find the minimum number of platforms required at the railway station at any time.

Sample Testcase:1
------------------------------
input=6
900 940 950 1100 1500 1800
910 1200 1120 1130 1900 2000
output=3


Explanation:
------------------------------------------
At 9:50, three trains are at the station:
- Train 2: Arrived at 9:40, departing at 12:00.
- Train 3: Arrived at 9:50, departing at 11:20.
- Train 4: Arrived at 11:00? Not yet arrived at 9:50.
Actually, at 9:50 only two trains are present. The maximum overlap 
of three trains occurs at 11:00 (trains 2, 3 and 4).

Therefore, 3 platforms are required.1.A railway station needs to determine the minimum number of platforms required
so that no train has to wait.

You are given the arrival and departure times of n trains.

Find the minimum number of platforms required at the railway station at any time.

Sample Testcase:1
------------------------------
input=6
900 940 950 1100 1500 1800
910 1200 1120 1130 1900 2000
output=3


Explanation:
------------------------------------------
At 9:50, three trains are at the station:
- Train 2: Arrived at 9:40, departing at 12:00.
- Train 3: Arrived at 9:50, departing at 11:20.
- Train 4: Arrived at 11:00? Not yet arrived at 9:50.
Actually, at 9:50 only two trains are present. The maximum overlap 
of three trains occurs at 11:00 (trains 2, 3 and 4).

Therefore, 3 platforms are required.

*/



import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arrival[] = new int[n];
        int departure[] = new int[n];

        for (int i = 0; i < n; i++) {
            arrival[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            departure[i] = sc.nextInt();
        }

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platforms = 0;
        int maxPlatforms = 0;

        int i = 0;
        int j = 0;

        while (i < n) {

            if (arrival[i] <= departure[j]) {

                platforms++;

                maxPlatforms = Math.max(maxPlatforms, platforms);

                i++;

            } else {

                platforms--;

                j++;
            }
        }

        System.out.println(maxPlatforms);

        sc.close();
    }
}
