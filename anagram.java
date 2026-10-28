public class anagram{
public static void main(String[]args){
String s="below";
String t="elbow";
char arr1[]=s.toCharArray();
char arr2[]=t.toCharArray();
for(int i=0;i<arr1.length;i++){
    for( int j=0;j<arr2.length;j++){
        if(arr1[i]==arr2[j]){
            arr2[j]=0;
            break;
        }
    }
}
boolean isanagram=true;
for ( int j=0;j<arr2.length;j++){
    if (arr2[j]==0){
        isanagram=true;
    }
    else{
        isanagram=false;
        break;
        }
}
if (isanagram)
    System.out.println("true");
else
    System.out.println("false");
}
}
 
 

