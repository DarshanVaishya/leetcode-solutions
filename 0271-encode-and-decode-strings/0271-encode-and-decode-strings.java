public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        String res = "";
        for(String str : strs) {
            res += str.length() + "#" + str;
        }
        return res;
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int n = s.length();
        int i = 0;
        while(i < n) {
            int j = i;
            while(s.charAt(j) != '#')
                j++;
            int steps = Integer.parseInt(s.substring(i, j));
            String word = s.substring(j + 1, j + steps + 1);
            res.add(word);
            i = j + steps + 1;
        }
        return res;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));