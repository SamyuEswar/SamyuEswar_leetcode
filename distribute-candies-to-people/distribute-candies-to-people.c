/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* distributeCandies(int c, int np, int* rs) {
    int *res =(int*)calloc(np,sizeof(int));
    *rs=np;
    int y=1;
    while(c!=0){
        for(int i=0;i<np;i++){
            if(y>c) y=c;
            res[i]=res[i]+y;
            c=c-y;
            y++;
            if(c==0) break;
        }
    }
    return res;
}