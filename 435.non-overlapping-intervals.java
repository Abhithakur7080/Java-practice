/*
 * @lc app=leetcode id=435 lang=java
 *
 * [435] Non-overlapping Intervals
 */

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int count = 0;
        int l=0;
        int r=1;
        while(r<n){
            if(intervals[l][1] <= intervals[r][0]){
                l=r;
                r++;
            }
            else if(intervals[l][1] <= intervals [r][1]){
                count++;
                r++;
            }
            else if(intervals[l][1] > intervals[r][1]){
                count++;
                l=r;
                r++;
            }
        }
        return count;
    }
}
// @lc code=end

