public class second_smallest{
public static void main(String args[]){
int num[]={9,2,3,8,12,4,14,6};
int first_min=num[0];
for (int i=0;i<num.length;i++){
    first_min=Math.min(first_min,num[i]);
}
int second_min=num[0];
for (int i=0;i<num.length;i++){
    if(first_min<num[i]){  
        if(second_min>num[i]){
            second_min=num[i];
        }
    }
}
System.out.println(second_min);
}
}