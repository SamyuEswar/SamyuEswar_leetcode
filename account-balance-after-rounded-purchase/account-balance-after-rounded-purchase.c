int accountBalanceAfterPurchase(int p) {
    if(p%10==0) return 100-p;
    else return 100-((p+5)/10)*10;
}