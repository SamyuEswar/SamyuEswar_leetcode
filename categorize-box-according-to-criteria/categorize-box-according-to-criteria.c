char* categorizeBox(int l, int w, int h, int m) {
    long v=(long)l*w*h;
    int b=(l>=10000 ||w>=10000 || h>=10000 || v>=1000000000);
    int he=m>=100;
    if(b&&he) return "Both";
    else if(b) return "Bulky";
    else if(he) return "Heavy";
    else return "Neither";
}