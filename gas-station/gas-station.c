int canCompleteCircuit(int* gas, int gs, int* cost, int cs) {
    int t=0,a=0,r=0;
    for(int i=0;i<gs;i++){
        t+=gas[i]-cost[i];
        r=r+gas[i]-cost[i];
        if(r<0) {
            a=i+1;
            r=0;
        }
    }
    return t < 0 ? -1 : a ;
}