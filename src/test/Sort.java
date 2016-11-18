package test;

/**
 * Created by dubo on 16/11/2.
 */
public class Sort {
    public void bubblesort(int[] a){
        for(int i=a.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(a[j+1]<a[j]){
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public void display(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public void selectSort(int[] a){
        int length=a.length;
        for (int i=0;i<length-1;i++){
            int min=i;
            for (int j=i+1;j<length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp;
                temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }

    }
    public void insertSort(int[] a){
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i;

                while(j>=1&&a[j-1]>temp){
                    a[j]=a[j-1];
                    j--;
                }
                a[j]=temp;

        }
    }
    public static void main(String[] args) {
        int[] a={20,30,150,1,34,12,43,54};
        Sort sort =new Sort();
        sort.insertSort(a);
        sort.display(a);
    }
}
