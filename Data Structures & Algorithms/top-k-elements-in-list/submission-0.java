class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> lis=map.entrySet()
                             .stream()
                             .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                             .limit(k)
                             .map(Map.Entry::getKey)
                             .collect(Collectors.toList());
        return lis.stream()
               .mapToInt(Integer::intValue)
               .toArray();

    }
}
