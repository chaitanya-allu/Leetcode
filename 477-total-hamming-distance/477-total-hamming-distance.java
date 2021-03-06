class Solution {
    public int totalHammingDistance(int[] A) {
        int i=0,N=A.length,count=0;
        while(i<32){
            int zc=0,oc=0;
            for(int j=0;j<N;j++){
                if((A[j]&1)==1) oc++;
                else zc++;
                A[j]>>=1;
            }
            count+=(zc*oc);
            i++;
        }
        return count;
    }
}