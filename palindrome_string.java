public class palindrome_string{
public static void main (String args[]){
String s="madam";
int l=s.length();
int count=0;
for (int i=1;i<=l;i++){
    if(s.charAt(i-1)==s.charAt(l-i)){
        count=count+1;
    }
}
if(count==l)
    System.out.println("true");
else
    System.out.println("false");
}
}
    