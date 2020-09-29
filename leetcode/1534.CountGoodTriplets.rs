impl Solution {
    pub fn count_good_triplets(arr: Vec<i32>, a: i32, b: i32, c: i32) -> i32 {
        let mut p = 0;
        for i in 0..arr.len(){
            for j in i+1..arr.len() {
                if (arr[i] - arr[j]).abs() <= a {
                    for k in j+1..arr.len() {
                        if (arr[i] - arr[k]).abs() <= c && (arr[j] - arr[k]).abs() <= b {
                            p+=1;
                        }
                    }
                }
            }
        }
        return p;
    }
}
//https://leetcode.com/problems/count-good-triplets/