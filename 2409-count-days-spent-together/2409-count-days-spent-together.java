class Solution {
    static int[] days_array={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
           int A_arrive= toDayOfYear(arriveAlice); 
           int B_arrive= toDayOfYear(arriveBob);
           int A_leave= toDayOfYear(leaveAlice);
           int B_leave= toDayOfYear(leaveBob);
           int overlap_Arrive=Math.max(A_arrive, B_arrive);
           int overlap_Leave=Math.min(A_leave,B_leave);
           return Math.max(0, overlap_Leave-overlap_Arrive + 1);
    }
    public static int toDayOfYear(String date){
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3));
        int day_of_year=0;
        for(int i=0;i<month-1;i++){  //eg:mon=oct.only wants month before oct this adds days[0-9], which includes October itself needs to be: i=0to month-1
            day_of_year+= days_array[i];
        }
        return day_of_year+day;
    }
}