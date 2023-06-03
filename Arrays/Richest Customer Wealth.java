class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxW=0;
        
        for( int customer=0 ; customer < accounts.length ; customer++){
            int wealth=0;
        for( int bank = 0 ; bank < accounts[ customer ].length; bank++ ){
              wealth += accounts[customer][bank];
}
            if( maxW < wealth){
                maxW= wealth ;
}
}
         return maxW;
    }
   
}