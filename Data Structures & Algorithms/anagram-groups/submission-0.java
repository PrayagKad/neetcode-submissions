class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> ans = new HashMap<>();
        for(String a : strs)
        {
            char[] ch = a.toCharArray();
            Arrays.sort(ch);

            String s = String.valueOf(ch);
            if(!ans.containsKey(s))
            {
              ans.put(s, new ArrayList<String>());
            }

            ans.get(s).add(a);

        }

        return new ArrayList<>(ans.values());
    }
}
