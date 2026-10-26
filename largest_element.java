public class largest_element{
public static void main(String args[]){
int num[]={1,2,3,8,12,4};
int greatest=0;
for (int i=0;i<num.length;i++){
    if (num[i]>greatest){
        greatest=num[i];
    }
    else{
        
    }
}
System.out.println("Greatest element is: " + greatest);
}
}