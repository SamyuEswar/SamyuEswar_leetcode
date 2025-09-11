int passThePillow(int n, int time) {    
    int c=2*(n-1);
    int p=time%c;
    if(p<=n-1) return p+1;
    else return n-(p-(n-1));
}