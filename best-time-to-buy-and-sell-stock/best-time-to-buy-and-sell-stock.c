int maxProfit(int* p, int n) {
    int maxProfit=0,currProfit=0,minProfit=p[0];
        for(int i=0;i<n;i++){
            if(p[i]<minProfit) minProfit=p[i];
            else{
                currProfit=p[i]-minProfit;
                if(currProfit>maxProfit) maxProfit=currProfit; 
            }
        }
    return maxProfit;
}