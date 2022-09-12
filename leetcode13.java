public class leetcode13{
    public int romanToInt(String s) {
     HashMap<String, Integer> map = new HashMap<>();
     map.put("I",1);
     map.put("V",5);
     map.put("X",10);
     map.put("L",50);
     map.put("C",100);
     map.put("D",500);
     map.put("M",1000);
     map.put("IV",4);    
     map.put("IX",9);    
     map.put("XL",40);    
     map.put("XC",90);    
     map.put("CD",400);    
     map.put("CM",900);        
     int[] result=new int[s.length()];
     int x=0;
     for(int i=0;i<s.length();i++){
         String x1=s.charAt(i)+"";
         String x2=null;
         if(i<s.length()-1){
            x2=""+s.charAt(i)+s.charAt(i+1);
         }
         if(x2!=null && map.containsKey(x2)){
            result[x++]=map.get(x2);
            i++;
            continue;
         }
         if(map.containsKey(x1)){
            result[x++]=map.get(x1);
         }
     }
     int resultValue=0;
     for(int i=0;i<result.length;i++){
         resultValue+=result[i];
     }
     return resultValue;
    }
}