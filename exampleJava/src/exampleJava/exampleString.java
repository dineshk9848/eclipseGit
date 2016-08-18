package exampleJava;

import java.util.StringTokenizer;

public class exampleString {
public static void main(String [] args){
int i=0;
String str = "Hello how are you. Feeling all right today on the count of riveria";
StringTokenizer st = new StringTokenizer(str, " ");
while (st.hasMoreTokens()) {
	i++;
    System.out.println(st.nextToken());
    System.out.println(st.countTokens());
}
System.out.println(i);
}
}

