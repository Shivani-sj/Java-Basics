public class anagram{
public static void main(String[]args){
String s="listen";
String t="silent";
int l1=s.length();
int l2=t.length();
int count=0;
for (int i=0;i<l1;i++){
    for (int j=0;j<l2;j++){
        if(s.charAt(i)==s.charAt(j)){
            count=count+1;
        }
}
}
if(count==l1)
    System.out.println("true");
else
    System.out.println("false");
}
}
