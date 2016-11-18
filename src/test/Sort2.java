package test;

/**
 * Created by dubo on 16/11/3.
 */
public class Sort2 {
    public void bubbleSort(int[] a){
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(a[j+1]<a[j]){
                    int temp;
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public void selectSort(int[] a){
        for (int i=0;i<a.length-1;i++){
            int min=i;
            int j;
            for(j=i;j<a.length;j++){
                if (a[min]>a[j]){
                    int temp=a[j];
                a[j]=a[min];
                a[min]=temp;
                }

            }
//            if(min!=i){
//                int temp=a[min];
//                a[min]=a[i];
//                a[i]=temp;
//            }


        }
    }
    public void insert(int[] a){
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i;
            while (j>=1&&a[j-1]>temp){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
    }
    public static void main(String[] args) {
        int[] a={12,54,1,23,5,14};
        Sort2 sort2=new Sort2();
        sort2.selectSort(a);
        sort2.display(a);
    }
    public void display(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
