impl Solution {
    pub fn restore_string(s: String, indices: Vec<i32>) -> String {
        let mut n = String::from(s.as_str());

        for (i, c) in s.char_indices() {
            n.replace_range((indices[i] as usize)..((indices[i]+1) as usize), c.to_string().as_str());
        }
        
        return n;
    }
}

//https://leetcode.com/problems/shuffle-string/