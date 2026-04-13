class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for(String str : strs) {
            sizes.add(str.length());
        }
        for(Integer size : sizes) {
            res.append(String.valueOf(size)).append(',');
        }
        res.append('#');
        for(String str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) return new ArrayList<>();
        List<String> strs = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i=0;
        while(str.charAt(i) != '#') {
            //char ch;
            StringBuilder cur = new StringBuilder();
            while(str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for(int size : sizes) {
            strs.add(str.substring(i, i + size));
            i += size;
        }
        return strs;
    }
}
