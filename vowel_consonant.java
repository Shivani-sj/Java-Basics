public class vowel_consonant{
public static void main (String args[]){
int vowels=0;
int consonants=0;
String s="Hello World";
char arr[]=s.toCharArray();
for (int i=0;i<arr.length;i++){
    if(arr[i]=='a' || arr[i]=='e' ||arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
        vowels=vowels+1;
    }
    else{
        consonants=consonants+1;
    }
}
System.out.println("Vowels: "+vowels);
System.out.println("Consonents: "+consonants);
}
}
