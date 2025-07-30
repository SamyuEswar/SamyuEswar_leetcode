class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int i=0,j=0,k=0;
        vector<double> merged;
        while(i<nums1.size() && j<nums2.size()){
            if(nums1[i]<nums2[j]){
                merged.push_back(nums1[i]);
                i++;
                k++;
            }
            else{
                merged.push_back(nums2[j]);
                j++;
                k++;
            }
        }
        while(i<nums1.size()) {
            merged.push_back(nums1[i]);
            k++;
            i++;
        }
        while(j<nums2.size()){
            merged.push_back(nums2[j]);
            j++;
            k++;
        }
        int n=merged.size();
        if(n%2==0){
            double a=(merged[(n-1)/2] + merged[n/2]) / 2.0;
            return a;
        }
        else{
            double a=n/2;
            return merged[a];
        }
    }
};