char* winningPlayer(int x, int y) {
    int t=0;
    while(x>=1 &&y>=4){
        t++;
        x-=1;y-=4;
    }
    return(t%2==0)?"Bob":"Alice";
}