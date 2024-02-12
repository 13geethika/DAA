import java.util.*;
public class FindingCount{
public static void main(String args[]){
    String para="Hi i am Geethika.   I am pursuing btech 3rd year";
    String[] arr;
    arr=para.split("   ");
    int WC=0;
    int SC=0;int LC=0;int DC=0;
    for(int i=0;i<arr.length;i++){
      String[] br=arr[i].split(" ");
      WC+=br.length;
    }
    for(int j=0;j<para.length();j++){
      if(Character.isLetter(para.charAt(j)))
          LC+=1;
      else if(Character.isDigit(para.charAt(j)))
          DC+=1;
      else if(Character.isWhitespace(para.charAt(j))){}
      else
          SC+=1;
    }
    System.out.println("Sntence Count "+arr.length);
    System.out.println("Word Count "+WC);
    System.out.println("Letter Count "+LC);
    System.out.println("Digit Count "+DC);
    System.out.println("Specialsymbol Count "+SC);
}
}
