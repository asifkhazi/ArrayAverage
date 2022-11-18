package main.java.com.arrAvg.app;
public class arr{
public static int arrayAvg(int a[]){
int n=a.length,sum=0;
for(int i=0;i<n;i++){
sum+=a[i];
}
return sum/n;
}
}