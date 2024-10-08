class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        // Find counts of s1
        int[] targetC = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            targetC[s1.charAt(i) - 'a']++;
        }
    
        // Initialize the window counts for s2
        int left = 0;
        int[] currC = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            currC[s2.charAt(i) - 'a']++;
        }

        // Start looking for permutations
        for(int right = s1.length(); right < s2.length(); right++) {
            if(Arrays.equals(currC, targetC)) {
                return true;
            }
            currC[s2.charAt(left) - 'a']--;
            currC[s2.charAt(right) - 'a']++;
            left++;
        }

        return Arrays.equals(currC, targetC);
    }
}