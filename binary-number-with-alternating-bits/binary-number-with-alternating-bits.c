bool hasAlternatingBits(int n) {
    unsigned k;
    k=n^n>>1;
    return (k&k+1)==0;   
}