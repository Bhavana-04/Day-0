public class Solution {
    public int wordLadderLength(String start, String target, Set<String> hs) {
        // code here
        if(!hs.contains(target))
            return 0;
        if(start.equals(target))
            return 0;
        Queue<String> q=new LinkedList<>();
        q.add(start);
        int res=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int t=size;t>0;t-=1){
                String s=q.poll();
                for(char ch='a';ch<='z';ch++){
                    for(int i=0;i<s.length();i++){
                        String s1=s.substring(0,i)+ch+s.substring(i+1, s.length());
                        if(hs.contains(s1)){
                            q.add(s1);
                            hs.remove(s1);
                        }
                        if(s.equals(target)){
                            return res;
                        }
                    }
                }
            }
            res+=1;
        }
        return 0;
    }
}
