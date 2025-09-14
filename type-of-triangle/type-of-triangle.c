char* triangleType(int* n, int numsSize) {
    int a=n[0],b=n[1],c=n[2];
    if(a+b>c && b+c>a && a+c>b){
        if(a==b && b==c) return "equilateral";
        else if((a==b && b!=c)|| (b==c &&b!=a) ||(a==c && a!=b)) return "isosceles";
        else return "scalene";
    }
    return "none";
}