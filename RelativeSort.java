package Java_Questions;

public class RelativeSort {
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
		relativeSortArray(arr1, arr2);
	}

	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans=new int[arr1.length];
        boolean[] v=new boolean[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    ans[k++]=arr2[i];
                    v[j]=true;
                }
            }
        }
        int start=k;
        int end=arr1.length-1;
        for(int i=0;i<v.length;i++){
            if(!v[i] && k<ans.length){
                ans[k++]=arr1[i];
                
            }
        }

        method(ans,start,end);

        return ans;

        
    }

    public static void method(int[] a,int left, int right){
        if(left<right) {
    		int mid=(left+right)/2;
    		method(a,left,mid);
    		method(a,mid+1,right);
    		merge(a,left,mid,right);
    	}
    }
    public static void merge(int[] a, int left, int mid, int right) {
    	int n1=mid-left+1;
    	int n2=right-mid;
    	
    	int[] l=new int[n1];
    	int[] r=new int[n2];
    	
    	for(int i=0;i<n1;i++)
    		l[i]=a[left+i];
    	for(int i=0;i<n2;i++)
    		r[i]=a[mid+1+i];
    	int i=0,j=0;
    	int k=left;
    	
    	while(i<n1 && j<n2) {
    		if(l[i]<=r[j]) {
    			a[k]=l[i++];
    		}else {
    			a[k]=r[j++];
    		}
    		k++;
    	}
    	while(i<n1) {
    		a[k++]=l[i++];
    	}
    	while(j<n2) {
    		a[k++]=r[j++];
    	}
    	
    }
}
