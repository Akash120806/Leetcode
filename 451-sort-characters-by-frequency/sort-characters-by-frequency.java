class Solution {
    public String frequencySort(String s) {
       StringBuilder ans = new StringBuilder();
       HashMap <Character,Integer> map = new HashMap<>();
       for(char ch : s.toCharArray()){
        map.put(ch, map.getOrDefault(ch,0)+1);
       }
       ArrayList<Character> list = new ArrayList(map.keySet());
       Collections.sort(list, new Comparator<Character>(){
        @Override
        public int compare(Character a, Character b){
            return map.get(b)-map.get(a);
        }
       });
       for(char c : list){
        int f = map.get(c);
        for(int i =0; i<f;i++){
            ans.append(c);
        }
       }
       return ans.toString();
    }
}