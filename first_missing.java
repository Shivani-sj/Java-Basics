import java.util.*;
public class first_missing{
public static void main (String args[]){
int arr[]={6,1,0,2,9,5,6,3,7,4};
boolean check[]=new boolean[arr.length+1];
check[0]=true;
for (int i=0;i<check.length;i++){
    check[i]=false;
}
for(int j:arr){
    if(j>0 && j<=arr.length){
       check[j]=true; 
    }
}
for (int k=1;k<check.length;k++){
    if(check[k]==false){
        System.out.println(k);
        break;
    }
}
}
}
