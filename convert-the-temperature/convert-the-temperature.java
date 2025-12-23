class Solution {
    public double[] convertTemperature(double c) {
        double f=((9.0/5)*c)+32;
        double k=273.15+c;
        double[] a={k,f}; 
        return a;
    }
}